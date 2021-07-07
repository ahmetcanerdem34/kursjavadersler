package DAY_24_array;

import java.util.Scanner;

public class Arrays_CalismaDiziMethodlar2 {

	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//1. methodda sayýlarý aldýk
		
		//2. methodda sayýlarý yazdýrdýk
		
		int diziBoyut;
		
		System.out.println("kaç elemanlý bir dizi gireceksiniz :");
		diziBoyut=scan.nextInt();
	

		
		//bir sayýsal dizi oluþturalým
		
		int sayilar[]= diziElemanlarýnýAl(diziBoyut);
		
		diziElemanYazdir(sayilar);


	}
	
	public static void diziElemanYazdir(int s[]) {//bu þekilde yukardaki butun sayilar elemanýný burdaki s e aktarmýþ lduk
		
		for (int i = 0; i < s.length; i++) {
			
			System.out.println(s[i]);//s diizzsindeki eemanlarý i olarak isteyeceðiz, yukarý çýk çaðýr
//			kaç elemanlý bir dizi gireceksiniz :
//				5
//				1.elemaný giriniz 
//				45
//				2.elemaný giriniz 
//				43
//				3.elemaný giriniz 
//				45
//				4.elemaný giriniz 
//				65
//				5.elemaný giriniz 
//				67
//				45
//				43
//				45
//				65
//				67
			
		}

}
	
	//yukarda elemanlarý biz verdik, bu seferde kendimiz tek tek girelim
	
	public static int[] diziElemanlarýnýAl(int boyut) {//burda int ile main methoduna göndereceðiz
		
		int sayilar[]=new int [boyut];
		
		//for döngüsüyle bütün elemanlarý alalým,,
		
		for (int i = 0; i < sayilar.length; i++) {
			
			System.out.println((i+1)+".elemaný giriniz ");
			sayilar[i]=scan.nextInt();
		}
		return sayilar;
	}
	
	
	
	
}