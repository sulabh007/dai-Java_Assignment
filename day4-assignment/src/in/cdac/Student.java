package in.cdac;
import java.util.Scanner;
public class Student
{
	private int rollno;
	private String name;
	private static int rollnocnt=101;
	private Date dob;
	public Student() {
		this.rollno=000;
		name="xxx";
		dob = new Date();
	}
	public Student(String name, int d, int m, int y) {
		this.rollno=Student.rollnocnt++;
		this.name=name;
		dob = new Date(d, m, y);
	}
	public void accept() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Student Name : ");
	this.name=sc.next();
	System.out.println("Enter Student Date for DOB : ");
	int d=sc.nextInt();
	System.out.println("Enter Student Month for DOB : ");
	int m=sc.nextInt();
	System.out.println("Enter Student Year for DOB : ");
	int y=sc.nextInt();
	this.dob=new Date(d,m,y);
	this.rollno=Student.rollnocnt++;
	}
	public void display() {
		System.out.println(rollno);
		System.out.println(name);
		dob.show();
	}
	
	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name  + "]";
	}
	public int getrollno(){
		return rollno;
	}
	public String getName(){
		return name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setName(String name){
		this.name=name;
	}

	

}