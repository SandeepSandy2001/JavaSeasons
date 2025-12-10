package d5loopingstatements;

public class WhileLoopDemo {

	public static void main(String[] args) 
	{
		//Example 1 Print 1 to 10 numbers
		
		int i=1;   //intilization
		
		while(i<=10) //condition
		{
			System.out.println(i); 
			i++;  //increment
		}
	    
		 //Example 2 Print hello message 10 times
		
		/*int i=1;
		
		while(i<=10)
		{
			System.out.println("Hello Sandy");
			i++;
		}*/
		
		//Example 3 Print even numbers between 1 to 10
		  //Approach 1
		/*int i=2;
		
		while(i<=10)
		{
		  System.out.println(i);
		  i+=2;  //i=i+2
		}*/
		
		//Approach 2
		
		/*int i=1;
		
		while(i<=10) 
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}*/
		
		//Example 4 Print 1 to 10 numbers (even/odd)
		
		/*int i=1;
		
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i +" - "+"Even");
			}
			else
			{
				System.out.println(i+" - "+"Odd");
			}
			i++;
		}*/
		
		//Example 5 Print 10 to 1 numbers
		
		/*int i=10;
		
		while(i>0)
		{
			System.out.println(i);
			i--;
		}*/
	}

}
