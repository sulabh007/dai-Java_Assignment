//Write a program to print whether user entered number is an Armstrong number.  
//Armstrong number is one for which the sum of the cube of all its digits is same as the number.  
//For example,153 = (1*1*1) + (5*5*5) + (3*3*3)
import java.util.Scanner;
public class q8 {

	public static void main(String[] args) {
		int num, dg, res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is an Armstrong Number :");
		num = sc.nextInt();
		int cump = num;
		while (num != 0) {
			dg = num%10;
			res =res + (dg*dg*dg);
			num = num / 10;
		}
		if (res == cump) {
			System.out.println(" It is an Armstrong Number");
		}
		else {
			System.out.println(" It is not an Armstrong Number");
		}
	}

}
