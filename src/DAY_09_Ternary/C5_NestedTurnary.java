package DAY_09_Ternary;

import java.util.Scanner;

public class C5_NestedTurnary {

	public static void main(String[] args) {
		
		//Kullanýcýdan dikdortgenin uzunluðunu ve geniþliðiini alýn 
		//girilen degerlere göre kare mi dikdörtgen mi yazýdýrýn
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("kenar deðerleri giriniz :");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		//kullanýcý makul þeyler girerse bu okutmada sorun yok-- ya eksi yada eþit girerse o zamn kontrol için alttaki
		System.out.println(kenar1==kenar2 ? "kare" : "kare deðil" );
		
		//stringe de atayabiliriz
		String sonuc=kenar1>0 && kenar2>0 ? kenar1==kenar2 ? "kare" : "kare deðil" : "geçersiz kenar uzunluðu";
		
		System.out.println(kenar1>0 && kenar2>0 ? kenar1==kenar2 ? "kare" : "kare deðil" : "geçersiz kenar uzunluðu");

//		kenar deðerleri giriniz :25
//		25
//		kare
//		kare
		
//		kenar deðerleri giriniz :0
//		12
//		kare deðil
//		geçersiz kenar uzunluðu
		
		scan.close();
	}

}
