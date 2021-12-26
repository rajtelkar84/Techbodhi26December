package stringClassExample;

public class StringMethods {
	
	public static void main(String[] args) {
		
	String s = "My name is Rajkumar Telkar";
	
	// 1. Length method	
	
	int lngth = s.length();	
	System.out.println("Length od string is -"+lngth);
	
	// 2. charAt method
	char charatt=s.charAt(5);
	System.out.println("Character at particuler index:-"+charatt);
	
	// 3. Substring
	String fullName=s.substring(11);
	System.out.println("Substring:-"+fullName);
	String Name = s.substring(11, 19);
	System.out.println("Substring:-"+Name);
	
	// 4. equals Method
	String s1= "Rajkumar";
	String s2 = "Raj";
	System.out.println("Equals Method:-"+s1.equals(s2));
	
	//5 contains method
	System.out.println("contains Method:-"+s1.contains(s2));
	
	// index of , last indexof
	System.out.println("Index of Method 1:"+s.indexOf('a'));
	System.out.println("Index of Method 2:"+s.indexOf('a', 6));
	System.out.println("Index of Method 3:"+s.indexOf("Raj"));
	System.out.println("Last Index of Method 1:"+s.lastIndexOf('a'));
	
	// 6. conact 
	String con1= "Rajkumar";
	String con2="Telkar";
	System.out.println("Concat :-"+con1.concat(con2));
	
	// 7. Replace method	
	System.out.println("Replace:-"+s.replace("Rajkumar", "Raj"));
	
	// 8.uppercase lowercase
	System.out.println("Uppercase:-"+s.toUpperCase());
	System.out.println("Lowercase:-"+s.toLowerCase());
	
	//9. split method
	 String[] splt = s.split(" ");
	 for(String a:splt){
		 {
			 System.out.println("eachvalue of splitted string:---"+a);
		 }
	 }
	
    // 10.join	
	 String gfg1 = String.join(" < ", "Four", "Five", "Six", "Seven");	  
     System.out.println("JoinExample---"+gfg1);	
	
	}	

}
