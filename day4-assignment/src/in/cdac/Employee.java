package in.cdac;

public class Employee {
	private int empid;
	private String name;
	private Date dob;
	
	public Employee() {
		empid = 101;
		name = "abc";
		dob = new Date();
	}
	public Employee(int id, String n, int d, int m, int y) {
		empid = id;
		name = n;
		dob = new Date(d, m, y);
	}
	public void show() {
		System.out.println("EmpID : "+empid);
		System.out.println("Name : "+name);
		System.out.println("DOB : "+dob.getDate());

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
	public String getDob() {
		return dob.getDate();
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

}
