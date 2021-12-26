package excptionHandling;

public class MultipleCatchBlock {
	
	public static void main(String args[]){    
		   try{    
		    int a[]=new int[5];    
		    a[9]=30/0;  
		    System.out.println("try block");
		   }    
		 //  catch(Exception e){System.out.println("common task completed");}    
		   catch(ArithmeticException e)
		   {
			   System.out.println("task1 is completed");
		   }    
		   catch(ArrayIndexOutOfBoundsException e)
		   {
			   System.out.println("task 2 completed");
		   }   
		   
		   catch(Exception e)
		   {
			   System.out.println("common task completed");
		   } 
		   
		   finally
		   {
			   System.out.println("This code will always executed");
		   }
		   
		   System.out.println("rest of the code...");    
		 }    

}
