/* 
 *1.Accept five integers in an array -
	a.Find maximum and minimum of the integers. Do not sort the array.
	b.Multiply each element of the array by 5 and store it in another array and display it.
*/

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int arraysize=5;
		int [] a=new int[arraysize];
		System.out.println("Enter elements for an array");
		for(int i=0; i<arraysize; i++) 
		{
			a[i]=sc.nextInt();
		}
		
		int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if (a[i] > max){
				max=a[i];
			}
			if (a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Min :"+min);
		System.out.println("Max :"+max);
		
		int [] b=new int[arraysize];
		for(int i=0;i<arraysize;i++)
		{
			b[i]=a[i]*5;
		}
		System.out.println("Array-");
		for(int i=0; i<b.length; i++)
			System.out.print(b[i]+" ");
	}
	

}
