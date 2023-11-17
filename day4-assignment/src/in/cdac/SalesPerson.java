package in.cdac;

public class SalesPerson extends WageEmployee {
	private int sales;
	private int com;
	private float salary;
	private int hrs;
	private int rate;

	
	public SalesPerson() {
		sales=0;
		com=0;
		salary=0;
	}

	public SalesPerson(int id, String n, int d, int m, int y, int h, int r,int sales, int com) {
		super( id,n,d,m,y,h,r);
		this.sales = sales;
		this.com = com;
		this.hrs=h;
		this.rate=r;
		this.salary=Salary();
	}
	@Override
	public float Salary() {
		return (hrs*rate) + (sales*com);
	}
	@Override
	public void show() {
		System.out.println();
		System.out.println("Name : "+((Employee) this).getName());
		System.out.println("EmpID : "+((Employee) this).getEmpid());
		System.out.println("DOB : "+((Employee) this).getDob());
		System.out.println("Hours : "+hrs);
		System.out.println("Rate : "+rate);
		System.out.println("Sales : "+sales);
		System.out.println("Commison : "+com);
		System.out.println("Salary : "+salary);
		
	}

}
