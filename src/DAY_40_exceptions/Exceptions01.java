package DAY_40_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*Kullanicidan yasini girmesini isteyin.
		 *  Kodunuzu kullanici sifirdan kucuk bir sayi 
		 *  girerse Exception verecek sekilde yazin.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("yas�n�z� giriniz");
		int yas=scan.nextInt();
		
		//exception k�sm� if else blo�u olmal�
		try {
		if(yas>=0) {
			
			System.out.println("girdi�iniz ya� :"+ yas );
		}else {
			
			throw new IllegalArgumentException();//bu k�sm� koydu�umuzda javya exception att�rd�k, ya� 0 dan k���k olamz
		}
		//java ya bir exception throw ettirmek i�in "throw" ve "new" keywordlari kullan�l�r
		//bu �ekilde yazd���n�zda java exception throw eder ma
		//kodunuz da bloke olmus olur
		//bloke olmas�n� engellemek isterseniz kodu try catch ille surround yapabiliriz
	}catch(IllegalArgumentException e) {
		e.getMessage();//syso i�inde yazmaya gerek yok
	}
		System.out.println("kod bloke olmam��");
	}
}
