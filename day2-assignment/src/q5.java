/*Create a class AccountHolder with -
		Instance variables - account number, account holder name, account balance
		Class methods - constructors, getter/setter methods, deposit, withdraw
	Create an array of AccountHolder objects in main. 
	Write a menu driven program to perform -
			1. Add record for account holder
			2. Display details of all account holders.
			3. Deposit an amount into particular account
			4. Withdraw an amount from particular account
*/
import java.util.Scanner;
class AccountHolder
{
	private int acno;
	private String name;
	private double bal;
	
	public AccountHolder()
	{
		acno=0;
		name="xxx";
		bal=0;
	}
	public AccountHolder(int acno, String name, double bal)
	{
		this.acno=acno;
		this.name=name;
		this.bal=bal;
		
	}
	@Override
	public String toString() {
		return "AccountHolder [acno=" + acno + ", name=" + name + ", bal=" + bal + "]";
	}
	public int getAcno(){
		return acno;
	}
	public String getName(){
		return name;
	}
	public double getBal(){
		return bal;
	}
	public void setAcno(int acno1){
		this.acno=acno1;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setBal(double bal){
		this.bal=bal;
	}
	public void deposit(double amt) 
	{
		this.bal =this.bal + amt;
	}
	public void withdraw(double amt)
	{
		this.bal =this.bal - amt;
	}
		
}
public class q5 {

	public static void main(String[] args) {
		int choice=0,acno;
		String name;
		double bal,amt;
		AccountHolder[] a=new AccountHolder[9];
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("1. Add record for account holder\n"
				+ "2. Display details of all account holders.\n"
				+ "3. Deposit an amount into particular account\n"
				+ "4. Withdraw an amount from particular account\n"
				+ "5. Exit");
		choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter account no. : ");
			acno = sc.nextInt();
			System.out.println("Enter name of account holder: ");
			name = sc.next();
			System.out.println("Enter balance : ");
			bal = sc.nextDouble();
			for(int i=0;i<a.length;i++) {
				if(a[i]==null) {
					AccountHolder ac1=new AccountHolder(acno,name,bal);
					a[i] = ac1;
					System.out.println(a[i]);
					break;
				}
			}
			
			break;
		}
		case 2: {
			
			for(int i=0; i<a.length; i++) {
				if(a[i]!=null) {
					System.out.println(a[i]);
				}
				
			}
		}
		case 3: {
			System.out.println("Enter account no. to make deposit : ");
			acno = sc.nextInt();
			for(int i=0;i<a.length; i++) {
				if(a[i].getAcno()!=acno)	
				{
					System.out.println("Account not found.");
					return;
					}
			}
			System.out.println("Enter amount to deposit : ");
			amt = sc.nextDouble();
			for(int i=0;i<a.length; i++) {
				if(a[i].getAcno()==acno)	
				{
				  a[i].deposit(amt);
				  System.out.println(a[i]);
				  break;
				}
				}
		}
		case 4: {
			System.out.println("Enter account no. to make withdrawl : ");
			acno = sc.nextInt();
			for(int i=0;i<a.length; i++) {
				if(a[i].getAcno()!=acno)	
				{
					System.out.println("Account not found.");
					return;
					}
			}
			System.out.println("Enter amount to withdraw : ");
			amt = sc.nextDouble();
			for(int i=0;i<a.length; i++) {
				if(a[i].getAcno()==acno)	
				{
					if(amt>a[i].getBal()) {
						System.out.println("Invalid Transiction, Insufficent Balance.");
						break;
					}
				    a[i].withdraw(amt);
				    System.out.println(a[i]);
				    break;
				}
			}
		}
		case 5: {
			
			System.exit(0);
		}
		default:
			System.out.println("Invalid Input");
		}
		
			
		}
		

	}

}
