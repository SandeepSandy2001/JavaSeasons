package JavaInterviewAssignments;

import java.util.Scanner;

public class Largest3Numbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter a second number: ");
		int b = sc.nextInt();
		
		System.out.println("Enter a third number: ");
		int c = sc.nextInt();
//		
//		
//		if(a>b && a>c)
//		{
//			System.out.println(a+ " is largest");
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println(b+ " is largest");
//		}
//		else
//		{
//			System.out.println(c+ " is largest");
//		}
		  
		//Approach 2
		int largest = a>b?a:b;
		
		int largest1 = c>largest?c:largest;
		
		System.out.println(largest1 +" is a largest number");
	
		//or
		
//		int largest = c>(a>b?a:b)?c:(a>b?a:b);
//		System.out.println(largest+" is a largest number");
//		
		

	}

}
