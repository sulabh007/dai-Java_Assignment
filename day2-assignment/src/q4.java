//Q4.Write a method “add” to add n number of integers. Use VarArgs
import java.util.Scanner;
class add{
	public static int add(int ...a)
	{
		int sum=0;
		for(int i=0; i<a.length; i++)
			sum+=a[i];
		return sum;
	}
}

public class q4{
//	public static int add(int ...a)
//	{
//		int sum=0;
//		for(int i=0; i<a.length; i++)
//			sum+=a[i];
//		return sum;
//	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Number of Integers to add:");
		int no_of_integer = sc.nextInt();
		int [] a=new int[no_of_integer];
		System.out.println("Enter Number to add:");
		for(int i=0; i<no_of_integer; i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Addition of Numbers is :"+add.add(a));

	}

}

