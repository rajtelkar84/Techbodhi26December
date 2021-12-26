package collectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<String>();  
        set.add("Ravi");  
        set.add("Vijay");  
        set.add("Ajay"); 
      //  set.add(null);--will give you run time error
        
        
        //Traversing elements  
        Iterator<String> itr=set.iterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next());  
        }  
        
        
        System.out.println("Traversing element through Iterator in descending order");  
        Iterator i=set.descendingIterator();  
        while(i.hasNext())  	
        {  
            System.out.println(i.next());  
        }  
	}

}
