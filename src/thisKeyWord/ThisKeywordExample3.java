package thisKeyWord;

public class ThisKeywordExample3 {
	
	ThisKeywordExample3()
	{
		this(5);
		System.out.println("Default Constructor");
	}
	
	ThisKeywordExample3(int a) {		
	//	this();
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		ThisKeywordExample3 th = new ThisKeywordExample3();
	}
	

}
