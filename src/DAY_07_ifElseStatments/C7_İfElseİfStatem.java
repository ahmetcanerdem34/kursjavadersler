package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C7_�fElse�fStatem {

	public static void main(String[] args) {
		
		//soru: kullan�c�dan 2 say� isteyin, say�lar�n 2 side pozitifse say�lar�n yazd�r�n
		//2 side negatifse say�lar�n �arp�m�n� yaz�d�rn
		//farkl� i�aretlere sahipse farkl� i�aretlerle i�lem yapamzs�n�z yaz�n
		//say�lardan s�f�ra e�it olan varsa s�f�r �arpmaya g�re yutan elemand�r yazd�r�n
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("2 say� giriniz :");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		
		if(sayi1==0 || sayi2==0) {//BURAYI && AND YAPSAYDIK, 2 S� 0 SIFIR OLUNCA �ALI�IRDI
			System.out.println("s�f�r �arpmaya g�re yutan elemand�r");
			
		}else if(sayi1>0 && sayi2>0) {
			System.out.println(sayi1+sayi2);
		
		}else if(sayi1<0 && sayi2<0) {
			System.out.println("say�lar�n �arp�m� :" +(sayi1*sayi2));
		
		}else{
			System.out.println("farkl� i�aretlere sahipse farkl� i�aretlerle i�lem yapamzs�n�z");
			
//			2 say� giriniz :10.2
//			-23
//			farkl� i�aretlere sahipse farkl� i�aretlerle i�lem yapamzs�n�z
			
//			2 say� giriniz :34 5
//			39.0
			
//			2 say� giriniz :0
//			0
//			s�f�r �arpmaya g�re yutan elemand�r
			
		}
		
		scan.close();
		
	}

}
