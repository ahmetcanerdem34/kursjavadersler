package DAY_06_İfStatements;

import java.util.Scanner;

public class C5_İfStatement5 {

	public static void main(String[] args) {
		
		
		//soru: kullanıcıdan bir dikdörtgenin 2 kenar uzunluğunu alın
		//kena r uzunluklarıu eşitse kare değilse dikdörtgen yazdırın
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println(" 2 kenar uzunluğu giriniz :");//dah afzalada girip aşagıda değerleri arttırabilirsiniz
		double kenar1=scan.nextDouble();//noktalı verebilir
		double kenar2=scan.nextDouble();
		
		if(kenar1>0 && kenar2>0 && kenar1==kenar2) {//equal demedik çünkü string değil sayı
			System.out.println("kare");
		}
		if(kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("dikdörtgen");

		}
		if(kenar1<=0 || kenar2<=0) {
			System.out.println("lütfen geçerli uzunluk giriniz");
//			 2 kenar uzunluğu giriniz :
//				 -35
//				 -35
//				 lütfen geçerli uzunluk giriniz
			
			scan.close();
		}
		
	}

}
