package DAY_09_Ternary;

import java.util.Scanner;

public class C4_Turnary4 {

	public static void main(String[] args) {
		
		//soru 2: kullanýcýdan bir tamsayý alýn
		//tek mi çift mi olduðunu yazdýrýn
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("tamsayý giriniz :");
		int sayi=scan.nextInt();
		
		//int sonuc= sayi%2==0 ? "çift" : "tek" --> bu þekilde burada sonuc deðerine atayýp syso ile sonuc ta yazdýrabiliriz
		
		System.out.println(sayi%2==0 ? "çift" : "tek");
		
		//girilen sayýnýn mutlak deðerini bulunuz
		
		System.out.println(Math.abs(sayi));
		System.out.println("sayýnýn mutlak deðeri = " +( sayi>0 ? sayi : -sayi));
//		tamsayý giriniz :-33
//		tek
//		33
//		sayýnýn mutlak deðeri = 33
		
//		tamsayý giriniz :65
//		tek
//		65
//		65
		
		//bu da negatifi
//		tamsayý giriniz :-24
//		çift
//		24
//		24
		
		
		
		
		
scan.close();
	}

}
