package constructor;

public class ParameterizedConstructor {
	
	int id;
	String name;
	
	ParameterizedConstructor(int i,String n)
	{
		id =i;
		name = n;
	}
	
	void display()
	{
		System.out.println(name+" "+id);
	}
	
	
	public static void main(String[] args) {
		
		ParameterizedConstructor pm = new ParameterizedConstructor(305313,"Raj");
		ParameterizedConstructor pm1 = new ParameterizedConstructor(301012,"Ram");
		
		pm.display();
		pm1.display();
	}

}
