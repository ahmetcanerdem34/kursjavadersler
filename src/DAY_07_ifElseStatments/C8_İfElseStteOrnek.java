package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C8_ÝfElseStteOrnek {

	public static void main(String[] args) {
	
		
		//soru: maaþ için bir teklif isteyin 
		//teklif 80.0000 in üzerindeyse kabul ediyorum
		// 60-80.0000 arýnda ise konusbiliriz
		//60.0000 in altýnda ise malesef kabul edemem
		
		Scanner scan = new Scanner (System.in);
		System.out.print("maaþ teklifiniz nedir :");
		double maas=scan.nextDouble();
		
		if(maas >80) {
			System.out.println("kabul ediyorum");
			
		}else if(maas>60 && maas<80) {
			System.out.println("konuþabiliriz");
		}else {
			System.out.println("maalesef kabul edemem");
			
//			maaþ teklifiniz nedir :50
//			maalesef kabul edemem
			
//			maaþ teklifiniz nedir :65
//			konuþabiliriz
			
//			maaþ teklifiniz nedir :81.5
//			kabul ediyorum
		}
		scan.close();

	}

}
