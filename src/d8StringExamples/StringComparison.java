package d8StringExamples;

public class StringComparison {

	public static void main(String[] args) 
	{
		//Case1 
		
		String s1 = "welcome";
		String s2 = "welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("------------------------------------------------------");
		
		
		//Case2 
		
		String s3 = new String("welcome");
		String s4 = new String("welcome");
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s3==s4);    //false  -> To compare the objects 
		System.out.println(s3.equals(s4));  //true  -> to compare value of objects
		System.out.println("-------------------------------------------------------------------");
		
		
		//Case3
		
		String s5 = "selenium";
		String s6 = new String("selenium");
		
		System.out.println(s5==s6);               //false
		System.out.println(s5.equals(s6));        //true
		System.out.println("-----------------------------------------------------------------------");
		
		
		//Case4
		
		String s7 = "python";
		String s8 = new String("python");
		String s9 = s8;
		
		System.out.println(s7==s8);   //false
		System.out.println(s7.equals(s8));  //true
		
		System.out.println(s8==s9);  //true, bcz objects are same
		System.out.println(s8.equals(s9)); //true
		
		System.out.println(s7==s9); //false
		System.out.println(s7.equals(s9));  //true
		System.out.println("-------------------------------------------------------------------------------");
	}

}
