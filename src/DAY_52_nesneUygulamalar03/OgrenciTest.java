package DAY_52_nesneUygulamalar03;

import java.util.ArrayList;
import java.util.List;

public class OgrenciTest {

	public static void main(String[] args) {
		
		ArrayList<String> dersler1 = new ArrayList<>();//burdaki listeyi 1. öðrenci için açtýk
		
		
		dersler1.add("Matematik");
		dersler1.add("Fizik");
		dersler1.add("Kimya");
		dersler1.add("Biyoloji");
		
		ArrayList<String> dersler2 = new ArrayList<>();
		
		dersler2.add("Beden Eðitimi");
		dersler2.add("Müzik");
		dersler2.add("Resim");
		
		
		Ogrenci ogrenci1 = new Ogrenci("Kahraman", "Aykan", 1989,"37474774", dersler1);
		
		Ogrenci ogrenci2 = new Ogrenci ("Salih", "Karaduman", 1959, "36464565", dersler1);
		
		Ogrenci ogrenci3 = new Ogrenci("Emircan", "Tuzsuz", 1988,"27373734", dersler2);
		
		String ders="Matematik";
		String ders1="Elektrik";
		OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri();
		
		ogrenciIslemleri.ogrenciDersArama(ogrenci3, "Matematik");
		//Kahraman adlý öðrenci bu dersi alýyor 
		
		System.out.println("***************************");
		
		
		ogrenciIslemleri.ogrenciBilgileriGoster(ogrenci1);
//		Adý :Kahraman
//		Soyadý :Aykan
//		Dogum yýlý :1989
//		Okulu :null
//		Okul numarasý :37474774
//		Aldýgý dersler :[Matematik, Fizik, Kimya, Biyoloji]
		
		System.out.println("*************************************");
		
		ogrenciIslemleri.ogrenciBilgileriGoster(ogrenci2);
//		Adý :Salih
//		Soyadý :Karaduman
//		Dogum yýlý :1959
//		Okulu :null
//		Okul numarasý :36464565
//		Aldýgý dersler :[Matematik, Fizik, Kimya, Biyoloji]
		
		System.out.println("*******************************");
		
		ogrenciIslemleri.ogrenciBilgileriGoster(ogrenci3);
//		Adý :Emircan
//		Soyadý :Tuzsuz
//		Dogum yýlý :1988
//		Okulu :null
//		Okul numarasý :27373734
//		Aldýgý dersler :[Matematik, Fizik, Kimya, Biyoloji]
	}
	
	
}
