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
		System.out.println("yasýnýzý giriniz");
		int yas=scan.nextInt();
		
		//exception kýsmý if else bloðu olmalý
		try {
		if(yas>=0) {
			
			System.out.println("girdiðiniz yaþ :"+ yas );
		}else {
			
			throw new IllegalArgumentException();//bu kýsmý koyduðumuzda javya exception attýrdýk, yaþ 0 dan küçük olamz
		}
		//java ya bir exception throw ettirmek için "throw" ve "new" keywordlari kullanýlýr
		//bu þekilde yazdýðýnýzda java exception throw eder ma
		//kodunuz da bloke olmus olur
		//bloke olmasýný engellemek isterseniz kodu try catch ille surround yapabiliriz
	}catch(IllegalArgumentException e) {
		e.getMessage();//syso içinde yazmaya gerek yok
	}
		System.out.println("kod bloke olmamýþ");
	}
}
