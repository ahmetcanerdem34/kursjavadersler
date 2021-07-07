package DAY_11_StringManipulation;

import java.util.Iterator;
import java.util.Scanner;

public class C1_StirngManipulationCalisma02 {

	public static void main(String[] args) {
		
		 //girilen bir stringin sadece son harfini yazdýr
		/*
        Girilen bir stringdeki a harfi sayýsýný bulunuz.
         c harfine sýra gelirse döngüden çýkýlsýn
         */

        Scanner oku= new Scanner(System.in);
        System.out.print("bir string giriniz=");
        String girilen= oku.nextLine();
       
        System.out.println(girilen.charAt(girilen.length()-1));
//        bir string giriniz=java kod yazdýkça geliþir
//        r
        
        int count =0;
        for (int i = 0; i < girilen.length(); i++) {
        	
        	if(girilen.toLowerCase().charAt(i)=='a') {
        		count++;
        	}else if(girilen.toLowerCase().charAt(i)=='c') {
        		break;
        	}
			
		}
        
        System.out.println(count);
//        bir string giriniz=java kod yazdýkça geliþir
//        		r
//        		4
        
	}

}
