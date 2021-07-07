package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C4_ÝfElseSatment3 {

	public static void main(String[] args) {
		
		//soru: kullanýcýdan yaþýný sorun 65 ten buyukse eþitse emeklý olabilirsin yoksa olmazsýn yazdýrýn
		
		Scanner scan =new Scanner (System.in);
		System.out.print("yaþýnýzý giriniz:");
		int yas=scan.nextInt();
		
		
		if (yas>=65) {
			System.out.println("emekli olabilirsiniz");
			
		} else {
			System.out.println("emekli olamazsýnýz");
			
//			yaþýnýzý giriniz:65
//			emekli olabilirsiniz	
			
//			yaþýnýzý giriniz:34
//			emekli olamazsýnýz
			
		}
		scan.close();
 
	}

}
