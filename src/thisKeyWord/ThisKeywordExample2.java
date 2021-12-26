package thisKeyWord;

public class ThisKeywordExample2 {
	
	void method1()
	{
		System.out.println("Hello");
	}

	void method2()
	{
		System.out.println("method2");
		this.method1(); 
		method1();// this is same as this.method1
	}
	public static void main(String[] args) {
		
		ThisKeywordExample2 th3 = new ThisKeywordExample2();
				th3.method2();
	}

}
