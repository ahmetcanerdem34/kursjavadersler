package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C3_�fElseStatement2 {

	public static void main(String[] args) {
		
		
		//SORU: KULLANICIDAN B�R KARAKTER G�RMES�N� �STEY�N
		//harf olup olmad���n� yazd�r�n
		
		Scanner scan =new Scanner (System.in);
		System.out.print("karakter giriniz:");
		char karakter=scan.next().toLowerCase().charAt(0);
		
		if ((karakter>='a' && karakter<='z') || (karakter>='A' && karakter<='Z')){
			System.out.println("girdi�iniz karakter harf");
			
		} else {
			System.out.println("girdi�iniz karakter harf de�il");
			
//			karakter giriniz:a
//			girdi�iniz karakter harf
			
//			karakter giriniz:.
//			girdi�iniz karakter harf de�il
			
//			karakter giriniz:A
//			girdi�iniz karakter harf

		}
		scan.close();
		
		

	}

}
