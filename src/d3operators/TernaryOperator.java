package d3operators;

public class TernaryOperator {

	public static void main(String[] args) {
		
		//var = exp ? result1 : result2
		
		/*int a=200, b=100;
		int x = (a>b) ? a : b;
		System.out.println(x);
		*/
		
		/*int x =(1==1)? 100:200;
		System.out.println(x);
		
		int y =(1==2)? 200:100;
		System.out.println(y);
	    */
		
		int person_age = 30;
		String res = (person_age>=18)? "Eligible" : "Not Eligible";
		System.out.println(res);
		
		int person_aged = 15;
		String res1 = (person_aged>=18)? "Eligible" : "Not Eligible";
		System.out.println(res1);

	}

}
