package in.cdac;
import java.util.*;
public class Employee {
	private int empid;
	private String name;
	private double salary;

	
	public Employee() {
		empid = 101;
		name = "abc";
		salary=0;
	}
	public Employee(int id, String n, double sal ) {
		empid = id;
		name = n;
		salary=sal;

	}
	public void accept() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		empid=sc.nextInt();
		System.out.println("Enter Empoyee Name:");
		name=sc.next();
		System.out.println("Enter Employee Salary:");
		salary=sc.nextDouble();
		
	}
	public void show() {
		System.out.println();
		System.out.println("EmpID : "+empid);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println();

	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


}
