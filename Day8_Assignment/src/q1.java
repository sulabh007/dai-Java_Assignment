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
 * 
 * c.Write a class 'UtilityReport' has a method 'showReport()' This method shows report 
 * like: StudentName-->Percentage
 * 		class UtilityReport
 * 		{
 * 			private Map<String, Double> m;
 * 			//method of class UtilityReport
 * 		}
 * 
 * */
public class q1 {

	public static void main(String[] args) {
		UtilityList s1= new UtilityList();
		s1.createList();
		s1.printList();
		UtilityReport u1= new UtilityReport(s1);
		
		u1.ShowReport();
		System.out.println("End of Program");

	}

}
