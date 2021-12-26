package conditionalStatment;

import java.util.Scanner;

public class IfElseStatmentExample {
	
	
	
	public static void main(String[] args) {	
		
		
	Scanner sc = new Scanner(System.in);	
	System.out.println("Please enter a number");
	
	int number=sc.nextInt();
	
	if(number%2==0)
	{  
        System.out.println("even number");  
    }
		else{  
        System.out.println("odd number");  
    }  	
	
	}
	
	
	
	

}
