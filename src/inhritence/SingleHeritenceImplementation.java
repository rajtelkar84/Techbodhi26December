package inhritence;

public class SingleHeritenceImplementation extends SingleHeritence {
	
	float bonus = 40000;
	
	void cde()
	{
		System.out.println("child class method");
	}
	
	public static void main(String[] args) {
		
		SingleHeritenceImplementation sh = new SingleHeritenceImplementation();
		System.out.println(sh.salary);
		System.out.println(sh.bonus);
		
		sh.abc();
		sh.cde();
		
	}

}
