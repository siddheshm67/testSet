package PracticeSet;

public class REverseNumber {

	public static void main(String[] args) {
		
		int num = 214;
		int rem =0;
		int rev = 0;
		while(num!=0) {
			
			rem = num%10;
			System.out.println(rem);
			rev = rev *10+rem;
			num = num /10;
		}
		
		System.out.println(rev);
		
	}

}
