package d7Stringmethods;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) 
	{
		//String s = "Welcome";
		/*String s = new String("Welcome");
		System.out.println(s);	
		
		//length() = returns length of a string(number of characters)
		
		String s = "Welcome";
		s.length();
		System.out.println(s.length());
		System.out.println("Welcome".length()); */
		
		
		//concat method = Joining strings
		
		String s1 = "Welcome";
		String s2 = "to java";
		String s3 = "selenium";
		String s4 = "automation";
		
		System.out.println(s1+" "+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+" "+s2+" "+s3);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2+s3));
		
		System.out.println(s1+" "+s2+" "+s3+" "+s4);
	    System.out.println(s1.concat(s2).concat(s3).concat(s4));
	    
	    System.out.println("Welcome"+"to java");
	    System.out.println("Welcome".concat("to java"));
	    System.out.println("--------------------------------------------------");
	    
		
		//trim() == Remove spaces from right and left side of the strings
	    
	    String s = "   Welcome   ";
	    
	    System.out.println(s);
	    System.out.println("Before Trimming:"+s.length());
	    
	    System.out.println(s.trim());
	    System.out.println("After Trimming:"+s.trim().length());
	    System.out.println("------------------------------------------------------");
	    
	    
	    //charAt == returns a character from a string based on the index(Index start from 0)
	    
	    s="Welcome";
	    System.out.println(s.charAt(3));
	    System.out.println(s.charAt(0));
	    System.out.println("-------------------------------------------------------------");
	    
	    
	    //contains() == contains method is always returns a boolean value
	    //verify string is main part of string or not
	    
	    s = "Welcome";
	    
	    System.out.println(s.contains("wel"));
	    System.out.println(s.contains("come"));
	    System.out.println(s.contains("Wel"));
	    System.out.println(s.contains("COME"));
	    System.out.println(s.contains("e"));
	    System.out.println(s.contains("Welme"));
	    System.out.println("---------------------------------------------------------------------");
	    
	    
	    //equals() , equalsIgnoreCase() == compare strings
	    
	    s1 = "welcome";
	    s2 = "welcome";
	    
	    System.out.println(s1==s2);
	    System.out.println(s1.equals(s2));
	    System.out.println(s1.equals("Welcome"));
	    System.out.println(s1.equalsIgnoreCase(s2));
	    System.out.println("-----------------------------------------------------------------");
	    
	    
	    //replace() ==replace single/multiple(sequence) of characters in a string
	    
	    s = "welcome to selenium java selenium python selenium c#";
	    System.out.println(s.replace('e','X'));
	    System.out.println(s.replace('s', 't'));
	    System.out.println(s.replace("selenium", "playwright"));
	    System.out.println(s.replace("se", "ab"));
	    System.out.println("-----------------------------------------------------------------------");
	    		
	    
	    //substring() ==extract substring from the main string
	    //Starting index start with 0  //ending index start with 1
	    
	    s ="Selenium";
	    System.out.println(s.substring(1,5));
	    System.out.println(s.substring(0,3));
	    System.out.println(s.substring(2,6));
	    System.out.println("-------------------------------------------------------------------------");
	    
	    //toUpperCase()    //toLowerCase
	    
	    s = "Welcome";
	    System.out.println(s.toUpperCase());
	    System.out.println(s.toLowerCase());
	    System.out.println("----------------------------------------------------------------------------------");
		
	    
	    //split() == split the string into multiple parts based on the delimeter
	    //Split will return in the array
	    
	    s = "abc@gmail.com";
	    System.out.println(s.split("@"));  //wrong
	    
	    String a[] = s.split("@");
	    System.out.println(Arrays.toString(a));  //or
	    
	    System.out.println(a[0]);
	    System.out.println(a[1]);
	    System.out.println("-----------------------------------------------------------------------");
	    
	    //Example 1
	    
	    String amount = "$15,20,55";
	    System.out.println(amount.replace("$", ""));
	    System.out.println(amount.replace("$", "").replace(",",""));
	    System.out.println("-----------------------------------------------------------------------");
	    
	    
	    //Example 2
	    
	    s = "abc,123@xyz";
	    String arr1[] = s.split(",");
	    System.out.println(Arrays.toString(arr1));
	    
	    String arr2[] = arr1[1].split("@");
	    System.out.println(Arrays.toString(arr2));
	    
	    System.out.println(arr1[0]);
	    System.out.println(arr2[0]);
	    System.out.println(arr2[1]);
	    System.out.println("-----------------------------------------------------------------------");
	    
	    
	    //Example 3
	    
	    s = "abc 123";
	    String arr[] = s.split(" ");
	    System.out.println(Arrays.toString(arr));
	    
	    s = "abc 123 xyz";
	    String arr4[] = s.split(" ");
	    System.out.println(Arrays.toString(arr4));
	    System.out.println("-----------------------------------------------------------------------");
	    
	    
	    // * % ^ & () -->Cannot use as a delimeters
	    
	    //Example 4
	   
	    String name = "John kennedy";
	    System.out.println(name.contains("john"));
	    
	    System.out.println(name.replace('J', 'j').contains("john"));
	    System.out.println(name.toLowerCase().contains("john"));
	}
}
