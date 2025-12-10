package d6arrays;

public class SearchingElementArray {

	public static void main(String[] args) 
	{
		//Example1 Searching an element in array(Linear Search)
		
		int a[] = {30,10,20,30,40,50,30};
		int search_element=30;
		
		boolean status =false;  //false -not found  ture - found
		
		/*for(int i=0; i<a.length; i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Element not found");
		}*/
		
		
		//enhanced for loop
		
		for(int x:a)
		{
			if(x==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("Element not found");
		}
	}

}
