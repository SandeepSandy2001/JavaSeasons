package stringPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		System.out.println("Enter a Number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		reverseOfNumber(num);
	}
	private static void reverseOfNumber(int num) 
	{
		System.out.println(num);
		
		int rev =0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse of number is "+rev);
	}
	

}
