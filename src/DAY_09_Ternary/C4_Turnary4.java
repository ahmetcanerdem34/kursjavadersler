package DAY_09_Ternary;

import java.util.Scanner;

public class C4_Turnary4 {

	public static void main(String[] args) {
		
		//soru 2: kullan�c�dan bir tamsay� al�n
		//tek mi �ift mi oldu�unu yazd�r�n
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("tamsay� giriniz :");
		int sayi=scan.nextInt();
		
		//int sonuc= sayi%2==0 ? "�ift" : "tek" --> bu �ekilde burada sonuc de�erine atay�p syso ile sonuc ta yazd�rabiliriz
		
		System.out.println(sayi%2==0 ? "�ift" : "tek");
		
		//girilen say�n�n mutlak de�erini bulunuz
		
		System.out.println(Math.abs(sayi));
		System.out.println("say�n�n mutlak de�eri = " +( sayi>0 ? sayi : -sayi));
//		tamsay� giriniz :-33
//		tek
//		33
//		say�n�n mutlak de�eri = 33
		
//		tamsay� giriniz :65
//		tek
//		65
//		65
		
		//bu da negatifi
//		tamsay� giriniz :-24
//		�ift
//		24
//		24
		
		
		
		
		
scan.close();
	}

}
