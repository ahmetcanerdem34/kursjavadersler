package ODEVLER_4;

import java.util.Scanner;

public class Soru_06 {

	public static void main(String[] args) {
		
		/* 
		Kullan�c�dan firstName ve lastName'i girmesini isteyin, ard�ndan ba� harflerini b�y�k harf yap�n ve geri kalan� tamamen kucuk harf olarak konsolda yazdirin.          
		ferhat => Ferhat
		          	kirac => Kirac
		          */

		
		Scanner scan= new Scanner (System.in);
		System.out.print(" ad�n�z� giriniz :");
		String ad�n�z=scan.next();
		System.out.print(" soyad�n�z� giriniz :");
		String soyad�n�z=scan.next();
		
		String ad=ad�n�z.substring(0,1).toUpperCase().concat(ad�n�z.substring(1).toLowerCase());
		String soyad=soyad�n�z.substring(0,1).toUpperCase().concat(soyad�n�z.substring(1).toLowerCase());
		
		System.out.println(ad+" "+soyad);

	}

}
