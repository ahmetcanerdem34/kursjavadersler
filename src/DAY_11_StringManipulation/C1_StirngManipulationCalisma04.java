package DAY_11_StringManipulation;

import java.util.Scanner;

public class C1_StirngManipulationCalisma04 {

	public static void main(String[] args) {
		
		 // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String'in palindrom olup olmadigini kontrol eden bir program yazin.
		
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String  kelime=scan.nextLine();
        
        //karak
        
     String yeniKelime="";   
    for (int i = kelime.length()-1; i >=0; i--) {
    	
    	yeniKelime=yeniKelime+kelime.charAt(i);
    }
    	
    	if(yeniKelime.equals(kelime)) {
    		System.out.println("polindrome");
    	}else {
    		System.out.println("deðil");
//    		Lutfen bir cumle giriniz : karak
//    		polindrome
    		
//    		Lutfen bir cumle giriniz : bohçaçý
//    		deðil
    	}
		
	}
        

	}


