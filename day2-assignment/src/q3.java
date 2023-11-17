import java.util.Scanner;

public class q3 {

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
				c[j][i]=a[j][i]*b[j][i];
			}
		}
		System.out.println("Multipication of array:");
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
