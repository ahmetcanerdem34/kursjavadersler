package DAY_28_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C1_ForEachLoopCalisma05 {

	public static void main(String[] args) {
	
		
		// Bir integer list olusturunuz ve
		// bu list’deki tum sayilarin karesinin toplamini
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz
		
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(12);
		list.add(15);
		list.add(34);
		
		
		System.out.println(list);
		//[10, 12, 15, 34]
		
		//tum sayýlarýn karelerinin toplamý
		
		int kareTop=0;
		for (Integer each : list) {
			
			kareTop+=each*each;
			
			
			
		}
		
		System.out.println(kareTop);
		
			//	1625
		

	}

}
