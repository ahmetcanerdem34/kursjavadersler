package DAY_10_SwitchCase;

import java.util.Scanner;

public class C5_SwitchCase {

	public static void main(String[] args) {
		// kullan�c�da hangi g�nde ldu�unu girsin
		//girilen g�n�n hafta i�i ya da hafta sonu oldu�unu yaz�n
		

		Scanner scan = new Scanner(System.in);
		System.out.print("g�n giriniz :");
		String gun = scan.nextLine().toUpperCase();
		
		
		
		switch (gun) {//birden fazla duurm ayn� sonucu veriyorsa hepsinibreak ve syso yazd�rmama gerekiyor mu? hay�r
		
		case "PAZARTES�": 
		case "SALI": 
		case "�AR�AMBA": 
		case "PER�EMBE": 
		case "CUMA": System.out.println("haftai�i");break;
		case "CUMARTES�": 
		case "PAZAR": System.out.println("haftasonu");break;
		default : System.out.println("ge�erli g�n yaz�n�z");
		
//		g�n giriniz :sal�
//		haftai�i
		
//		g�n giriniz :cumartesi
//		haftasonu
		}
		
		
		
		
		
	}

}
