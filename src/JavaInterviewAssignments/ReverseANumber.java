package JavaInterviewAssignments;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num = sc.nextInt();
		
		//1) Using Algorithm
		int rev = 0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("Reverse a Number:" +rev);
		
		//2 Using String buffer class
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev1 =sb.reverse();
		System.out.println("Reverse a Number:" +rev1);
		
		//3 Using String Builder class
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev2 = sbl.reverse();		
		System.out.println("Reverse a Number:" +rev2);
	}
}
