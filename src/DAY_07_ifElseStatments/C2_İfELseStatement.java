package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C2_�fELseStatement {

	public static void main(String[] args) {
		
		
		//kullan�c�dan dikd�rtgen�n uzunluklsr�n� ls�n
		//e�itse kare de�ilse dikd�rtgen yazd��rn
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("2 kenar uzunlugu giriniz:");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		
		if (kenar1==kenar2 ) {
			System.out.println("kare");
		} else {
			System.out.println("dikd�rtgen");
			
//			2 kenar uzunlugu giriniz:15
//			25
//			dikd�rtgen
			
		}
		scan.close();

	}

}
