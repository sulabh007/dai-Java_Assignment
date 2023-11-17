/*Write a program to calculate Net Salary of an employee. Accept Basic Salary (BS) from the user. 
 *      HRA is 15% of BS
 *      DA is 30% of BS	
 *      PF is 12.5% of GS	
 *      Gross Salary is BS + HRA + DA	
 *      Net Salary = Gross Salary – PF
*/

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		float sal;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Basic Salary:");
		sal = sc.nextFloat();
		double gs = sal + sal*0.45;
		double netsal = gs - gs*0.125;
		System.out.println("Net Salary = "+netsal);

	}

}
