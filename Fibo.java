package PracticeSet;

import java.util.Iterator;

public class Fibo {
	
	public static void main(String args[]) {
		
		int first = 0;
		int Second = 1;
		
		int sum = 0;		
		for(int i = 0;i<=10;i++) {
			sum = first +Second;
			System.out.print(sum+" ");
			first = Second;
			Second = sum ;
		}
		
	}
	
}
