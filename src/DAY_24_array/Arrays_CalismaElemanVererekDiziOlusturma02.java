package DAY_24_array;

import java.util.Scanner;

public class Arrays_CalismaElemanVererekDiziOlusturma02 {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		int gun;
		
		System.out.print("g�n say�s� giriniz :");
		gun=scan.nextInt();
		
		
		//gunler diye dizi olu�turduk
							// 0		1.			2.		3.			4.		5.			6.
		String gunler[]= {"Pazartesi", "sal�", "�ar�amba","per�embe","cuma","cumartesi","pazar"};//verilecek elemanlar belli ise s�sl� i�inde yaz�yoruz

		
		if(gun>=0 && gun <7) {
			
			System.out.println(gunler[gun-1]);//-1 dedikki se�ilen g�n� versin
//			g�n say�s� giriniz :4
//			cuma
//			
//			g�n say�s� giriniz :4
//			per�embe
			
		}else {
			System.out.println("girdi�iniz gun say�s� ge�erli de�il");
			
//			g�n say�s� giriniz :10
//			girdi�iniz gun say�s� ge�erli de�il
			
			scan.close();
		}
		

		System.out.println("*****************************");
		
		
			
		System.out.println("3.g�nun indexi" +" "+ gunler[3]);
		//3.g�nun indexi per�embe
		
		
		//peki bu g�nleri de�i�tirebilir miyiz , tabi de�i�ir
		
		
		gunler[3]="nisan";
		
		System.out.println(gunler[3]);
		
		
		//saya�la yaparsak hepsini yazd�r�r
		
		
		for (int i = 0; i < 7; i++) {
			
			System.out.println(gunler[i]);
			
//			Pazartesi
//			sal�
//			�ar�amba
//			nisan
//			cuma
//			cumartesi
//			pazar
			
		}
		
		System.out.println("***************************");
		
		for (int i = 0; i < gunler.length; i++) {
			
			System.out.println(gunler[i]);
//			Pazartesi
//			sal�
//			�ar�amba
//			nisan
//			cuma
//			cumartesi
//			pazar
			
		}
		
		System.out.println("**********************************");
		
		//int te verilecek say�lar belli ise yine suslu i�inde yazar�z
		
		int sayilar[]= {20,30,4,6,45,67};
		
		System.out.println(sayilar[0]);
	}

}
