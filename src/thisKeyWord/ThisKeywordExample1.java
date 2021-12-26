package thisKeyWord;

public class ThisKeywordExample1 {
	
	int rollno;  
	String name;  
	float fee;  
	
	ThisKeywordExample1(int rollno,String name,float fee)
	{  
	this.rollno=rollno;  // chnage now to this.rollno=rollno
	name=name;  // change to this.name = name
	fee=fee;  // change to this.fee=fee
	}  
	void display()
	
	{
		System.out.println(rollno+" "+name+" "+fee);
		 
	}  

    
public static void main(String args[])
{
	ThisKeywordExample1 th1 = new ThisKeywordExample1(12345,"raj",25000);
	ThisKeywordExample1 th2 = new ThisKeywordExample1(6759,"Anand",30000);	
	th1.display();
	th2.display();
	
}
}
