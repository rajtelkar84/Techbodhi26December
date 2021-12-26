package superKeyWord;

public class SuperConstructor1Implementation extends SuperConstructor1 {
	
	SuperConstructor1Implementation(int c)
	{
		//super();// -- JVM will give call to parent constructor implicitly if parametrised constructor is not used
		super(12);
		System.out.println("child class parametrised constructor");
	}
	
	public static void main(String[] args) {
		
		SuperConstructor1Implementation scm = new SuperConstructor1Implementation(10);
	}
}
