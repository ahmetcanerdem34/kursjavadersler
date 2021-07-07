package DAY_09_Ternary;

import java.util.Scanner;

public class C3_Turnary3 {

	public static void main(String[] args) {
		
		// soru: kullanýcýdan 2 sayý alýn ve yazdýrýn ve buyuk olaný yazýrýn
		
		Scanner scan =new Scanner (System.in);
		System.out.print("sayý giriniz :");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		
		System.out.println("büyük olan sayý =" + (sayi1>sayi2 ? "sayi1 büyüktür" : "sayi2 büyüktür"));

//		sayý giriniz :25
//		35
//		büyük olan sayý =sayi2 büyüktür
		
		
		//turnary kolay iþlemler kýsa iþlemlerde güzel
		
		// nested da var
	}

}
