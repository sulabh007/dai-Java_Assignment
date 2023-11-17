//Using switch-case construct, write a menu driven program to perform basic calculations 
//(addition, subtraction, multiplication and division) on two user entered numbers.
import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		float a,b, res = 0;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two digits :");
		a = sc.nextFloat();
		b = sc.nextFloat();
		System.out.println("Enter choice for Operation to perform\n1.Addition\n2.Substracion\n3.Multiplication\n4.Division :");
		c = sc.nextInt();
		switch(c) {
		case 1:
			res = a + b;
			System.out.println("Addition is :"+res);
			break;
		case 2:
			res = a - b;
			System.out.println("Substraction is :"+res);
			break;
		case 3:
			res = a * b;
			System.out.println("Multipication is :"+res);
			break;
		case 4:
			res = a / b;
			System.out.println("Division is :"+res);
			break;
		default:
			System.out.println("Invalid Input");
			break;
	};
	}
}
