package DAY_61_lambdaOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream02Integer {

	public static void main(String[] args) {

		// bu sayfada map ve reduce nedir ve �rnekler g�rece�iz

		/*
		 * (MAP)--> map() Streamdeki verileri verilen methoda g�re
		 * de�i�tiren(tranformasyon) ara i�lem methodudur - Matematik i�lemi yapar
		 * javada...
		 */

		/*
		 * �ndirgeme (reduction) bir stream in bir tur veya bir primitive e
		 * d�n��t�r�lmesini sa�layan terminal(sonland�r�c�) i�lemdir -Java 8 Stream API
		 * de average(), sum(), min(), max(), ve count() gibi tan�mlanm�� bir �ok
		 * indirgeme methodu bulunur
		 * 
		 * -bu metler ilgili i�lemleri ger�ekle�tirip tek bir de�er d�nd�rmektedir
		 * 
		 * - reduce()--> kendi indeirgeme i�lemlerimizi tan�mlayabilece�imiz genel
		 * ama�l� bir methodtur --Verileri tek bir ture indirger,methodlarla ilgili topla ��kar enbuyu bul gibi
		 * islemleri gerceklestirip tek bir deger doner
		 * 
		 */

		// SORU
		// bir listeyi parametre olarak alan ve listedeki her tek say�n�n karesini
		// aralar�nda
		// bir bo�luk b�rakarak yazd�ran methodu yaz�n�z

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

		System.out.println("1. y�ntem lambda ifadelerini kullanarak");
		kareAll(liste);
//        1. y�ntem lambda ifadelerini kullanarak
//        81 169 81 225 

		System.out.println();
		System.out.println("2. y�ntem method referans� ve kendi methodumuzu kullanarak");
		kareAl2(liste);
//        2. y�ntem method referans� ve kendi methodumuzu kullanarak
//        81 169 81 225

		System.out.println();
		System.out.println("k�p�n� alma i�lemini yapal�m");
		kupunuAl(liste);
//        k�p�n� alma i�lemini yapal�m
//        729 2197 729 3375 

		System.out.println();
		System.out.println("listedeki tek say�lar�n kupleri hesaplamas�");
		teklerinKupunuAl(liste);

		System.out.println();
		System.out.println("listedeki �ift say�lar�n kupleri hesaplamas�");
		ciftlerinKupunuAl(liste);
//		listedeki �ift say�lar�n kupleri hesaplamas�
//		1728 64 8 64 1728 

		System.out.println();
		System.out.println("reduce metodu i�in tek kare toplam� i�lemi");
		System.out.println(tekKareTopla(liste));
//		reduce metodu i�in tek kare toplam� i�lemi
//		7030
		
		System.out.println();
		System.out.println("reduce methodu i�in tek kup toplam� yapal�m ve sum() indirgeme methodunuda kullanal�m");
		System.out.println(tekKupTopla(liste));
//		reduce methodu i�in tek kup toplam� yapal�m ve sum() indirgeme methodunuda kullanal�m
//		7030
		
		System.out.println();
		System.out.println("reduce i�in 2 .y�ntem method referans� ve Optional kullan�m�");
		System.out.println(tekKareToplami2(liste));
//		reduce i�in 2 .y�ntem method referans� ve Optional kullan�m�
//		Optional[556]

	}

	// 1. y�ntem lambda ifadelerini kullanarak

	public static void kareAll(List<Integer> liste) {

		liste.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));

	}
	// 2. y�ntem method referans� ve kendi methodumuzu kullanarak

	public static void kareAl2(List<Integer> liste) {

		liste.stream().filter(Methodlarimiz::tekMi).map(Methodlarimiz::kareAl).forEach(Methodlarimiz::yazdir);

	}

	// k�p�n� alma i�lemini yapal�m
	public static void kupunuAl(List<Integer> liste) {

		liste.stream().filter(Methodlarimiz::tekMi).map(Methodlarimiz::kupAl).forEach(Methodlarimiz::yazdir);
	}
	// listedeki tek say�lar�n kupleri hesaplamas�

	public static void teklerinKupunuAl(List<Integer> liste) {

		liste.stream().filter(Methodlarimiz::tekMi).map(Methodlarimiz::kupAl).forEach(Methodlarimiz::yazdir);

	}
	// listedeki �ift say�lar�n kupleri hesaplamas�

	public static void ciftlerinKupunuAl(List<Integer> liste) {

		liste.stream().filter(Methodlarimiz::�iftMi).map(Methodlarimiz::kupAl).forEach(Methodlarimiz::yazdir);

	}
	// reduce metodu i�in tek kare toplam� i�lemi

	public static Integer tekKareTopla(List<Integer> liste) {

		return liste.stream().filter(Methodlarimiz::tekMi).map(x -> x * x * x).reduce(0, (x, y) -> x + y);

	}
	// reduce methodu i�in tek kup toplam� yapal�m ve sum() indirgeme methodunuda kullanal�m

	public static Integer tekKupTopla(List<Integer> liste) {

		return liste.stream().filter(Methodlarimiz::tekMi).map(x -> x * x * x).reduce(0,Integer::sum);

	}
	//reduce i�in 2 .y�ntem method referans� ve Optional kullan�m�
	
	public static Optional<Integer> tekKareToplami2(List<Integer> liste) {
		
		return liste.stream().filter(Methodlarimiz::tekMi).map(Methodlarimiz::kareAl).reduce(Integer::sum);
		
		
	}
}
