
public class Vehicle implements Comparable<Vehicle>
{
	private int veh_num; 
	private String veh_name; 
	private double veh_cost;
	
	public Vehicle(int veh_num, String veh_name, double veh_cost) {
		super();
		this.veh_num = veh_num;
		this.veh_name = veh_name;
		this.veh_cost = veh_cost;
	}

	public void display() {
		System.out.println();
		System.out.println("Vehicle Number : "+veh_num);
		System.out.println("Vehicle Name : "+veh_name);
		System.out.println("Vehicle Cost : "+veh_cost);
		
	}

	public double getVeh_cost() {
		return veh_cost;
	} 
	@Override
	public int compareTo(Vehicle o) {
		if(this.veh_cost > o.veh_cost)
			return 1;
		else if (this.veh_cost < o.veh_cost)
			return -1;
		else
			return 0;
	}
	

}
