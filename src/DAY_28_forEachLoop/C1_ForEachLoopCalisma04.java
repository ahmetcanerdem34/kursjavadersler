package DAY_28_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C1_ForEachLoopCalisma04 {
	
	public static void main(String[] args) {
		
		//verilen 2 farkl� string arr inde ortaklar� liste yap�n�z

		String arr1[] = { "Ali", "Can", "Ay�e", "Seher" };
		String arr2[] = { "Ali", "Veli", "Mesut", "Seher", "Sedaat" };
		
		// ortak elemanlar� olu�turmak i�in bir list olu�tural�m
		
		List<String> ortakElemanlar=new ArrayList<>();
		
		for (String each1 : arr1) {
			
			
			for (String each2 : arr2) {
				
				if(each1.equals(each2)) {
					
					ortakElemanlar.add(each1);
				}
				
			}
			
		}
		if(ortakElemanlar.isEmpty()) {
			System.out.println("ortak eleman yok");
		}else {
			
			System.out.println(ortakElemanlar);
		}
		
		
		
	}

}
