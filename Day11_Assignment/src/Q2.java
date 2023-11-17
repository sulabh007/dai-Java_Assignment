/*2.Write above program of file copy using multithreading
 * 		a. One thread to read from "src.txt".
 * 		b. Another thread to write into "dest.txt"*/

import java.io.*;

class FileIO implements Runnable
{
	private Thread t1,t2;
	int status=0;
	
	public FileIO() {
		t1=new Thread(this,"read");
		t2=new Thread(this,"write");
		t1.start();
		t2.start();
	}

	public void run() {
		while(true)
		{
			if(Thread.currentThread()==t1)
			{
				synchronized (this) {
					try {
						notifyAll();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
				File srcfile=new File("src.txt");
				try {
					srcfile.createNewFile();
				}catch(IOException e)
				{
					e.printStackTrace();
				}

				System.out.println("Source file created..");
				try {
				FileWriter fileWriter=new FileWriter(srcfile);
				fileWriter.write("This is first line into the file..");
				fileWriter.close();
				}catch(Exception e){
					
				}
				status=1;
				try {
					Thread.sleep(10);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				break;
			} 
			else if(Thread.currentThread()==t2)
			{
				if(status==0) {
				synchronized (this) {
					try {
						wait();
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					}
				}
				File destfile=new File("dest.txt");
				try {
					destfile.createNewFile();
				}catch(IOException e)
				{
					e.printStackTrace();
				}

				System.out.println("Destination file created..");
				try {
					char [] s=new char[100];
					File srcfile=new File("src.txt");
					FileReader fileReader=new FileReader(srcfile);
					fileReader.read(s);
					fileReader.close();
					FileWriter fileWriter=new FileWriter(destfile);
					fileWriter.write(s);
					fileWriter.close();
					
					}catch(Exception e){
						
					}
				try {
					char [] s1=new char[100];
					FileReader fileReader=new FileReader(destfile);
					fileReader.read(s1);
					System.out.println("From destination file :");
					System.out.println(s1);
					fileReader.close();

					}catch(Exception e){
						
					}
				break;
			}
		}
	}
}
public class Q2 {

	public static void main(String[] args) {
		FileIO i=new FileIO();
		i.run();
	}
}
