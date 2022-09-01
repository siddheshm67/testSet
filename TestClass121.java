package PracticeSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass121 {
	
	public static void main(String[] args) {
		
//		String string = "my name siddhesh";
//		
//		List<String> list = new ArrayList<>();
//		
//		list.add(string);
//		
//		list.stream().map(e->e.toUpperCase()).forEach(e->System.out.println(e));
		
		String arr[] = {"siddhesh","raghav","nikhil","namu","mutthuswami"};
		
		List<String> list = new ArrayList<>();
		
		for (String string : arr) {
			list.add(string);
		}
		
		
		String string = list.stream().max(Comparator.comparing(String::length)).get();
		
		System.out.println(string);
		
		
		
	}

}
