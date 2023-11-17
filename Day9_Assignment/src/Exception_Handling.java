/*Exception Handling
 * 	Create a class Account with -
 * 		Instance variable - balance
 * 		class method - deposit/withdraw
 * User withdrawal limit on one transaction is Rs.15000/-
 * 
 * Throw and Handle Exception - 
 * 		1. OverLimit - when user tries to withdraw more than Rs. 15000/- in a transaction.
 * 		2. InsufficientBalance - When user withdrawal amount is more than existing balance.
 */

import java.util.Scanner;

class MyException extends Exception{
	String message;
	public MyException(String message) {
		this.message=message;
	}
	
	public String toString() {
		return message;
	}
}
class Account
{
	private double bal;
	
	public Account()
	{
		bal=0;
	}
	public Account(double bal)
	{
		this.bal=bal;
	}
	@Override
	public String toString() {
		return "Account [ bal=" + bal + "]";
	}

	public double getBal(){
		return bal;
	}

	public void setBal(double bal){
		this.bal=bal;
	}
	public void deposit(double amt) 
	{
		this.bal =this.bal + amt;
	}
	public void withdraw(double amt) throws Exception
	{
		if(amt>15000) {
			throw new MyException("OverLimit");
		}
		if(this.bal<amt) {
			throw new MyException("InsufficentBalance");
		}
		this.bal =this.bal - amt;
		
		
	}
	}
public class Exception_Handling {

	public static void main(String[] args) 
	{
		int choice=0;
		double bal,amt;
		Account a=new Account();
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("1. Set Balance for Account\n"
				+ "2. Display Account balance.\n"
				+ "3. Deposit to Account\n"
				+ "4. Withdraw from Account\n"
				+ "5. Exit");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
		{
			System.out.println("Enter balance : ");
			bal = sc.nextDouble();
			a.setBal(bal);
			break;
		}
		case 2: 
		{
			System.out.println("Balance : "+a.getBal());
			
			break;
		}
		case 3:
		{
			System.out.println("Enter amount to deposit : ");
			amt = sc.nextDouble();
			a.deposit(amt);
			break;
		}
		
		case 4: 
		{
			System.out.println("Enter amount to withdraw : ");
			amt = sc.nextDouble();
			try 
			{
				a.withdraw(amt);
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
			break;
			
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
	
