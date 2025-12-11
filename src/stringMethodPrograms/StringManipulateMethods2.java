package stringMethodPrograms;

public class StringManipulateMethods2 {

	public static void main(String[] args) 
	{

		String s1= "New";
		String s2="FLM";
		
		System.out.println(s1+s2);  //NEWFLM
		System.out.println(s1.concat(s2));  //NEWFLM
		
		System.out.println(s2.replace('M', 'm')); //FLm
		System.out.println(s2);   //FLM
		
		String s3="Frontlines Media";
		
		System.out.println(s3.substring(11));  //Media
		
		System.out.println(s3.substring(15));   //a
		
		System.out.println(s3.substring(5));    //lines Media
		
		System.out.println(s3.substring(5,10)); //lines
		
	}

}
