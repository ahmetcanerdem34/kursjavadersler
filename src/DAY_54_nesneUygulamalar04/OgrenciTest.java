package DAY_54_nesneUygulamalar04;

import java.util.ArrayList;

public class OgrenciTest {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new  Ogrenci("Kazým", "Gülek",1945,"26236363",null);
		
		ArrayList<String> dersler = new ArrayList<>();
		
		dersler.add("Matematik");
		dersler.add("Kimya");
		dersler.add("Kimya");
		
		//þimdi bu dersleri ogrenci1 imize set edeceðiz
		ogrenci1.setDersler(dersler);
		
		//2.öðrencimizi objeleyelim
		
		Ogrenci ogrenci2 = new Ogrenci("Ali", "Koç", 1987, "474747", null);
		ogrenci2.setDersler(dersler);
		
		Ogrenci ogrenci3 = new  Ogrenci("Karman", "Dülek",1945,"3674646",null);
		
		Ogrenci ogrenci4 = new  Ogrenci("Tarkan", "Zafir",1983,"575744",null);
		
		
		ArrayList<Ogrenci> ogrenciler =new ArrayList<>();//burda listemizin içinde öðrencilerimi saklmak istiyorumi Stringi Ogrenciye çevirdim
	
		ogrenciler.add(ogrenci4);
		ogrenciler.add(ogrenci2);
		ogrenciler.add(ogrenci3);
		ogrenciler.add(ogrenci1);
	
	for (Ogrenci ogrenci : ogrenciler) {
		
		//System.out.println(ogrenci.getIsim() + " " + ogrenci.getSoyÝsim());-->bu þekilde yazarsam sadece isim ve soyisimleri çýkar
		
		System.out.println(ogrenci);//toString methodu ile bunlarý yazdýracaki bir önceki classda toStringdeki içerikler burda olacak
//		        Ogrenci [isim=Tarkan, soyÝsim=Zafir, dogumYili=1983, okulNumarasý=575744, dersler=null]
//				Ogrenci [isim=Ali, soyÝsim=Koç, dogumYili=1987, okulNumarasý=474747, dersler=[Matematik, Kimya, Kimya]]
//				Ogrenci [isim=Karman, soyÝsim=Dülek, dogumYili=1945, okulNumarasý=3674646, dersler=null]
//				Ogrenci [isim=Kazým, soyÝsim=Gülek, dogumYili=1945, okulNumarasý=26236363, dersler=[Matematik, Kimya, Kimya]]
		
		
		
	}
	
	
	
	}

}
