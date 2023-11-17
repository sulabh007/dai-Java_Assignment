/*
 * Write a program to accept the basic salary and total sales amount for a salesperson and calculate commission 
 * according to sales amount. Display the net salary and commission earned. (Net Salary = Basic Salary + Commission) 
 * The range is as follows.
	Sales Amount in Rupees             Commission on Sales 
		5000 to 7500                            3%
		7501 to 10500							8%
		10501 to 15000							11%
		15000 and above							15%
*/
import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
		double sal, sale, netsal=0, com=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary:");
		sal = sc.nextFloat();
		System.out.println("Enter Total Sale amount:");
		sale = sc.nextFloat();
		if (5000 <= sale && sale<=7500) 
		{
			com = sal*0.03;
			netsal = sal + com;
		}
		else if (7501 <= sale && sale<=10500) 
		{
			com = sal*0.08;
			netsal = sal + com;
		}
		else if (10501 <= sale && sale<=15000) 
		{
			com = sal*0.11;
			netsal = sal + com;
		}
		else if (15000 < sale) 
		{
			com = sal*0.15;
			netsal = sal + com;
		}
		System.out.println("Net Salary = "+ netsal + "\nCommission earned = "+com);
			

	}

}
