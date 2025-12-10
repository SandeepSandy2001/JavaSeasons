package methods;

public class MethodsDemo3 {
	
	//static method
	public static void natsum1(int n)
	{
		int res = n*(n+1)/2;
		System.out.println("Sum of "+n+" natural numbers "+res);
	}

	public static void main(String[] args) {
		
		MethodsDemo3.natsum1(5);
		MethodsDemo3.natsum1(10);
		MethodsDemo3.natsum1(100);
		MethodsDemo3.natsum1(1000);
	}

}
