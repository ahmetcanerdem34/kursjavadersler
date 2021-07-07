package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C6_ÝfElseÝf {

	public static void main(String[] args) {
		
		
		//soru: kullanýcýdan 100 üzerinde notunu isteyin 
		//notu harf sistemine çevirip yazdýrýn
		//50 den küçükse D, 50-60 arasý C, 60-80 arasý  B, 80 ve üzeri A
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("100 üzerinden notunuzu giriniz :");
		double not=scan.nextDouble();
		
	
		//ELSE ÝF CÜMLELERÝNÝ BÝRBÝRÝNE BAÐLAR, --- SADECE ÝFLERLE KURARSAK KODLARI, HER ÝF KODU BÝRBÝRÝNDEN BAÐIMSIZDIR(BODY LERÝ)
		
		
		if(not<0 || not>100) {//istenmeyen durumu girdik
			System.out.println("geçerli not giriniz");
		}
		
		else if(not<50) {//notumuz 0 ile 100 arasýnda
			System.out.println("D");
			
			} else if(not<60) {//þuan da notm 50 ile 100 arasýnda olabilir
				System.out.println("C");
			
			}else if(not<80) {//buraya geldiyse 
				System.out.println("B");
				
			}else {
				System.out.println("A");
				
				
//				100 üzerinden notunuzu giriniz :50
//				C
				
//				100 üzerinden notunuzu giriniz :101
//				geçerli not giriniz
//				
//				100 üzerinden notunuzu giriniz :87
//				A
//				
				


			}
		scan.close();
		
		

	}

}
