package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C6_�fElse�f {

	public static void main(String[] args) {
		
		
		//soru: kullan�c�dan 100 �zerinde notunu isteyin 
		//notu harf sistemine �evirip yazd�r�n
		//50 den k���kse D, 50-60 aras� C, 60-80 aras�  B, 80 ve �zeri A
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("100 �zerinden notunuzu giriniz :");
		double not=scan.nextDouble();
		
	
		//ELSE �F C�MLELER�N� B�RB�R�NE BA�LAR, --- SADECE �FLERLE KURARSAK KODLARI, HER �F KODU B�RB�R�NDEN BA�IMSIZDIR(BODY LER�)
		
		
		if(not<0 || not>100) {//istenmeyen durumu girdik
			System.out.println("ge�erli not giriniz");
		}
		
		else if(not<50) {//notumuz 0 ile 100 aras�nda
			System.out.println("D");
			
			} else if(not<60) {//�uan da notm 50 ile 100 aras�nda olabilir
				System.out.println("C");
			
			}else if(not<80) {//buraya geldiyse 
				System.out.println("B");
				
			}else {
				System.out.println("A");
				
				
//				100 �zerinden notunuzu giriniz :50
//				C
				
//				100 �zerinden notunuzu giriniz :101
//				ge�erli not giriniz
//				
//				100 �zerinden notunuzu giriniz :87
//				A
//				
				


			}
		scan.close();
		
		

	}

}
