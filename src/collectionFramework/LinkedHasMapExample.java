package collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMapExample {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();    
	      hm.put(100,"Amit");    
	      hm.put(105,"Vijay");    
	      hm.put(102,"Rahul");   
	      System.out.println("Initial list of elements:");  
	     for(Map.Entry m:hm.entrySet())  
	     {  
	        System.out.println(m.getKey()+" "+m.getValue());   
	     }  
	}

}
