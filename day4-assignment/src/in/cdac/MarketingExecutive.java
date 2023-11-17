package in.cdac;

public class MarketingExecutive extends EmployeeWithSal {
	private double tourallo;
	private double phoneallo;
	private int km;
	private double grosssal;
	private double netsal;
	private double bsal;
	
	public MarketingExecutive (){
		tourallo=0;
		phoneallo=0;
		km=0;
		grosssal=0;
		netsal=0;
	}
	public MarketingExecutive(int id, String n,double bsal, int kmt) {
		super(id, n, bsal);
		this.bsal=bsal;
		km=kmt;
		tourallo=km*5;
		phoneallo=2000;
		calculateGrossSalary();
		calculateNetSalary();
	}
	@Override
	public String toString() {
		return "MarketingExecutive: \n[Tour allowance=" + tourallo + ",\nPhone allowance=" + phoneallo + ",\nKm travelled=" + km + ",\nGross salary="
				+ grosssal + ",\nNet salary=" + netsal + ",\nBasic salary=" + bsal + "]\n";
	}
	public void calculateGrossSalary() {
		this.grosssal=bsal+(tourallo+phoneallo);
	}
	public void calculateNetSalary() {
		this.netsal=grosssal-(0.125*bsal);
	}
	


}
