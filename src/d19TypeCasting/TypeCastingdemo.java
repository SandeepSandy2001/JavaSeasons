package d19TypeCasting;

/*Upcasting - Converting- value from smaller to larger
   ex: int --> long
       float --> double
   Downcasting - Converting value from larger to smaller
   ex: long --> int
       double --> float
 */
public class TypeCastingdemo {

	public static void main(String[] args) 
	
	{
		//upcasting - automatic
		/*int intvalue = 100;
		long longvalue = intvalue;
		System.out.println(longvalue);
		
		float floatvalue = 10.5F;
		double doublevalue = floatvalue;
		System.out.println(doublevalue);*/
		
		//Downcasting - manually
		/*long longvalue = 100000;
		int intvalue = (int)longvalue;
		System.out.println(intvalue);
		
		double doublevalue = 123.56;
		float floatvalue = (float)doublevalue;
		System.out.println(floatvalue);*/
		
		//Example 1
		int i = 100;
		double d = i;  //upcasting
		System.out.println(d);
		
		//Example 2
		double e = 10.5;
		int a = (int) e; //downcasting
		System.out.println(a);
		
	}

}
