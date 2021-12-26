package polymorphism;

public class MethodOverLoading1 {
	
	public float add(int a,int b)
	{
		System.out.println(a+b);
		return a+b;
	}
	
	public float add(float a,float b,float c)
	{
		System.out.println(a+b+c);
		return a+b+c;
	}
	
	public float add(float a,float b)
	{
		System.out.println(a+b);
		return a+b;
		
	}
	

	
	
	public static void main(String[] args) {
		
		MethodOverLoading1 md = new MethodOverLoading1();
		md.add(11.2f, 22.2f);
		md.add(12, 13);
		md.add(5,15.2f,13.3f);
	}

}

