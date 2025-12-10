package d6arrays;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) 
	{
		 
		//int num =20   hard code value
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Enter a Number");
		int num= sc.nextInt();
		
		System.out.println("Given number is:" +num);
		
		
		System.out.println("Enter a Decimal Number");
		double num = sc.nextDouble();
		System.out.println("Given number is "+num);
		*/
		
		System.out.println("Enter your city");
		String city = sc.next();
		System.out.println("Your city is:"+city);
	}

}
