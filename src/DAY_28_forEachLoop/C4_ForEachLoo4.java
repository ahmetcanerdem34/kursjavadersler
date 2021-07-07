package DAY_28_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C4_ForEachLoo4 {

	public static void main(String[] args) {
		//verilen 2 farkl� string arr inde ortaklar� liste yap�n�z

		String arr1[] = { "Ali", "Can", "Ay�e", "Seher" };
		String arr2[] = { "Ali", "Veli", "Mesut", "Seher", "Sedaat" };

		// ortak elemanlar� olu�turmak i�in bir list olu�tural�m
		List<String> ortakElemanlar = new ArrayList<>();
		// git arr deki her bir eleman� getir
		// diyelim ki ali, 2 .arrayde de var m� onu kontroletmeliyim

		// ikinci bir list yaz�p kar��la�t�rmal�y�m

		for (String eachArr1 : arr1) {// d��ardaki for outer arr1 deki her bir eleman� getiriyor

			for (String eachArr2 : arr2) {// buda inner yani aar2 deki elemanlar� getiriyor
				if (eachArr1.equals(eachArr2)) {// burdada kar��la�t�r�yoruz

					ortakElemanlar.add(eachArr1);// ortak olanlar�da burda ekliyoruz
				} // else olmak zorunda de�il hi�bir zaman, if kendi ba��nada �a�l���r

			}

		}
		//ortak elemanlar diye yeni bir listem varr
		//liste dolu mu bo� mu?
		if (ortakElemanlar.isEmpty()) {
			System.out.println("ortak eleman yok");
			
		} else {
			System.out.println(ortakElemanlar);//de�ilse elemanlar� yazd�racak
			//[Ali, Seher]
		}

	}

}
