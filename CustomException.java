package PracticeSet;

public class CustomException {

	public static void main(String[] args) throws UnderAgeException {
		
		int age = 10;
		if (age<18) {
			
				
				throw new UnderAgeException();
				

			
			
			
		}
		
	}

}
