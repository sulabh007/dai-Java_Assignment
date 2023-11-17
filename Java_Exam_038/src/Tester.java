import java.time.LocalDateTime;

import java.util.*;

class EmployeeClass{
	private String name;
	private LocalDateTime dateofjoining;
	private String phonenum;
	private String Aadhaar_number;
	static private int empid=0;
	
	public EmployeeClass(String name, String phonenum, String aadhaar_number) {
		super();
		this.name = name;
		this.dateofjoining = dateofjoining.now();
		this.phonenum = phonenum;
		Aadhaar_number = aadhaar_number;
		this.empid = ++this.empid;
	}

	public LocalDateTime getDateofjoining() {
		return dateofjoining;
	}

	public static int getEmpid() {
		return empid;
	}

	public void setDateofjoining(LocalDateTime dateofjoining) {
		this.dateofjoining = dateofjoining;
	}

	public static void setEmpid(int empid) {
		EmployeeClass.empid = empid;
	}
	
	
	
}
class FTE extends EmployeeClass{
	private double monthsalary;
	public FTE(String name, String phonenum, String aadhaar_number, double monthsalary) {
		super(name, phonenum, aadhaar_number);
		this.monthsalary = monthsalary;
	}
	
}
class PTE extends EmployeeClass{
	private double hrpay;

	public PTE(String name, String phonenum, String aadhaar_number, double hrpay) {
		super(name, phonenum, aadhaar_number);
		this.hrpay = hrpay;
	}
	
	
}
public class Tester {

	public static void main(String[] args) {
		int choice = 0;
		ArrayList<Object> emplist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(choice!=7) {
			System.out.println( "1. Add full time employee\n"+
								"2. Add part time employee\n"+
								"3. Delete an employee by Emp id\n"+
								"4. Search employee details by Aadhaar number\n"+
								"5. Display all employee details\n"+
								"6. Display all employee details sorted by date of joining\n"+
								"7. Exit\n"+
								"Enter Choice");
			switch(choice) {
			case 1:{
				System.out.println("Enter name of Emplyoee");
				String name = sc.next();
				System.out.println("Enter Phone Number of Emplyoee");
				
				String phonenum = sc.next();
				if(phonenum.length()==10 | phonenum.length()==12 | phonenum.length()==13) {
					if(phonenum.contains(" ")) {
						System.out.println("Invalid Phone Number");
					}
					else {
						System.out.println("Valid Phone Number");
					}
				}
				else {
					System.out.println("Invalid Phone Number");
				}
				adhaar :
				System.out.println("Enter Adhaar Number of Emplyoee");
				String adhaarnum = sc.next();
				if (adhaarnum.matches("[0-9]+")) {
					if(adhaarnum.length()==12) {
						System.out.println("Valid Adhaar Number");
				}
				else {
					System.out.println("Invalid Adhaar Number");
					//continue adhaar;
					}
				}
				
				System.out.println("Enter Monthly Salary of Emplyoee");
				double monthlysal = sc.nextDouble();
				FTE e= new FTE(name, phonenum, adhaarnum, monthlysal );
				emplist.add(e);
				break;
			}
			case 2:{
				break;
			}
			case 3:{
				System.out.println("Enter Employee ID to delete Emplyoee");
				int empid = sc.nextInt();
//				for (int i; i<emplist.size();i++) {
//					if(emplist.get(i).getEmpid) {
//					
//				}
				break;
			}
			case 4:{
				break;
			}
			case 5:{
				break;
			}
			case 6:{
				break;
			}
			case 7:{
				break;
			}
//			case default:{
//				break;
			
			
			}
		}
	}
}

	


