package excptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException2 {
	
	public static void main(String args[]) throws IOException
	   {
	      FileInputStream fis = null;
	      fis = new FileInputStream("C:\\Users\\telkaraj\\Desktop\\AllData_18June\\Mydocs\\TechBodhi\\File\\A.txt"); 
	    //  fis = new FileInputStream("C:\\Users\\telkaraj\\Desktop\\AllData_18June\\Mydocs\\TechBodhi\\File\\B.txt"); 
	      int k; 

	      while(( k = fis.read() ) != -1) 
	      { 
		   System.out.print((char)k); 
	      } 
	      fis.close(); 	
	   }

}
