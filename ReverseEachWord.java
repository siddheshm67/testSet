package PracticeSet;

import java.util.Iterator;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s1 = "my name is siddhesh";
		String s2 ="";
		
		String[] split = s1.split(" ");
		
		for (String string : split) {
			String reverse = reverse(string);
			
			s2 = s2.concat(reverse).concat(" ");		
		}
		
		System.out.println(s2);
	}
	
	private static String reverse(String word) {
		
		String s2 = "";
		
		for(int i = word.length()-1;i>=0;i--) {
			s2 = s2 + word.charAt(i);
		}
		
			return s2;
	}
}
