package d18Exceptions;

public class MultipleCatcheBlocks {

	public static void main(String[] args) 
	{
		System.out.println("Program is Started..");
		String s = null;
		
		try
		{
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled Exception..");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Handled Exception..");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Handled Exception..");
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Handled Exception..");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program is completed..");
	}

}
