package d20Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		//Declaration
		ArrayList mylist = new ArrayList();
		//List mylist = new ArrayList();(Heterogenius data)
		//ArrayList <String>mylist = new ArrayList<String>();(Homogenius data)
		
		//Adding data into array list
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//size of arraylist
		System.out.println("Size of an arraylist:" + mylist.size());
		
		//Printing arraylist
		System.out.println("Printing data from array list:" + mylist);
		
		//remove element from array list
		mylist.remove(5);
		System.out.println("After removing:" + mylist);
		
		//Insert an element in arraylist
		mylist.add(2,"Java");
		System.out.println("After Inserting an element:" + mylist);
		
		//Change/modify(replace) elemnet  in array list
		mylist.set(2,"Python");
		System.out.println("After modify an element:" + mylist);
		
		//Access specifid element from array list
		System.out.println(mylist.get(3)); //here 3 is index of array list
		
		//reading all the elements from arraylist(Using normal for loop)
		 /*for(int i =0; i<mylist.size(); i++)
		 {
			 System.out.println(mylist.get(i));
		 }*/
		
		//Using for..each loop
		/*for(Object x:mylist)
		{
			System.out.println(x);
		}*/
		
		//Using Iterator
		Iterator it = mylist.iterator();
		
		//System.out.println(it.next());
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Checking arraylist is empty or not
		System.out.println("Is arraylist is empty?:" + mylist.isEmpty());
		
		//remove all the elements from array list
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add("Welcome");
		
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements:" + mylist);
		
		//remove all the elements/clear
		mylist.clear();
		System.out.println("Is arraylist empty?:" + mylist.isEmpty());
		
	}

}
