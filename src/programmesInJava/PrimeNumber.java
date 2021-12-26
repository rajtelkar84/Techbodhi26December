package programmesInJava;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int number =14;
		int flag=0;
		
		for(int i=2;i<number-1;i++)
		{
			if(number%i==0)
			{
				System.out.println(number+" "+" is not prime number");
				flag=1;
				break;
			}					
		}
		if (flag==0)
		{
			System.out.println(number+" "+"is a prime number");
		}
	}

}
