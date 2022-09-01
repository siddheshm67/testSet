package PracticeSet;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



class Stu10 {
	
	private int rollNo;
	private String nAmeString;
	private String lastNameString;
		
	public Stu10() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stu10(int rollNo, String nAmeString, String lastNameString) {
		super();
		this.rollNo = rollNo;
		this.nAmeString = nAmeString;
		this.lastNameString = lastNameString;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getnAmeString() {
		return nAmeString;
	}

	public void setnAmeString(String nAmeString) {
		this.nAmeString = nAmeString;
	}

	public String getLastNameString() {
		return lastNameString;
	}

	public void setLastNameString(String lastNameString) {
		this.lastNameString = lastNameString;
	}

	@Override
	public String toString() {
		return "Stu10 [rollNo=" + rollNo + ", nAmeString=" + nAmeString + ", lastNameString=" + lastNameString + "]";
	}
			
}


public class TestClass{
	public static void main(String[] args)  {
	
//	String string = "aaabbbbncn";
//	
//	char[] charArray = string.toCharArray();
//	
//	Map<Character, Integer> map = new HashMap<>();
//	
//	for (char c : charArray) {
//		if (map.get(c)==null) {
//			map.put(c, 1);
//		}else {
//			map.put(c, map.get(c)+1);
//		}
//	}
//	
//	System.out.println(map);
//	
//	Map<Integer, Character> map2 = new HashMap<>();
//	
//	map.forEach((e1,e2)-> map2.put(e2, e1));
//
//	
//	Optional<Entry<Integer, Character>> first = map2
//	.entrySet()
//	.stream()
//	.sorted((e1,e2)->e1.getKey().compareTo(e2.getKey())).skip(1).findFirst();
//	
//
//	System.out.println(first.get());
	
		
//		int a[] = {1,2,3};
//		
//		IntStream stream = Arrays.stream(a);
//		
//		List<Integer> collect = Arrays.stream(a).boxed().collect(Collectors.toList());
//		
//		//or
//		
//		List<Integer> list2 = new ArrayList<>(a.length);
//		
//		for (int i : a) {
//			list2.add(i);
//		}
//		
//		
//	Integer max = Collections.max(map.values());
//	
//	System.out.println(max);
//		
//		Set<Entry<String, Integer>> entrySet = map.entrySet();
//		
////		entrySet.stream().sorted((e1,e2)->e1.getValue().compareTo(e2.getValue()))
////		.forEach(e->System.out.println(e));
//		
//		List<Entry<String, Integer>> list3 = entrySet.stream().sorted((e1,e2)->e1.getValue().compareTo(e2.getValue())).collect(Collectors.toList());
//		
//		System.out.println(list3);
//		
////		list3.stream().distinct().forEach(e->System.out.println(e));
//		
//		list3.stream().map(e->Collections.frequency(list3, e)).forEach(e->System.out.println(e));
//		
//		
//		
		
		int[] arr = {12,6,7,9,2,3,5};
		
		
	quicksort(arr, 0, arr.length-1);	
		
		
		
		
	}
	
	public static void quicksort(int[] arr,int lowIndex,int highIndex) {
		
		int pivot = highIndex;
		
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(leftPointer < rightPointer) {
			while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
				
			}
			
			while (arr[rightPointer] >= pivot && leftPointer < rightPointer ) {
				rightPointer--;
			}
		}
		
	}
	
}
