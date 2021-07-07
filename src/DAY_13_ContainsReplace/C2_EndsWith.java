package DAY_13_ContainsReplace;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {

		//ile bitiyor mu--->>true false veriir
		
		String str="java'yla hayat ne güzel";
		
		System.out.println(str.endsWith("zel"));
		//true

		System.out.println(str.endsWith("zel "));
		//false---> çünkü boþluk var
		
		
		// Kullanicidan bir email isteyin
				// eger @ isareti ivecermiyorsa "girdiginiz bilgi email degil"
				// eger @ isareti iceriyor ama @gmail.com icermiyorsa "lutfen gmail adresi yazin"
				// eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyorsa "gecersiz gmail adresi" yazsin
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("email adresi giriniz :");
		String email=scan.nextLine();
		
		if(!email.contains("@")) {//baþýnda ünlem varsa içermiyorsa olur-->email @ iþareti içermiyorsa
			
			System.out.println("girdiginiz bilgi email degil");
			
		}else if(!email.contains("@gmail.com")) {
			System.out.println("lutfen gmail adresi yazin");
			
		}else if(email.endsWith("@gmail.com")) {
			
			System.out.println("emeail iniz baþarýyla kaydedildi");
			
		}else {
			
			System.out.println("geçersiz email adresi");
			
//			email adresi giriniz :mehy@gmail.comcom
//			geçersiz email adresi
//			email adresi giriniz :mehmet@gmail.com
//			emeail iniz baþarýyla kaydedildi

			
		}
		
		
		

	}

}
