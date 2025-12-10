package d3operators;

public class IncrementOperator {

	public static void main(String[] args) {
		// Increment Operator
		
		//Case 1
		
		/*int a = 10;
		System.out.println(a);   //10
		a++;            //a = a+1;
		System.out.println(a);   //11
		*/
		
		//case 2 Post Increment
		
		/*int a = 10;
		int res = a++;
		System.out.println(res); //10
		System.out.println(a);   //11
		*/
		
		//case 3 Pre increment
		
		int a = 10;
		int res = ++a;
		System.out.println(res); //11
		

	}

}
