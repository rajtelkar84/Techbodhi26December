package staticKeyword;

public class StaticVariableExample1 {
	
	//int count =0;
	
	 static int count;
	
	StaticVariableExample1()
	{
		count++;
	}
	
	void getcount()
	{
		System.out.println("Value of counter:"+count);
	}
	
	public static void main(String[] args) {
		
		StaticVariableExample1 st1 = new StaticVariableExample1();
		st1.getcount();
		
		StaticVariableExample1 st2 = new StaticVariableExample1();
		st2.getcount();
		
		StaticVariableExample1 st3 = new StaticVariableExample1();
		st3.getcount();
		
		
	}

}
