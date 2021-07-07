package ODEVLER_4;

import java.util.Scanner;

public class Soru_06 {

	public static void main(String[] args) {
		
		/* 
		Kullanýcýdan firstName ve lastName'i girmesini isteyin, ardýndan baþ harflerini büyük harf yapýn ve geri kalaný tamamen kucuk harf olarak konsolda yazdirin.          
		ferhat => Ferhat
		          	kirac => Kirac
		          */

		
		Scanner scan= new Scanner (System.in);
		System.out.print(" adýnýzý giriniz :");
		String adýnýz=scan.next();
		System.out.print(" soyadýnýzý giriniz :");
		String soyadýnýz=scan.next();
		
		String ad=adýnýz.substring(0,1).toUpperCase().concat(adýnýz.substring(1).toLowerCase());
		String soyad=soyadýnýz.substring(0,1).toUpperCase().concat(soyadýnýz.substring(1).toLowerCase());
		
		System.out.println(ad+" "+soyad);

	}

}
