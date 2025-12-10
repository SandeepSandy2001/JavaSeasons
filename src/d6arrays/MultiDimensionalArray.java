package d6arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) 
	{
		//declaring array
		//Approach1
		
		/*int a[][] = new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		
		//approach 2
		
		int a[][]= {{100,200} , {300,400}, {500,600}};
		
		//find length of an array
		System.out.println("length of rows:"+a.length);
		System.out.println("length of columns:"+a[0].length);
		
		//read single value from an array
		
		System.out.println(a[2][1]);
		System.out.println(a[1][0]);
		
		//read all the rows and columns from array
		//normal for loop
		
		/*for(int r=0; r<=2; r++)
		{
			for(int c=0; c<=1; c++)
			{
				System.out.println(a[r][c]);
			}
		}    
		 
		          //or
		for(int r=0; r<=2; r++)
		{
			for(int c=0; c<=1; c++)    //c<=1 ==>c<a[r].length-1
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}*/
		
		//enhanced for loop
		
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+ " ");
			}
			System.out.println();
		}
		
		

	}

}
