/*Write a program to accept and display 3 by 3 matrix. Use enhanced for loop for display.
	a.Find the transpose of a matrix and print the transpose. 
	b.Accept another matrix of same dimensions.  Find the addition of two matrices 
	and print the resultant matrix. 
*/
import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [][] a=new int[3][3];
		int [][] b=new int[3][3];
		int [][] c=new int[3][3];
		System.out.println("Enter array elements");
		for(int i=0; i<a.length; i++) 
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}	

		System.out.println("Transpose of array:");
		for(int i=0; i<a.length; i++) 
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("Enter array elements for 2nd array:");
		for(int i=0; i<b.length; i++) 
		{
			for(int j=0; j<b[i].length; j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<a.length; i++) 
		{
			for(int j=0; j<a[i].length; j++)
			{
				c[j][i]=a[j][i]+b[j][i];
			}
		}
		System.out.println("Addition of array:");
		for(int i=0; i<c.length; i++) 
		{
			for(int j=0; j<c[i].length; j++)
			{
				System.out.print(c[j][i]+" ");
			}
			System.out.println(" ");
		}
	
	}

}
