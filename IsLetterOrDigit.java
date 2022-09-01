package PracticeSet;

public class IsLetterOrDigit {
	
	public static void main(String[] args) {
		
		String s1 = 8211+"";
		System.out.println(s1);
		boolean flag = true;
		
		for(int i = 0;i<s1.length();i++) {
			if (!Character.isDigit(s1.charAt(i))) {
				flag = false;
			}
		}
		
		if (flag == false) {
			System.out.println("not contains only digits");
		}else {
			System.out.println("contains only digit");
		}
		
	
	
	}
}
