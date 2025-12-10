package d16AbstractionInterface;

interface shape
{
	int length = 10;  //final & static
	int width = 20;   //final & static
	
	void circle();       //abstract method
	
	default void square()
	{
		System.out.println("This is a square....default method");
	}
	
	static void rectangle()
	{
		System.out.println("This is a rectangle......static method");
	}
}


public class InterfaceDemo implements shape
{
	public void circle()
	{
		System.out.println("This is circle...abstract method");
	}
	
	void triangle()
	{
		System.out.println("This is a Traingle.....");
	}
	
	public static void main(String[] args) 
	{
		//scenario 1
		/*InterfaceDemo idobj = new InterfaceDemo();
		idobj.circle();  //abstract
		idobj.square();  //default
		
		shape.rectangle();  //static method can directly access from interface
		idobj.triangle();*/
		
		//scenario 2
		
		shape sh = new InterfaceDemo();
		sh.circle(); //abstract
		sh.square(); //default
		
		shape.rectangle();  //static method can directly access from interface
		System.out.println(shape.length*shape.width);
		
	}

}
