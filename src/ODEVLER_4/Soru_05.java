package ODEVLER_4;

import java.util.Scanner;

public class Soru_05 {

	public static void main(String[] args) {
		
		/*
		Kullan�c�dan bir kelime girmesini isteyin. 
		S�zc�kte tek say�da karakter ve 3 veya daha fazla karakter i�eriyorsa, 
		kelimenin ortas�ndaki karakteri yazd�r�n.
		*/
		
		Scanner scan= new Scanner (System.in);
		System.out.print(" kelime giriniz :");
		String kelime=scan.next().toLowerCase();
		
		if(kelime.length()%2==1 && kelime.length()>=3) {
			
			  System.out.println("kelimenin ortas�ndaki karakter :"+ kelime.charAt((kelime.length()-1)/2));
			
			
		}else {
			
			System.out.println("kelime �ift say�da karaktere sahip");
		}

	}

}
