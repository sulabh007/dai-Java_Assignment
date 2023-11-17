/*Write a class Employee for an application which will have data members for employee id,
 * employee name and salary.
 * 	Provide the following functionalities in Employee call,
 * 		1.Initialing objects using default and parameterized constructors.
 * 		2.Accepting and displaying the information of employee from console
 * In "main" method take a Vector of Employee objects.Write a menu driven program to -
 * 		a. Insert record into a Vector.
 * 		b. Update information of specific employee on the basis of emp_id accepted from user
 * 		c. Display all records.*/

import in.cdac.*;
import java.util.*;

public class q1 {

	public static void main(String[] args) {
		int choice=0,cnt=0,id;
		Vector <Employee> EmplyoeeVector = new Vector <>(10);
		Scanner sc = new Scanner(System.in);
		while(true){
		
		System.out.println("1. Add record for Employee\n"
				+ "2. Update Emplyoee by EmpId.\n"
				+ "3. Display details of all Employees.\n"
				+ "4. Exit");
		choice = sc.nextInt();
		switch (choice) {
		case 1: {
					Employee emp=new Employee();
					emp.accept();
					EmplyoeeVector.add(cnt,emp);
					EmplyoeeVector.get(cnt).show();
					cnt++;
					break;
				}
			
		case 2: 
		{
		System.out.println("Enter EmpId to update Employee");
		id=sc.nextInt();
//		Iterator<Employee> itr=EmplyoeeVector.iterator();
//		while(itr.hasNext())
//		{
//			if(id==itr.next().getEmpid()) 
//			{
//				System.out.println("Enter Updated Name:");
//				String a=sc.next();
//				itr.next().setName(a);
//				System.out.println("Enter Updated Salary:");
//				double b=sc.nextDouble();
//				itr.next().setSalary(b);
//			}
			for(Employee e:EmplyoeeVector)
			{
				if(id==e.getEmpid()) 
				{
					System.out.println("Enter Updated Name:");
					e.setName(sc.next());
					System.out.println("Enter Updated Salary:");
					e.setSalary(sc.nextDouble());
				}
				
				
			}
			
		}
		break;
//		}
		case 3: {
//		Iterator<Employee> itr1=EmplyoeeVector.iterator();
//		while(itr1.hasNext())
//		{
//			itr1.next().show();
//		}
			for(Employee e:EmplyoeeVector)
			{
				e.show();
			}
		break;
		}
		
		case 4: {
			
			System.exit(0);
		}
		default:
			System.out.println("Invalid Input");
			break;
		}
		
			
		}
		
	}

}
