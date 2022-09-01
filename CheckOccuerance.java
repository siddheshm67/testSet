package PracticeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class CheckOccuerance {

	public static void main(String[] args) {
		
		String string = "java is fun i love java it is easy to learn";
		
		String[] arrstr = string.split(" ");
		Map<String, Integer> hMap = new HashMap<>();
		for (String word : arrstr) {
			if (hMap.get(word) == null) {
				hMap.put(word, 1);
			}else {
				hMap.put(word, hMap.get(word)+1);
			}
		}
		System.out.println(hMap);
		
		Iterator<String> iterator = hMap.keySet().iterator();
		
		while (iterator.hasNext()) {
			String w = (String) iterator.next();
			if (hMap.get(w)>1) {
				System.out.println(w+" : "+hMap.get(w));
			}	
		}
		
		Map<Integer, Character> map2 = new HashMap<>();
//		hMap.forEach((e1,e2)-> map2.put(e2, e1));

		Optional<Entry<Integer, Character>> first = map2
		.entrySet()
		.stream()
		.sorted((e1,e2)->e1.getKey().compareTo(e2.getKey())).skip(1).findFirst();
		
	}

}
