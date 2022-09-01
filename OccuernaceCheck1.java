package PracticeSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccuernaceCheck1 {

	public static void main(String[] args) {
		
		String string = "java is java it is java ";
		
		String[] strings = string.split(" ");
		
		Map<String, Integer> hMap = new HashMap<>();
		
	for (String string2 : strings) {
		if (hMap.get(string2) == null) {
			hMap.put(string2, 1);
		}else {
			hMap.put(string2, hMap.get(string2)+1);
		}
	}
	
	System.out.println(hMap);
	
	Iterator<String> iterator = hMap.keySet().iterator();
	
	while (iterator.hasNext()) {
		String string2 = (String) iterator.next();
		if (hMap.get(string2)>1) {
			System.out.println(string2+" : "+hMap.get(string2));
		}
		
	}
		
	}

}
