package DAY_15_methodCreatDevam;

import java.util.Scanner;

public class C1_MetodCreation {

	public static void main(String[] args) {
		
		
		/*
        Soru 1 ) Kullanicidan bir tam sayi alin. 
        Bu sayinin negatif veya pozitif oldugunu, 
        tek mi cift mi oldugunu ve 
        uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
        100�den kucukse sadece 1�ler basamagini yazdirin.
        */
		
	
		
		Scanner scan=new Scanner(System.in);
		System.out.print("tam say� giriniz :");
		int sayi=scan.nextInt();
		
		
		//metodumuzun ad�: pozitifNegatif()//bu metod parantezi var, i�ine yazaca��m�z (sayi) argumenttir
		
		pozitifNegatif(sayi);//girilen say� argument�n�n pozitif ya da negatif oldu�unu yazd�rs�n=buras� metod call
		//main d���na gideyim metod olu�turay�m
		
		tekMiCiftMi(sayi);//2. sorunun metodunu olu�tural�m
		
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
		 sayi/=10;//3 ten kurtulduk 52 kald�-->arada e�itlik var atamada oldu
		 rakamlarToplami+=sayi%10;
		 sayi/=10;
		 rakamlarToplami+=sayi%10;
		 System.out.println(rakamlarToplami);
	}

	public static void tekMiCiftMi(int sayi) {//if le yapal�m
		if (sayi%2==0) {
			System.out.println("sayi �ift");
		} else {
			System.out.println("sayi tek");
		}
		
	}

	public static void pozitifNegatif(int sayi) {// buraya parametre yazarken data tipinide yazmal�y�z(int)
		//say�n�n pozitiff mi oldu�unu burda yazabiliriz
		
		//turnary ile yapal�m
		
		System.out.println(sayi>0 ? "pozitif" : (sayi<0 ? "negatif" : "pozitif yada negatif degil"));
		
		
		
	}
	

}
