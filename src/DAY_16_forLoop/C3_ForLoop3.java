package DAY_16_forLoop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		
		
		
		//kullan�c�dan pozitif tam say� al�n
		//1 den kullan�c�n�n girdi�i say�ya kadar tum tam say�lar�n toplam�n� yazd�r�n
		
		Scanner scan=new Scanner (System.in);
		System.out.print("pozitif tamsay� griniz :");
		int sayi=scan.nextInt();
		
		int toplam=0;
		
		//�nce bir konteyner olu�tural�m ki say�lar�n toplam�n� oraya koyal� toplam=
		
		
		for (int i = 1; i <=sayi; i++) {
			
			toplam=toplam +i;
		
			//�nemli toplam� yazd�racaksak yani enson veriyi yazd�r diyorsam 
			//syso yu for lop body si d���nda yazmal�y�z
			
		}
		
		
		System.out.println(toplam);
		
////		pozitif tamsay� griniz :10
//		55

		

	}

}
