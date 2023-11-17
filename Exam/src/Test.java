import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	private String name;
	private LocalDateTime dateofjoining;
	private String phonenum;
	private String Aadhaar_number;
	static private int empid=0;
	
	public Employee(String name, String phonenum, String aadhaar_number) {
		super();
		this.name = name;
		this.dateofjoining = dateofjoining.now();
		this.phonenum = phonenum;
		Aadhaar_number = aadhaar_number;
	}

	public LocalDateTime getDateofjoining() {
		return dateofjoining;
	}

	public int getEmpid() {
		return empid;
	}

	public void setDateofjoining(LocalDateTime dateofjoining) {
		this.dateofjoining = dateofjoining;
	}

	public static void setEmpid(int empid) {
		Employee.empid = empid;
	}

	public String getAadhaar_number() {
		return Aadhaar_number;
	}

	public void setAadhaar_number(String aadhaar_number) {
		Aadhaar_number = aadhaar_number;
	}
	
	
	
}
class FTE extends Employee{
	private double monthsalary;
	public FTE(String name, String phonenum, String aadhaar_number, double monthsalary) {
		super(name, phonenum, aadhaar_number);
		this.monthsalary = monthsalary;
	}
	@Override
	public String toString() {
		return "FTE [monthsalary=" + monthsalary + ", getDateofjoining()=" + getDateofjoining() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getEmpid() {
		return super.getEmpid();
	}
	
	
}
class PTE extends Employee{
	private double hrpay;

	public PTE(String name, String phonenum, String aadhaar_number, double hrpay) {
		super(name, phonenum, aadhaar_number);
		this.hrpay = hrpay;
	}
	@Override
	public String toString() {
		return "PTE [hrpay=" + hrpay + ", getDateofjoining()=" + getDateofjoining() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getEmpid() {
		return super.getEmpid();
	}
	public String getAadhaar_number() {
		return super.getAadhaar_number();
	}
	
	
}
public class Test {

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
								"Enter Choice :");
			choice = sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter name of Emplyoee");
				String name = sc.next();
				System.out.println("Enter Phone Number of Emplyoee");
				
				String phonenum = sc.next();
				if(phonenum.length()==10 | phonenum.length()==12 | phonenum.length()==13) {
					if(phonenum.contains(" ")) {
						System.out.println("Invalid Phone Number");
						break;
					}
					else {
						System.out.println("Valid Phone Number");
					}
				}
				else {
					System.out.println("Invalid Phone Number");
					break;
				}
				System.out.println("Enter Adhaar Number of Emplyoee");
				String adhaarnum = sc.next();
				if (adhaarnum.matches("[0-9]+") || adhaarnum.contains(" ")) {
					if(adhaarnum.length()==12) {
						System.out.println("Valid Adhaar Number");
				}
				else {
					System.out.println("Invalid Adhaar Number");
					break;
					}
				}
				
				System.out.println("Enter Monthly Salary of Emplyoee");
				double monthlysal = sc.nextDouble();
				FTE e= new FTE(name, phonenum, adhaarnum, monthlysal );
				emplist.add(e);
				break;
			}
			case 2:{
				System.out.println("Enter name of Emplyoee");
				String name = sc.next();
				System.out.println("Enter Phone Number of Emplyoee");
				
				String phonenum = sc.next();
				if(phonenum.length()==10 | phonenum.length()==12 | phonenum.length()==13) {
					if(phonenum.contains(" ")) {
						System.out.println("Invalid Phone Number");
						break;
					}
					else {
						System.out.println("Valid Phone Number");
					}
				}
				else {
					System.out.println("Invalid Phone Number");
					break;
				}
				System.out.println("Enter Adhaar Number of Emplyoee");
				String adhaarnum = sc.next();
				if (adhaarnum.matches("[0-9]+") || adhaarnum.contains(" ")) {
					if(adhaarnum.length()==12) {
						System.out.println("Valid Adhaar Number");
				}
				else {
					System.out.println("Invalid Adhaar Number");
					break;
					}
				}
				
				System.out.println("Enter Hourly Payment of Emplyoee");
				double monthlysal = sc.nextDouble();
				FTE e= new FTE(name, phonenum, adhaarnum, monthlysal );
				emplist.add(e);
				break;
			}
			case 3:{
				System.out.println("Enter Employee ID to delete Emplyoee");
				int empid = sc.nextInt();
				for (Object i:emplist) {
						if(((Employee) i).getEmpid()==empid) {
							emplist.remove(i);
						}
					}
					
				break;
			}
			case 4:{
				System.out.println("Enter Adhaar Number of Emplyoee");
				String adhaarnum = sc.next();
				if (adhaarnum.matches("[0-9]+") || adhaarnum.contains(" ")) {
					if(adhaarnum.length()==12) {
						System.out.println("Valid Adhaar Number");
				}
				else {
					System.out.println("Invalid Adhaar Number");
					break;
					}
				}
				for (Object i:emplist) {
						if(((Employee) i).getAadhaar_number()==adhaarnum) {
							System.out.println(i);
						}
					}
				break;
			}
			case 5:{
				for (int i = 0; i<emplist.size();i++) {
					System.out.println(emplist.get(i));
				}
				
				break;
			
			}
			case 6:{
				break;
			}
			case 7:{
				break;
			}
			
			}
		}
	}

}
