package DAY_06_�fStatements;

import java.util.Scanner;

public class C5_�fStatement5 {

	public static void main(String[] args) {
		
		
		//soru: kullan�c�dan bir dikd�rtgenin 2 kenar uzunlu�unu al�n
		//kena r uzunluklar�u e�itse kare de�ilse dikd�rtgen yazd�r�n
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println(" 2 kenar uzunlu�u giriniz :");//dah afzalada girip a�ag�da de�erleri artt�rabilirsiniz
		double kenar1=scan.nextDouble();//noktal� verebilir
		double kenar2=scan.nextDouble();
		
		if(kenar1>0 && kenar2>0 && kenar1==kenar2) {//equal demedik ��nk� string de�il say�
			System.out.println("kare");
		}
		if(kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("dikd�rtgen");

		}
		if(kenar1<=0 || kenar2<=0) {
			System.out.println("l�tfen ge�erli uzunluk giriniz");
//			 2 kenar uzunlu�u giriniz :
//				 -35
//				 -35
//				 l�tfen ge�erli uzunluk giriniz
			
			scan.close();
		}
		
	}

}
