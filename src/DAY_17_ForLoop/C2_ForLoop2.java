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
		System.out.print("tamsayý griniz :");
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
		String sayi2=sayi+"";//hiçlik ekledik---> intederen uzunluðunu bulma imkanýmýz yok, onun için hiçlik yaparak concatination yapýyoruz
		for (int i = 1; i <= sayi2.length(); i++) {
			
			rakamlarToplami+=sayi%10;
			sayi/=10;
			//rakamlar toplamýný bu þekilde buluruz aþaðýda yazdýralým
			
		}
		
		return rakamlarToplami;//void olsaydý bir þey yazdýrmamý zyeterliydi imdi return yazmamýzý bekliyor
		
//		tamsayý griniz :234
//		Lutfen sinir degeri icin pozitif bir tamsayi giriniz
//		10
//		Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil
		
		
	}
}