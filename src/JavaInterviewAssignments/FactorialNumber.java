package JavaInterviewAssignments;

public class FactorialNumber {

	public static void main(String[] args) 
	{	
		int num = 5;
		long factorial = 1;
		
		for(int i=1;i<=num;i++)
		{
			factorial = factorial*i;
		}
		System.out.println("Factorial number is :"+factorial);
		
		//Approach 2
		int num1 =5;
		long factorial1 = 1;
		
		for(int i = num1;i>=1;i--)
		{
			factorial1=factorial1*i;
		}
		System.out.println("Factorial number is :"+factorial1);
	}
}
