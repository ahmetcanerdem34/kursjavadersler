package DAY_15_methodCreatDevam;

import java.util.Scanner;

public class C2_MetodCreation {

	public static void main(String[] args) {
	/*	
		Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
	Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin 
	ve sayilarin toplamini yazdirin. 
	Kullanici toplamak istedigi sayi adedini 4�den buyuk girerse 
	�Cok sayi girdiniz, ben toplayamam� yazdirin.
	2'den kucuk bir say� girerse ""en az 2 say� girmelisiniz
*/
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ka� say� toplamak istedi�inizi giriniz :");
		int adet=scan.nextInt();
		
		
		if (adet< 2) {
			System.out.println("en az 2 say� girmelisiniz");
			
		} else if (adet==2){
			
			ikiSayiTopla();
			
		}else if(adet==3) {
				
				ucSayiTopla();
				
			}else if(adet==4) {
				
				dortSayiTopla();
				
			}else {
				
				System.out.println("Cok sayi girdiniz, ben toplayamam");
				
			}

	    }	
	

	public static void dortSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen 4 say� giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();		
		double sayi3=scan.nextDouble();		
		double sayi4=scan.nextDouble();		
		
		System.out.println("dort say��n toplam� :" +(sayi1+sayi2+sayi3+sayi4));
				
	}

	public static void ucSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen 3 say� giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();		
		double sayi3=scan.nextDouble();		
			
		
		System.out.println("�� say��n toplam� :" +(sayi1+sayi2+sayi3));
	}

	public static void ikiSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen 2 say� giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();		
			
		System.out.println("iki say��n toplam� :" +(sayi1+sayi2));
		
		
//		ka� say� toplamak istedi�inizi giriniz :3
//		l�tfen 3 say� giriniz
//
//		23.5
//		36.2
//		32.5
//		�� say��n toplam� :92.2
		
//		ka� say� toplamak istedi�inizi giriniz :2
//		l�tfen 2 say� giriniz
//		34
//		32.4
//		iki say��n toplam� :66.4
		
		
//		ka� say� toplamak istedi�inizi giriniz :12
//		Cok sayi girdiniz, ben toplayamam
		
		
		
		
		
		
		
	}
}