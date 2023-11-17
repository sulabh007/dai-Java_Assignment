interface printable
{
	public void printDetails();
}
class CktPlayers implements printable
{
	private String name;
	private int runs;
	public void printDetails() 
	{
		System.out.println("Name : "+name);
		System.out.println("Runs : "+runs);
		System.out.println();
		
	}
	public CktPlayers()
	{
		name="abc";
		runs=0;
		
	}
	public CktPlayers(String name, int runs)
	{
		this.name=name;
		this.runs=runs;
		
	}
}
class FtPlayers implements printable
{
	private String name;
	private int goals;
	public FtPlayers()
	{
		name="abc";
		goals=0;
		
	}
	public FtPlayers(String name, int goals)
	{
		this.name=name;
		this.goals=goals;
		
	}
	public void printDetails() 
	{
		System.out.println("Name : "+name);
		System.out.println("Goals : "+goals);
		System.out.println();
		
	}

}
public class q1 {

	public static void main(String[] args) {
		CktPlayers c1 = new CktPlayers("Virat",100);
		c1.printDetails();
		FtPlayers f1 = new FtPlayers("Messy",10);
		f1.printDetails();

	}

}
