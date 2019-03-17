package Session1;

public class SampleProject 
{
	static String Name="shadows";
	static int Age=23;
	int weight=50;
	String Gender="male";
	static String FirstName="Shadows";
	static String LastName="Academy";
	static String c;
	

	static void run()
	{
		int Speed;
	}
	static void eat()
	{
		
	}
	static void sleep()
	{
		
	}
	public String invent()
	{
		c=FirstName+LastName;
		return c;
		
	}
	
	void TechTalk()
	{
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			SampleProject sp1=new SampleProject();
			Age=30;
			sp1.weight=60;		
			SampleProject sp2=new SampleProject();
			System.out.println(Age);
			System.out.println(sp2.weight);
			System.out.println(sp1.Gender);
			sp1.invent();
			System.out.println("Mr."+c);
	}

}
