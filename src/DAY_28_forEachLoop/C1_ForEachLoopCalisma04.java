package DAY_28_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C1_ForEachLoopCalisma04 {
	
	public static void main(String[] args) {
		
		//verilen 2 farklý string arr inde ortaklarý liste yapýnýz

		String arr1[] = { "Ali", "Can", "Ayþe", "Seher" };
		String arr2[] = { "Ali", "Veli", "Mesut", "Seher", "Sedaat" };
		
		// ortak elemanlarý oluþturmak için bir list oluþturalým
		
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
