package DAY_17_ForLoop;

import java.util.Scanner;

public class C1_ForLoop1 {

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
		
		
		if(sayi<0 || sayi==0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
			
			
		}else {
			
			rakamlarToplamiYazd�r(sayi);//method call tamamd�r
			
			
		}
		
		

	}
	//Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin

	public static void rakamlarToplamiYazd�r(int sayi) {
		int rakamlarToplami=0;
		String sayi2=sayi+"";//hi�lik ekledik---> intederen uzunlu�unu bulma imkan�m�z yok, onun i�in hi�lik yaparak concatination yap�yoruz
		for (int i = 1; i <= sayi2.length(); i++) {
			
			rakamlarToplami+=sayi%10;
			sayi/=10;
			//rakamlar toplam�n� bu �ekilde buluruz a�a��da yazd�ral�m
			
		}
		System.out.println("rakamlar toplam� :" + rakamlarToplami);
//		tamsay� griniz :12345
//		rakamlar toplam� :15
	}

}
