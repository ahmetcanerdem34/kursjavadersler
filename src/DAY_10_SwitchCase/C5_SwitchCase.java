package DAY_10_SwitchCase;

import java.util.Scanner;

public class C5_SwitchCase {

	public static void main(String[] args) {
		// kullanýcýda hangi günde lduðunu girsin
		//girilen günün hafta içi ya da hafta sonu olduðunu yazýn
		

		Scanner scan = new Scanner(System.in);
		System.out.print("gün giriniz :");
		String gun = scan.nextLine().toUpperCase();
		
		
		
		switch (gun) {//birden fazla duurm ayný sonucu veriyorsa hepsinibreak ve syso yazdýrmama gerekiyor mu? hayýr
		
		case "PAZARTESÝ": 
		case "SALI": 
		case "ÇARÞAMBA": 
		case "PERÞEMBE": 
		case "CUMA": System.out.println("haftaiçi");break;
		case "CUMARTESÝ": 
		case "PAZAR": System.out.println("haftasonu");break;
		default : System.out.println("geçerli gün yazýnýz");
		
//		gün giriniz :salý
//		haftaiçi
		
//		gün giriniz :cumartesi
//		haftasonu
		}
		
		
		
		
		
	}

}
