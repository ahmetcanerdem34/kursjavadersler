package DAY_08_nested�f;

import java.util.Scanner;

public class C1_�fElse�fStament {

	public static void main(String[] args) {
		
		
		//soru: kullan�c�dan gun ismini yazma�sn� isteyizniz
		//girilen isim ge�erli ise 
		//gun isimlerinin 1. 2. 3. harflerini ilk harf buyuk di�er ikisi kucuk olarak yazd�r�n
		//gun ismi ge�erli de�il se gecerli gun smi giriniz
		

		Scanner scan =new Scanner (System.in);
		System.out.print("g�n ismi giriniz :");
		String gun=scan.nextLine();//girilen tum yaz�y� kucuk harfe �evirdik, yan� ne g�rse kucuk olacak
		
		
		if(gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		}else if(gun.equalsIgnoreCase("sal�")) {
			System.out.println("Sal");
		
		}else if(gun.equalsIgnoreCase("�ar�amba")) {
			System.out.println("�ar");
		}else if(gun.equalsIgnoreCase("per�embe")) {
			System.out.println("Per");
		}else if(gun.equalsIgnoreCase("cuma") || gun.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
		}else {
			System.out.println("l�tfen ge�erli gun ismi giriniz");
			
//			g�n ismi giriniz :sal�
//			Sal
			
//			g�n ismi giriniz :sal� sallan�r
//			l�tfen ge�erli gun ismi giriniz
		}
scan.close();
	}

}
