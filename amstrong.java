package PracticeSet;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public class amstrong {

	public static void main(String[] args ) {
		int num = 1634;
		int count = 0;	
		int rem = 0;
		double sum = 0;
		double power = 1;
		int temp = num;
		int num2 = num;
	
		while(temp !=0) {
			rem = temp%10;
			count ++;
			temp = temp/10;
		}
		
		while(num2 !=0) {
			rem = num2%10;
			power = Math.pow(rem, count);
			System.out.println(power);
			sum = sum + power;
			num2 = num2/10;
		}	
		System.out.println(num+" "+sum);
		if (num == sum) {
			System.out.println("number is armstrong");
		}else {
			System.out.println("not an armstrong");
		}
  }
	
}
