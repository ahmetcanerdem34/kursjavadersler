package DAY_15_methodCreatDevam;

import java.util.Scanner;

public class C1_MetodCreation {

	public static void main(String[] args) {
		
		
		/*
        Soru 1 ) Kullanicidan bir tam sayi alin. 
        Bu sayinin negatif veya pozitif oldugunu, 
        tek mi cift mi oldugunu ve 
        uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
        100’den kucukse sadece 1’ler basamagini yazdirin.
        */
		
	
		
		Scanner scan=new Scanner(System.in);
		System.out.print("tam sayý giriniz :");
		int sayi=scan.nextInt();
		
		
		//metodumuzun adý: pozitifNegatif()//bu metod parantezi var, içine yazacaðýmýz (sayi) argumenttir
		
		pozitifNegatif(sayi);//girilen sayý argumentýnýn pozitif ya da negatif olduðunu yazdýrsýn=burasý metod call
		//main dýþýna gideyim metod oluþturayým
		
		tekMiCiftMi(sayi);//2. sorunun metodunu oluþturalým
		
		if (sayi>=100) {
			
			yuzdenBuyuk(sayi);
			
		} else {
			
			yuzdenKucuk(sayi);

		}

	}
	
	public static void yuzdenKucuk(int sayi) {
		
		System.out.println(sayi%10);
	
		
	}

	public static void yuzdenBuyuk(int sayi) {//523 diyelim sayi sayi%10
		int rakamlarToplami=0;
		
		 rakamlarToplami =sayi%10;
		 sayi/=10;//3 ten kurtulduk 52 kaldý-->arada eþitlik var atamada oldu
		 rakamlarToplami+=sayi%10;
		 sayi/=10;
		 rakamlarToplami+=sayi%10;
		 System.out.println(rakamlarToplami);
	}

	public static void tekMiCiftMi(int sayi) {//if le yapalým
		if (sayi%2==0) {
			System.out.println("sayi çift");
		} else {
			System.out.println("sayi tek");
		}
		
	}

	public static void pozitifNegatif(int sayi) {// buraya parametre yazarken data tipinide yazmalýyýz(int)
		//sayýnýn pozitiff mi olduðunu burda yazabiliriz
		
		//turnary ile yapalým
		
		System.out.println(sayi>0 ? "pozitif" : (sayi<0 ? "negatif" : "pozitif yada negatif degil"));
		
		
		
	}
	

}
