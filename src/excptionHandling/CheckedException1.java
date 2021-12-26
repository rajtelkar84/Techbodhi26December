package excptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException1 {
	
	public static void main(String[] args) {
		
	
	
	
	FileInputStream fs=null;
	
	 // fs= new FileInputStream("C:\\Users\\telkaraj\\Desktop\\AllData_18June\\Mydocs\\TechBodhi\\File\\A.txt"); // -- this will give you compile time excption which can be handled by two ways
	
	try
	{
	   // fs = new FileInputStream("C:\\Users\\telkaraj\\Desktop\\AllData_18June\\Mydocs\\TechBodhi\\File\\B.txt"); 
		fs = new FileInputStream("C:\\Users\\telkaraj\\Desktop\\AllData_18June\\Mydocs\\TechBodhi\\File\\A.txt"); 
	}
	catch(FileNotFoundException fnfe)
	{
            System.out.println("The specified file is not " +
			"present at the given path");
	 }
	
	int k; 
	try{
	    while(( k = fs.read() ) != -1) 
	    { 
		System.out.print((char)k); 
	    } 
	    fs.close(); 
	}catch(IOException ioe){
	    System.out.println("I/O error occurred: "+ioe);
	 }

}
}
