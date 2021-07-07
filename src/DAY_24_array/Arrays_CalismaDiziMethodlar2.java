package DAY_24_array;

import java.util.Scanner;

public class Arrays_CalismaDiziMethodlar2 {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//1. methodda say�lar� ald�k
		
		//2. methodda say�lar� yazd�rd�k
		
		int diziBoyut;
		
		System.out.println("ka� elemanl� bir dizi gireceksiniz :");
		diziBoyut=scan.nextInt();
	

		
		//bir say�sal dizi olu�tural�m
		
		int sayilar[]= diziElemanlar�n�Al(diziBoyut);
		
		diziElemanYazdir(sayilar);


	}
	
	public static void diziElemanYazdir(int s[]) {//bu �ekilde yukardaki butun sayilar eleman�n� burdaki s e aktarm�� lduk
		
		for (int i = 0; i < s.length; i++) {
			
			System.out.println(s[i]);//s diizzsindeki eemanlar� i olarak isteyece�iz, yukar� ��k �a��r
//			ka� elemanl� bir dizi gireceksiniz :
//				5
//				1.eleman� giriniz 
//				45
//				2.eleman� giriniz 
//				43
//				3.eleman� giriniz 
//				45
//				4.eleman� giriniz 
//				65
//				5.eleman� giriniz 
//				67
//				45
//				43
//				45
//				65
//				67
			
		}

}
	
	//yukarda elemanlar� biz verdik, bu seferde kendimiz tek tek girelim
	
	public static int[] diziElemanlar�n�Al(int boyut) {//burda int ile main methoduna g�nderece�iz
		
		int sayilar[]=new int [boyut];
		
		//for d�ng�s�yle b�t�n elemanlar� alal�m,,
		
		for (int i = 0; i < sayilar.length; i++) {
			
			System.out.println((i+1)+".eleman� giriniz ");
			sayilar[i]=scan.nextInt();
		}
		return sayilar;
	}
	
	
	
	
}