package DAY_03_scanner_dataCasting;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		
		//bir klasýn çalýþmasý için main klasý oluþturmalýyýz
		
		//scanner ýniçin kullanýyoruz, kiþiden bilgi almak için yapýyoruz
		//3 adýmda iþlemi yapýyoruz
		//Scanner ýn çalýþmasý için Java.util(utilities=faydalanma araç gereç) i seçiyoruz
		
		Scanner scan =new Scanner (System.in);//eþitliðin sol tarafý variable oluþturmak için di, sað taraf hesap yapýp variableye atýyoruz
		//() parentez içerisine parametre yazýyorduk, buda system.in
		//in ne demekti= dýþardan bir deðer almaktý
		//import ettik, java kütüphanesi açýldý bize
		
		//2. adým kullanýcýya ne istediðimizi belirtmektir
		System.out.print("lütfen isminizi giriniz :");
		//burda da out kelimesi önemli
		
		//3. adým,, bir variable oluþturup kullanýcýnýn girdiði deðeri ataömalýyýz
		
		String name=scan.nextLine();
		
		
		//þimdi soy isim alacaðýz tekrar scanner oluþturmaya gerek yok
		
		System.out.print("lütfen soyadýnýzý giriniz :");
		String surname=scan.nextLine();
		
		//þimdi çýktý alalým
		
		//eðer yazdýracaðýmýz bir yazý sabit ise "" çift týrnak
		//eðer bir variable atanmýþ deðer varsa variableyi yazmak yeterli
		
		
		System.out.println("isminiz :" + name);
		System.out.println("soyisminiz : " + surname);
		System.out.println("kursa kaydýnýz alýnmýþtýr...");
		
//		lütfen isminizi giriniz : mehmet 
//		lütfen soyadýnýzý giriniz : tunçbilek
//		isminiz : mehmet 
//		soyisminiz :  tunçbilek
//		kursa kaydýnýz alýnmýþtýr...
		
	scan.close();
		
		

	}

}
