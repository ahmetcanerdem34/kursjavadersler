package DAY_18_whileLoop;

public class C3_WhileLoop2 {

	public static void main(String[] args) {

		// 3 basamakl� say�lardan 15 20 ve 90 a tam b�l�nenleri yazd�r�n�z

		int sayi = 1;

		for (int i = 100; i < 1000; i++) {

			if (sayi % 15 == 0 && sayi % 20 == 0 && sayi % 90 == 0) {

				System.out.print(i + " ");
			}

		}
		
		System.out.println("");

		// while loop ile yapal�m

		// ilk �nce bai�lang�� de�eri vermeliyiz loop d���nda

		int sayii = 100;//ba�lang�� �art�

		while (sayii < 1000) {//biti� �art�

			if (sayii % 15 == 0 && sayii % 20 == 0 && sayii % 90 == 0) {

				System.out.print(sayii + " ");//say�lar�n �arp�m� toplam� gibi �eyler varsa bunu loop un d���na yazd�r�r�z, 
				//say�lar� s�rayla yazd�rmak istedi�imizde loop un i�ine
			}
			sayii++;

		}

	}

}
