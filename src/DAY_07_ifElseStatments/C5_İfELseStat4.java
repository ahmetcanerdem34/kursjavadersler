package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C5_�fELseStat4 {

	public static void main(String[] args) {
		
		
		
		//soru: kullan�c�dan ��genin kenar uzunluklar�n� al�n�z
		//3 kenar e�itse e�kenar de�ilse de�il
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("3 kenar uzunlugu giriniz:");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		
		
		
		if (kenar1==kenar2 && kenar1==kenar3) {
			System.out.println("e�kenar");
			
		} else {
			System.out.println("e�kenar de�il");
			
//			3 kenar uzunlugu giriniz:34.5
//			23
//			45.6
//			e�kenar de�il

		}
		scan.close();
	}

}
