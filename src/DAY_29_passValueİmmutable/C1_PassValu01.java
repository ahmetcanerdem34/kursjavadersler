package DAY_29_passValue�mmutable;

public class C1_PassValu01 {

	public static void main(String[] args) {
		
		//PassByValue ve PassByReferance
		
		/*
		 Soru : Verilen bir fiyat icin %10 indirim yapan bir method olusturun.
  - Method�da indirim uygulanan fiyati yazdirin
  - Method Call sonrasi original fiyati yazdirin ve method�da yapilan degisikligin  
  orginal degeri degistirip degistirmedigini kontrol edin. 
		 
		 */
		
		double fiyat=100;
		
		indirimUygula(fiyat);//method call yapt�k
		System.out.println("method call sonras� fiyat : "+ fiyat);
		//method call sonras� fiyat : 100----->burdaki yeni yazd�r�l�nca fiyat�
	}

	public static void indirimUygula(double fiyat) {
		
		fiyat=fiyat*0.90;
		
		System.out.println("%10 indirimli fiyat :" + fiyat*0.90);//0.90 yuz de 10 luk indirmi oluyor zaten
		//%10 indirimli fiyat :90.0---------<yukar� g�nderdi�i fiyat
		System.out.println(fiyat-10);//bura 80 verir ��nk� bu method i�inde olan burda kal�r
		
		
		
	}

}
