class vechicle implements Cloneable
{
	private int vehiclenum;
	private String vehiclename;
	private double vehicleprice;
	public vechicle() {
		this.vehiclenum = 1;
		this.vehiclename = "Tesla";
		this.vehicleprice = 40000.00;
	}
	
	public vechicle(int vehiclenum, String vehiclename, double vehicleprice) {
		this.vehiclenum = vehiclenum;
		this.vehiclename = vehiclename;
		this.vehicleprice = vehicleprice;
	}

	public void show() 
	{
		System.out.println("Vehicle Number :"+vehiclenum);
		System.out.println("Vehicle Name :"+vehiclename);
		System.out.println("Vehicle Price :"+vehicleprice);
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
public class q2 {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		vechicle v1=new vechicle(1,"Alto",100000.0);
		vechicle v2=(vechicle)v1.clone();
		v2.show();

	}

}
