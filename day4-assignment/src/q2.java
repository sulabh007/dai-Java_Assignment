/*2.Construct a hierarchy of employees.
a. Create an Employee class with attributes like employee id, name, date of birth.
b. Inherit class WageEmployee from super class Employee
c. WageEmployee class should have following members
		a. Number of hours worked
		b. Rate per hour
d. Inherit class SalesPerson from super class WageEmployee. SalesPerson should have following members
		a. Number of items sold
		b. Commission per item
e. Write constructors for WageEmployee and SalesPerson classes. 
f. Override the methods for displaying details, calculating salary in WageEmployee and SalesPerson class. 
		WageEmployee Salary = hours * rate
		SalesPerson Salary = hours*rate + sales*commission
*/
import in.cdac.*;
public class q2 {

	public static void main(String[] args) {
		WageEmployee we1=new WageEmployee(101, "Raj", 7, 11, 1990, 40, 1000);
		we1.show();
		SalesPerson sp1=new SalesPerson(101, "Raj", 7, 11, 1990, 40, 1000,100, 100);
		sp1.show();
		

	}

}
