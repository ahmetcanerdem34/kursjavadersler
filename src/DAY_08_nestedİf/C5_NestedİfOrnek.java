package DAY_08_nested�f;

import java.util.Scanner;

public class C5_Nested�fOrnek {

	public static void main(String[] args) {
		
		
		//soru: kullan�c�dan bir �ifre girmesini isteyin
		//e�er ilk harf b�y�k harf ise "A" olup olmad���n� kontrol edin-- A ise ge�erli �ifere diyece�iz, de�ilse de�il
		//  e�er ilk harf k���k harf ise "z" olup -- k���k z ise ge�erli de�ilse ge�ersiz yazd�r�rnr

		
		Scanner scan =new Scanner (System.in);
		System.out.print("�ifre giriniz :");
		char ilkharf=scan.next().charAt(0);
		
		
		//1. i�lem kullan�c�dan harf al�p bak buyuk mu k���k m�
		
		if (ilkharf>='A' && ilkharf<='Z') {//ilk harf buyukse
			

			if (ilkharf=='A') {
				System.out.println("�ifre ge�erli");
				
			} else {
				System.out.println("�ifre ge�ersiz");

			}
			
				
		} else if(ilkharf>='a' && ilkharf<='z'){//ilk harf kucukse
			
			
			if (ilkharf=='z') {
				System.out.println("�ifre ge�erli");
				
			} else {
				System.out.println("�ifre ge�ersiz");

			}

		}else {//ilk hark buyu harf veya ku�uk harf de�ilse
		
		System.out.println("�ifre ge�ersiz");
		
//		�ifre giriniz :Sakarya
//		�ifre ge�ersiz
		
//		�ifre giriniz :Ankara1453
//		�ifre ge�erli
		
//		�ifre giriniz :zeki
//		�ifre ge�erli

		
	}
		
		scan.close();

}
}