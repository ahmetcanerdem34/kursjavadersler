package DAY_24_arrays;

import java.util.Scanner;

public class Arrays_CalismaDiziToplama03 {

	public static void main(String[] args) {
		
		int diziBoyut;
		int toplam=0;
		
		
		Scanner scan= new Scanner (System.in);
		
		System.out.print("Kaç elemanlý dizi oluþturacaksýnýz :");
		diziBoyut=scan.nextInt();
		
		//þimdi dizleri oluþtruacaðýz
		
		int sayilar[]= new int[diziBoyut];	//kiþinin gireceði boyut sayýsý kiþi girince belli olacak	
		
		for (int i = 0; i < sayilar.length; i++) {//sayýlarýn length i kadar çoðalacak, kiþi dizi boyuta kaç girerse burasý deðiþ, 
												//burasý dinamik oldu yani
			
			System.out.print((i+1)+ ".elemeaný giriniz :");
			sayilar[i]=scan.nextInt();
		
		}
		
		for (int i = 0; i < sayilar.length; i++) {
			
			toplam+=sayilar[i];
			
		}
		System.out.println("sayýlarýn toplamý +"+ toplam);
		System.out.println("sayýlarýn ortalamasý : " +(toplam/sayilar.length));
		
//		Kaç elemanlý dizi oluþturacaksýnýz :6
//		1.elemeaný giriniz :4
//		2.elemeaný giriniz :3
//		3.elemeaný giriniz :4
//		4.elemeaný giriniz :56
//		5.elemeaný giriniz :43
//		6.elemeaný giriniz :23
//		sayýlarýn toplamý +133
//		sayýlarýn ortalamasý : 22
		
		scan.close();

	}

}
