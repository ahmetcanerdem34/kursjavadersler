package DAY_03_scanner_dataCasting;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		
		//bir klas�n �al��mas� i�in main klas� olu�turmal�y�z
		
		//scanner �ni�in kullan�yoruz, ki�iden bilgi almak i�in yap�yoruz
		//3 ad�mda i�lemi yap�yoruz
		//Scanner �n �al��mas� i�in Java.util(utilities=faydalanma ara� gere�) i se�iyoruz
		
		Scanner scan =new Scanner (System.in);//e�itli�in sol taraf� variable olu�turmak i�in di, sa� taraf hesap yap�p variableye at�yoruz
		//() parentez i�erisine parametre yaz�yorduk, buda system.in
		//in ne demekti= d��ardan bir de�er almakt�
		//import ettik, java k�t�phanesi a��ld� bize
		
		//2. ad�m kullan�c�ya ne istedi�imizi belirtmektir
		System.out.print("l�tfen isminizi giriniz :");
		//burda da out kelimesi �nemli
		
		//3. ad�m,, bir variable olu�turup kullan�c�n�n girdi�i de�eri ata�mal�y�z
		
		String name=scan.nextLine();
		
		
		//�imdi soy isim alaca��z tekrar scanner olu�turmaya gerek yok
		
		System.out.print("l�tfen soyad�n�z� giriniz :");
		String surname=scan.nextLine();
		
		//�imdi ��kt� alal�m
		
		//e�er yazd�raca��m�z bir yaz� sabit ise "" �ift t�rnak
		//e�er bir variable atanm�� de�er varsa variableyi yazmak yeterli
		
		
		System.out.println("isminiz :" + name);
		System.out.println("soyisminiz : " + surname);
		System.out.println("kursa kayd�n�z al�nm��t�r...");
		
//		l�tfen isminizi giriniz : mehmet 
//		l�tfen soyad�n�z� giriniz : tun�bilek
//		isminiz : mehmet 
//		soyisminiz :  tun�bilek
//		kursa kayd�n�z al�nm��t�r...
		
	scan.close();
		
		

	}

}
