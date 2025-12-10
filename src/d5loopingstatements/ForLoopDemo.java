package d5loopingstatements;

public class ForLoopDemo {

	public static void main(String[] args)
	{
		//Example 1-> 1....10 numbers
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		//Example 2-> 1....10 Even numbers
		
		for(int i=2; i<=10; i+=2)
		{
			System.out.println(i);
		}
		
		//Example 3-> 1...10 Even and odd numbers
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+ " - " +"Even");
			}
			else
			{
				System.out.println(i+" - "+ "odd");
			}
		}
		
		//Example 4-> 10....1 descending order
		for(int i=10; i>0; i--)
		{
			System.out.println(i);
		}

	}

}
