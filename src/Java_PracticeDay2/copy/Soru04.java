package Java_PracticeDay2.copy;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		
		/*
		*Kullanýcý tarafýndan girilen bir sayýnýn
		 *mutlak deðerini yazdýrmak için bir program yazýn.
		 */
		
		

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen sayi giriniz :");
		int sayi = scan.nextInt();
		
		System.out.println(Math.abs(sayi));
	
		if(sayi>=0) {
			System.out.println(sayi);
		}else {
			System.out.println(sayi*-1);
		}

	}

}
