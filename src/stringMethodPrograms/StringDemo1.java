package stringMethodPrograms;

public class StringDemo1 
{
	public static void main(String[] args) 
	{
		String s1 = "FLM";
		String s2 = "FLM";
		
		String s3 = new String("FLM");
		
		System.out.println(s1==s2);  //True
		System.out.println(s1==s3);  //false
		
		System.out.println(s1.equals(s2)); //True
		System.out.println(s1.equals(s3)); //True
	}

}
