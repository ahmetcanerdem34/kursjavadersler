package ODEVLER_6;

import java.util.Scanner;

public class Soru_02 {

	public static void main(String[] args) {
		
		/* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */

		
		Scanner scan =new Scanner(System.in);
		
		int count=0;
		int toplam=0;
		int sayi=0;
		
		do {
			
			System.out.println("sayý giriniz:");
			sayi=scan.nextInt();
			
			toplam+=sayi;
			count++;
			
			
		} while (toplam<100);
		
		System.out.println(count+" "+toplam);

	}

}
