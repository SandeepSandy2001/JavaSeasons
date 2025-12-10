package d4conditionalstatements;

public class MultipleStatements {

	public static void main(String[] args) {
		
		//example 1
		/*if(false)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(2);
		}
       */
		
		/*if(1==2)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}*/
		
		//Example 2
		if(true)
		{
			if(true)
			{
				System.out.println("ABC");
			}
			else
			{
				System.out.println("XYZ");
			}
		}
		else
		{
			System.out.println("123");
		}
		
		
		
	}

}
