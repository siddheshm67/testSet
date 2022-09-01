package PracticeSet;

import java.util.Iterator;
import java.util.stream.Stream;

public class CheckOccuerance2 {
	public static void main(String[] args) {
		
		String string = "jpareposetory";
		
		char[] charArr = string.toCharArray();
		
		int b[] = new int[charArr.length];
		
		
		
		for (char c : charArr) {
			System.out.print(c+" ");
		}
		
		for(int i = 0;i<b.length;i++) {
			b[i]=-1;
		}
		
		for (int i = 0; i < charArr.length; i++) {
		
			int count = 1;
			
			for (int j = i+1; j < b.length; j++) {
				
				if (charArr[i]==charArr[j]) {
					
					count++;
					b[j] = 0;
					
				}
			}
			
			if (b[i] != 0) {
				b[i] = count;
			}		
		}
		Stream<T>
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < b.length; i++) {
			if (b[i]>1) {
				System.out.println(charArr[i]+" : "+b[i]);
			}
	
		}
	}

}
