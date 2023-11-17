/*3.Construct a hierarchy of employees.
	1. Create an Employee class with attributes like employee id, name, basic salary.
	2. Inherit class Manager and MarketingExecutive from super class Employee
	3. Manager class should have following members
		a. Petrol Allowance: 8% of basic salary
		b. Food Allowance: 12% of basic salary
		c. Other Allowance: 4% of basic salary
	4. MarketingExecutive class should have following members
		a. Kilometers travelled
		b. Tour Allowance: Rs.5/- per kilometer
		c. Telephone Allowance Rs.2000/-
	5. Write constructors for the derived classes. (Use super keyword)
	6. Implement methods - display, calculateGrossSalary and calculateNetSalary in Manager
	   and MarketingExecutive class. 
		gross salary = basic salary + allowances
		net salary = gross salary - PF
		PF = 12.5% of basic salary
Create objects of above classes inside main method and display them.
*/
import in.cdac.*;
public class q3 {

	public static void main(String[] args) {
		Manager m1 = new Manager(100,"Raj",10000);
		System.out.println(m1);
		MarketingExecutive me1 = new MarketingExecutive(100,"Raj",10000,100);
		System.out.println(me1);

	}

}
