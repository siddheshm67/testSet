package PracticeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SmallestElement {
	
	public static void main(String args[]) {
		
		int a[] = {8,6,7,2,5,4,7};
		
		int smallest = 0;
		
		Set<Integer> set = new TreeSet<>();
		
		for(int i = 0;i<a.length-1;i++) {
			
			set.add(a[i]);
			
			if (a[i] < a[i+1]) {
				smallest =  a[i];
			}
		}
		
		System.out.println(smallest);
		System.out.println(set);
	}

}
