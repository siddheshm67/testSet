package PracticeSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateWords {
	
	public static void main(String[] args) {
		String s1 = "java is java i love java";
		
		String[] split = s1.split(" ");
			
		Set<String>set = new LinkedHashSet<>();
		
		for (String string : split) {
			set.add(string);
		}
		
		StringBuilder builder = new StringBuilder();
		
		for (String string : set) {
			builder.append(string).append(" ");
		}
		
		System.out.println(builder);
	}
	
	
}
