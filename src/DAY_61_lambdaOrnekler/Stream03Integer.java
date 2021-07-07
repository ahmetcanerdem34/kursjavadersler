package DAY_61_lambdaOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream03Integer {

	public static void main(String[] args) {

		// reduce öreneklere devam ediyoruz sonrasýnda COLLECT METHODU TANIMI VE ÖRNEKLERÝ ve DÝSTÝNCT METHODU
		
		//COLLECT
		/*
		 * collec()--> Stream API deki terminal(sonlandýrýcý) iþlemlerinden birisidir
		 *
		 * -Streamdeki elemanlarýn çeþitli veri yapýlarýna döndürülmesi ve bazý ek iþlmelerin uygulanamsýný saðlamaktadýr
		 *
		 *-collect() iþlemindeki strateji Collector arayuzleri (inrerface) yardýmýzyla gerçekleþtirilir, biriktir listele
		 *-- SORU//Listedeki tek elemanlarýn karelerini sýralý ve tekrarsýz bir þekilde listeye kaydeden methodu yazdýrýnýz
		 */
		
		//DÝSTÝNCT
		/*
		 * distinct()--->tekrar eden elemanlarý tekrarsýz yazdýran methoddur
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

		System.out.println("reduce ile enbuyuk deðeri bulma");
		System.out.println(buyukBul(liste));
		// 500

		System.out.println();
		System.out.println("reduce ile math methodu kullanarak enbuyuk bulma");
		System.out.println(enbuyukBul(liste));
//        reduce ile math methodu kullanarak enbuyuk bulma
//        500

		System.out.println();
		System.out.println("reducu fonksiyonu ile sorted(sýralama) yapýp en buyuk deðeri bulma");
		System.out.println(sortenbuyukBul(liste));
//        reducu fonksiyonu ile sorted(sýralama) yapýp en buyuk deðeri bulma
//        500
		
		System.out.println();
		System.out.println("reduce ile carpým deðeri bulma");
		System.out.println(carpim(liste));
		
		System.out.println();
		System.out.println("reduce ile herhangi bir sayýnýn kaçtane olduðunu count ile bulma");
		System.out.println(dokuzlariBul(liste));
//		reduce ile herhangi bir sayýnýn kaçtane olduðunu count ile bulma
//		2
		
		System.out.println();
		System.out.println("listedeki negatif sayýlarý collect() methodu ile yazdýralým Collector arayuzunu kullanýr");
		System.out.println(negatifsayilariBul(liste));
//		listedeki negatif sayýlarý collect() methodu ile yazdýralým Collector arayuzunu kullanýr
//		[-2, -1]
		
		System.out.println();
		System.out.println("distinct methodu ile ayný olan elemanlarýn karelerini bulalým her sayýyý tek sefer yazdýralým math pow da kullanalým");
		System.out.println(tekKareSiraliListele(liste));
//		[1.0, 81.0, 169.0, 225.0]
	}
	// reduce ile enbuyuk deðeri bulma

	public static int buyukBul(List<Integer> liste) {

		return liste.stream().reduce(0, (x, y) -> x > y ? x : y);

	}
	// reduce ile math methodu kullanarak enbuyuk bulma

	public static int enbuyukBul(List<Integer> liste) {

		return liste.stream().reduce(0, Math::max);
	}

	// reducu fonksiyonu ile sorted(sýralama) yapýp en buyuk deðeri bulma

	public static int sortenbuyukBul(List<Integer> liste) {

		return liste.stream().sorted().reduce(0, (x, y) -> y); // x ve y yi karþýlaþtýrý sorted sýraladýðý için y enn
																// sonda en buyuk olandýr

	}

	// reduce ile enkucuk deðeri bulma
	public static int kucukBul(List<Integer> liste) {

		return liste.stream().reduce(0, (x, y) -> x < y ? x : y);

	}
	// reduce ile carpým deðeri bulma

	public static int carpim(List<Integer> liste) {

		return liste.stream().reduce(1,(x,y)->x*y);

	}
	//reduce ile herhangi bir sayýnýn kaçtane olduðunu count ile bulma
	
	public static int dokuzlariBul(List<Integer> liste) {
		
		return (int) liste.stream().filter(x-> x==9).count();
	}
	
	//listedeki negatif sayýlarý collect() methodu ile yazdýralým Collector arayuzunu kullanýr
	
	public static List<Integer> negatifsayilariBul(List<Integer> liste) {
		
		return liste.stream().filter(x-> x<0).collect(Collectors.toList());
	}
	//distinct methodu ile ayný olan elemanlarýn karelerini bulalým her sayýyý tek sefer yazdýralým
	
	public static List<Double> tekKareSiraliListele(List<Integer> liste) {
		
		return liste.stream().distinct().filter(Methodlarimiz::tekMi).map(x->Math.pow(x,2)).distinct().sorted().collect(Collectors.toList());
		//mat por kare kup bi iþlemleri yapar Double ile çalýþýr
	}
}
