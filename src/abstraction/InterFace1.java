package abstraction;

public interface InterFace1 {
	
//	int x;//Compile-time error -- interface variables must be initialized at the time of declaration otherwise compiler will throw an error.
	int a=10; // same as--- public static final int a=10;
	
	   public void method1();// -- same as public abstract void method1();
	   public void method2();// -- same as public abstract void method2();
}
