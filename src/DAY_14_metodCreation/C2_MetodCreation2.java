package DAY_14_metodCreation;

public class C2_MetodCreation2 {

	public static void main(String[] args) {//bakal�m alt� alan var m� burda
		
		
		//bir metodu �al��t�rmak i�in main metodun i�inden �a��rmam�z gerekir
		//�a��rmak ne demek=--> metod ad�m� ve parametrelere uygun argument  leri yazmal�y�z
		
		ortalama (85.2,90.3);//method call 
		
		
		
		//1-public= acces modifier= herkese a��k
		//2-static var olmazsa olmaz
		//3-void = return type= buda en alta return yazmaya gerek yok anlam� ta��r
		//4-main= isim
		//5-parantezler=0olmazsa olmaz==(string args=> yazan yerde parametredata tipi string-ismi=>args
		//6-body=son k�s�m
	
	}//buras� main metodunun biti�i
	
	//yeni bir metod olu�tural�m
	//nerde olu�turulu?---;> class �n i�inde ama main metodunun d���nda olu�turmal�y�z
	
	//ilk anahtar kelimemiz=acces modi-->public
	
	public static void ortalama(double sayi1, double sayi2) {
		
		System.out.println("girdi�iniz 2 say�n�n ortalamas� :" + (sayi1 +sayi2)/2);//�al��t�rsak bi�ey vermez ��nk� de�er yok hen�z
		//bir metodu olu�turmak o metodu �al��t�rmak i�in yeterli de�ildir
		//olu�truulan metod main metod i�inden �a�r�l�nca �al���r
		
	
	}
	

}//buras� da class sonu
