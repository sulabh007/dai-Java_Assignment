package in.cdac;

public class EmployeeWithSal {
	private int empid;
	private String name;
	private double basicsal;
	
	public EmployeeWithSal() {
		empid = 101;
		name = "abc";
		basicsal=0;
	}
	public EmployeeWithSal(int id, String n,double sal) {
		empid = id;
		name = n;
		basicsal=sal;
	}
	public void show() {
		System.out.println("EmpID : "+empid);
		System.out.println("Name : "+name);
		System.out.println("Basic Salary : "+basicsal);

	}
	public double getBasicsal() {
		return basicsal;
	}
	public void setBasicsal(double basicsal) {
		this.basicsal = basicsal;
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


}
