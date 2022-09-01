package PracticeSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class CheckPAlindrome {
	
	public static void main(String[] args) {
		
		String string = "mom and dad coming at noon";
		
		String string3 = "java k";
		
		
		String[] split = string.split(" ");
		
		for (String string2 : split) {
			if (checkWord(string2)) {
				System.out.println(string2);
			}
		}	
	}
	
	static boolean checkWord(String str) {
		String wordOne = "";
			for(int i = str.length()-1;i>=0;i--) {
				 wordOne = wordOne + str.charAt(i);
			}
			
			if (str.equals(wordOne)) {
				return true;
			}else {
				return false;
			}

	}

}
