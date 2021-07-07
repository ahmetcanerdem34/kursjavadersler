package DAY_08_nestedÝf;

import java.util.Scanner;

public class C1_ÝfElseÝfStament {

	public static void main(String[] args) {
		
		
		//soru: kullanýcýdan gun ismini yazmaýsný isteyizniz
		//girilen isim geçerli ise 
		//gun isimlerinin 1. 2. 3. harflerini ilk harf buyuk diðer ikisi kucuk olarak yazdýrýn
		//gun ismi geçerli deðil se gecerli gun smi giriniz
		

		Scanner scan =new Scanner (System.in);
		System.out.print("gün ismi giriniz :");
		String gun=scan.nextLine();//girilen tum yazýyý kucuk harfe çevirdik, yaný ne gýrse kucuk olacak
		
		
		if(gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
		}else if(gun.equalsIgnoreCase("salý")) {
			System.out.println("Sal");
		
		}else if(gun.equalsIgnoreCase("çarþamba")) {
			System.out.println("Çar");
		}else if(gun.equalsIgnoreCase("perþembe")) {
			System.out.println("Per");
		}else if(gun.equalsIgnoreCase("cuma") || gun.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
		}else {
			System.out.println("lütfen geçerli gun ismi giriniz");
			
//			gün ismi giriniz :salý
//			Sal
			
//			gün ismi giriniz :salý sallanýr
//			lütfen geçerli gun ismi giriniz
		}
scan.close();
	}

}
