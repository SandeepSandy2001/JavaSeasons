package d8StringExamples;

import java.util.Arrays;

public class MutableVsImutable {

	public static void main(String[] args) 
	{
		//Mutable --> can change
		
		int a[] = {20,30,10,50,40};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//imutable --> We cannot change
		
		String s = new String("Welcome");
		System.out.println(s);
		String s1 = s.concat("to java");
		System.out.println(s); //immutable cannot change
        System.out.println(s1);
        
        //Only string is immuatble in java other all are mutable 
        //StringBuffer and StringBuilder are mutable object in java 
	}

}
