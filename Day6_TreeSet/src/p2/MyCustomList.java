package p2;

import java.util.ArrayList;


// Generic Stack
public class MyCustomList<T extends Product> {

	ArrayList<T> mylist = new ArrayList<>();
	
	public void doAdd(T element)
	{
		mylist.add(element);
	}
	
}
