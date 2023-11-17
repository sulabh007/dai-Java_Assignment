package com.cdac.pack1;

public class Student {
	private int rollno;
	private String name;
	private static int rollnocnt=101;
	public Student()
	{
		this.rollno=000;
		name="xxx";
	}
	public Student( String name)
	{
		this.rollno=Student.rollnocnt++;
		this.name=name;
		System.out.println("Student [rollno=" + rollno + ", name=" + name + "]");
	}


}
