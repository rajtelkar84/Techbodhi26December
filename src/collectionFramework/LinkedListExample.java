package collectionFramework;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		List<Integer> ab = new LinkedList<Integer>();
	    ab.add(12);
	    ab.add(12);
	    ab.add(90);
	  //  ab.add(null);
	  //  ab.add(null);
	    ab.add(55);	    
        // Sorting        
        Collections.sort(ab); 
        Iterator itr=ab.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
         } 
        
        ///Here, element iterates in reverse order  
        ListIterator<Integer> list1=ab.listIterator(ab.size());  
        while(list1.hasPrevious())  
        {  
            int str=list1.previous();  
            System.out.println(str);  
        } 

	}

}
