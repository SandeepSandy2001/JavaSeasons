package d3operators;

public class DecrementOperators {

	public static void main(String[] args) {
		// Decrement Operators
		
		/*int a =10;
		System.out.println(a); //10
		a--;          //a = a-1;
		System.out.println(a); //9
		*/
		
		//Case2 - Post decrement
		
		/*int a = 10;
		System.out.println(a);  //10
		int res = a--;
		System.out.println(res); //10
		System.out.println(a);  //9
        */
		
		//case 3 - Pre Decrement
		
		int a = 10;
		System.out.println(a);  //10
		int res = --a;
		System.out.println(res);  //9
		System.out.println(a);    //9
		
	}

}
