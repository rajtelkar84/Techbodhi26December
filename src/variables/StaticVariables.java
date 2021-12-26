package variables;

public class StaticVariables {
	
	int rollNumber;
	String name;
	static String collegename = "OIST"; // this is static variable will get memory only once at the time of class loading
	
	
	StaticVariables(int r,String n)
	{
		rollNumber = r;
		name = n;
	}
	
	void ToPrint() {
		
		System.out.println(rollNumber);
		System.out.println(name);
		System.out.println(collegename);

	}
	
	public static void main(String[] args) {
		
		StaticVariables st1 = new StaticVariables(123456,"Rajkumar");
		StaticVariables st2 = new StaticVariables(987456,"Anand");		
		st1.ToPrint();
		st2.ToPrint();
		
	}
	

}
