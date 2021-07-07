package DAY_19_count_do_while;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
/*
		Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
	 Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde �Sifreniz Kabul edilmistir� yazdirin.
	  - Sifre kucuk harf icermelidir//kontrol etmem laz�m i�eriyorsa bi�ey i�ermiyorsa bir�ey yapmal�y�z
	  - Sifre buyuk harf icermelidir
	  - Sifre ozel karakter icermelidir
	  - Sifre en az 8 karakter olmalidir.
*/
		Scanner scan= new Scanner (System.in);
		String sifre=" ";
		int sonuc=0;
		
		do {
			
			System.out.print("l�tfen �ifrenizi giriniz :");
			sifre =scan.nextLine();//�ifrede bo�luk b�rakm�� olabilir.. line
			
			//yukardaki 4 �art i�in metodlar�n� burda olu�turduk
			
	   sonuc=kucukHarfVarMi(sifre)+ buyukHarfVarMi(sifre)+ ozelKarakterVarMi(sifre)+ uzunlukUygunMu(sifre);  //bu kodu �a��r�p i��ine �ifre yazaca��m
			//kucuk harf metodu ban 0 veya 1 d�nd�r�r=1 varsa istedi�im, 0 sa istemedi�im durum00burdakilerin hepsi 0 ve 1 uzerinden olacak
			//hepsi uygunsa toplamlar� =4 eder
			
			
		} while (sonuc!= 4);//sonu� 4 olursa i�i bitir yoksa d�n=04 � buluncaya kadar d�necek
		
		System.out.println("�ifreniz ba�ar� ile kaydedildi");
	}

	public static int uzunlukUygunMu(String sifre) {
		
		int sonucUzunluk=0;
		if(sifre.length()<8) {
			
			System.out.println("�ifre en az 8 karakter olmal�d�r...");
		}else {
			
			sonucUzunluk=1;

		}
		
		return 0;
	}

	public static int ozelKarakterVarMi(String sifre) {
		
		
		
		return 0;
	}

	public static int buyukHarfVarMi(String sifre) {
		
		
		
		
		return 0;
	}

	public static int kucukHarfVarMi(String sifre) {//sifre =MehmetJava123
		//return type void, voidse ne yapar= 
		//sadece 1 �ey yazd�rabilir= kucuk harrf var yada yok yad�rabilir, int a �evirisek d�ng�ler sa�lar�z
		int flagKucuk=0;
		int index=0;
		
		
		while(index<sifre.length()) {
			
			if(sifre.charAt(index)>'a' && sifre.charAt(index)<'z'){
				flagKucuk=1;//flag ya 0 ya 1 olur--->true ve false de olurda burda 1 ya da 0 alal�m
				
				
			}
			index++;
			
			
		}
		
		if(flagKucuk==0) {
			
			System.out.println("�ifre k���k harf i�ermelidir..");
		}
		
		return flagKucuk;
		
	}

}
