package DAY_10_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase3 {

	public static void main(String[] args) {
		// kullan�c�dan bir rakam isteyin
		// girilen rakam� yaz�yla girin
		// negatifise reddedin
		// 9 dan buyukse reddedin

		Scanner scan = new Scanner(System.in);
		System.out.print("rakam giriniz :");
		int rakam = scan.nextInt();

		if (rakam == 0) {

			System.out.println("S�f�r");

		} else if (rakam == 2) {
			System.out.println("iki");

		} else if (rakam == 3) {
			System.out.println("��");

		} else if (rakam == 4) {
			System.out.println("d�rt");

		} else if (rakam == 5) {
			System.out.println("be�");

		} else if (rakam == 6) {
			System.out.println("alt�");

		} else if (rakam == 7) {
			System.out.println("yedi");

		} else if (rakam == 8) {
			System.out.println("sekiz");

		} else if (rakam == 9) {
			System.out.println("dokuz");

		} else {
			System.out.println("l�tfen rakam giriniz");

//			rakam giriniz :9
//			dokuz	

//			rakam giriniz :0
//			S�f�r

			
			}
		//switch le yapal�m
		
		
		switch (rakam) {// if deki boolean durumu burda olmaz--- ayr�cak sadece int char string byte i�lemleri yap�l�r 
		
		case 0 : System.out.println("girilen s�f�r"); break;
		case 1 : System.out.println("bir"); break;
		case 2 : System.out.println("iki"); break;
		case 3 : System.out.println("��"); break;
		case 4 : System.out.println("d�rt"); break;
		case 5 : System.out.println("be�"); break;
		case 6 : System.out.println("alt�"); break;
		case 7 : System.out.println("yedi"); break;
		case 8 : System.out.println("sekiz"); break;
		case 9 : System.out.println("dokuz"); break;
		default :System.out.println("l�tfen ge�erli say� giriniz");
		
//		S�f�r
//		girilen s�f�r
			
		}

	}

}
