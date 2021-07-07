package ODEVLER_5;

import java.util.Scanner;

public class Soru_01 {

	public static void main(String[] args) {
	
		/*
		Kullanýcýdan bir isim ve karakter girmesini isteyin, sonra karakterin kaç kez tekrarlandýðýný kontrol edin.
		e.g:
		char ch1= 'a' ;
		String name =“John came late" 
=> Tekrar Sayisi = 2
		*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("cümle giriniz :");
		String cumle=scan.nextLine();
		System.out.println("karakter giriniz: ");
		char harf=scan.next().charAt(0);
		
		int count=0;
		for (int i = 0; i < cumle.length(); i++) {
			
			if(cumle.charAt(i)==harf) {
				count++;
			}
	}
		System.out.println(count);
}
}