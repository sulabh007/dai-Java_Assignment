/*2. Write a class Vehicle with attributes for - Vehicle number, vehicle name and cost of
 * Vehicle.
 * Add necessary method inside class Vehicle. Create a HashSet of Vehicle class objects
 * inside main. Write a menu driven program to -
 * 		a. Add vehicle record into the HashSet
 * 		b. Display details of all vehicles from HashSet.
 * 		c. Display details of maximum and minimum cost vehicle form HashSet*/

import java.util.*;

public class q2 {

	public static void main(String[] args) {
		Set<Vehicle> vset=new TreeSet<>();
		int choice=0, veh_num;
		double veh_cost=0;
		String veh_name;
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("1. Add vehicle record into the HashSet\n"
				+ "2. Display details of all vehicles from HashSet.\n"
				+ "3. Display details of maximum and minimum cost vehicle form HashSet\n"
				+ "4. Exit");
		choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter Vehicle No. : ");
			veh_num = sc.nextInt();
			System.out.println("Enter Vehicle Name: ");
			veh_name = sc.next();
			System.out.println("Enter Vehicle Cost : ");
			veh_cost = sc.nextDouble();
			Vehicle vo = new Vehicle(veh_num,veh_name,veh_cost);
			vset.add(vo);
			
			break;
		}
		case 2: 
		{
			
			for(Vehicle v:vset)
			{
				v.display();
			}
			break;
		}
		case 3: 
		{

	        Vehicle maxObj = Collections.max(vset);
	        double maxCost = maxObj.getVeh_cost();
	        System.out.println("Maximum Vehicel Cost :" +maxCost); 
	        Vehicle minObj = Collections.min(vset);
	        double minCost = minObj.getVeh_cost();
	        System.out.println("Maximum Vehicel Cost :" +minCost); 
		

		}
		case 4: 
		{
			System.exit(0);
		}

		default:
			System.out.println("Invalid Input");
		}
		
			
		}
		

	}

}
