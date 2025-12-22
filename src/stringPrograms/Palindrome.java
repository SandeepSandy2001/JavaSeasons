package stringPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		System.out.println("Enter a palindrome");
		Scanner input = new Scanner(System.in);
		String str =input.next();
		checkStringIsPalindrome(str);
	}

	private static void checkStringIsPalindrome(String str) 
	{
		str=str.toLowerCase();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(str))
		{
			System.out.println(str +" is palindrome");
		}
		else
		{
			System.out.println(str +" is not a palindrome");
		}
		
	}
	
}
