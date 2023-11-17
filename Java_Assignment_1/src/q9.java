//Write a program to display whether a user entered number is prime or not.
import java.util.Scanner;
import java.lang.Math;
public class q9 {

	public static void main(String[] args) {
		int num;
		boolean check=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num = sc.nextInt();
		
		for(int i = 2; i < Math.sqrt(num); i++) {
			if((num%i)==0) {
				check = false;
				break;
			}
		}
		if(check==false) {
			System.out.println("Its Not a Prime Number");
		}
		else {
			System.out.println("Its a Prime Number");
		}
		

	}

}
