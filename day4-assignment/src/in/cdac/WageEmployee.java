package in.cdac;

public class WageEmployee extends Employee {
	private int hrs;
	private int rate;
	private float salary=0;
	
	public WageEmployee() {
		hrs=0;
		rate=0;
		salary=0;
	}

	public WageEmployee(int id, String n, int d, int m, int y, int h, int r) {
		super(id,n,d,m,y);
		this.hrs = h;
		this.rate = r;
		this.salary=Salary();
		
	}
	public float Salary() {
		return this.hrs * this.rate;
	}
	public void show() {
		super.show();
		System.out.println("Hours : "+hrs);
		System.out.println("Rate : "+rate);
		System.out.println("Salary : "+salary);
	}


}
