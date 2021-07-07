package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C2_ÝfELseStatement {

	public static void main(String[] args) {
		
		
		//kullanýcýdan dikdörtgenýn uzunluklsrýný lsýn
		//eþitse kare deðilse dikdörtgen yazdýýrn
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("2 kenar uzunlugu giriniz:");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		
		if (kenar1==kenar2 ) {
			System.out.println("kare");
		} else {
			System.out.println("dikdörtgen");
			
//			2 kenar uzunlugu giriniz:15
//			25
//			dikdörtgen
			
		}
		scan.close();

	}

}
