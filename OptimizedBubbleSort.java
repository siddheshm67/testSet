package PracticeSet;


class Bbb{
	
	public void m1() {
		System.out.println("b class m1 method");
	}
	
}


public class OptimizedBubbleSort extends Bbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,2,1,5,8,9};
		
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i; j < arr.length; j++) {
				
				if (arr[i]>arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if (flag == false) {
				break;
			}
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		

	}
	
	

}
