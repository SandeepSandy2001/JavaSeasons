package stringPrograms;

public class OccuranceofCharInString {

	public static void main(String[] args) 
	{
		toFindOccuranceOfCharacterString("Hello");

	}

	private static void toFindOccuranceOfCharacterString(String str) 
	{
		char ch;
		int count =1;
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(j)==ch)
				{
					count++;
				}
			}
			System.out.println(ch+" occured "+count+" times");
		}
		
	}

}
