package DAY_14_metodCreation;

public class C3_MetodCreation3 {

	public static void main(String[] args) {
		
		
	//verilen 3 double sayýnýn ortalamasýn alan bi metod yazýn main metod içinden çaðýrarak metodu çalýþtýrýn
		
		//java yukardan aþaðý çalýþýrken parantezi görünce metodla karþýlaþtýðýný anlayacak ve içeriðini sorgulayacak
		//argumentle aþaðýdaki data tipinin parametrelerine bakar aþaðýda double içleri
		
		
		ortalama(80,60,55);//integeri de kabul eder double daha büyük kutu, problem yapmaz
		//girdiðiniz 3 sayýýn ortalamsý =65.0 --->çalýþtý sonuç
		
		ortalama(80,60);

	} //Main Metodu sonu
	
	public static void ortalama(double sayi1, double sayi2, double sayi3) {
		//bunlarý ýnt te yapsam çalýþýr çünkü yukardakiler int deðer
		
		//ama girilen notlar . noktalý ise yanlýþ sonuç verebilir, 
		//onun için en iyisi double olmasý
		
		
		System.out.println("girdiðiniz 3 sayýýn ortalamsý =" +(sayi1+ sayi2 + sayi3)/3);
		//bu metodun çalýþmasý için yukarda metod caall yapalýyým
		//metod call u main metodu içerisinde olamlýki motor main metodu olduðundan orasý çalýþtýracak
		
	}
	
			public static void ortalama(double sayi1, double sayi2) {
		
			System.out.println("girdiðiniz 2 sayýnýn ortalamasý :" + (sayi1 +sayi2)/2);
		
				// bu metodumuz üsttekiyle ayný ama java sorun vermedi, çünkü 3 deðerli
			//ama java hangisini önce çalýþtýrýr parametresi fazla olaný yukarda 3 deðer var oradaki metodu çalýþtýrý
			//2 tane yani 80, 70 olsaydý buradaki  metodu çalýþtýrýdý
	}


}//class sonu
