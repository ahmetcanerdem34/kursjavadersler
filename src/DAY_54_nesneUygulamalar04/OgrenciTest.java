package DAY_54_nesneUygulamalar04;

import java.util.ArrayList;

public class OgrenciTest {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new  Ogrenci("Kaz�m", "G�lek",1945,"26236363",null);
		
		ArrayList<String> dersler = new ArrayList<>();
		
		dersler.add("Matematik");
		dersler.add("Kimya");
		dersler.add("Kimya");
		
		//�imdi bu dersleri ogrenci1 imize set edece�iz
		ogrenci1.setDersler(dersler);
		
		//2.��rencimizi objeleyelim
		
		Ogrenci ogrenci2 = new Ogrenci("Ali", "Ko�", 1987, "474747", null);
		ogrenci2.setDersler(dersler);
		
		Ogrenci ogrenci3 = new  Ogrenci("Karman", "D�lek",1945,"3674646",null);
		
		Ogrenci ogrenci4 = new  Ogrenci("Tarkan", "Zafir",1983,"575744",null);
		
		
		ArrayList<Ogrenci> ogrenciler =new ArrayList<>();//burda listemizin i�inde ��rencilerimi saklmak istiyorumi Stringi Ogrenciye �evirdim
	
		ogrenciler.add(ogrenci4);
		ogrenciler.add(ogrenci2);
		ogrenciler.add(ogrenci3);
		ogrenciler.add(ogrenci1);
	
	for (Ogrenci ogrenci : ogrenciler) {
		
		//System.out.println(ogrenci.getIsim() + " " + ogrenci.getSoy�sim());-->bu �ekilde yazarsam sadece isim ve soyisimleri ��kar
		
		System.out.println(ogrenci);//toString methodu ile bunlar� yazd�racaki bir �nceki classda toStringdeki i�erikler burda olacak
//		        Ogrenci [isim=Tarkan, soy�sim=Zafir, dogumYili=1983, okulNumaras�=575744, dersler=null]
//				Ogrenci [isim=Ali, soy�sim=Ko�, dogumYili=1987, okulNumaras�=474747, dersler=[Matematik, Kimya, Kimya]]
//				Ogrenci [isim=Karman, soy�sim=D�lek, dogumYili=1945, okulNumaras�=3674646, dersler=null]
//				Ogrenci [isim=Kaz�m, soy�sim=G�lek, dogumYili=1945, okulNumaras�=26236363, dersler=[Matematik, Kimya, Kimya]]
		
		
		
	}
	
	
	
	}

}
