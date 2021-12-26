package variables;

public class LocalVariables {
	
	// This is instance variable as it is not inside any of the method block or constructor
	String instanceVariable = "This is instance variable";
	
	public void firstMethod()
	{
		// This is local variable as it is inside the method
		String localVariable = "This is local variable";		
		
		//access modifier can not assighn for local variable
		//public String abc1 ="access modifier can not assighn for local variable";
		
		//static can not be used for local variable		
		//static String cde = "static can not used for local variable";
		
		// Value should be assign before first use of local variable
		//String NoAsssignValue;
		//System.out.println(NoAsssignValue);
		
		System.out.println(localVariable);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		// Create a instance of class to access member of it
		LocalVariables ls = new LocalVariables();
		System.out.println(ls.instanceVariable);
		ls.firstMethod();
		
		
	}

}
