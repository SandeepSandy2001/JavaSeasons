package JavaInterviewAssignments;

import java.util.Scanner;

public class CountEvenAndOdddigits {

	public static void main(String[] args) 
	{
//		int num = 12345;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		
		int even_count = 0;
		int odd_count = 0;
		
		while(num>0)
		{
			int rem = num%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num = num/10;
		}
		System.out.println("Count of Even numbers: "+even_count);
		System.out.println("Count of Odd numbers: "+odd_count);

	}

}
