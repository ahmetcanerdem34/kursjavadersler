package DAY_13_ContainsReplace;

import java.util.Scanner;

public class C7_SoruCevap {

	public static void main(String[] args) {


		//kullanýcýdan 4 harfli bir kelime isteyin ve tersten yazdýrýn
		
		Scanner scan =new Scanner (System.in);
		
		System.out.print("4 harfli bir kelime giriniz :");
		String str=scan.nextLine();
		
		if(str.length()!=4) {
			
			System.out.println("lütfen 4 karakterli kelime giriniz");
		}else {
			System.out.print(str.substring(3));
			System.out.print(str.substring(2, 3));
			System.out.print(str.substring(1, 2));
			System.out.print(str.substring(0, 1));
//			4 harfli bir kelime giriniz :akif
//			fika
		}
		
		
	}

}
