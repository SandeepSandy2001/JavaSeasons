package d18Exceptions;

import java.util.Scanner;

public class HowToHandleExceptions {

	public static void main(String[] args) 
	{
		System.out.println("Program is started..");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println(num);
		
		try
		{
			System.out.println(100/num);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Data");
		}
		
		System.out.println("Program is completed..");
		System.out.println("Program is exited..");
		
		
	}

}
