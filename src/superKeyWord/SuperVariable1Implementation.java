package superKeyWord;

public class SuperVariable1Implementation extends SuperVariable1 {
	
	String abc ="I am in child/derived class";
	
	void display()
	{
		System.out.println(abc);
		System.out.println(super.abc);
	}
	
	public static void main(String[] args) {
		
		SuperVariable1Implementation sp = new SuperVariable1Implementation();
		sp.display();
	}

}
