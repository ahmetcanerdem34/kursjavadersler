package DAY_60_lambda;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionFonksiyonelArayuzOrnek {
		
	
	public static void main(String[] args) {
		
		
		//Function arayuzunde tanýmlanan fonksiyon .apply() methodu çaðrýlabilir
		
		
		System.out.println("Virgülle ayrýlmýþ olarak sayýlarý giriniz");
		
		Scanner scan = new Scanner(System.in);
		String sayilar[]= scan.nextLine().split(",");
		
		Function<String, Integer> cevirici = x->Integer.parseInt(x);
		
		int toplam=0;
		for (String s : sayilar) {
			
			toplam += cevirici.apply(s);
			
		}
	System.out.println("Sayýsý :" + sayilar.length);
	System.out.println("Toplamý :" + toplam);
//	Virgülle ayrýlmýþ olarak sayýlarý gireiniz
//	1,2,3,4,5,676,8,
//	Sayýsý :7
//	Toplamý :699
		}

	}


