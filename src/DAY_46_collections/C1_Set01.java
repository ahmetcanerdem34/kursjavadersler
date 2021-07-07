package DAY_46_collections;

import java.util.HashSet;
import java.util.Set;

public class C1_Set01 {

	public static void main(String[] args) {
		//tekrarlý elemanlarý siler
		
		//Set<String> set1=new Set<>();//set interface dir bundan oluþturmazsýn dedi
		
		Set<String> set1=new HashSet<>();
		set1.add("V");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		set1.add("F");
		System.out.println(set1);//[A, B, C, V, F]
		
	System.out.println(set1.hashCode());//354
	  // Set'de onemli olan ozellik No duplication ve elemanin kumede var olup olmamasidir
    // Siralama Set icin onemli degildir
    // Set icin elemanlari girdigimiz sirada verir veya elemanlari natural siralama ile verir
	//bucket=raf
	set1.add("M");
	set1.add("E");
	System.out.println(set1);//[A, B, C, E, V, F, M]--1 a yý yzdýrýr
	System.out.println(set1.hashCode());//500
	 // Collections'da hashCode() method'u o collection icindeki tum 
    // elemanlarin hash code'larinin toplamini verir
    // yeni eleman eklersek dogal olarak hash code da degisir
	}

}
