package DAY_08_nested�f;

import java.util.Scanner;

public class C4_NestedArt�kY�l {

	public static void main(String[] args) {


		//nested la yapal�m
		
				//4 ile b�l�nemyen y�llar art�k y�l olamaz
				//4 un kat� lams�na ra�men 100 ile bolunebiklen y�llardan sadece 400 un kat� olany�llar art�k y�ld�r
				
				
				Scanner scan=new Scanner (System.in);
				
				System.out.print("bir y�l giriniz :");
				int yil=scan.nextInt();
				
				//2 durum var ya 100 ile b�l�nebiliyor ya da b�l�nemiyor
				
				if (yil%100==0) {//100 e b�l�nebiliyor, 100 e b�l�nebiliyorsa bir �art daha laz�m
					
					if (yil%400==0) {//400 e b�l�n�yorsa 
						System.out.println("ar�k y�l");
						
					} else {//b�l�nemiyorsa de�il
						System.out.println("art�k y�l de�il");

					}
				
				} else {//100 e b�l�nemiyorsa  ve 4 ile b�l�n�yorsa art�k y�l, b�l�nemiyorsa de�il, yeni bir if else a�

				if (yil%4==0) {
					System.out.println("art�k y�l");
				
					
				} else {
					System.out.println("art�k y�l de�il");
					
//					bir y�l giriniz :2021
//					art�k y�l de�il
					
//					bir y�l giriniz :1985
//					art�k y�l de�il
					
//					bir y�l giriniz :2096
//					art�k y�l

				}
				
	scan.close();			
				}
	}
}
					
				

	


