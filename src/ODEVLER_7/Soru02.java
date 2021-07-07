package ODEVLER_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 * * Rastgele kullan�c� ad� olu�turan JAVA kodu yaz�n�z. 
		 * * 1. Ad�m : Kullan�c�dan ismini isteyelim * 
		 * 2. Ad�m : Kullan�c� ad�ndaki bo�luklar� silelim. * 
		 * 3. Ad�m : Kullan�c� ad�n�n al�nabilir olup olmad���na bakal�m. * 
		 * 4. Ad�m : E�er bizim listemizde �yle bir kullan�c� ad� yoksa kullan�c� ad�, kullan�c�n�ngirdi�i isim olsun. 
		 * 5. Ad�m : E�er bu kullan�c� ad� zaten varsa, sonuna rastgele say� olu�turup ekleyelim, 
		 * ve g�sterelim.
		 * List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
		 * veritabanindakiKullaniciListesi.add("Ahmet");
		 * veritabanindakiKullaniciListesi.add("Ay�e");
		 * veritabanindakiKullaniciListesi.add("S�leyman");
		 * veritabanindakiKullaniciListesi.add("Nazmi"); *	
		*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("isminizi giriniz :");
		String isim = scan.nextLine().trim();
		
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
		
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ay�e");
		veritabanindakiKullaniciListesi.add("S�leyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		
		Random rastgele = new Random();
		
		if(veritabanindakiKullaniciListesi.contains(isim)) {
			
			System.out.println("Numara eklenmi� hali :"+isim+rastgele.nextInt(40));
			
			
		}else {
			
			System.out.println("Normal hali : "+isim);
			
		}
		
		
	}

}
