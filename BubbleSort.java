package PracticeSet;

import java.util.Iterator;

public class BubbleSort {
	
	public static void main(String args[]) {
		
		int arr[] = {1,4,9,7,8,3};
		
		System.out.println("Before : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i = 0;i<arr.length;i++) {
			
			for(int j = i+1;j<arr.length;j++) {
				
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}	
		}
		System.out.println("after : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
