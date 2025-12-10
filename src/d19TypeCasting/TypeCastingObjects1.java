package d19TypeCasting;

class Parent
{
	String name = "John";
	
	void m1()
	{
		System.out.println("This is m1 from parent..");
	}
}	
class Child extends Parent
{
	int id = 101;
	
	void m2()
	{
		System.out.println("This is m2 from child..");
	}

}
public class TypeCastingObjects1 {

	public static void main(String[] args) 
	{
		/*Child ch = new Child();
		System.out.println(ch.name);
		ch.m1();
		System.out.println(ch.id);
		ch.m2();*/
		
		/*Parent p = new Child(); //Upcasting
		System.out.println(p.name);
		p.m1();
		System.out.println(p.id); //We cannot access
		p.m2();  //we cannot access*/
		
		Parent p = new Parent(); //downcasting
		Child c = (Child) p;
		
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
		
	}

}
