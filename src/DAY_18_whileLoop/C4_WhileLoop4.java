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
		System.out.print("ba�lang�� harfi giriniz :");
		char basHarf=scan.next().toUpperCase().charAt(0);
		
		System.out.print("biti� harfi giriniz :");
		char sonHarf=scan.next().toUpperCase().charAt(0);
		
		
		for (char i = basHarf; i <=sonHarf; i++) {
			
			System.out.print(i +" ");
			
//			ba�lang�� harfi giriniz :a
//			biti� harfi giriniz :f
//			A B C D E F 
			
		}
		
		System.out.println("");
		
		//while loop ile yapal�m
		
		//ba�lang�� de�erini yazmal�y�m=0 yukarda girdik
		
		while (basHarf<=sonHarf) {
					
				System.out.print(basHarf +" ");
				basHarf++;//harfleri tek tek yazd�rmak i�in loop un i�ine koyduk artt�rmay�
				
//				ba�lang�� harfi giriniz :a
//				biti� harfi giriniz :n
//				A B C D E F G H I J K L M N 
	
	scan.close();		
		}
		
	}

}
