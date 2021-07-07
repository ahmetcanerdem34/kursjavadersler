package DAY_29_passValue›mmutable;

public class C1_PasValueCalisma02 {

	public static void main(String[] args) {
	
		
		/*
		 Soru2 : Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun.
 - Methodída indirim uygulayip fiyati main methodída yazdirin
 - Methodílari arka arkaya cagirip dogru calistiklarini kontrol edin
		 */
		
		double fiyat=100;
		System.out.println("%10 indirimli fiyat : " + indirimUygula10(fiyat));
		System.out.println("%10 indirimli fiyat : " + indirimUygula20(fiyat));
		System.out.println("%10 indirimli fiyat : " + indirimUygula25(fiyat));
		System.out.println("normal fiyat :"+ fiyat);
		
//		%10 indirimli fiyat : 90.0
//		%10 indirimli fiyat : 80.0
//		%10 indirimli fiyat : 75.0
//		normal fiyat :100.0

	}

	private static double indirimUygula25(double fiyat) {
		
		fiyat=fiyat*0.75;
		return fiyat;
	}

	private static double indirimUygula20(double fiyat) {
		
		fiyat=fiyat*0.80;
		return fiyat;
		
		
	}

	private static double indirimUygula10(double fiyat) {
		
		
		fiyat=fiyat*0.90;
		return fiyat;
	
		
	}

}
