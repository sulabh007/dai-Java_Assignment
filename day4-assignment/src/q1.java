/* 1. Write a class Student having following –
Student Roll Number (int)
Student Name (String)
Date of Birth (Date class object where Date is user defined class)
Implement default constructor, parameterized constructor, accept, display. 
Generate the student roll number automatically.
*/

import in.cdac.Student;

public class q1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.accept();
		s1.display();
		Student s2 = new Student();
		s2.accept();
		s2.display();

	}

}
