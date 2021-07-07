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
		System.out.print("pozi tamsayý giriniz :");
		int sayi = scan.nextInt();
		// kullanýcý mesela 100 girsin... --->100%1==0 ise 1 bölendie sonra 100%2 ==0--
		// 2 de bölendir, 100%4==0 evet...
		// YANÝ BÝZÝM BÖLEN SAYI OLARAK BÝR VARÝABLE ye ihtiyacýmýz var

		int bolen = 1;
		int count = 0;// toplamlar için--->ne zaman artsýn, sayýyý böldükçe, macýlýstan sonra 1
						// arttýrmalýyýz

		while (bolen <= sayi) {// bolen kullanýcýnn girdiði sayýdan küçük olduðu müddetçe== þart yani

			if (sayi % bolen == 0) {// bölme gerçekleþtiyse

				System.out.println(bolen);// böleni bulunca
				count++;// 1 arttýrýyorum
			}
			bolen++;

//			pozi tamsayý giriniz :100
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
		System.out.println(sayi + "sayýsýnýn bölenleri :" + count + "adettir");
//		100sayýsýnýz bölenleri :9adettir

		// bolenleri þu þekilde yazdýrýn

//		1- 1
//		2- 2
//		3- 3
//		4- 4
//		5- 10
//		6- 20...

		bolen = 1;
		count = 0;// toplamlar için--->ne zaman artsýn, sayýyý böldükçe, macýlýstan sonra 1
					// arttýrmalýyýz

		while (bolen <= sayi) {// bolen kullanýcýnn girdiði sayýdan küçük olduðu müddetçe== þart yani

			if (sayi % bolen == 0) {// bölme gerçekleþtiyse

				System.out.println(bolen);// böleni bulunca
				count++;// 1 arttýrýyorum
				
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
