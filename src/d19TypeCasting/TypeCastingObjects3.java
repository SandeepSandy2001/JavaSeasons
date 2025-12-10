package d19TypeCasting;

//A b = (C) d;

public class TypeCastingObjects3 {

	public static void main(String[] args) 
	{
		//Example 1
		/*Object o = new String("Welcome");
		StringBuffer sb = (StringBuffer) o; //Rule1 = pass, Rule2 = pass, Rule3 = failed
        
		//Example 2
		String s = new String("Welcome");
		StringBuffer sb = (StringBuffer) s; //Rule1 = failed
		
		//Example 3
		Object o = new String("Welcome");
		StringBuffer sb = (StringBuffer) o;  //Rule1 = pass, Rule2 = Pass, Rule3 = Failed
		
		//Example 4
		Object o = new String("Welcome");
	    StringBuffer sb = (String) o;   //Rule1 = Pass, Rule2 = failed
		
		//Example 5
		String s = new String("Welcome");
		StringBuffer sb = (String) s;  //Rule1 = Pass, Rule2 = Failed
		
		//Example 6
		Object o = new String("Welcome");
		StringBuffer sb = (StringBuffer) o; //Rule1 = Pass, Rule2 = Pass, Rule3 = Failed*/
		
		//Example 7
		Object o =  new String("Welcome");
		String s = (String) o;  //Rule1 = pass, Rule2 = Pass; Rule3 = Passed
		System.out.println(s);
	
	}

}
