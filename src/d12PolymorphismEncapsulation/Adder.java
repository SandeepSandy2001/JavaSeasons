package d12PolymorphismEncapsulation;

/*Rules for applicable:
->Method names should be same
->Number of parameters should be different
->Data type parameters should be different
->Order of parameters should be different*/

public class Adder 
{
	int a=10, b=20;
	
	void sum()               //1st method
	{
		System.out.println(a+b);			
	}
	
	void sum(int x, int y)     //2nd method
	{
		System.out.println(x+y);	
	}
	
	void sum(int x, double y)    //3rd method
	{
		System.out.println(x+y);
	}
	
	void sum(double x, int y)  //4th method
	{
		System.out.println(x+y);
	}
	
	void sum(int a, int b, int c)  //5th method
	{
		System.out.println(a+b+c);
	}

}
