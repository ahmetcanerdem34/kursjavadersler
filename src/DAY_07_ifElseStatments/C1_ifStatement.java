package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C1_ifStatement {

	public static void main(String[] args) {
		

		//SORU: KULLANICIDAN 1 TAM SAYI ÝSTEYÝN SAYI POZÝTÝF ÝSE SAYI POZÝTÝF ÝSE POZÝTÝF
		//SAYI YUZDEN KUÇUKSE SAYI 100 DEN KUCUK, 
		//1000 den buyukse buyuk yazdýrýn
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("tamsayý giirniz :");
		int sayi=scan.nextInt();
		
		if(sayi>0) {
			
			System.out.println("girilen sayý pozitiftir..");
		}
		if(sayi<100) {
			System.out.println("girilen sayý 100 den küçüktür");
		
		}
		if(sayi>1000) {
			System.out.println("büyük sayý");
			
			scan.close();
		}
		
		
	}

}
