//Write a program to add two numbers and store the result in a third variable. Print the result.
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int c = a+b;
		
		System.out.println("Sum = "+c);

	}

}
