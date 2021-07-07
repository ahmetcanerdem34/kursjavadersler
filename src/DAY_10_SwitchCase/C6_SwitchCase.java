package DAY_10_SwitchCase;

import java.util.Scanner;

public class C6_SwitchCase {

	public static void main(String[] args) {
		
		//kullanýcýdan VIP(very important person) kýsaltmasýnda hangi aharfin anlamýný istediðini soralým
		//girilen harfin açýklamasýný yazdýralým
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("VÝP kýsaltmasýndan hangi harfin akelime karþýlýðýný istiyorsunuz:");
		char harf = scan.nextLine().toUpperCase().charAt(0);
		
		
			
		
		
		switch(harf) {
		
		case 'V': System.out.println("Very ");break;
		case 'Ý': System.out.println("important");break;
		case 'P': System.out.println("person");break;
		default: System.out.println("geçerli harf giriniz :");
		
//		VÝP kýsaltmasýndan hangi harfin akelime karþýlýðýný istiyorsunuz:v
//		Very 
		
		}
		
		
//farklý þekilde yani string le çözelim
		
		System.out.print("VÝP kýsaltmasýndan hangi harfin akelime karþýlýðýný istiyorsunuz:");
		String str = scan.nextLine().toUpperCase();//ilk kelimeyi veiri = vali girsekte v yi verecek, inek girse i yi alacak
		
	
		switch(str) {
		
		case "V": System.out.println("Very..");break;
		case "Ý": System.out.println("important..");break;
		case "P": System.out.println("person..");break;
		default: System.out.println("geçerli harf giriniz :");
		
//		VÝP kýsaltmasýndan hangi harfin akelime karþýlýðýný istiyorsunuz:V
//		Very..
		
		}
	

	}

}
