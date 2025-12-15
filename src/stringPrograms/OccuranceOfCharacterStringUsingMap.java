package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class OccuranceOfCharacterStringUsingMap {

	public static void main(String[] args) 
	{
		toFindOccuranceOfCharatcerString("Hello");

	}

	private static void toFindOccuranceOfCharatcerString(String str) 
	{
		str=str.toLowerCase();
		char[] chars = str.toCharArray();
		
		Map<Character, Integer> hMap=new HashMap<Character, Integer>();
		
		for(char ch:chars)
		{
			if(hMap.containsKey(ch))
			{
				hMap.put(ch,hMap.get(ch)+1);
			}
			else
			{
				hMap.put(ch,1);
			}
		}
		System.out.println(hMap);
		
		Set<Entry<Character, Integer>> entries=hMap.entrySet();
		for(Entry<Character, Integer>entry:entries)
		{
			System.out.println(entry.getKey() +"------"+entry.getValue());
		}
		
	}

}
