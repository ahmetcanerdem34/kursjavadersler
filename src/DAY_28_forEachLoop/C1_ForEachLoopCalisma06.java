package DAY_28_forEachLoop;

import java.util.Arrays;

public class C1_ForEachLoopCalisma06 {

	public static void main(String[] args) {
		
		
		int [] sayilar= {1,2,3,4,34,4,5,4,3,4,55,4,565};
		
		
		
		for (int i = 0; i < sayilar.length; i++) {
	
			
		}
		System.out.print(Arrays.toString(sayilar));
		//[1, 2, 3, 4, 34, 4, 5, 4, 3, 4, 55, 4, 565]
		
		System.out.println();
		int toplam=0;
		for (int i : sayilar) {
			
			
			toplam+=i;
			
			
		}
		System.out.println(toplam);
		//688
	}

}
