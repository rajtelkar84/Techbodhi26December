package programmesInJava;

public class PalidromeNumber {
	public static void main(String[] args) {
		
		int n=656 , r ,sum=0 ;
		
		int temp = n;
		
		while(n>0)
		{
			r = n%10;
			sum = sum*10+r;
			n =n/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Plaidrome Number");
		}
		else
		{
			System.out.println("Not a Palidrome Number");
		}
		
	}

}
