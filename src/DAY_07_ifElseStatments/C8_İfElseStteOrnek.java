package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C8_�fElseStteOrnek {

	public static void main(String[] args) {
	
		
		//soru: maa� i�in bir teklif isteyin 
		//teklif 80.0000 in �zerindeyse kabul ediyorum
		// 60-80.0000 ar�nda ise konusbiliriz
		//60.0000 in alt�nda ise malesef kabul edemem
		
		Scanner scan = new Scanner (System.in);
		System.out.print("maa� teklifiniz nedir :");
		double maas=scan.nextDouble();
		
		if(maas >80) {
			System.out.println("kabul ediyorum");
			
		}else if(maas>60 && maas<80) {
			System.out.println("konu�abiliriz");
		}else {
			System.out.println("maalesef kabul edemem");
			
//			maa� teklifiniz nedir :50
//			maalesef kabul edemem
			
//			maa� teklifiniz nedir :65
//			konu�abiliriz
			
//			maa� teklifiniz nedir :81.5
//			kabul ediyorum
		}
		scan.close();

	}

}
