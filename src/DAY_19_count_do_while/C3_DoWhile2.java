package DAY_19_count_do_while;

import java.util.Scanner;

public class C3_DoWhile2 {

	public static void main(String[] args) {
		
	/*	
		Kullanicidan toplamak uzere pozitif sayi isteyin, 
		islemi bitirmek icin 0�a basmasini soyleyin.
		  Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin 
		  ve �Negatif sayi giremezsiniz� yazdirip basa donun
		  Kullanici 0�a bastiginda toplam kac pozitif sayi girdigini, 
		  yanlislikla kac negative sayi girdigini 
		  ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
		*/
		
		Scanner scan= new Scanner (System.in);
		//d onun i�ine yazsakta olur buraya yazsak ta olur
		
		
		int countPoz=0;//pozitif say�lar i�in variable olu�turdum
		int countNeg=0;//negatif say�lar i�in variable olu�turdum
		int toplamPoz=0;
		int sayi=1;
		
		System.out.println("oyuna ho�geldiniz, bitirmek istedi�inizde 0 a bas�n");
		
		do {
			
		
			System.out.print("pozi say� giriniz :");
			sayi=scan.nextInt();
			//buraya kadar bir say� girdi kullan�c�-->pozi neg yada s�f�r girdi
			
			
			if (sayi>0) {//say� 0 dan buyukse neler yapmal�y�m  1= count pozi yi bir artt�rmal�y�m
				//toplamaya eklemeliyim
				countPoz++;
				toplamPoz+=sayi;	
			} 
			if(sayi<0){//say� negatifse ne yapaca��z s�ralayal�m ve yukardaki mesaj� verelim 		
				countNeg++;
				System.out.println("Negatif sayi giremezsiniz");
	
			}
			
			//burada while den sonra { suslu yok ��nk� while �n i�i bitiyor
		} while (sayi !=0);//kullan�c� 0 a bas�ncaya kadar tekrar tekrar �al��acak--> s�f�r girerse sonu�lar� yazaca��z
		//yukar� false olunca bunlar� yazd�raca��z
		
		System.out.println("toplam "+ countPoz+" "+"pozitif say� giriniz");//buras� countPoz++ n�n toplam hali
		System.out.println("toplam "+countNeg +" "+"negatif say� giriniz");//buras� countNeg++ n�n toplam hali
		System.out.println("Girdi�iniz pozitif say�lar�n toplam� "+ toplamPoz);
		
//		Negatif sayi giremezsiniz
//		pozi say� giriniz :-5
//		Negatif sayi giremezsiniz
//		pozi say� giriniz :-7
//		Negatif sayi giremezsiniz
//		pozi say� giriniz :56
//		pozi say� giriniz :0
//		toplam 4 pozitif say� giriniz
//		toplam 3 negatif say� giriniz
//		Girdi�iniz pozitif say�lar�n toplam� 162
		
	scan.close();	
	}

}
