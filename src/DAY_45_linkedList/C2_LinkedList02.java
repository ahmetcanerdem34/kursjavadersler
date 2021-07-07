package DAY_45_linkedList;

import java.util.LinkedList;

public class C2_LinkedList02 {

	public static void main(String[] args) {
		
		//collections da eþitliðin sol tarafýnda <> içinde data türü yazýlmasa
		//veya data turu Objeckt yazýlsa collectiion çalýþýr
		//ama böyle bir kullanýmda surekli casting yapýldýðý için 
		//zaman ve hafýza açýsýndan verimli deðildir
		LinkedList<Object> ll1 = new LinkedList<>();//linkedlist oluþturduk
		
		System.out.println(System.currentTimeMillis());//1617737791013--->çalýþma hýz verimine bakmýþ olduk diðerleirnede bakabiliriz
		for (int i = 0; i < 1000; i++) {				//deiðerlerinide yaýznca hangisinin dah hýzlý olduðu anlaþýlýr, pc ler böyle çalýþýr yavaþ iþlemler
														//olunca bu akla gelmeli
			ll1.add("A"+i);//concatination
			ll1.add(20+i);//toplama
			ll1.add('C');//ascii deðerleri
		}
		
		
		///bu listte add methodu ile a ekleyeyim, ekler, diðerlerini eklemiyordu Object e çevirince yukarýyý oldu.//en geniþtir çünkü hzadem..
//		ll1.add("A");
//		ll1.add(20);
//		ll1.add('C');
//		System.out.println(ll1);//[A, 20, C]
		
		
		LinkedList ll2 = new LinkedList<>();//<Object> tamamen sildik kabul etti

		ll2.add("B");
		ll2.add(20);
		ll2.add('K');
		System.out.println(ll2);//[B, 20, K]
		
//		LinkedList<String> ll3 = new LinkedList<>();//kabul etmedi
//
//		ll3.add("B");
//		ll3.add(20);
//		ll3.add('K');
//		System.out.println(ll3);
	}

}
