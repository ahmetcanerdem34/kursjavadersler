package DAY_04_MathOperatorsAndModuls;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {


		//soru : kullanýýcdan 4 basamklý sayý alalým ve sayýnýn basamklarýnýn ters sýrada yazalým
		
		//bir sayýnýn basamklarýný elde etmek için 2 iþlemi tekrar tekrar yaparýz
		//1. iþlem en sondaki basamaðý elde etmek sonra onu yok etmek
		//2. iþlem bu iþlemi basamk sayýsý kadar yapmalýyým, 3 basam 3 , 4 basamak 4 kere ister
		
		// iþmdi sayý alalým kullancýdan
		
		

		Scanner scan=new Scanner (System.in);
		System.out.print("basamaklarýný bulmak için 4 basamaklý sayý giriniz :");
		int sayi=scan.nextInt();//bu basamaktan sonra elimizde 4 basamaklý sayý var
		
		
		// 4 tekrar yapacaðýz
		//1. tekrar birler basamðýný bul 
		
		int birler=sayi % 10;
		sayi/=10;//ilk basamaðý buldum, bulduðum ilk basamaktan kurtulmak için sayi deðiþkenini 10 a böldüm
		
		//bu satýrdan sonra sayýmýz 3 basamklý oldu
		//onlar basamaðýný bulmak için ayný iþlemi  tekrar yapacaðým
		
		int onlar=sayi%10;
		sayi/=10;
		
		//bu satýrdan itibaren sayýmýz 2 basamaklý kaldý
		
		int yuzler= sayi%10;
		sayi/=10;
		
		//bu iþlemden sonra sayýmýz tek basamk kaldý
		//artýk binler basamaðý kalan sayýdýr yazalým, oda ayi kýsmýdýr
		
		int binler=sayi;
		
		System.out.println("birler :" + birler);
		System.out.println("onlar :" + onlar);
		System.out.println("yuzler : " + yuzler);
		System.out.println("bilner :" + binler);
		
		
		
//		birler :7
//		onlar :8
//		yuzler : 6
//		biner :5


		
		//yan yana yazdýralým//concatination yaparsak yanýna string koyarýz sonrakileri birleþtirir
		
		System.out.println("girdiðimi sayýnýn tersten yazýlýþý : " +birler + onlar + yuzler + binler );
		//7865
		
		// toplamlarýný yadýralým
		
		System.out.println(+birler + onlar + yuzler + binler);
		//26
		
//		basamaklarýný bulmak için 4 basamaklý sayý giriniz :5687
//		birler :7
//		onlar :8
//		yuzler : 6
//		binler :5
//		girdiðimi sayýnýn tersten yazýlýþý : 7865
//		26
	
		
	scan.close();
		
		
		
	}

}
