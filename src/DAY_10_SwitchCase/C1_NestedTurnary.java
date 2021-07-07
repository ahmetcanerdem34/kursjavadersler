package DAY_10_SwitchCase;

import java.util.Scanner;

public class C1_NestedTurnary {

	public static void main(String[] args) {
		
		//kullanýcýdan bir sayý alýn 
		//sayý 3 basamakl ýise  üç basamaklý 
		//deðilse üç basamaklý deðil yazdýýrn
		
		//sayýmýz üç basamklý olmasýný nasýl kontrol edebilirim
		//kiþiden sayýyý aldýk
		//
		
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("tamsayý pozitif giriniz :");
		int sayi=scan.nextInt();
		
		
		
		
	String sonuc=sayi>99 ? (sayi<1000 ? "3 basamkalý" : "üç basamaklý deðil") :"3 basamaklý deðil";
	
	System.out.println(sonuc);
	
//	tamsayý pozitif giriniz :156
//	3 basamkalý

	
		//diðer çözüm þekli

	String sonuc1= sayi >=100 && sayi<1000 || sayi <=100 && sayi>-1000 ? "üç basamaklý" : "3 basamklý  deðil";
	
	System.out.println(sonuc1);
	}

}
