package p1;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetSortedCollection2 {

	public static void main(String[] args) {
		// TreeSet is the sorted collection 
		
		// train schedule 
		TreeSet<String> schedule = new TreeSet<>();
		schedule.add("dsfdw");
		schedule.add("frgvtrdsfdw");
		schedule.add("qsadsfdrtgerww");
		schedule.add("efefdsfdw");
		
		
		System.out.println(schedule);
		
		SortedSet<String> data = schedule.tailSet("qsadsfdrtgerww");
		
		System.out.println(data);
		System.out.println(data.first());
		System.out.println(data.last());
		
	}
}
