package DAY_10_SwitchCase;

import java.util.Scanner;

public class C4_SwitchCase4 {

	public static void main(String[] args) {

		// kullanýcýdan kaçýncý ayda olduðunu alýn ve ay ismini yazdýrýn

		Scanner scan = new Scanner(System.in);
		System.out.print("ay sayýsý giriniz:");
		int ay = scan.nextInt();

		switch (ay) {

		case 1:
			System.out.println("girilen ay ocak");
			break;
		case 2:
			System.out.println("girilen ay þubat");
			break;
		case 3:
			System.out.println("girilen ay mart");
			break;
		case 4:
			System.out.println("girilen ay nisan");
			break;
		case 5:
			System.out.println("girilen ay mayýs");
			break;
		case 6:
			System.out.println("girilen ay haziran");
			break;
		case 7:
			System.out.println("girilen ay temmuz");
			break;
		case 8:
			System.out.println("girilen ay aðustos");
			break;
		case 9:
			System.out.println("girilen ay eylül");
			break;
		case 10:
			System.out.println("girilen ay ekim");
			break;
		case 11:
			System.out.println("girilen ay kasým");
			break;
		case 12:
			System.out.println("girilen ay aralýk");
			break;
		default:
			System.out.println("geçerli ay ayýsý giriniz");
			break;
			
//			ay sayýsý giriniz:3
//			girilen ay mart
			
//			ay sayýsý giriniz:1
//			girilen ay ocak

//			ay sayýsý giriniz:5
//			girilen ay mayýs
		}

	}

}
