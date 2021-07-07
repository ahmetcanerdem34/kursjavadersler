package DAY_61_lambdaOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream03Integer {

	public static void main(String[] args) {

		// reduce �reneklere devam ediyoruz sonras�nda COLLECT METHODU TANIMI VE �RNEKLER� ve D�ST�NCT METHODU
		
		//COLLECT
		/*
		 * collec()--> Stream API deki terminal(sonland�r�c�) i�lemlerinden birisidir
		 *
		 * -Streamdeki elemanlar�n �e�itli veri yap�lar�na d�nd�r�lmesi ve baz� ek i�lmelerin uygulanams�n� sa�lamaktad�r
		 *
		 *-collect() i�lemindeki strateji Collector arayuzleri (inrerface) yard�m�zyla ger�ekle�tirilir, biriktir listele
		 *-- SORU//Listedeki tek elemanlar�n karelerini s�ral� ve tekrars�z bir �ekilde listeye kaydeden methodu yazd�r�n�z
		 */
		
		//D�ST�NCT
		/*
		 * distinct()--->tekrar eden elemanlar� tekrars�z yazd�ran methoddur
		 */

		List<Integer> liste = new ArrayList<>();
		liste.add(12);
		liste.add(9);
		liste.add(13);
		liste.add(4);
		liste.add(9);
		liste.add(2);
		liste.add(-2);
		liste.add(4);
		liste.add(-1);
		liste.add(15);
		liste.add(500);

		System.out.println("reduce ile enbuyuk de�eri bulma");
		System.out.println(buyukBul(liste));
		// 500

		System.out.println();
		System.out.println("reduce ile math methodu kullanarak enbuyuk bulma");
		System.out.println(enbuyukBul(liste));
//        reduce ile math methodu kullanarak enbuyuk bulma
//        500

		System.out.println();
		System.out.println("reducu fonksiyonu ile sorted(s�ralama) yap�p en buyuk de�eri bulma");
		System.out.println(sortenbuyukBul(liste));
//        reducu fonksiyonu ile sorted(s�ralama) yap�p en buyuk de�eri bulma
//        500
		
		System.out.println();
		System.out.println("reduce ile carp�m de�eri bulma");
		System.out.println(carpim(liste));
		
		System.out.println();
		System.out.println("reduce ile herhangi bir say�n�n ka�tane oldu�unu count ile bulma");
		System.out.println(dokuzlariBul(liste));
//		reduce ile herhangi bir say�n�n ka�tane oldu�unu count ile bulma
//		2
		
		System.out.println();
		System.out.println("listedeki negatif say�lar� collect() methodu ile yazd�ral�m Collector arayuzunu kullan�r");
		System.out.println(negatifsayilariBul(liste));
//		listedeki negatif say�lar� collect() methodu ile yazd�ral�m Collector arayuzunu kullan�r
//		[-2, -1]
		
		System.out.println();
		System.out.println("distinct methodu ile ayn� olan elemanlar�n karelerini bulal�m her say�y� tek sefer yazd�ral�m math pow da kullanal�m");
		System.out.println(tekKareSiraliListele(liste));
//		[1.0, 81.0, 169.0, 225.0]
	}
	// reduce ile enbuyuk de�eri bulma

	public static int buyukBul(List<Integer> liste) {

		return liste.stream().reduce(0, (x, y) -> x > y ? x : y);

	}
	// reduce ile math methodu kullanarak enbuyuk bulma

	public static int enbuyukBul(List<Integer> liste) {

		return liste.stream().reduce(0, Math::max);
	}

	// reducu fonksiyonu ile sorted(s�ralama) yap�p en buyuk de�eri bulma

	public static int sortenbuyukBul(List<Integer> liste) {

		return liste.stream().sorted().reduce(0, (x, y) -> y); // x ve y yi kar��la�t�r� sorted s�ralad��� i�in y enn
																// sonda en buyuk oland�r

	}

	// reduce ile enkucuk de�eri bulma
	public static int kucukBul(List<Integer> liste) {

		return liste.stream().reduce(0, (x, y) -> x < y ? x : y);

	}
	// reduce ile carp�m de�eri bulma

	public static int carpim(List<Integer> liste) {

		return liste.stream().reduce(1,(x,y)->x*y);

	}
	//reduce ile herhangi bir say�n�n ka�tane oldu�unu count ile bulma
	
	public static int dokuzlariBul(List<Integer> liste) {
		
		return (int) liste.stream().filter(x-> x==9).count();
	}
	
	//listedeki negatif say�lar� collect() methodu ile yazd�ral�m Collector arayuzunu kullan�r
	
	public static List<Integer> negatifsayilariBul(List<Integer> liste) {
		
		return liste.stream().filter(x-> x<0).collect(Collectors.toList());
	}
	//distinct methodu ile ayn� olan elemanlar�n karelerini bulal�m her say�y� tek sefer yazd�ral�m
	
	public static List<Double> tekKareSiraliListele(List<Integer> liste) {
		
		return liste.stream().distinct().filter(Methodlarimiz::tekMi).map(x->Math.pow(x,2)).distinct().sorted().collect(Collectors.toList());
		//mat por kare kup bi i�lemleri yapar Double ile �al���r
	}
}
