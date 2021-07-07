package DAY_18_whileLoop;

public class C3_WhileLoop2 {

	public static void main(String[] args) {

		// 3 basamaklý sayýlardan 15 20 ve 90 a tam bölünenleri yazdýrýnýz

		int sayi = 1;

		for (int i = 100; i < 1000; i++) {

			if (sayi % 15 == 0 && sayi % 20 == 0 && sayi % 90 == 0) {

				System.out.print(i + " ");
			}

		}
		
		System.out.println("");

		// while loop ile yapalým

		// ilk önce baiþlangýç deðeri vermeliyiz loop dýþýnda

		int sayii = 100;//baþlangýç þartý

		while (sayii < 1000) {//bitiþ þartý

			if (sayii % 15 == 0 && sayii % 20 == 0 && sayii % 90 == 0) {

				System.out.print(sayii + " ");//sayýlarýn çarpýmý toplamý gibi þeyler varsa bunu loop un dýþýna yazdýrýrýz, 
				//sayýlarý sýrayla yazdýrmak istediðimizde loop un içine
			}
			sayii++;

		}

	}

}
