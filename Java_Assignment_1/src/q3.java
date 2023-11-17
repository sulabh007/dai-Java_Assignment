//Write a program to swap two variables using a third variable and without using third variable.
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		int a, b, d, e;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers for swapping:");
		a = sc.nextInt();
		b = sc.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping a = "+a +"\nb = "+b);
		
		System.out.println("Enter two numbers for swapping:");
		d = sc.nextInt();
		e = sc.nextInt();
		d = d+e;
		e = d-e;
		d = d-e;
		System.out.println("After swapping \n1st element = "+d +"\n2nd element = "+e);
		
	}

}
