package DAY_11_StringManipulation;

import java.util.Iterator;
import java.util.Scanner;

public class C1_StirngManipulationCalisma02 {

	public static void main(String[] args) {
		
		 //girilen bir stringin sadece son harfini yazd�r
		/*
        Girilen bir stringdeki a harfi say�s�n� bulunuz.
         c harfine s�ra gelirse d�ng�den ��k�ls�n
         */

        Scanner oku= new Scanner(System.in);
        System.out.print("bir string giriniz=");
        String girilen= oku.nextLine();
       
        System.out.println(girilen.charAt(girilen.length()-1));
//        bir string giriniz=java kod yazd�k�a geli�ir
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
//        bir string giriniz=java kod yazd�k�a geli�ir
//        		r
//        		4
        
	}

}
