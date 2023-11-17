import java.util.*;
public class UtilityReport
{
	Map<String, Double> m = new TreeMap<>();
	

	UtilityReport(UtilityList s1)
	{
		//UtilityList utilityList = new UtilityList();
		List<Student> list = s1.getList();
		
		for(Student s:list) {
			//System.out.println(s.getName()+" "+s.getPercentage());
			m.put(s.getName(),s.getPercentage());
		}
			
	}
	
	public void ShowReport() 
	{	Set<String> s2=m.keySet();
		for(String key:s2)
		{
			System.out.println(key+"---->"+m.get(key));
		}
		
	}
}
