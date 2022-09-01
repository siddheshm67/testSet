package PracticeSet;

import java.util.Iterator;
import java.util.function.BiConsumer;

public class MIssingNUmberInArray {
	
	public static void main(String args[]) {
		
		int sum = 0;
		
		int a[] = new int[101];
		
		for(int i = 1;i<=100;i++) {
			a[i]=i;
			sum = sum + i;
		}
		
		a[52] = 0;
		
		System.out.println(sum);
		
		int sum2 = 0;
		
		for (int i : a) {
		    sum2 = sum2 +i;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(sum2);
		
		int result = sum-sum2;
		
		System.out.println("missing number is : "+  result);
		
	}
	
}
