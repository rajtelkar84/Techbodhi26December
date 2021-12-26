package conditionalStatment;

public class SwitchCaseProgram {
	public static void main(String[] args) {		
	int num=100;
	switch(num){
	
	case 100:
		System.out.println("Value of Case 1 is "+num);
		// need to use break else it will go to the next condition as well
		break;
	case 200:
		System.out.println("Value of Case 2 is "+num);
		break;
	default:
		System.out.println("Value of default is "+num);	
	}

}
}
