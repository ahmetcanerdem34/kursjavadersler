package ODEVLER_4;

import java.util.Scanner;

public class Soru_05 {

	public static void main(String[] args) {
		
		/*
		Kullanıcıdan bir kelime girmesini isteyin. 
		Sözcükte tek sayıda karakter ve 3 veya daha fazla karakter içeriyorsa, 
		kelimenin ortasındaki karakteri yazdırın.
		*/
		
		Scanner scan= new Scanner (System.in);
		System.out.print(" kelime giriniz :");
		String kelime=scan.next().toLowerCase();
		
		if(kelime.length()%2==1 && kelime.length()>=3) {
			
			  System.out.println("kelimenin ortasındaki karakter :"+ kelime.charAt((kelime.length()-1)/2));
			
			
		}else {
			
			System.out.println("kelime çift sayıda karaktere sahip");
		}

	}

}
