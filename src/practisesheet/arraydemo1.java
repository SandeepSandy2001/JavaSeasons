package practisesheet;

public class arraydemo1{
	
	public static void main(String[]args)
	{
		int a[] = {10,30,80,40,60};
		int max = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum number in array is: "+max);
		
		int b[] = {30,80,60,10,50};
		int min = a[0];
		for(int i=1;i<b.length;i++)
		{
			if(b[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println("Minimum number in array is: "+min);
	}
}

	


	

