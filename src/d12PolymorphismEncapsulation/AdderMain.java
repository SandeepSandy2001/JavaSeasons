package d12PolymorphismEncapsulation;

public class AdderMain {

	public static void main(String[] args) 
	{
		Adder addobj = new Adder();
		
		addobj.sum();  //1st Method
		
		addobj.sum(100,5); //2nd method
		
		addobj.sum(10, 456.00); //3rd method
		
		addobj.sum(345.985, 10); //4th method
		
		addobj.sum(10,20,30);  //5th method
		

	}

}
