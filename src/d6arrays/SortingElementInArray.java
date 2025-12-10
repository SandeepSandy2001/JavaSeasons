package d6arrays;

import java.util.Arrays;

public class SortingElementInArray {

	public static void main(String[] args) 
	{
		int a[] = {100,600,200,400,500};
		
		System.out.println("Before Sorting....");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("After Sorting.....");
		System.out.println(Arrays.toString(a));
		
	}

}
