package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C5_ÝfELseStat4 {

	public static void main(String[] args) {
		
		
		
		//soru: kullanýcýdan üçgenin kenar uzunluklarýný alýnýz
		//3 kenar eþitse eþkenar deðilse deðil
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("3 kenar uzunlugu giriniz:");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		
		
		
		if (kenar1==kenar2 && kenar1==kenar3) {
			System.out.println("eþkenar");
			
		} else {
			System.out.println("eþkenar deðil");
			
//			3 kenar uzunlugu giriniz:34.5
//			23
//			45.6
//			eþkenar deðil

		}
		scan.close();
	}

}
