package DAY_52_nesneUygulamalar03;

import java.util.ArrayList;
import java.util.List;

public class OgrenciTest {

	public static void main(String[] args) {
		
		ArrayList<String> dersler1 = new ArrayList<>();//burdaki listeyi 1. ��renci i�in a�t�k
		
		
		dersler1.add("Matematik");
		dersler1.add("Fizik");
		dersler1.add("Kimya");
		dersler1.add("Biyoloji");
		
		ArrayList<String> dersler2 = new ArrayList<>();
		
		dersler2.add("Beden E�itimi");
		dersler2.add("M�zik");
		dersler2.add("Resim");
		
		
		Ogrenci ogrenci1 = new Ogrenci("Kahraman", "Aykan", 1989,"37474774", dersler1);
		
		Ogrenci ogrenci2 = new Ogrenci ("Salih", "Karaduman", 1959, "36464565", dersler1);
		
		Ogrenci ogrenci3 = new Ogrenci("Emircan", "Tuzsuz", 1988,"27373734", dersler2);
		
		String ders="Matematik";
		String ders1="Elektrik";
		OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri();
		
		ogrenciIslemleri.ogrenciDersArama(ogrenci3, "Matematik");
		//Kahraman adl� ��renci bu dersi al�yor 
		
		System.out.println("***************************");
		
		
		ogrenciIslemleri.ogrenciBilgileriGoster(ogrenci1);
//		Ad� :Kahraman
//		Soyad� :Aykan
//		Dogum y�l� :1989
//		Okulu :null
//		Okul numaras� :37474774
//		Ald�g� dersler :[Matematik, Fizik, Kimya, Biyoloji]
		
		System.out.println("*************************************");
		
		ogrenciIslemleri.ogrenciBilgileriGoster(ogrenci2);
//		Ad� :Salih
//		Soyad� :Karaduman
//		Dogum y�l� :1959
//		Okulu :null
//		Okul numaras� :36464565
//		Ald�g� dersler :[Matematik, Fizik, Kimya, Biyoloji]
		
		System.out.println("*******************************");
		
		ogrenciIslemleri.ogrenciBilgileriGoster(ogrenci3);
//		Ad� :Emircan
//		Soyad� :Tuzsuz
//		Dogum y�l� :1988
//		Okulu :null
//		Okul numaras� :27373734
//		Ald�g� dersler :[Matematik, Fizik, Kimya, Biyoloji]
	}
	
	
}
