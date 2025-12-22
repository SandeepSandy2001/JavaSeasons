package JavaInterviewAssignments;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) 
	{
		
//		int num = 123456;
//		int count = 0;
//		
//		while(num>0)
//		{
//			num = num/10;
//			count++;
//		}
//		System.out.println("Number of digits: " +count);
		
		 Scanner sc = new Scanner(System.in);  // Create Scanner object to read input
	        
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt(); 
	        int count = 0;
	        
	        while(num>0)
	        {
	        	num = num/10;
	        	count++;
	        }
	        System.out.println("Number of digits " + count);
		
	}
}
