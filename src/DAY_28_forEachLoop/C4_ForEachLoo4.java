package DAY_28_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C4_ForEachLoo4 {

	public static void main(String[] args) {
		//verilen 2 farklý string arr inde ortaklarý liste yapýnýz

		String arr1[] = { "Ali", "Can", "Ayþe", "Seher" };
		String arr2[] = { "Ali", "Veli", "Mesut", "Seher", "Sedaat" };

		// ortak elemanlarý oluþturmak için bir list oluþturalým
		List<String> ortakElemanlar = new ArrayList<>();
		// git arr deki her bir elemaný getir
		// diyelim ki ali, 2 .arrayde de var mý onu kontroletmeliyim

		// ikinci bir list yazýp karþýlaþtýrmalýyým

		for (String eachArr1 : arr1) {// dýþardaki for outer arr1 deki her bir elemaný getiriyor

			for (String eachArr2 : arr2) {// buda inner yani aar2 deki elemanlarý getiriyor
				if (eachArr1.equals(eachArr2)) {// burdada karþýlaþtýrýyoruz

					ortakElemanlar.add(eachArr1);// ortak olanlarýda burda ekliyoruz
				} // else olmak zorunda deðil hiçbir zaman, if kendi baþýnada çaýlýþýr

			}

		}
		//ortak elemanlar diye yeni bir listem varr
		//liste dolu mu boþ mu?
		if (ortakElemanlar.isEmpty()) {
			System.out.println("ortak eleman yok");
			
		} else {
			System.out.println(ortakElemanlar);//deðilse elemanlarý yazdýracak
			//[Ali, Seher]
		}

	}

}
