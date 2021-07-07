package JavaOfficeHoursDay2;

import java.util.Iterator;
import java.util.Scanner;

public class C1_Question01 {

	public static void main(String[] args) {
		
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede ‘e’ harfi 3 kere kullanilmis.
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("cumle girin:");
		String cumle=scan.nextLine().toLowerCase();
		System.out.print("harf girin:");
		char harf=scan.next().toLowerCase().charAt(0);
	
		
		//bir sayým görüyorsak count kullanmak önemli
		
		
		int count=0;//buldukça harfi syýyýsýna göre artacak
		
		//for loop u burda kullanmak faydalý olacaktýr
		
		
		//i baþlangýç noktamýz
		//stringin baþýndan baþlayýp sonuna gidecegiz. bitiþ noktamýz i>cumelnin lenght i
		for (int i = cumle.length()-1; i>=0 ; i--) {
			
			if(cumle.charAt(i)==harf) {//açaç butun cumleyi ttarayýp istenilen harfi içeriyormu bulup eklemek
				count++;
				
			}
			
			
		}
		System.out.println("girdiðiniz cümlede bu harf :" +harf +" "+"kere kullanýlmýþ");
		
		
		

	}

}
