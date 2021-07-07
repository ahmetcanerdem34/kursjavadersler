package DAY_29_passValueÝmmutable;

public class C1_PassValu01 {

	public static void main(String[] args) {
		
		//PassByValue ve PassByReferance
		
		/*
		 Soru : Verilen bir fiyat icin %10 indirim yapan bir method olusturun.
  - Method’da indirim uygulanan fiyati yazdirin
  - Method Call sonrasi original fiyati yazdirin ve method’da yapilan degisikligin  
  orginal degeri degistirip degistirmedigini kontrol edin. 
		 
		 */
		
		double fiyat=100;
		
		indirimUygula(fiyat);//method call yaptýk
		System.out.println("method call sonrasý fiyat : "+ fiyat);
		//method call sonrasý fiyat : 100----->burdaki yeni yazdýrýlýnca fiyatý
	}

	public static void indirimUygula(double fiyat) {
		
		fiyat=fiyat*0.90;
		
		System.out.println("%10 indirimli fiyat :" + fiyat*0.90);//0.90 yuz de 10 luk indirmi oluyor zaten
		//%10 indirimli fiyat :90.0---------<yukarý gönderdiði fiyat
		System.out.println(fiyat-10);//bura 80 verir çünkü bu method içinde olan burda kalýr
		
		
		
	}

}
