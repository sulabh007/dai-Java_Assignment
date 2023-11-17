import java.util.*;
public class UtilityList
{
	private List<Student> list=new LinkedList<Student>();
	
	public void createList()
	{
		System.out.println("Enter Details of 3 Studetns:");
		for(int i=1;i<4;i++)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No. of Student "+i+": ");
		int rollno=sc.nextInt();
		System.out.println("Enter Name of Student "+i+": ");
		String name=sc.next();
		System.out.println("Enter Percentage of Student "+i+": ");
		double percentage=sc.nextDouble();
		System.out.println("Enter 3 Skills for Student "+i+": ");
		Set<String> s=new LinkedHashSet<>();
		for(int i1=1;i1 < 4; i1++)
		{
			System.out.println("Enter Skill "+i1+": ");
			s.add(sc.next());
		}
		Student s1= new Student(rollno, name, percentage, s);
		
		list.add(s1);
		}
	}
	public void printList()
	{
		for(Student s:list)
			s.display();
		
	}
	public List<Student> getList() {
		return list;
	}
	
}