package DAY_10_SwitchCase;

import java.util.Scanner;

public class C1_NestedTurnary {

	public static void main(String[] args) {
		
		//kullan�c�dan bir say� al�n 
		//say� 3 basamakl �ise  �� basamakl� 
		//de�ilse �� basamakl� de�il yazd��rn
		
		//say�m�z �� basamkl� olmas�n� nas�l kontrol edebilirim
		//ki�iden say�y� ald�k
		//
		
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("tamsay� pozitif giriniz :");
		int sayi=scan.nextInt();
		
		
		
		
	String sonuc=sayi>99 ? (sayi<1000 ? "3 basamkal�" : "�� basamakl� de�il") :"3 basamakl� de�il";
	
	System.out.println(sonuc);
	
//	tamsay� pozitif giriniz :156
//	3 basamkal�

	
		//di�er ��z�m �ekli

	String sonuc1= sayi >=100 && sayi<1000 || sayi <=100 && sayi>-1000 ? "�� basamakl�" : "3 basamkl�  de�il";
	
	System.out.println(sonuc1);
	}

}
