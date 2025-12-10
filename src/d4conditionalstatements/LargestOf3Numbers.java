package d4conditionalstatements;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		/*a>b and a>c --> a is largest
		b>a and b>c --> b is largest
		c>a and c>b --> c is largest
        */
		
		int a=1000, b=200, c=300;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number"+" "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest numbeer");
		}
		else
		{
			System.out.println("c is largest number");
		}
	}

}
