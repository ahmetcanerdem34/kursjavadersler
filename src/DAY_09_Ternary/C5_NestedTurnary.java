package DAY_09_Ternary;

import java.util.Scanner;

public class C5_NestedTurnary {

	public static void main(String[] args) {
		
		//Kullan�c�dan dikdortgenin uzunlu�unu ve geni�li�iini al�n 
		//girilen degerlere g�re kare mi dikd�rtgen mi yaz�d�r�n
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("kenar de�erleri giriniz :");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		//kullan�c� makul �eyler girerse bu okutmada sorun yok-- ya eksi yada e�it girerse o zamn kontrol i�in alttaki
		System.out.println(kenar1==kenar2 ? "kare" : "kare de�il" );
		
		//stringe de atayabiliriz
		String sonuc=kenar1>0 && kenar2>0 ? kenar1==kenar2 ? "kare" : "kare de�il" : "ge�ersiz kenar uzunlu�u";
		
		System.out.println(kenar1>0 && kenar2>0 ? kenar1==kenar2 ? "kare" : "kare de�il" : "ge�ersiz kenar uzunlu�u");

//		kenar de�erleri giriniz :25
//		25
//		kare
//		kare
		
//		kenar de�erleri giriniz :0
//		12
//		kare de�il
//		ge�ersiz kenar uzunlu�u
		
		scan.close();
	}

}
