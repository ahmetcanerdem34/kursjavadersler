package DAY_29_passValue�mmutable;

public class C2_PassValu02 {

	public static void main(String[] args) {
		/*
		 Soru2 : Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun.
  - Method�da indirim uygulayip fiyati main method�da yazdirin
  - Method�lari arka arkaya cagirip dogru calistiklarini kontrol edin
		 */
		
		//indirim method da yazd�rma mainde olacak
		double fiyat=100;//bu double �n fiyat� sadece main de gecerli, di�erleride kendi methodlar�nda
		System.out.println("%10 indirimli fiyat : " + indirimUygula10(fiyat));
		System.out.println("%20 indirimli fiyat : " + indirimUygula20(fiyat));
		System.out.println("%25 indirimli fiyat : " + indirimUygula25(fiyat));
		System.out.println("method call dan sonra fiyat :" + fiyat);
		
//		%10 indirimli fiyat : 90.0
//		%20 indirimli fiyat : 80.0
//		%25 indirimli fiyat : 75.0
//		method call dan sonra fiyat :100.0
		
		
		

	}

	public static double indirimUygula25(double fiyat) {//java3. methoda gelip buraya 100 kolon fiyat g�nderecek 
													    //ve 75 d�nd�r�p yazd�racak
		
		fiyat*=0.75;
		
		return fiyat;
	}

	public static double indirimUygula20(double fiyat) {//sonra buraya fiyat klonlanacak 100 olarak, 
													    //i�lenecek ve 80 olara kyukar� gidecek
		
		fiyat*=0.80;
		return fiyat;
	}

	public static double indirimUygula10(double fiyat) {//buraya fiyat�n kolonu geldi=90 a d���p, 
														//retur oldu yukar� 90 gitti bu method i�in
		//burda fiyat %10 indirim uygulayacak,
		
		fiyat*=0.90;
		
		
		return fiyat;
	}

}
