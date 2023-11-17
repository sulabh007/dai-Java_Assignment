//Write a program to find maximum of three numbers using conditional operators.
import java.util.Scanner;
public class q7 {

	public static void main(String[] args) {
		float a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three digits :");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		if (a>b && a > c) {
			System.out.println("Maximum number is :"+a);
		}
		if (b>a && b > c) {
			System.out.println("Maximum number is :"+b);
		}
		if (c>a && c > b ) {
			System.out.println("Maximum number is :"+c);
		}
		if (a == b && b == c) {
			System.out.println("All numbers are equal");
		}

	}

}
