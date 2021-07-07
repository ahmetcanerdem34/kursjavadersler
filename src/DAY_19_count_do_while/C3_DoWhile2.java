package DAY_19_count_do_while;

import java.util.Scanner;

public class C3_DoWhile2 {

	public static void main(String[] args) {
		
	/*	
		Kullanicidan toplamak uzere pozitif sayi isteyin, 
		islemi bitirmek icin 0’a basmasini soyleyin.
		  Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin 
		  ve “Negatif sayi giremezsiniz” yazdirip basa donun
		  Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, 
		  yanlislikla kac negative sayi girdigini 
		  ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
		*/
		
		Scanner scan= new Scanner (System.in);
		//d onun içine yazsakta olur buraya yazsak ta olur
		
		
		int countPoz=0;//pozitif sayýlar için variable oluþturdum
		int countNeg=0;//negatif sayýlar için variable oluþturdum
		int toplamPoz=0;
		int sayi=1;
		
		System.out.println("oyuna hoþgeldiniz, bitirmek istediðinizde 0 a basýn");
		
		do {
			
		
			System.out.print("pozi sayý giriniz :");
			sayi=scan.nextInt();
			//buraya kadar bir sayý girdi kullanýcý-->pozi neg yada sýfýr girdi
			
			
			if (sayi>0) {//sayý 0 dan buyukse neler yapmalýyým  1= count pozi yi bir arttýrmalýyým
				//toplamaya eklemeliyim
				countPoz++;
				toplamPoz+=sayi;	
			} 
			if(sayi<0){//sayý negatifse ne yapacaðýz sýralayalým ve yukardaki mesajý verelim 		
				countNeg++;
				System.out.println("Negatif sayi giremezsiniz");
	
			}
			
			//burada while den sonra { suslu yok çünkü while ýn iþi bitiyor
		} while (sayi !=0);//kullanýcý 0 a basýncaya kadar tekrar tekrar çalýþacak--> sýfýr girerse sonuçlarý yazacaðýz
		//yukarý false olunca bunlarý yazdýracaðýz
		
		System.out.println("toplam "+ countPoz+" "+"pozitif sayý giriniz");//burasý countPoz++ nýn toplam hali
		System.out.println("toplam "+countNeg +" "+"negatif sayý giriniz");//burasý countNeg++ nýn toplam hali
		System.out.println("Girdiðiniz pozitif sayýlarýn toplamý "+ toplamPoz);
		
//		Negatif sayi giremezsiniz
//		pozi sayý giriniz :-5
//		Negatif sayi giremezsiniz
//		pozi sayý giriniz :-7
//		Negatif sayi giremezsiniz
//		pozi sayý giriniz :56
//		pozi sayý giriniz :0
//		toplam 4 pozitif sayý giriniz
//		toplam 3 negatif sayý giriniz
//		Girdiðiniz pozitif sayýlarýn toplamý 162
		
	scan.close();	
	}

}
