package PracticeSet;

import java.util.Iterator;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[] = {20,30,40};
		
		int sum = 0;
		
		for (int i : a) {
			sum = sum + i;
		}
		
		System.out.println("sum :" +sum);

	}

}
