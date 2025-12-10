package d3operators;

public class OperatorsDemo {

	public static void main(String[] args) 
	{
		// 1) Arithmetic Operators + - * / %
		
		int a = 20, b = 10;
		
		int result = a+b;
		System.out.println("Sum of a and b is:"+ result);
		
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Difference of a and b is:"+(a-b));
		System.out.println("Multiplication of a and b is:"+(a*b));
		System.out.println("Division of a and b is:"+(a/b));
		System.out.println("Modulo of a and b is:"+(a%b));
		
		//2. Relational /comparison operators: > >= < <= != ==  -> Use date types
		// returns boolean value True/False
		
		System.out.println("Relational Operators");
		System.out.println(a>b); //True
		System.out.println(a<b); //False
		System.out.println(a>=b); //True
		System.out.println(a<=b); //false
		b=20;
		System.out.println(a>=b); //true
		System.out.println(a<=b); //true
		System.out.println(a!=b); //False
		System.out.println(a==b); //True
		
		boolean res = a>b;
		System.out.println("Boolean");
		System.out.println(res);
		
		boolean res1 = a==b;
		System.out.println(res1);
		
		//3. Logical Operators: &&(AND)  ||(OR)  !(NOT) -> Use only boolean data types
		// returns boolean value True/False
		//Works between two boolean values or variables
		
		boolean x = true;
		boolean y = false;
		
		System.out.println("Logical Operators");
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x); //false
		System.out.println(!y); //True
		
		boolean d = false;
		boolean e = true;
		System.out.println("Logical Operators1");
		System.out.println(d && e); //false
		System.out.println(d || e); //true
		
		System.out.println("Other Example");
		boolean b1 = 10>20; 
		System.out.println(b1);  //false
		boolean b2 = 20>10; 
		System.out.println(b2);   //True
		
		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //True
		System.out.println("Combination of relational and logical");
		System.out.println((10<20) && (10>20)); //True
		
	}

}
