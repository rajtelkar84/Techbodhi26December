package programmesInJava;

public class PalidromeString {
	
	public static void main(String[] args) {
		
		String originaString = "My Name is Rajkumar Telkar";
		String reverstring = "";
		
		for(int i=originaString.length()-1;i>=0;i--)
		{
			reverstring = reverstring + originaString.charAt(i);
		}
		
		if(originaString.equals(reverstring))
		{
			System.out.println("string is palidrome");
		}
		else
		{
			System.out.println("String is not palidrome");
		}
	}

}
