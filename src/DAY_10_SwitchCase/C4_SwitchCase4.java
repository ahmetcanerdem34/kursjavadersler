package DAY_10_SwitchCase;

import java.util.Scanner;

public class C4_SwitchCase4 {

	public static void main(String[] args) {

		// kullan�c�dan ka��nc� ayda oldu�unu al�n ve ay ismini yazd�r�n

		Scanner scan = new Scanner(System.in);
		System.out.print("ay say�s� giriniz:");
		int ay = scan.nextInt();

		switch (ay) {

		case 1:
			System.out.println("girilen ay ocak");
			break;
		case 2:
			System.out.println("girilen ay �ubat");
			break;
		case 3:
			System.out.println("girilen ay mart");
			break;
		case 4:
			System.out.println("girilen ay nisan");
			break;
		case 5:
			System.out.println("girilen ay may�s");
			break;
		case 6:
			System.out.println("girilen ay haziran");
			break;
		case 7:
			System.out.println("girilen ay temmuz");
			break;
		case 8:
			System.out.println("girilen ay a�ustos");
			break;
		case 9:
			System.out.println("girilen ay eyl�l");
			break;
		case 10:
			System.out.println("girilen ay ekim");
			break;
		case 11:
			System.out.println("girilen ay kas�m");
			break;
		case 12:
			System.out.println("girilen ay aral�k");
			break;
		default:
			System.out.println("ge�erli ay ay�s� giriniz");
			break;
			
//			ay say�s� giriniz:3
//			girilen ay mart
			
//			ay say�s� giriniz:1
//			girilen ay ocak

//			ay say�s� giriniz:5
//			girilen ay may�s
		}

	}

}
