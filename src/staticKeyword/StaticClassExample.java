package staticKeyword;

public class StaticClassExample {
	
	static String abc = "hello Alexa";
	String cde = "Hello Google";
	
	static class InnerclassStatic
	{
		static void print()
		{
			System.out.println(abc);
		//	System.out.println(cde); // can not access the outer class non static member
		}
		
		void method1()
		{
			System.out.println("method1");
		}
	}
	
	public static void main(String args[])
	{
		StaticClassExample.InnerclassStatic.print();  // same as InnerclassStatic.print();
		StaticClassExample.InnerclassStatic in = new StaticClassExample.InnerclassStatic(); // or InnerclassStatic in = new InnerclassStatic();
		in.method1();
		
		StaticClassExample st2 = new StaticClassExample();
				System.out.println(st2.cde);
		
	}

}
