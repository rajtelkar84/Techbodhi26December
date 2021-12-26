package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
			
		List<String> ar = new ArrayList<String>();
		ar.add("Rajkumar");
		ar.add("Nihansh");
		ar.add("Ram");
		ar.add("Sanjay");
		ar.add("Sanjay");
		ar.add(null);
		ar.add(null);
		//ar.add(10);
		ar.add("...................");
		// first way iterator
		Iterator<String> it =ar.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		// second way for each loop
		for(String ab:ar)
		{
			System.out.println(ab);
		}
		
		// third way
		System.out.println("Traversing list through for loop:");  
        for(int i=0;i<ar.size();i++)  
        {  
         System.out.println(ar.get(i));     
        }  
       
        
	}

}
