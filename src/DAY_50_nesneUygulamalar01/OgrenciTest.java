package DAY_50_nesneUygulamalar01;

import java.util.ArrayList;
import java.util.List;

public class OgrenciTest {

	public static void main(String[] args) {
		
		ArrayList<String> dersler1 = new ArrayList<>();//burdaki listeyi 1. öðrenci için açtýk
		//eðer 2. öðrencide ayný dersleri alacaksa bu dersleri set methodunda kullanbilir, ancak kulllnamayacaksa
		//yeni bir list oluþturamam gerekli yeni öðrenci için
		ArrayList<String> dersler2 = new ArrayList<>();
		
		dersler1.add("Matematik");
		dersler1.add("Fizik");
		dersler1.add("Kimya");
		dersler1.add("Biyoloji");
		
		Ogrenci ogrenci1 = new Ogrenci("Kahraman", "Aykan", 1989,"37474774", dersler2);
		
		dersler2.add("Matematik");
		dersler2.add("Fizik");
		dersler2.add("Kimya");
		dersler2.add("Biyoloji");
		dersler2.add("Ýngilizce");
		dersler2.add("Fransýzca");
		dersler2.add("Türkçe");
		
		Ogrenci ogrenci2=new Ogrenci();
		ogrenci2.setAdi("Enes");
		ogrenci2.setSoyadi("Çýnar");
		ogrenci2.setDogumYili(1990);
		ogrenci2.setOkulNumarasi("34747838832");
		ogrenci2.setDersler(dersler2);
		
		Ogrenci ogrenci3 = new Ogrenci("Osman", "Kayhan", 1989,"38484784",dersler1 );
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		//eðer bir önceki class da toString methodu kullanmasaydýk burayý bu þekilde yazamzi referanslarýný yazardý ve hatalý olurdu
		
//	Ogrenci [adi=Kahraman, soyadi=Aykan, dogumYili=1989, okulNumarasi=37474774, dersler=[Matematik, Fizik, Kimya, Biyoloji, Ýngilizce, Fransýzca, Türkçe]]
//	Ogrenci [adi=Enes, soyadi=Çýnar, dogumYili=1990, okulNumarasi=34747838832, dersler=[Matematik, Fizik, Kimya, Biyoloji, Ýngilizce, Fransýzca, Türkçe]]
//	Ogrenci [adi=Osman, soyadi=Kayhan, dogumYili=1989, okulNumarasi=38484784, dersler=[Matematik, Fizik, Kimya, Biyoloji]]

	}

}
