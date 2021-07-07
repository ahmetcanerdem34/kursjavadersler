package DAY_05_operatorSigns;

public class C1_Modulus {

	public static void main(String[] args) {
	
		//veirlen bir integer ýn birler basamaðýný yazdýrýn
		
		int sayi=1469;
		
		int birler=sayi%10;
		System.out.println(sayi%10);
		System.out.println("verilen sayýnýn birler basamaðý : "+birler);
		//verilen sayýnýn birler basamaðý : 9
		
		//verilen sayýnýn birler basamaðý hariç geriye kalan sayýyý yazýn
		
		int kalan = sayi/10;
		System.out.println(sayi/10);//böyle yazarsam sadece o anlýk iþlem yapar
		System.out.println(sayi);//bu kýsmý tekrar yazdýðýmda sayi 1469 olarak devam eder
		//146
		System.out.println(sayi/=10);
		System.out.println(sayi);//þimdi yazdýrsam artýk 146 yazar çünkü eþitlikle atama yaptýk. aþaðýdaki not bununla alkalý
		
		//sayi/10 ile sayi/=10 arasýndaki fark nedir
		//0 iþrareti taam assaüingnment) demektir
		//biei iþlemde = (eþittr)atama varsa orada deðer kalýcý olaak deðiþir 
		//eþittir iþareti yoksa matematiksel iþlem yapar
		//sayi/10 yazýlýrsa, sayýnýn deðeri deðiþmez
		//sayi/=10 yazýlýrsa sayi 10 a bölünðr ve yeni deðer olarak atanýr
		
//		9
//		verilen sayýnýn birler basamaðý : 9
//		146
//		1469
//		146
//		146
		

		
	}

}
