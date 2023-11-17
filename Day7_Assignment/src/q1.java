/*
 * 1. a.Write a student class with attributes -
 * 		class Student
 * 		{
 * 			private int rollno;
 * 			private String name;
 * 			private double percentage;
 * 			private Set<String> skillset;
 * 
 * 			// methods of Student class
 * 		}
 * 	 b.Now Write a class 'UnilityList' which has list of Student objects as memeber.
 * 		class UtilityList
 * 		{
 * 			private List<Student> list;
 * 			// methods of Utility class
 * 		}
 * Implements methods 'createList()' and 'printList()' in class UtilityList.
 * 		createList - will accept Students from user and will store it into list of students.
 * 		printList - will print whole list of students.
 * */
public class q1 {

	public static void main(String[] args) {
		UtilityList s1= new UtilityList();
		s1.createList();
		s1.printList();
		System.out.println("End of Program");

	}

}
