package DAY_08_nested�f;

import java.util.Scanner;

public class C3_NestedArt�kY�l {

	public static void main(String[] args) {
		
		//�ubat�n 29 gun �ekti�i y�l -->
		
		//4 ile b�l�nemyen y�llar art�k y�l olamaz
		//4 un kat� lams�na ra�men 100 ile bolunebiklen y�llardan sadece 400 un kat� olany�llar art�k y�ld�r
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("bir y�l giriniz :");
		int yil=scan.nextInt();
		
		//1. durum 4 e b�l�necek 100 e bolunemeyecek
		
		if (yil%4==0  && yil%100 != 0){
			System.out.println("art�k y�l");
			
		} else if (yil%4==0 && yil%100==0 && yil%400==0) {//burda 4 e bilmeye de gerek yok 100 ile b�l�nen her say� 4 ile de b�l�nebilir
								//y�l%100==0 bu k�sm�da kald�rsak olur 100 un kat� 400 unde kat�d�r
			System.out.println("art�k y�l");

		}else {
			System.out.println("art�k y�l de�il");
			
//			bir y�l giriniz :2000
//			art�k y�l
			
//			bir y�l giriniz :2004
//			art�k y�l
			
//			bir y�l giriniz :2300
//			art�k y�l de�il
			
//			bir y�l giriniz :2021
//			art�k y�l de�il


scan.close();
		}
		
		
	}

}
