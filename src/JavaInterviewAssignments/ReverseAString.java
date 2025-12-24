package JavaInterviewAssignments;

public class ReverseAString {

	public static void main(String[] args) 
	{
		//1) Using  string concatenation operator
				String str = "My name is Sandeep";
				String rev = "";
				
				int len = str.length();
				for(int i=len-1;i>=0;i--)
				{
					rev = rev+str.charAt(i);
				}
				System.out.println("Reversed a string is:" + rev);
				
				//2) using character array
				char a[] = str.toCharArray();
				int len1 = a.length;
				for(int i=len-1;i>=0;i--)
				{
					rev=rev+a[i];
				}
				System.out.println("Reversed a string is:" + rev);
				
				//3) Using string buffer class
				StringBuffer sb = new StringBuffer(str);
				System.out.println(sb.reverse());		
				
				
	              //4 Using StringBuilder			
		          StringBuilder str2 = new StringBuilder();
		          str2.append(str);
		          str2 = str2.reverse();     // used string builder to reverse
		         System.out.println(str2);
		  
		}	
	}



