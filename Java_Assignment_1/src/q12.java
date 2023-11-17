//Write a program to check if user entered number is perfect number. 
//(A perfect number is a number for which sum of its factors equals that number 
//e.g. 6=1+2+3,  28=1+2+4+7+14)

import java.util.Scanner;

public class q12 {

	public static void main(String[] args) {
		int num, result=1,comp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		comp = num;
		
		for(int i = 2; i < Math.sqrt(num); i++) {
			if((num%i)==0) {
				result=result+num/i+i;
			}
			
			}
		if (num==result) {
			System.out.println("Enterd Number is a Perfect Number.");
		}
		else {
			System.out.println("Enterd Number is Not a Perfect Number.");
		}
		
	}

}
