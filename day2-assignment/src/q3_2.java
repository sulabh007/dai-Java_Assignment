import java.util.Scanner;

public class q3_2 {

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
				c[i][j]=0;
				for(int k=0;k<a[i].length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("A:");
		for(int i=0; i<c.length; i++) 
		{
			for(int j=0; j<c[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("B:");
		for(int i=0; i<c.length; i++) 
		{
			for(int j=0; j<c[i].length; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Multipication of array:");
		for(int i=0; i<c.length; i++) 
		{
			for(int j=0; j<c[i].length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println(" ");
		}
	

	}

}
