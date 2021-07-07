package DAY_16_forLoop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		
		
		//Soru 8 ) Interview Question Kullanicidan bir String isteyin //
		//ve Stringi tersine ceviren bir program yazin.
		
		Scanner scan=new Scanner (System.in);
		System.out.print("string girin:");
		String kelime =scan.nextLine();
		
	String tersYazi="";
		
		for (int i = kelime.length()-1; i>=0 ; i--) {
			
			tersYazi+=kelime.charAt(i);
			
		
			
		}
		System.out.println(tersYazi);
//		string girin:ahmet gel
//		leg temha

			//2. yol tersiYazi yi sadece yazdýracaksak variavle yazmadanda yapabiliriz
	}
	
	/* System.out.print("Girdiginiz yazinin tersi : ");
     for (int i = kelime.length()-1 ; i >= 0; i--) {
         
         System.out.print(yazi.charAt(i));
         */


}
		//System.out.println("");
			// 3.yol method olusturup bunu yazdirabiliriz

			//tersineCevir(yazi);



