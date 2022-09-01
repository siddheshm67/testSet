package PracticeSet;

public class SwapTwoString {
	public static void main(String[] args) {
		
		String firstNAme = "siddhesh";
		String lastNameString = "madiwale";
		
		String tempString  = firstNAme;
		firstNAme = lastNameString;
		lastNameString = tempString;
		
		
		System.out.println("firstNAME : "+ firstNAme);
		System.out.println("lastNAME : "+ lastNameString);
	}
}
