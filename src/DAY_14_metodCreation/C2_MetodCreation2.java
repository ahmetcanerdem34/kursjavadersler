package DAY_14_metodCreation;

public class C2_MetodCreation2 {

	public static void main(String[] args) {//bakalým altý alan var mý burda
		
		
		//bir metodu çalýþtýrmak için main metodun içinden çaðýrmamýz gerekir
		//çaðýrmak ne demek=--> metod adýmý ve parametrelere uygun argument  leri yazmalýyýz
		
		ortalama (85.2,90.3);//method call 
		
		
		
		//1-public= acces modifier= herkese açýk
		//2-static var olmazsa olmaz
		//3-void = return type= buda en alta return yazmaya gerek yok anlamý taþýr
		//4-main= isim
		//5-parantezler=0olmazsa olmaz==(string args=> yazan yerde parametredata tipi string-ismi=>args
		//6-body=son kýsým
	
	}//burasý main metodunun bitiþi
	
	//yeni bir metod oluþturalým
	//nerde oluþturulu?---;> class ýn içinde ama main metodunun dýþýnda oluþturmalýyýz
	
	//ilk anahtar kelimemiz=acces modi-->public
	
	public static void ortalama(double sayi1, double sayi2) {
		
		System.out.println("girdiðiniz 2 sayýnýn ortalamasý :" + (sayi1 +sayi2)/2);//çalýþtýrsak biþey vermez çünkü deðer yok henüz
		//bir metodu oluþturmak o metodu çalýþtýrmak için yeterli deðildir
		//oluþtruulan metod main metod içinden çaðrýlýnca çalýþýr
		
	
	}
	

}//burasý da class sonu
