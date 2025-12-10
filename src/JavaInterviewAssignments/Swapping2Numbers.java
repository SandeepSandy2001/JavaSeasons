package JavaInterviewAssignments;

public class Swapping2Numbers {

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println("Before swapping values are.."+a+"  "+b);
		
		//Logic 1 - Using Third variable
		
		/*int t =a;
		System.out.println(t);
		a=b;
		System.out.println(a);
		b=t;
		System.out.println(b);
		*/
		
		//Logic 2 - Use + and - (Without using 3 variable)
		
		/*a = a+b;
		System.out.println(a);  //10+20=30
		b = a-b;
		System.out.println(b);  //30-20=10
		a = a-b;
		System.out.println(a);  //30-10=20
		*/
		
		//Logic3 - Use * and / (Without using 3 variable)
		//here a and b are should not be zero
		
		/*a = a*b;
		System.out.println(a);    //10*20= 200
		b = a/b;
		System.out.println(b);    //200/20=10
		a = a/b;
		System.out.println(a);    //200/10 = 20
		*/
		
		//Logic4 - bitwise XOR(^)
		
		/*a = a^b; 
		System.out.println(a);  //10^20 = 30
		b = a^b;
		System.out.println(b);   //30^20 = 10
		a = a^b;
		System.out.println(a);   //30^10 = 20
		*/
		
		//Logic5 - single statement
		
		b = a+b-(a=b);
		System.out.println("After swapping values are.."+a+"  "+b);

	}

}
