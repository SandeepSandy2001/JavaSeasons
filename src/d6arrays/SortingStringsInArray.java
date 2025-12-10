package d6arrays;

import java.util.Arrays;

public class SortingStringsInArray {

	public static void main(String[] args) 
	{
		//char s[] = {'D', 'C', 'B', 'A'};
		
		String s[] = {"Scott", "Marry", "John", "David"};
		
		System.out.println("Before Sorting.."+Arrays.toString(s));
		
		Arrays.sort(s);
		System.out.println("After Sorting.."+Arrays.toString(s));
		

	}

}
