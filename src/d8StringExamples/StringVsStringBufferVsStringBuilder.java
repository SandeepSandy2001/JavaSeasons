package d8StringExamples;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) 
	{
		
		//String -->Immutable --cannot change from original value s
		
		String s = "Welcome";
		s.concat("to Java");
		System.out.println(s);
		
		
		//StringBuffer -->Mutable -> can change original value 
		
		StringBuffer sbf = new StringBuffer("Welocme");
		sbf.append("to Java");
		System.out.println(sbf);
		
		
		//StringBuilder -->Mutable -> can change original value 
		
		StringBuffer sbr = new StringBuffer("Welocme");
		sbr.append("to Java");
		System.out.println(sbr);
		

	}

}
