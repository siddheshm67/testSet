package PracticeSet;

public class SingleLoopBubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {22,8,4,6,1,9};
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				i = -1;
				
			}
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}

	}

}
