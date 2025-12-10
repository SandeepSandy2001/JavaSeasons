package d17WrapperClass;

public class DataConversionMethods {

	public static void main(String[] args) 
	{
		/*Scenario 1:
			String --convert--> int, double, boolean, char*/
		//String-->int
		
		//String s = "Welcome"; //cannot convert to int
        String s1 = "10";
        String s2 = "20";
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
        
        //String-->double
        String s3 = "10.5";
        String s4 = "20.0";
        System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
        
        //String-->boolean
        String s5 ="False";  //other than true, if you pass any string that will return false
        System.out.println(Boolean.parseBoolean(s5));
        
        /*Scenario 2:
        	int, double, boolean, char --convert-->String*/
        
        int a = 10;
        double d = 10.5;
        char c = 'A';
        boolean bool = true;
        
        String s = String.valueOf(a);
        System.out.println(s);
        
        s = String.valueOf(d);
        System.out.println(s);
        
        s = String.valueOf(c);
        System.out.println(s);
        
        s = String.valueOf(bool);
        System.out.println(s);
	}

}
