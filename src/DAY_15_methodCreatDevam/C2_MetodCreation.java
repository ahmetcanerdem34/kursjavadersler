package DAY_15_methodCreatDevam;

import java.util.Scanner;

public class C2_MetodCreation {

	public static void main(String[] args) {
	/*	
		Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
	Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin 
	ve sayilarin toplamini yazdirin. 
	Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse 
	“Cok sayi girdiniz, ben toplayamam” yazdirin.
	2'den kucuk bir sayý girerse ""en az 2 sayý girmelisiniz
*/
		
		Scanner scan=new Scanner(System.in);
		System.out.print("kaç sayý toplamak istediðinizi giriniz :");
		int adet=scan.nextInt();
		
		
		if (adet< 2) {
			System.out.println("en az 2 sayý girmelisiniz");
			
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
		System.out.println("lütfen 4 sayý giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();		
		double sayi3=scan.nextDouble();		
		double sayi4=scan.nextDouble();		
		
		System.out.println("dort sayýýn toplamý :" +(sayi1+sayi2+sayi3+sayi4));
				
	}

	public static void ucSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 3 sayý giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();		
		double sayi3=scan.nextDouble();		
			
		
		System.out.println("üç sayýýn toplamý :" +(sayi1+sayi2+sayi3));
	}

	public static void ikiSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 2 sayý giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();		
			
		System.out.println("iki sayýýn toplamý :" +(sayi1+sayi2));
		
		
//		kaç sayý toplamak istediðinizi giriniz :3
//		lütfen 3 sayý giriniz
//
//		23.5
//		36.2
//		32.5
//		üç sayýýn toplamý :92.2
		
//		kaç sayý toplamak istediðinizi giriniz :2
//		lütfen 2 sayý giriniz
//		34
//		32.4
//		iki sayýýn toplamý :66.4
		
		
//		kaç sayý toplamak istediðinizi giriniz :12
//		Cok sayi girdiniz, ben toplayamam
		
		
		
		
		
		
		
	}
}