package DAY_13_ContainsReplace;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {

		//ile bitiyor mu--->>true false veriir
		
		String str="java'yla hayat ne g�zel";
		
		System.out.println(str.endsWith("zel"));
		//true

		System.out.println(str.endsWith("zel "));
		//false---> ��nk� bo�luk var
		
		
		// Kullanicidan bir email isteyin
				// eger @ isareti ivecermiyorsa "girdiginiz bilgi email degil"
				// eger @ isareti iceriyor ama @gmail.com icermiyorsa "lutfen gmail adresi yazin"
				// eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyorsa "gecersiz gmail adresi" yazsin
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("email adresi giriniz :");
		String email=scan.nextLine();
		
		if(!email.contains("@")) {//ba��nda �nlem varsa i�ermiyorsa olur-->email @ i�areti i�ermiyorsa
			
			System.out.println("girdiginiz bilgi email degil");
			
		}else if(!email.contains("@gmail.com")) {
			System.out.println("lutfen gmail adresi yazin");
			
		}else if(email.endsWith("@gmail.com")) {
			
			System.out.println("emeail iniz ba�ar�yla kaydedildi");
			
		}else {
			
			System.out.println("ge�ersiz email adresi");
			
//			email adresi giriniz :mehy@gmail.comcom
//			ge�ersiz email adresi
//			email adresi giriniz :mehmet@gmail.com
//			emeail iniz ba�ar�yla kaydedildi

			
		}
		
		
		

	}

}
