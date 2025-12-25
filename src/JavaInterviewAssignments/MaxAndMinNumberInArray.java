package JavaInterviewAssignments;

public class MaxAndMinNumberInArray {

	public static void main(String[] args) 
	{
		int a[] = {30,60,10,80,40,100};
		
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println("Maximum number in array is: "+max);
		
		int b[] = {80,60,20,40,10};
		int min = b[0];
		
		for(int i=1;i<b.length;i++)
		{
			if(b[i]<min)
			{
				min=b[i];
			}
		}
		System.out.println("Minimum number in arrays is: "+min);
	}
}
