package DAY_17_ForLoop;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		
		
		/*
		 Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		
		 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin		
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.print("tamsay� griniz :");
		int sayi=scan.nextInt();
		 
	     System.out.println("Lutfen sinir degeri icin pozitif bir tamsayi giriniz");
	     int sinir=scan.nextInt();
		
		
		if(sayi<0 || sayi==0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
			
			
		}else {
			  if(rakamlarToplamiHesapla(sayi)>sinir ) {
	                System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk");
	            } else {
	                System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil");
	            }
			
		}
}
	
	
	/* Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin	
		 */

	private static int rakamlarToplamiHesapla(int sayi) {
		int rakamlarToplami=0;
		String sayi2=sayi+"";//hi�lik ekledik---> intederen uzunlu�unu bulma imkan�m�z yok, onun i�in hi�lik yaparak concatination yap�yoruz
		for (int i = 1; i <= sayi2.length(); i++) {
			
			rakamlarToplami+=sayi%10;
			sayi/=10;
			//rakamlar toplam�n� bu �ekilde buluruz a�a��da yazd�ral�m
			
		}
		
		return rakamlarToplami;//void olsayd� bir �ey yazd�rmam� zyeterliydi imdi return yazmam�z� bekliyor
		
//		tamsay� griniz :234
//		Lutfen sinir degeri icin pozitif bir tamsayi giriniz
//		10
//		Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil
		
		
	}
}