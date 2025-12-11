package stringMethodPrograms;

public class StringPositioMethods {

	public static void main(String[] args) 
	{
		String s1 = "Frontlines Media";
		
		System.out.println(s1.length());  //16
		System.out.println(s1.indexOf("Media"));  //11
		System.out.println(s1.indexOf('e'));  //8
		
		System.out.println(s1.indexOf('M'));  //11
		System.out.println(s1.indexOf(77));   //11
		
		System.out.println(s1.lastIndexOf('i'));  //14
		
		System.out.println(s1.lastIndexOf(105));  //14
		
		int a[]= {10,20,30,40,50};
		System.out.println(a.length);   //5
		System.out.println(a[4]);    //50
		
		

	}

}
