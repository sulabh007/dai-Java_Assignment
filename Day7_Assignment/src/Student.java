import java.util.*;
class Student implements Comparable<Student>
{
	private int rollno;
		private String name;
		private double percentage;
		private Set<String> skillset;
		
		public Student(int rollno, String name, double percentage, Set<String> skillset) 
		{
			this.rollno = rollno;
			this.name = name;
			this.percentage = percentage;
			this.skillset = skillset;
		}
		
		public void display()
		{
			System.out.println();
			System.out.println("Roll No.:"+rollno);
			System.out.println("Name :"+name);
			System.out.println("Percentage :"+percentage);
			System.out.println("Skillset :");
			for(String s:skillset)
			{
				System.out.println("   "+s);
			}
			System.out.println();
			
		}

		public double getPercentage() 
		{
			return percentage;
		}

		@Override
		public int compareTo(Student o) {
			if(this.rollno > o.rollno)
				return 1;
			else if(this.rollno < o.rollno)
				return -1;
			else 
				return 0;
		}	
}

class CompareStudents implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2)
	{
		if(o1.getPercentage()>o1.getPercentage())
			return 1;
		else if(o1.getPercentage()<o2.getPercentage())
			return -1;
		else
			return 0;
			
	}
}
