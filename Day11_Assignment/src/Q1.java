//1.Write a java code to copy "src.txt" file into another file "dest.txt"

import java.io.*;


public class Q1 {

	public static void main(String[] args) {
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
	}

}
