package DAY_31_varrags;

public class C2_Varrags01 {

	public static void main(String[] args) {
		
		
		//veirlen iki say�y� toplayan ve sonucu yazd�ran bir method yaz�n
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		
		 toplama(sayi1,sayi2);//method call
		
		 
		 //verilen 3 sayiyi toplayan method olu�turun
		 //bir �nce method i�e yaramaz, ��nk� orda 2 argument var

		toplama(sayi1,sayi2,sayi3);//method call
		//yukardaki methodun sonu yok s�reki artt�r�rz
		
		//�yle bir method yazal�m ki i�ine ka� say� yazarsak yazal�m toplas�n
		toplama(2,3);//dersek 1. method �al���r
		toplama(2,5,8);//2. method �al���r, 3 say�n�n toplam�
		
		//istedi�imiz kadar say�y� yazabilece�imiz methodu olu�turabilmemiz i�in varagsa bakal�m
		//java varags olu�turmu�

	}

	public static void toplama(int sayi1, int sayi2, int sayi3) {
		
		
		System.out.println("3 say�n�n toplam� : " +(sayi1 + sayi2+ sayi3));
		
	}

	public static void toplama(int sayi1, int sayi2) {
		
		System.out.println("2 say�n�n toplam� : " +(sayi1 + sayi2));
		
	}

}
