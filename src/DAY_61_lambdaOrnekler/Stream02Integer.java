package DAY_61_lambdaOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream02Integer {

	public static void main(String[] args) {

		// bu sayfada map ve reduce nedir ve örnekler göreceðiz

		/*
		 * (MAP)--> map() Streamdeki verileri verilen methoda göre
		 * deðiþtiren(tranformasyon) ara iþlem methodudur - Matematik iþlemi yapar
		 * javada...
		 */

		/*
		 * Ýndirgeme (reduction) bir stream in bir tur veya bir primitive e
		 * dönüþtürülmesini saðlayan terminal(sonlandýrýcý) iþlemdir -Java 8 Stream API
		 * de average(), sum(), min(), max(), ve count() gibi tanýmlanmýþ bir çok
		 * indirgeme methodu bulunur
		 * 
		 * -bu metler ilgili iþlemleri gerçekleþtirip tek bir deðer döndürmektedir
		 * 
		 * - reduce()--> kendi indeirgeme iþlemlerimizi tanýmlayabileceðimiz genel
		 * amaçlý bir methodtur --Verileri tek bir ture indirger,methodlarla ilgili topla çýkar enbuyu bul gibi
		 * islemleri gerceklestirip tek bir deger doner
		 * 
		 */

		// SORU
		// bir listeyi parametre olarak alan ve listedeki her tek sayýnýn karesini
		// aralarýnda
		// bir boþluk býrakarak yazdýran methodu yazýnýz

		List<Integer> liste = new ArrayList<>();
		liste.add(12);
		liste.add(9);
		liste.add(13);
		liste.add(4);
		liste.add(9);
		liste.add(2);
		liste.add(4);
		liste.add(12);
		liste.add(15);

		System.out.println("1. yöntem lambda ifadelerini kullanarak");
		kareAll(liste);
//        1. yöntem lambda ifadelerini kullanarak
//        81 169 81 225 

		System.out.println();
		System.out.println("2. yöntem method referansý ve kendi methodumuzu kullanarak");
		kareAl2(liste);
//        2. yöntem method referansý ve kendi methodumuzu kullanarak
//        81 169 81 225

		System.out.println();
		System.out.println("küpünü alma iþlemini yapalým");
		kupunuAl(liste);
//        küpünü alma iþlemini yapalým
//        729 2197 729 3375 

		System.out.println();
		System.out.println("listedeki tek sayýlarýn kupleri hesaplamasý");
		teklerinKupunuAl(liste);

		System.out.println();
		System.out.println("listedeki çift sayýlarýn kupleri hesaplamasý");
		ciftlerinKupunuAl(liste);
//		listedeki çift sayýlarýn kupleri hesaplamasý
//		1728 64 8 64 1728 

		System.out.println();
		System.out.println("reduce metodu için tek kare toplamý iþlemi");
		System.out.println(tekKareTopla(liste));
//		reduce metodu için tek kare toplamý iþlemi
//		7030
		
		System.out.println();
		System.out.println("reduce methodu için tek kup toplamý yapalým ve sum() indirgeme methodunuda kullanalým");
		System.out.println(tekKupTopla(liste));
//		reduce methodu için tek kup toplamý yapalým ve sum() indirgeme methodunuda kullanalým
//		7030
		
		System.out.println();
		System.out.println("reduce için 2 .yöntem method referansý ve Optional kullanýmý");
		System.out.println(tekKareToplami2(liste));
//		reduce için 2 .yöntem method referansý ve Optional kullanýmý
//		Optional[556]

	}

	// 1. yöntem lambda ifadelerini kullanarak

	public static void kareAll(List<Integer> liste) {

		liste.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));

	}
	// 2. yöntem method referansý ve kendi methodumuzu kullanarak

	public static void kareAl2(List<Integer> liste) {

		liste.stream().filter(Methodlarimiz::tekMi).map(Methodlarimiz::kareAl).forEach(Methodlarimiz::yazdir);

	}

	// küpünü alma iþlemini yapalým
	public static void kupunuAl(List<Integer> liste) {

		liste.stream().filter(Methodlarimiz::tekMi).map(Methodlarimiz::kupAl).forEach(Methodlarimiz::yazdir);
	}
	// listedeki tek sayýlarýn kupleri hesaplamasý

	public static void teklerinKupunuAl(List<Integer> liste) {

		liste.stream().filter(Methodlarimiz::tekMi).map(Methodlarimiz::kupAl).forEach(Methodlarimiz::yazdir);

	}
	// listedeki çift sayýlarýn kupleri hesaplamasý

	public static void ciftlerinKupunuAl(List<Integer> liste) {

		liste.stream().filter(Methodlarimiz::çiftMi).map(Methodlarimiz::kupAl).forEach(Methodlarimiz::yazdir);

	}
	// reduce metodu için tek kare toplamý iþlemi

	public static Integer tekKareTopla(List<Integer> liste) {

		return liste.stream().filter(Methodlarimiz::tekMi).map(x -> x * x * x).reduce(0, (x, y) -> x + y);

	}
	// reduce methodu için tek kup toplamý yapalým ve sum() indirgeme methodunuda kullanalým

	public static Integer tekKupTopla(List<Integer> liste) {

		return liste.stream().filter(Methodlarimiz::tekMi).map(x -> x * x * x).reduce(0,Integer::sum);

	}
	//reduce için 2 .yöntem method referansý ve Optional kullanýmý
	
	public static Optional<Integer> tekKareToplami2(List<Integer> liste) {
		
		return liste.stream().filter(Methodlarimiz::tekMi).map(Methodlarimiz::kareAl).reduce(Integer::sum);
		
		
	}
}
