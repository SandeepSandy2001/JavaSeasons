package JavaInterviewAssignments;

import java.util.Arrays;

public class CheckArraysAreEqual {

	public static void main(String[] args) 
	{
		//Approach1
		int a1[] = {1,2,3,4};
		int a2[] = {1,2,3,4};
				
		boolean status = Arrays.equals(a1,a2);
		if(status==true)
			{
				System.out.println("Arrays are Equal");
			}
			else
			{
				System.out.println("Arrays are not equal");
			}
				
			//Approach 2
			int a3[] = {9,8,7,6,5};
			int a4[] = {9,8,7,6,5};
				
			boolean status1 = true;
			if(a3.length==a4.length)
			{
				for(int i=0;i<a3.length;i++)
				  {
					if(a3[i] !=a4[i])
					 {
						status= false;
					 }
				  }
			}
			else
			{
				status=false;
			}
				
			if(status==true)
			{
				System.out.println("Arrays are Equal");
			}
			else
			{
				System.out.println("Arrays are not equal");
			}
	}
			
}
