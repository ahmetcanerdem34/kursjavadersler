package DAY_04_MathOperatorsAndModuls;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {


		//soru : kullan��cdan 4 basamkl� say� alal�m ve say�n�n basamklar�n�n ters s�rada yazal�m
		
		//bir say�n�n basamklar�n� elde etmek i�in 2 i�lemi tekrar tekrar yapar�z
		//1. i�lem en sondaki basama�� elde etmek sonra onu yok etmek
		//2. i�lem bu i�lemi basamk say�s� kadar yapmal�y�m, 3 basam 3 , 4 basamak 4 kere ister
		
		// i�mdi say� alal�m kullanc�dan
		
		

		Scanner scan=new Scanner (System.in);
		System.out.print("basamaklar�n� bulmak i�in 4 basamakl� say� giriniz :");
		int sayi=scan.nextInt();//bu basamaktan sonra elimizde 4 basamakl� say� var
		
		
		// 4 tekrar yapaca��z
		//1. tekrar birler basam��n� bul 
		
		int birler=sayi % 10;
		sayi/=10;//ilk basama�� buldum, buldu�um ilk basamaktan kurtulmak i�in sayi de�i�kenini 10 a b�ld�m
		
		//bu sat�rdan sonra say�m�z 3 basamkl� oldu
		//onlar basama��n� bulmak i�in ayn� i�lemi  tekrar yapaca��m
		
		int onlar=sayi%10;
		sayi/=10;
		
		//bu sat�rdan itibaren say�m�z 2 basamakl� kald�
		
		int yuzler= sayi%10;
		sayi/=10;
		
		//bu i�lemden sonra say�m�z tek basamk kald�
		//art�k binler basama�� kalan say�d�r yazal�m, oda ayi k�sm�d�r
		
		int binler=sayi;
		
		System.out.println("birler :" + birler);
		System.out.println("onlar :" + onlar);
		System.out.println("yuzler : " + yuzler);
		System.out.println("bilner :" + binler);
		
		
		
//		birler :7
//		onlar :8
//		yuzler : 6
//		biner :5


		
		//yan yana yazd�ral�m//concatination yaparsak yan�na string koyar�z sonrakileri birle�tirir
		
		System.out.println("girdi�imi say�n�n tersten yaz�l��� : " +birler + onlar + yuzler + binler );
		//7865
		
		// toplamlar�n� yad�ral�m
		
		System.out.println(+birler + onlar + yuzler + binler);
		//26
		
//		basamaklar�n� bulmak i�in 4 basamakl� say� giriniz :5687
//		birler :7
//		onlar :8
//		yuzler : 6
//		binler :5
//		girdi�imi say�n�n tersten yaz�l��� : 7865
//		26
	
		
	scan.close();
		
		
		
	}

}
