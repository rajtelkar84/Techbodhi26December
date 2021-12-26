package HelloWorld;

public class HelloWorld {
	
	static int a;
	
	public static void main(String args[])
	{
		System.out.println("hello world");
		System.out.println("Rajkumr first test");
		
		HelloWorld hw = new HelloWorld();
		hw.add();
		int b =hw.substarct(20, 10);
		System.out.println(b);
		int a =hw.substarct(20,5);
		System.out.println(a);
	}	
	public void add()
	{
		System.out.println("add");
	}
	
	public int substarct(int a,int b)
	{
		 int abcd=0;
		 int xyza=abcd+3;
		int c = a-b;
		return c;
		
	}
}
