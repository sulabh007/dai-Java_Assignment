/*
Write a class Account with attributes for - account-number(integer),
name(String), balance(double)
Write a menu driven code to -
 	1. Accept a record of an account holder and save it into the binary
 	file "account_data.dat"
 	2. Display all records of account holder present in "account_data.dat"
 	(Load all records from binary file into "ArrayList" and Print using
 	lambda syntax)
 	3. Deposit an amount into particular account of existing records.
 	(Load all records from binary file into "ArrayList" and Search on
 	basis of id. Write updated data back into the file)
 	4.Withdraw an amount from particular account of existing records. 
 	Search on basis of id. Write updated data back into the file)
 	5. Display account details of account holders having balance less than
 	Rs. 20000/-.
 	(Load all records from binary file into "ArrayList" and use "filter"
 	stream-api and print using lambda syntax)
 	*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import in.cdac.Account;

public class Assignment12 {

	public static void main(String[] args) {
		int choice=0,acno;
		String name;
		double bal,amt;
		ArrayList<Account> objList = new ArrayList<>();
		ArrayList<Account> objectsList = new ArrayList<>();
		objectsList=readFile();
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("1. Add record for Account holder\n"
				+ "2. Display details of all account holders.\n"
				+ "3. Deposit an amount into particular account\n"
				+ "4. Withdraw an amount from existing account\n"
				+ "5. Display account details of account holders having balance less than Rs. 20000/-.\n"
				+ "6. Exit");
		choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter account no. : ");
			acno = sc.nextInt();
			System.out.println("Enter name of account holder: ");
			name = sc.next();
			System.out.println("Enter balance : ");
			bal = sc.nextDouble();
			try {
				Account a = new Account(acno,name,bal);
				objList.add(a);
				writeFile(objList);
				System.out.println(a);
			}catch(Exception e) {
				e.printStackTrace();
			}
			break;
			}
		
		case 2: {
			
			objectsList=readFile();
		    System.out.println();
		    objectsList.forEach((e) -> System.out.print(e+"\n"));
		    System.out.println();
		    break;
			
		}
		case 3: {
			boolean status = false;
			System.out.println("Enter account no. to make deposit : ");
			acno = sc.nextInt();
			objectsList=readFile();
			for(int i=0;i<objectsList.size(); i++) 
			{
				if(((Account) objectsList.get(i)).getAcno()==acno)	
				{
				  System.out.println("Enter amount to deposit : ");
				  amt = sc.nextDouble();
				  ((Account) objectsList.get(i)).deposit(amt);
				  System.out.println();
				  System.out.println(objectsList.get(i));
				  System.out.println();
				  writeFile(objectsList);
				  status = false;
				  break;
				}
				else {
					status = true;
				}	
			}
			if(status == true) {
				System.out.println("Account not found.");
				System.out.println();
			}
			break;
		}
		case 4: {
			boolean status = false;
			System.out.println("Enter account no. to make withdrawl : ");
			acno = sc.nextInt();
			objectsList=readFile();
			for(int i=0;i<objectsList.size(); i++) 
			{
				if(((Account) objectsList.get(i)).getAcno()==acno)	
				{
					System.out.println("Enter amount to withdraw : ");
					amt = sc.nextDouble();
					if(amt>((Account) objectsList.get(i)).getBal()) 
					{
						System.out.println("Invalid Transiction, Insufficent Balance.");
						break;
					}
				    ((Account) objectsList.get(i)).withdraw(amt);
				    System.out.println();
				    System.out.println(objectsList.get(i));
				    System.out.println();
				    writeFile(objectsList);
				    status = false;
				    break;
					}
				else {
					status = true;
				}	
			}
			if(status == true) {
				System.out.println("Account not found.");
				System.out.println();
			}
			break;
		}
		case 5: {
			objectsList=readFile();
			System.out.println();
			objectsList.stream().filter((t)-> (t.getBal()<20000)).forEach((t)->System.out.println(t));
			System.out.println();
			break;
		}
		case 6: 
		{
			System.out.println();
			System.out.println("Thank you for visiting...");
			System.exit(0);
			break;
		}
		default:
			System.out.println("Invalid Input");
		}
		}
	}

	private static void writeFile (ArrayList<Account> objList) {
		FileOutputStream fos;
		try {
			File file=new File("account_data.dat");
			fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(objList);
			oos.close();
			fos.close();
			System.out.println("Account is saved");
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	@SuppressWarnings("unchecked")
	static ArrayList<Account> readFile() {
		Object objectsList = null;
	    try {
			File file=new File("account_data.dat");
	    	ArrayList<Object> temp = new ArrayList<>();
		    FileInputStream fis = new FileInputStream(file);
		    ObjectInputStream ois = new ObjectInputStream(fis);
		    Object obj = null;
		    obj = ois.readObject();
		    temp.add(obj);
		    objectsList = temp.get(0);
			ois.close();
			fis.close();
		    
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (ArrayList<Account>) objectsList;
	}
}
