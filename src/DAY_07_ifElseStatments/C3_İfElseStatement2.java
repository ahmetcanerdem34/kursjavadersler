package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C3_İfElseStatement2 {

	public static void main(String[] args) {
		
		
		//SORU: KULLANICIDAN BİR KARAKTER GİRMESİNİ İSTEYİN
		//harf olup olmadığını yazdırın
		
		Scanner scan =new Scanner (System.in);
		System.out.print("karakter giriniz:");
		char karakter=scan.next().toLowerCase().charAt(0);
		
		if ((karakter>='a' && karakter<='z') || (karakter>='A' && karakter<='Z')){
			System.out.println("girdiğiniz karakter harf");
			
		} else {
			System.out.println("girdiğiniz karakter harf değil");
			
//			karakter giriniz:a
//			girdiğiniz karakter harf
			
//			karakter giriniz:.
//			girdiğiniz karakter harf değil
			
//			karakter giriniz:A
//			girdiğiniz karakter harf

		}
		scan.close();
		
		

	}

}
