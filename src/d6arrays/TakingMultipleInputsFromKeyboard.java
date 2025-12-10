package d6arrays;

import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		//Example 1
		/*System.out.println("Enter First Number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int num2 = sc.nextInt();
		
		System.out.println("Addition of 2 Numbers:"+(num1+num2));
		*/
		
		//Example 2
		
		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Your name is:"+name);
		
		System.out.println("Enter your Age:");
		int age = sc.nextInt();
		System.out.println("Your age is:"+age);
		
		System.out.println("Enter unknown Value:");
		Object value = sc.next();
		System.out.println("Your Unknown value:"+value);
	}

}
