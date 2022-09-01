package PracticeSet;

public class PrimeNumber {
	
	public static void main(String []args) {
		
		for (int j = 2; j <=100; j++) {
					
		int num = j;
		boolean flag = false;
		for(int i = 2;i<=Math.sqrt(num);i++) {
			int rem = num%i;
			if (rem==0) {
				flag = true;
				break;
			}
		}
		
		if (flag == false) {
			System.out.println(j);
		}
		
		}
	}
}
