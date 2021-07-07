package DAY_18_whileLoop;

import java.util.Scanner;

public class C4_WhileLoop4 {

	public static void main(String[] args) {
	/*	
		Soru 4) Kullanicidan baslangic ve bitis haflerini alin 
ve baslangic harfinden baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. 
Kullanicinin hata yapmadigini farz edin.
		
	*/	
		
		Scanner scan =new Scanner (System.in);
		System.out.print("baþlangýç harfi giriniz :");
		char basHarf=scan.next().toUpperCase().charAt(0);
		
		System.out.print("bitiþ harfi giriniz :");
		char sonHarf=scan.next().toUpperCase().charAt(0);
		
		
		for (char i = basHarf; i <=sonHarf; i++) {
			
			System.out.print(i +" ");
			
//			baþlangýç harfi giriniz :a
//			bitiþ harfi giriniz :f
//			A B C D E F 
			
		}
		
		System.out.println("");
		
		//while loop ile yapalým
		
		//baþlangýç deðerini yazmalýyým=0 yukarda girdik
		
		while (basHarf<=sonHarf) {
					
				System.out.print(basHarf +" ");
				basHarf++;//harfleri tek tek yazdýrmak için loop un içine koyduk arttýrmayý
				
//				baþlangýç harfi giriniz :a
//				bitiþ harfi giriniz :n
//				A B C D E F G H I J K L M N 
	
	scan.close();		
		}
		
	}

}
