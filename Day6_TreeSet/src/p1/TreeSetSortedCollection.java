package p1;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetSortedCollection {

	public static void main(String[] args) {
		// TreeSet is the sorted collection 
		
		// train schedule 
		TreeSet<Double> schedule = new TreeSet<>();
		schedule.add(6.0);
		schedule.add(7.0);
		schedule.add(6.30);
		schedule.add(10.45);
		schedule.add(9.15);
		schedule.add(11.50);
		schedule.add(12.15);
		
		System.out.println(schedule);
		
		SortedSet<Double> data = schedule.tailSet(10.0);
		
		System.out.println(data);
		System.out.println(data.first());
		System.out.println(data.last());
		
	}
}
