package DAY_09_Ternary;

import java.util.Scanner;

public class C3_Turnary3 {

	public static void main(String[] args) {
		
		// soru: kullan�c�dan 2 say� al�n ve yazd�r�n ve buyuk olan� yaz�r�n
		
		Scanner scan =new Scanner (System.in);
		System.out.print("say� giriniz :");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		
		System.out.println("b�y�k olan say� =" + (sayi1>sayi2 ? "sayi1 b�y�kt�r" : "sayi2 b�y�kt�r"));

//		say� giriniz :25
//		35
//		b�y�k olan say� =sayi2 b�y�kt�r
		
		
		//turnary kolay i�lemler k�sa i�lemlerde g�zel
		
		// nested da var
	}

}
