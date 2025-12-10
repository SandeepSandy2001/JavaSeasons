package d12PolymorphismEncapsulation;

public class BoxMain {

	public static void main(String[] args) 
	{
		Box b = new Box();  //1 constructor
		
		System.out.println(b.volume());  //user defined
		
		Box a = new Box(10.5,20.5,5.5);  //2 constructor
		System.out.println(a.volume());
		
		Box c = new Box(10.5);
		System.out.println(c.volume());
	}

}
