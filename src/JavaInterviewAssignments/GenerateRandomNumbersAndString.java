package JavaInterviewAssignments;

import java.util.Random;

public class GenerateRandomNumbersAndString {

	public static void main(String[] args) 
	{
		//Approach1 -> Using Random class
		Random rand = new Random();
		int int_rand = rand.nextInt(1000);
		System.out.println(int_rand);
		
		double int_dbl = rand.nextDouble();   //range is 0.0 and less than 1.0
		System.out.println(int_dbl);
		
		//approach2 -> Using math
		System.out.println(Math.random());
		
//		//approach3
//		String randNum = RandomStringUtils.randomNumeric(10);
//		System.out.println(randNum);
//
//		String randStr = RandomStringUtils.randomAlphabetic(10);
//		System.out.println(randStr);
	}

}
