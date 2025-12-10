package d6arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) 
	{
		//declaring array
		//Approach1
		/*int a[] = new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		*/
		
		//Approach 2
		
		int a[] = {100,200,300,400,500};
		
		//find length of an array
		System.out.println("Length of an array:" +a.length);
		
		//read single value from an array
		System.out.println(a[4]); //here 4 is index
		
		//normal for loop for reading all values from array
		
		for(int i=0; i<a.length;i++)  // i<=4   i<5  i<=a.length-1  i<a.length
		{
			System.out.println(a[i]);
		}
		
		//enhanced for loop/ for..each loop
		
		for(int x:a)
		{
			System.out.println(x);
		}
		
		
	}

}
