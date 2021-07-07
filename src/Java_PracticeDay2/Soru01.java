package Java_PracticeDay2;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
	/*
		*
        * Kullanicidan 3 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
        *
        * Ornek : Inputs : Ali, topu, tut
        *         Output : Ali topu tut.
        *
        *
        */
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("3 kelime giriniz :");
		String kelime1=scan.nextLine();
		System.out.print("3 kelime giriniz :");
		String kelime2=scan.nextLine();
		System.out.print("3 kelime giriniz :");
		String kelime3=scan.nextLine();
		
		
		System.out.println(kelime1.concat(kelime2.concat(kelime3)));
		System.out.println(kelime1 +" "+ kelime2+" "+kelime3+".");
		
scan.close();
	}
	

}
