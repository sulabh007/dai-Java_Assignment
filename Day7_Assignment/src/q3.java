/*3. Sort the objects of class Student (implemented earlier) according to their rollno.
 *  Use comparable interface.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class q3 {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		Set<String> set=new LinkedHashSet<>();
		set.add("Java");
		set.add("Python");
		set.add("Oracle");
		
		list.add(new Student(103,"Deepak",85,set));
		list.add(new Student(102,"Raj",90.6,set));
		list.add(new Student(101,"Virat",88.4,set));

		for(Student l:list)
			l.display();
	
		Collections.sort(list);
		System.out.println();
		
		for(Student l:list)
			l.display();

	}

}
