package PracticeSet;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String string = "siddheshiwalemanoj";
		
		char[] charArray = string.toCharArray();
		
//		int a[] = {9,8,2,2,4,7,5,17,5,1,4,1,1,2,2};
		char a[] = string.toCharArray();
		
		int b[] = new int[a.length];
		
		for(int i = 0;i<b.length;i++) {
			b[i]=-1;
		}
		
		
		for (int i = 0; i < b.length; i++) {
			int count = 1;
			for (int j = i+1; j < b.length; j++) {
				if (a[i]==a[j]) {
					count++;
					b[j]=0;
				}
			}
			if (b[i]!=0) {
				b[i]=count;
			}
			
		}
		
		for (int i = 0; i < b.length; i++) {
			
			if (b[i]>0) {
				
				System.out.println(a[i] +" : "+b[i]);	
			}
				
		}
	}

}
