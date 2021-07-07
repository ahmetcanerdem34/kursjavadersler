package DAY_19_count_do_while;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
/*
		Soru 5 ) Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
	 Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
	  - Sifre kucuk harf icermelidir//kontrol etmem lazým içeriyorsa biþey içermiyorsa birþey yapmalýyýz
	  - Sifre buyuk harf icermelidir
	  - Sifre ozel karakter icermelidir
	  - Sifre en az 8 karakter olmalidir.
*/
		Scanner scan= new Scanner (System.in);
		String sifre=" ";
		int sonuc=0;
		
		do {
			
			System.out.print("lütfen þifrenizi giriniz :");
			sifre =scan.nextLine();//þifrede boþluk býrakmýþ olabilir.. line
			
			//yukardaki 4 þart için metodlarýný burda oluþturduk
			
	   sonuc=kucukHarfVarMi(sifre)+ buyukHarfVarMi(sifre)+ ozelKarakterVarMi(sifre)+ uzunlukUygunMu(sifre);  //bu kodu çaðýrýp içöine þifre yazacaðým
			//kucuk harf metodu ban 0 veya 1 döndürür=1 varsa istediðim, 0 sa istemediðim durum00burdakilerin hepsi 0 ve 1 uzerinden olacak
			//hepsi uygunsa toplamlarý =4 eder
			
			
		} while (sonuc!= 4);//sonuç 4 olursa iþi bitir yoksa dön=04 ü buluncaya kadar dönecek
		
		System.out.println("þifreniz baþarý ile kaydedildi");
	}

	public static int uzunlukUygunMu(String sifre) {
		
		int sonucUzunluk=0;
		if(sifre.length()<8) {
			
			System.out.println("þifre en az 8 karakter olmalýdýr...");
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
		//sadece 1 þey yazdýrabilir= kucuk harrf var yada yok yadýrabilir, int a çevirisek döngüler saðlarýz
		int flagKucuk=0;
		int index=0;
		
		
		while(index<sifre.length()) {
			
			if(sifre.charAt(index)>'a' && sifre.charAt(index)<'z'){
				flagKucuk=1;//flag ya 0 ya 1 olur--->true ve false de olurda burda 1 ya da 0 alalým
				
				
			}
			index++;
			
			
		}
		
		if(flagKucuk==0) {
			
			System.out.println("þifre küçük harf içermelidir..");
		}
		
		return flagKucuk;
		
	}

}
