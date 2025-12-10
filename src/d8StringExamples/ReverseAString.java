package d8StringExamples;

public class ReverseAString {

	public static void main(String[] args) 
	{
		//Approach 1    length() and charAt()
		String s = "Selenium";
		String rev = "";
		
		for(int i = s.length()-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("Reverse String is:"+rev); 
		
		
		//Approach 2 -->Without using string methods
		
		String s1 = "Java";
		String rev1 = "";
		
		char a[] = s1.toCharArray();
		
		for(int i = a.length-1; i>=0; i--)
		{
			rev1 = rev1+a[i];
		}
		System.out.println("Reverse String is:"+rev1);
		
		//Approach 3 --> using StringBuffer class
		
		StringBuffer s2 = new StringBuffer("Automation");
		System.out.println("Reverse String is:" + s2.reverse());
		
		//Approach 3 --> using StringBuilder class
		
		StringBuilder s3 = new StringBuilder("Python");
		System.out.println("Reverse String is:" + s3.reverse());
 
	}

}
