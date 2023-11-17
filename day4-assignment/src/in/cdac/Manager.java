package in.cdac;

public class Manager extends EmployeeWithSal {
	private double petallo;
	private double foodallo;
	private double otherallo;
	private double grosssal;
	private double netsal;
	private double bsal;
	
	public Manager() {
		petallo=0;
		foodallo=0;
		otherallo=0;
		grosssal=0;
		netsal=0;
	}
	public Manager(int id, String n,double bsal) {
		super(id, n, bsal);
		this.bsal=bsal;
		petallo=0.08*bsal;
		foodallo=0.12*bsal;
		otherallo=0.04*bsal;
		calculateGrossSalary();
		calculateNetSalary();
	}
	public void calculateGrossSalary() {
		this.grosssal=bsal+(petallo+foodallo+otherallo);
	}
	public void calculateNetSalary() {
		this.netsal=grosssal-(0.125*bsal);
	}
	@Override
	public String toString() {
		return "Manager: \n[Petrol allowance=" + petallo + ",\nFood allowance=" + foodallo + ",\nOther allowance=" + otherallo + "\nGross Salary="
				+ grosssal + ",\nNet salary=" + netsal + ",\nBasic salary=" + bsal + "]\n";
	}





}
