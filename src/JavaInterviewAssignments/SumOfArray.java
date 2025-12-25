package JavaInterviewAssignments;

public class SumOfArray {

	public static void main(String[] args) 
	{
		int a[] = {3,9,7,5,4};
		
		int sum = 0;
		
		for(int i= 0;i<=a.length-1;i++)
		{
			sum = sum+a[i];
		}
		System.out.println("Sum of Array is: "+sum);
		
		//Approach2 Enhanced for loop:
		
		int b[] = {2,8,6,4,5};
		int sum1 = 0;
		
		for(int value:b)
		{
			sum1 = sum1+value;
		}
		System.out.println("Sum of Array is:"+sum1);
	}

}
