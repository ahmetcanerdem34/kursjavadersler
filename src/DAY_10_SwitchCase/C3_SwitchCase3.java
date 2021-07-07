package DAY_10_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase3 {

	public static void main(String[] args) {
		// kullanýcýdan bir rakam isteyin
		// girilen rakamý yazýyla girin
		// negatifise reddedin
		// 9 dan buyukse reddedin

		Scanner scan = new Scanner(System.in);
		System.out.print("rakam giriniz :");
		int rakam = scan.nextInt();

		if (rakam == 0) {

			System.out.println("Sýfýr");

		} else if (rakam == 2) {
			System.out.println("iki");

		} else if (rakam == 3) {
			System.out.println("üç");

		} else if (rakam == 4) {
			System.out.println("dört");

		} else if (rakam == 5) {
			System.out.println("beþ");

		} else if (rakam == 6) {
			System.out.println("altý");

		} else if (rakam == 7) {
			System.out.println("yedi");

		} else if (rakam == 8) {
			System.out.println("sekiz");

		} else if (rakam == 9) {
			System.out.println("dokuz");

		} else {
			System.out.println("lütfen rakam giriniz");

//			rakam giriniz :9
//			dokuz	

//			rakam giriniz :0
//			Sýfýr

			
			}
		//switch le yapalým
		
		
		switch (rakam) {// if deki boolean durumu burda olmaz--- ayrýcak sadece int char string byte iþlemleri yapýlýr 
		
		case 0 : System.out.println("girilen sýfýr"); break;
		case 1 : System.out.println("bir"); break;
		case 2 : System.out.println("iki"); break;
		case 3 : System.out.println("üç"); break;
		case 4 : System.out.println("dört"); break;
		case 5 : System.out.println("beþ"); break;
		case 6 : System.out.println("altý"); break;
		case 7 : System.out.println("yedi"); break;
		case 8 : System.out.println("sekiz"); break;
		case 9 : System.out.println("dokuz"); break;
		default :System.out.println("lütfen geçerli sayý giriniz");
		
//		Sýfýr
//		girilen sýfýr
			
		}

	}

}
