package DAY_51_nesneUygulamalar02;

import java.util.ArrayList;
import java.util.List;

public class OgrenciTest {

	public static void main(String[] args) {
		
		ArrayList<String> dersler1 = new ArrayList<>();//burdaki listeyi 1. ��renci i�in a�t�k
		
		
		dersler1.add("Matematik");
		dersler1.add("Fizik");
		dersler1.add("Kimya");
		dersler1.add("Biyoloji");
		
		
		Ogrenci ogrenci1 = new Ogrenci("Kahraman", "Aykan", 1989,"37474774", dersler1);
		
		Ogrenci ogrenci2 = new Ogrenci ("Salih", "Karaduman", 1959, "36464565", dersler1);
		
		
	
		bilgileriGoruntule(ogrenci1);
		System.out.println("*******************");
		
		bilgileriGoruntule(ogrenci2);//bu method ogrenci1 bittikten sonra ogrenci2 i�inde �al��acak
//		Ad�:Salih
//		Soyadi :Karaduman
//		Do�um Y�l� :1959
//		Okul Numaras� :36464565
//		Dersler :[Matematik, Fizik, Kimya, Biyoloji]
		
		System.out.println("**************************");
		dersleriGoster(ogrenci1);
//		    Kahramanin ald��� dersler :
//			Matematik
//			Fizik
//			Kimya
//			Biyoloji

		
		System.out.println("****************");
		dersleriGoster(ogrenci2);
//		    Salihin ald��� dersler :
//			Matematik
//			Fizik
//			Kimya
//			Biyoloji
//		
		System.out.println("*******************");
		
		dersleriGoster(ogrenci2);
	}
	public static void bilgileriGoruntule(Ogrenci ogrenci1) {
		
		System.out.println("Ad�:" +ogrenci1.getAdi());
		System.out.println("Soyadi :"+ogrenci1.getSoyadi());
		System.out.println("Do�um Y�l� :"+ ogrenci1.getDogumYili());
		System.out.println("Okul Numaras� :" + ogrenci1.getOkulNumarasi());
		System.out.println("Dersler :" + ogrenci1.getDersler());
		
//		Ad�:Kahraman
//		Soyadi :Aykan
//		Do�um Y�l� :1989
//		Okul Numaras� :37474774
//		Dersler :[Matematik, Fizik, Kimya, Biyoloji]
		
	}
	
	public static void dersleriGoster(Ogrenci ogrenci2) {
		
		ArrayList<String> dersler= ogrenci2.getDersler();
		
		System.out.println(ogrenci2.getAdi() + "in ald��� dersler :");
		
		for (String ders : dersler) {
			
			System.out.println(ders);
//			Matematik
//			Fizik
//			Kimya
//			Biyoloji
			
		}
	}
	
	
	
	
	
	
	
	
	
	
}
