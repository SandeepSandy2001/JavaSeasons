package stringMethodPrograms;

public class StringCheckMethods {

	public static void main(String[] args) 
	{
		String s1 = "FLM";
		String s2 = "flm";
		String s3 = "new FLM";
		
		System.out.println(s1==s2);   //False
		System.out.println(s1.equalsIgnoreCase(s2));  //True
		
		System.out.println(s3.contains(s1));  //True
		System.out.println(s1.contains(s3));  //False
		
		System.out.println(s3.endsWith(s1));  //True
		System.out.println(s3.startsWith(s1)); //false
		System.out.println(s3.startsWith("new"));  //True
		
		System.out.println(s3.startsWith(s1,4));   //True
		
		

	}

}
