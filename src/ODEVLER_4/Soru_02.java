package ODEVLER_4;

import java.util.Scanner;

public class Soru_02 {

	public static void main(String[] args) {
		
		/*  
		* Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java kodunu yaziniz.
			*/


		Scanner scan= new Scanner (System.in);
		System.out.println(" ay ismi girniz :");
		String ayAd=scan.next().toLowerCase();
		
		  switch (ayAd) {
	        case "ocak":  
	        case "mart":  
	        case "mayýs":
	        case "temmuz":
	        case "aðustos":
	        case "ekim":
	        case "aralýk":
	            System.out.println("31 gün");
	            break;
	            
	        case "nisan":
	        case "haziran":
	        case "eylül":
	        case "kasým":
	            System.out.println("30 gün");
	            break;
	            
	        case "subat":
	            System.out.println("28 gun fakat 4 yýlda bir 29 gün");  
	            break;  
	            
	        default:    
	            System.out.println("Geçerli bir ay ismi giriniz");
	            break;
	        }
	}

}
