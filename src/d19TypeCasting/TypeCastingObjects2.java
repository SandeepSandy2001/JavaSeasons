package d19TypeCasting;

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}


public class TypeCastingObjects2 {

	public static void main(String[] args) 
	{
		
		/*Rule 1 : Conversion is valid or not
		This type of 'd'(an) and 'c'(Cat) must have some relationship (Either parent to child or child to parent)
		A(Cat) b(ct)  C((Cat)) d(an)
		
		Animal an = new Dog();
		Cat ct = (Cat) an;  //valid as per rule 1
		
		Dog dg = new Dog();
		Cat ct = (Cat) dg;  //Invalid as per rule*/
		
		/*Rule 2 : Assignment is valid or not
		 'C' must be either same or Child of 'A'
		
		Animal an = new Dog();
		Cat ct = (Cat) an;   //valid as per rule 2
		
		Animal an = new Dog();
		Cat ct = (Dog) an;  //Invalid as per rule 2*/
		
		/*Rule 3: The underlying object type of 'd' must be either same or child of 'C'
		
		Animal an = new Dog();
		Cat ct = (Cat) an;  //invalid as per rule no 3*/
		
		
		//Rule 1, Rule 2, Rule 3
		Animal an = new Dog();
		Dog dg = (Dog) an; //Rule1 Pass , Rule2 Pass, Rule3 Pass
		
		 
	}

}
