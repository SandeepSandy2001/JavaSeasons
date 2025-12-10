package d20Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		//Declaration
		//HashMap hm = new HashMap();
		//Map hm = new HashMap();
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//Adding pairs
		hm.put(101, "john");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Scott");
		hm.put(105,  "David");
		
		System.out.println(hm);
		
		System.out.println("Size of Hasmap:" + hm.size());
		
		//remove pair from hashmap
		hm.remove(101);
		System.out.println("After Removing pair:" + hm);
		
		//Access value of the key
		System.out.println("After Accesing :" + hm.get(104));
		
		//get all the keys from Hashmap
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		//Reading data from Hashmap using for..each
		for(int k:hm.keySet())
		{
			System.out.println(k+"     "+hm.get(k));
		}
		
		//Using iterator
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<Integer,String> entry = it.next();
			System.out.println(entry.getKey()+"     "+entry.getValue());
			
			hm.clear();
			System.out.println(hm.isEmpty());
		}

	}

}
