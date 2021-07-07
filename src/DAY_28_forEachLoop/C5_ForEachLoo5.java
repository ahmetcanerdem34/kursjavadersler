package DAY_28_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C5_ForEachLoo5 {
	
	public static void main(String[] args) {
		
		
				// Bir integer list olusturunuz ve
				// bu list’deki tum sayilarin karesinin toplamini
				// For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz. 
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(3);
		list.add(8);
		System.out.println(list);
		
		//tum sayýlarýn karelerinin toplamý
		
		int karelerinToplami=0;//her bir elemeaný lacaðýz, karelerini alýp buna ekleyeceðiz
		
		for (Integer each : list) {//listeden jher bir int getir
			
			karelerinToplami+=each*each;
			
		}
	System.out.println(karelerinToplami);
//	[10, 5, 3, 8]
//			198
	
	}

}
