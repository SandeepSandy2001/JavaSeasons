package stringMethodPrograms;

public class StringPositionMethods2 {

	public static void main(String[] args) 
	{
		String s1 = "Frontlines Media";
		String s2 = "FLM";
		String s3 = "flm";
		
		System.out.println(s1.compareTo(s2)); //38 because it subtract through Ascii value  (A-z = 65-90)
		System.out.println(s2.compareTo(s3)); // -32  (a-z = 97-122)
		System.out.println(s2.compareToIgnoreCase(s3));  //0
		

	}

}
