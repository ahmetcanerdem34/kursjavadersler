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
		System.out.print("tamsayý griniz :");
		int sayi=scan.nextInt();
		
		
		if(sayi<0 || sayi==0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
			
			
		}else {
			
			rakamlarToplamiYazdýr(sayi);//method call tamamdýr
			
			
		}
		
		

	}
	//Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin

	public static void rakamlarToplamiYazdýr(int sayi) {
		int rakamlarToplami=0;
		String sayi2=sayi+"";//hiçlik ekledik---> intederen uzunluðunu bulma imkanýmýz yok, onun için hiçlik yaparak concatination yapýyoruz
		for (int i = 1; i <= sayi2.length(); i++) {
			
			rakamlarToplami+=sayi%10;
			sayi/=10;
			//rakamlar toplamýný bu þekilde buluruz aþaðýda yazdýralým
			
		}
		System.out.println("rakamlar toplamý :" + rakamlarToplami);
//		tamsayý griniz :12345
//		rakamlar toplamý :15
	}

}
