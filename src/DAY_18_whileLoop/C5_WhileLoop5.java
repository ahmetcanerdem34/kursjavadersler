package DAY_18_whileLoop;

import java.util.Scanner;

public class C5_WhileLoop5 {

	public static void main(String[] args) {
		/*
		 * Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam
		 * kac tane olduklarini ekranda yazdirin
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("pozi tamsay� giriniz :");
		int sayi = scan.nextInt();
		// kullan�c� mesela 100 girsin... --->100%1==0 ise 1 b�lendie sonra 100%2 ==0--
		// 2 de b�lendir, 100%4==0 evet...
		// YAN� B�Z�M B�LEN SAYI OLARAK B�R VAR�ABLE ye ihtiyac�m�z var

		int bolen = 1;
		int count = 0;// toplamlar i�in--->ne zaman arts�n, say�y� b�ld�k�e, mac�l�stan sonra 1
						// artt�rmal�y�z

		while (bolen <= sayi) {// bolen kullan�c�nn girdi�i say�dan k���k oldu�u m�ddet�e== �art yani

			if (sayi % bolen == 0) {// b�lme ger�ekle�tiyse

				System.out.println(bolen);// b�leni bulunca
				count++;// 1 artt�r�yorum
			}
			bolen++;

//			pozi tamsay� giriniz :100
//			1
//			2
//			4
//			5
//			10
//			20
//			25
//			50
//			100		
		}
		System.out.println(sayi + "say�s�n�n b�lenleri :" + count + "adettir");
//		100say�s�n�z b�lenleri :9adettir

		// bolenleri �u �ekilde yazd�r�n

//		1- 1
//		2- 2
//		3- 3
//		4- 4
//		5- 10
//		6- 20...

		bolen = 1;
		count = 0;// toplamlar i�in--->ne zaman arts�n, say�y� b�ld�k�e, mac�l�stan sonra 1
					// artt�rmal�y�z

		while (bolen <= sayi) {// bolen kullan�c�nn girdi�i say�dan k���k oldu�u m�ddet�e== �art yani

			if (sayi % bolen == 0) {// b�lme ger�ekle�tiyse

				System.out.println(bolen);// b�leni bulunca
				count++;// 1 artt�r�yorum
				
				System.out.println(count + "-" + bolen);
			}
			bolen++;

//			1
//			2
//			4
//			5
//			10
//			20
//			25
//			50
//			100

			scan.close();
		}

	}

}
