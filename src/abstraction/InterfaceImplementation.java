package abstraction;

import java.nio.charset.MalformedInputException;

public class InterfaceImplementation implements InterFace1{

	@Override
	public void method1() {
		System.out.println("method1");		
	}

	@Override
	public void method2() {
		System.out.println("Method 2");	
			
	}
	
	public static void main(String[] args) {
		
		// a= 20; -- can not chage the value as it is final
		
		System.out.println(a);
		InterFace1 if1 = new InterfaceImplementation();
		if1.method1();
		if1.method2();
	}

}
