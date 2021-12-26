package abstraction;

public class AbstractClass1Implementation extends AbstractClass1 {

	@Override
	public void abstarctmethod1() {

     System.out.println("abstarct method 1 implemention");
		
	}
	
	public static void main(String args[])
	{
		//AbstractClass1 ab = new AbstractClass1(); //can not create the instance of abstarct class
		
		AbstractClass1 ab1 = new AbstractClass1Implementation();
		ab1.abstarctmethod1();
		ab1.simplemethod();
		
		AbstractClass1Implementation abc = new AbstractClass1Implementation();
		abc.abstarctmethod1();
		abc.simplemethod();
	}

}
