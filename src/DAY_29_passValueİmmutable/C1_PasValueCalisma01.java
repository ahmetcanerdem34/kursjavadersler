package DAY_29_passValueÝmmutable;

public class C1_PasValueCalisma01 {

	public static void main(String[] args) {
		
		
		/*
		 Soru : Verilen bir fiyat icin %10 indirim yapan bir method olusturun.
 - Method’da indirim uygulanan fiyati yazdirin
 - Method Call sonrasi original fiyati yazdirin ve method’da yapilan degisikligin  
 orginal degeri degistirip degistirmedigini kontrol edin. 
		 
		 */
		
		
		double fiyat=100;
		
		indirimUygulananFiyat(fiyat);
		System.out.println("method call sonrasý fiyat : "+ fiyat);

	}

	public static void indirimUygulananFiyat(double fiyat) {
		
		fiyat=fiyat*0.90;
		
		System.out.println("%10 indirimli fiyat :" + fiyat*0.90);
		System.out.println(fiyat-10);
	}

}
