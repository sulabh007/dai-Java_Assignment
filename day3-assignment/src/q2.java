/*2. Write a class Student with members for rollno, name and percentage. 
 * Implement necessary methods inside class. Generate roll number 
 * automatically for objects created. Use static and take starting value as 101.
*/
import java.util.Scanner;
class Student
{
	private int rollno;
	private String name;
	private float percentage;
	private static int rollnocnt=101;
	public Student()
	{
		this.rollno=000;
		name="xxx";
		percentage=0;
	}
	public Student( String name, float percentage)
	{
		this.rollno=Student.rollnocnt++;
		this.name=name;
		this.percentage=percentage;
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
	}
	public int getrollno(){
		return rollno;
	}
	public String getName(){
		return name;
	}
	public float getpercentage(){
		return percentage;
	}

	public void setName(String name){
		this.name=name;
	}
	public void setpercentage(float percentage){
		this.percentage=percentage;
	}
	public void deposit(float amt) 
	{
		this.percentage =this.percentage + amt;
	}
	public void withdraw(float amt)
	{
		this.percentage =this.percentage - amt;
	}
		
}
public class q2 {

	public static void main(String[] args) {
		String name;
		float percentage;
		
		Scanner sc = new Scanner(System.in);
		Student s1=new Student("Raj",89);
		Student s2=new Student("Taj",89);
		System.out.println(s2);

	}

}
