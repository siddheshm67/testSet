package PracticeSet;

import java.util.Iterator;

public class Pattern {

	public static void main(String []args) {
		for(int i = 1;i<=5;i++) {
			
			for(int j = 1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k = 5-1;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
