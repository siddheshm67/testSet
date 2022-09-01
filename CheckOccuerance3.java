package PracticeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class CheckOccuerance3 {

	public static void main(String[] args) {
		
		String string = "aaabnkkkzrypp";
		
		List<Character> list = new ArrayList<>();
		
		for (int i = 0; i < string.length(); i++) {
			list.add(string.charAt(i));
		}
		
		System.out.println(list);
		
		list.stream().distinct(). filter(e->Collections.frequency(list, e)>1).forEach(e->System.out.println(e));
		
		

		
		

		


	}

}
