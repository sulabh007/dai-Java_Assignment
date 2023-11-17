/*Create two different threads t1 and t2. Accept a number from the user.
 * 		t1 ==> prints next 10 incremented values of user entered number.
 * 		t2 ==> prints multiplication table of the same user entered number.*/
import java.util.Scanner;
class MyThread implements Runnable
{
	Thread t1, t2;
	int num;
	
	public MyThread(int num) 
	{	
		this.num=num;
		t1=new Thread(this,"t1");
		t2=new Thread(this,"t2");
		t1.start();
		t2.start();
	}
	public void run()
	{	while(Thread.currentThread()==t1)
		{
		for(int i=0;i<10; i++)
		{
			this.num=num++;
			System.out.println(num);
			
		}
		break;
		}
	
		System.out.println();	
		
		while(Thread.currentThread()==t2)
		{
			for(int i=1;i<11; i++)
			{
				int table=num*i;
				System.out.println(table);
				
			}
			break;
		}
		
	}
	
}

public class Multithreading {

	public static void main(String[] args) 
	{
		System.out.println("Enter a Number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println();
		new MyThread(num);

	}

}

