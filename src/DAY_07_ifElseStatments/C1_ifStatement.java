package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C1_ifStatement {

	public static void main(String[] args) {
		

		//SORU: KULLANICIDAN 1 TAM SAYI �STEY�N SAYI POZ�T�F �SE SAYI POZ�T�F �SE POZ�T�F
		//SAYI YUZDEN KU�UKSE SAYI 100 DEN KUCUK, 
		//1000 den buyukse buyuk yazd�r�n
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("tamsay� giirniz :");
		int sayi=scan.nextInt();
		
		if(sayi>0) {
			
			System.out.println("girilen say� pozitiftir..");
		}
		if(sayi<100) {
			System.out.println("girilen say� 100 den k���kt�r");
		
		}
		if(sayi>1000) {
			System.out.println("b�y�k say�");
			
			scan.close();
		}
		
		
	}

}
