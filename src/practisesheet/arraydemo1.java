package practisesheet;

public class arraydemo1{
	
	public static void main(String[] args) {
		
		String[] s = new String[5];
		
		System.out.println(s.length);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		s[0] = "Sandeep";
		s[1] = "Java";
		s[2] = "Selenium";
		s[3] = "Python";
		s[4] = "BDD";
		
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
	

