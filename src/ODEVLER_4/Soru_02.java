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
	        case "may�s":
	        case "temmuz":
	        case "a�ustos":
	        case "ekim":
	        case "aral�k":
	            System.out.println("31 g�n");
	            break;
	            
	        case "nisan":
	        case "haziran":
	        case "eyl�l":
	        case "kas�m":
	            System.out.println("30 g�n");
	            break;
	            
	        case "subat":
	            System.out.println("28 gun fakat 4 y�lda bir 29 g�n");  
	            break;  
	            
	        default:    
	            System.out.println("Ge�erli bir ay ismi giriniz");
	            break;
	        }
	}

}
