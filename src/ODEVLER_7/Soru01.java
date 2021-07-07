package ODEVLER_7;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		
		//Swap islemini iki yoldan yaptiginiz java kodunu yaziniz.
		//1.Yol: 3. degisken kullanarak
		//2.Yol: 3. degisken kullanmadan*/	
		
		/*
		 Java da takas(swap) iþlemi için kullanýcýdan 2 deðer alacaðýz bu deðerlerin her birini bir deðiþkene atayacaðýz. 
		 ÖRN a=5;b=10 gibi . 
		 Takas iþlemi uygulandýktan sonra b deðiþkeninde a deðiþkeninin deðeri a da da b nin ilk deðeri olmuþ olacak.
		 */

		
		Scanner scan=new Scanner (System.in);
		System.out.println("sayi giriniz :");
		int sayi1=scan.nextInt();
		System.out.println("sayi giriniz :");
		int sayi2=scan.nextInt();
		
		int swap=0;
		
		
		System.out.println("swap tan önce sayi1 :"+sayi1);
		System.out.println("swap tan önce sayi2 :"+sayi2);
		
		swap=sayi1;
		sayi1=sayi2;
		sayi2=swap;
		
		System.out.println("*********************************");
		System.out.println("swap tan sonra sayi1 :"+sayi1);
		System.out.println("swap tan sonra sayi2 :"+sayi2);
		
//		    sayi giriniz :
//			13
//			sayi giriniz :
//			21
//			swap tan önce sayi1 :13
//			swap tan önce sayi2 :21
//			*********************************
//			swap tan sonra sayi1 :21
//			swap tan sonra sayi2 :13
		
		
		System.out.println("*****************************");
		
		
		Scanner sc=new Scanner (System.in);
		System.out.println("sayi giriniz :");
		int sayi3=sc.nextInt();
		System.out.println("sayi giriniz :");
		int sayi4=sc.nextInt();
		
		sayi3=sayi3+sayi4;
		sayi4=sayi3-sayi4;
		sayi3=sayi3-sayi4;
		
		System.out.println(sayi3);
		System.out.println(sayi4);
		
		
	}

}
