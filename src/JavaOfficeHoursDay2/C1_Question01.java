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
         * OUTPUT : Girdiginiz cumlede �e� harfi 3 kere kullanilmis.
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("cumle girin:");
		String cumle=scan.nextLine().toLowerCase();
		System.out.print("harf girin:");
		char harf=scan.next().toLowerCase().charAt(0);
	
		
		//bir say�m g�r�yorsak count kullanmak �nemli
		
		
		int count=0;//bulduk�a harfi sy�y�s�na g�re artacak
		
		//for loop u burda kullanmak faydal� olacakt�r
		
		
		//i ba�lang�� noktam�z
		//stringin ba��ndan ba�lay�p sonuna gidecegiz. biti� noktam�z i>cumelnin lenght i
		for (int i = cumle.length()-1; i>=0 ; i--) {
			
			if(cumle.charAt(i)==harf) {//a�a� butun cumleyi ttaray�p istenilen harfi i�eriyormu bulup eklemek
				count++;
				
			}
			
			
		}
		System.out.println("girdi�iniz c�mlede bu harf :" +harf +" "+"kere kullan�lm��");
		
		
		

	}

}
