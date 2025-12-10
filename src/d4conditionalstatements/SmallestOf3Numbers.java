package d4conditionalstatements;

public class SmallestOf3Numbers {

	public static void main(String[] args) 
	{
          int a=100, b=200, c=300;
		
		if(a<b && a<c)
		{
			System.out.println("a is smallest number"+" "+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("b is smallest numbeer"+" "+b);
		}
		else
		{
			System.out.println("c is smallest number"+" "+c);
		}
	}

}


