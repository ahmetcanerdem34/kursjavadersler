package DAY_60_lambda;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionFonksiyonelArayuzOrnek {
		
	
	public static void main(String[] args) {
		
		
		//Function arayuzunde tan�mlanan fonksiyon .apply() methodu �a�r�labilir
		
		
		System.out.println("Virg�lle ayr�lm�� olarak say�lar� giriniz");
		
		Scanner scan = new Scanner(System.in);
		String sayilar[]= scan.nextLine().split(",");
		
		Function<String, Integer> cevirici = x->Integer.parseInt(x);
		
		int toplam=0;
		for (String s : sayilar) {
			
			toplam += cevirici.apply(s);
			
		}
	System.out.println("Say�s� :" + sayilar.length);
	System.out.println("Toplam� :" + toplam);
//	Virg�lle ayr�lm�� olarak say�lar� gireiniz
//	1,2,3,4,5,676,8,
//	Say�s� :7
//	Toplam� :699
		}

	}


