package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C7_ÝfElseÝfStatem {

	public static void main(String[] args) {
		
		//soru: kullanýcýdan 2 sayý isteyin, sayýlarýn 2 side pozitifse sayýlarýn yazdýrýn
		//2 side negatifse sayýlarýn çarpýmýný yazýdýrn
		//farklý iþaretlere sahipse farklý iþaretlerle iþlem yapamzsýnýz yazýn
		//sayýlardan sýfýra eþit olan varsa sýfýr çarpmaya göre yutan elemandýr yazdýrýn
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("2 sayý giriniz :");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		
		if(sayi1==0 || sayi2==0) {//BURAYI && AND YAPSAYDIK, 2 SÝ 0 SIFIR OLUNCA ÇALIÞIRDI
			System.out.println("sýfýr çarpmaya göre yutan elemandýr");
			
		}else if(sayi1>0 && sayi2>0) {
			System.out.println(sayi1+sayi2);
		
		}else if(sayi1<0 && sayi2<0) {
			System.out.println("sayýlarýn çarpýmý :" +(sayi1*sayi2));
		
		}else{
			System.out.println("farklý iþaretlere sahipse farklý iþaretlerle iþlem yapamzsýnýz");
			
//			2 sayý giriniz :10.2
//			-23
//			farklý iþaretlere sahipse farklý iþaretlerle iþlem yapamzsýnýz
			
//			2 sayý giriniz :34 5
//			39.0
			
//			2 sayý giriniz :0
//			0
//			sýfýr çarpmaya göre yutan elemandýr
			
		}
		
		scan.close();
		
	}

}
