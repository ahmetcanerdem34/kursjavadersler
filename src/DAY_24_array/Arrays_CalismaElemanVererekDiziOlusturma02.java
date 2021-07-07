package DAY_24_array;

import java.util.Scanner;

public class Arrays_CalismaElemanVererekDiziOlusturma02 {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		int gun;
		
		System.out.print("gün sayısı giriniz :");
		gun=scan.nextInt();
		
		
		//gunler diye dizi oluşturduk
							// 0		1.			2.		3.			4.		5.			6.
		String gunler[]= {"Pazartesi", "salı", "çarşamba","perşembe","cuma","cumartesi","pazar"};//verilecek elemanlar belli ise süslü içinde yazıyoruz

		
		if(gun>=0 && gun <7) {
			
			System.out.println(gunler[gun-1]);//-1 dedikki seçilen günü versin
//			gün sayısı giriniz :4
//			cuma
//			
//			gün sayısı giriniz :4
//			perşembe
			
		}else {
			System.out.println("girdiğiniz gun sayısı geçerli değil");
			
//			gün sayısı giriniz :10
//			girdiğiniz gun sayısı geçerli değil
			
			scan.close();
		}
		

		System.out.println("*****************************");
		
		
			
		System.out.println("3.günun indexi" +" "+ gunler[3]);
		//3.günun indexi perşembe
		
		
		//peki bu günleri değiştirebilir miyiz , tabi değişir
		
		
		gunler[3]="nisan";
		
		System.out.println(gunler[3]);
		
		
		//sayaçla yaparsak hepsini yazdırır
		
		
		for (int i = 0; i < 7; i++) {
			
			System.out.println(gunler[i]);
			
//			Pazartesi
//			salı
//			çarşamba
//			nisan
//			cuma
//			cumartesi
//			pazar
			
		}
		
		System.out.println("***************************");
		
		for (int i = 0; i < gunler.length; i++) {
			
			System.out.println(gunler[i]);
//			Pazartesi
//			salı
//			çarşamba
//			nisan
//			cuma
//			cumartesi
//			pazar
			
		}
		
		System.out.println("**********************************");
		
		//int te verilecek sayılar belli ise yine suslu içinde yazarız
		
		int sayilar[]= {20,30,4,6,45,67};
		
		System.out.println(sayilar[0]);
	}

}
