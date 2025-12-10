package d18Exceptions;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) 
	{
		System.out.println("Program is Started....");
		
		Scanner sc = new Scanner(System.in);
		
		//Example 1
		System.out.println("Enter a Number:");
		int num = sc.nextInt();	
		System.out.println(100/num);  //Arithmetic Exception
		
		//Example 2
		int a[] = new int[5];
		System.out.println("Enter the position(0-4):");
		int pos = sc.nextInt();
		
		System.out.println("Enter a value");
		int value = sc.nextInt();
		
		a[pos] = value;  //ArrayIndexOutOfBoundsException
		System.out.println(a[pos]);
		
		//Example 3
		String s = "12345";
		int num1 = Integer.parseInt(s); //NumberFormatException
		System.out.println(num1);
		
		//Example 4
		String s1 = null;
		System.out.println(s1.length()); //NullPointerException
		
		System.out.println("Program is completed..");
		System.out.println("Program is Exited..");
	}

}
