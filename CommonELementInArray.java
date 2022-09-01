package PracticeSet;

import java.util.ArrayList;
import java.util.List;

public class CommonELementInArray {
	
	public static void main(String argString[]) {
		int a[] = {1,2,5,7,9};
		int b[] = {1,5,9};
		int c[] = {1,4,5,7,9};
		
		int x = 0;
		int y = 0;
		int z = 0;
		
		List< Integer> list = new ArrayList<>();
		
		while(x<a.length && y<b.length && z<c.length) {
			if (a[x] == b[y] && b[y]==c[z]) {
				list.add(a[x]);
				x++;
				y++;
				z++;
			}else if (a[x]<b[y]) {
				x++;
			}else if (b[y]<c[z]) {
				y++;
			}else {
				z++;
			}
			
		}
		
		System.out.println(list);
		
	
	}
}
