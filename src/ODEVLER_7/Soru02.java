package ODEVLER_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 * * Rastgele kullanýcý adý oluþturan JAVA kodu yazýnýz. 
		 * * 1. Adým : Kullanýcýdan ismini isteyelim * 
		 * 2. Adým : Kullanýcý adýndaki boþluklarý silelim. * 
		 * 3. Adým : Kullanýcý adýnýn alýnabilir olup olmadýðýna bakalým. * 
		 * 4. Adým : Eðer bizim listemizde öyle bir kullanýcý adý yoksa kullanýcý adý, kullanýcýnýngirdiði isim olsun. 
		 * 5. Adým : Eðer bu kullanýcý adý zaten varsa, sonuna rastgele sayý oluþturup ekleyelim, 
		 * ve gösterelim.
		 * List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
		 * veritabanindakiKullaniciListesi.add("Ahmet");
		 * veritabanindakiKullaniciListesi.add("Ayþe");
		 * veritabanindakiKullaniciListesi.add("Süleyman");
		 * veritabanindakiKullaniciListesi.add("Nazmi"); *	
		*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("isminizi giriniz :");
		String isim = scan.nextLine().trim();
		
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
		
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayþe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		
		Random rastgele = new Random();
		
		if(veritabanindakiKullaniciListesi.contains(isim)) {
			
			System.out.println("Numara eklenmiþ hali :"+isim+rastgele.nextInt(40));
			
			
		}else {
			
			System.out.println("Normal hali : "+isim);
			
		}
		
		
	}

}
