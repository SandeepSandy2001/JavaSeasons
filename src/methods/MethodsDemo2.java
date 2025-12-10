package methods;

public class MethodsDemo2 {
	
	//Not static method
	public void natsum1(int n)
	{
		int res = n*(n+1)/2;
		System.out.println("Sum of "+n+" natural numbers "+res);
	}

	public static void main(String[] args) {
		
		MethodsDemo2 obj1 = new MethodsDemo2();
		obj1.natsum1(5);
		obj1.natsum1(10);
		obj1.natsum1(100);
		obj1.natsum1(1000);
		obj1.natsum1(250);
	

	}

}
