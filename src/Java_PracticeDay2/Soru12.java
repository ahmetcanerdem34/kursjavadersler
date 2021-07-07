package Java_PracticeDay2;

import java.util.Iterator;
import java.util.Scanner;

public class Soru12 {

	public static void main(String[] args) {
	/*	
		* Kullanicidan 10’dan kucuk bir sayi alin ve ornekteki gibi carpim tablosu olusturun
        *
        * ORNEK:
        * INPUT : number: 4 OUTPUT : 1 2 3 4
        *                            2 4 6 8
        *                            3 6 9 12
        *                            4 8 12 16
        */	

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Carpim tablosu olistirmak icin 10 dan kucuk bir sayi giriniz");
		int sayi = scan.nextInt();
		
		for(int i = 1 ; i <= sayi ; i++) {
			for(int k = 1; k <= sayi ; k++) {
				System.out.print(i*k + " ");
			}System.out.println();
		}
		
		
		scan.close();
	

		
	}

}
