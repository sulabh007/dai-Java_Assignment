//Write a program to accept marks of five subjects from the user and calculate their average.

import java.util.Scanner;

public class day1_assignments_q1 {

	public static void main(String[] args) {
		int a, b, c, d, e;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks of five subject:");
		a = sc.nextInt();
		b = sc.nextInt();
       	c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
		
		float avg = (a+b+c+d+e)/5;
		
		System.out.println("Average Marks = "+avg);
		

	}

}
