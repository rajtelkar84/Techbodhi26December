package constructor;

public class DefaultConstructor2 {
	
	int id;
	String name;
	
	void display()
	{
		System.out.println(id+" "+name);
	}	
	public static void main(String[] args) {
		
		DefaultConstructor2 ds1 = new DefaultConstructor2();
		DefaultConstructor2 ds2 = new DefaultConstructor2();		
		ds1.display();
		ds2.display();	
		
	}
	

}
