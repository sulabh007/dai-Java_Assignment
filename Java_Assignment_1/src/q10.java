//Write a program to generate all possible combinations of 1, 2, 3 using for loop.
import java.util.Scanner;
public class q10 {

	public static void main(String[] args) {	
		for(int a=1;a<=3;a++) {
			for(int b=1;b<=3;b++) {
				for(int c=1;c<=3;c++) {
					if(a!=b&&a!=c&&b!=c){
						System.out.print(a);
						System.out.print(b);
						System.out.print(c);
						System.out.println();
					}
					
			}
			
		}
		}

	}

}
