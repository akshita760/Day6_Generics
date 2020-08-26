package p2;

import java.util.ArrayList;

public class GenericsDemo {
	
	public static void main(String[] args) {
		
		//ArrayList list = new ArrayList<>();
		
		MyCustomList<String> list = new MyCustomList<>();
		list.doAdd("fever");
		list.doAdd("fevererfger");
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.doAdd(2);
		list2.doAdd(45);
		
		
		MyCustomList<Product> list3 = new MyCustomList<>();
		list3.doAdd(new Product());
		
		MyCustomList<Laptop> list4 = new MyCustomList<>();

		
		MyCustomList<Employee> list5 = new MyCustomList<>();
		
		
		
		
		
	}
	

}
