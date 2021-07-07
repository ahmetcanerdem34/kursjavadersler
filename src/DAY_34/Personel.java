package DAY_34;

public class Personel {
	//main methoduna gerek yok
	//ayný pakette isek publikc yapmayýz ama geneli düþünürsek yapmalýyýz, farklý pakýçlardan kullanmak için
	
	public String isim;//isim atamayada gerek yok biz objeler oluþturup deðer atayacaðýz zaten
	public String soyÝisim;
	public String adres;
	public int Id;
	public boolean izindeMi;
	
		
		//PRÝVATE datalar inherit edilemez ÖNEMLÝ
		
		/*
         * Java'da inheritance, bir objenin-class'in baska bir obje,
 tum ozelliklerini ve davranislarini elde ettigi mekanizmadir.
         * (Ozellik variable,davranislar method)
         * Inheritance, OOP'lerin onemli bir parcasidir.
         * Java'da inheritance'in arkasindaki fikir daha once'den olusturulmus Class'larin uzerine 
         * yeni Class'lar olusturabilmemizdir.
         * Inheritance sayesinde yeni olusturdugumuz bir class'in var olan bir class'in 
         * tum methodlarini ve variable'larini kullanmasini saglaybiliriz
         * Inheritance bu islemin adidir. 
         * Inheritance sayesinde child class,parent class'daki public veya protected primitive datalari,objectleri
         * veya methodlari problemsiz bir sekilde kullanabilir.
         */
		/*
         * Java'da inheritance, bir objenin-class'in baska bir obje,class'in tum ozelliklerini ve davranislarini elde ettigi mekanizmadir.
         * (Ozellik variable,davranislar method)
         * Inheritance, OOP'lerin onemli bir parcasidir.
         * Java'da inheritance'in arkasindaki fikir daha once'den olusturulmus Class'larin uzerine yeni Class'lar olusturabilmemizdir.
         * Inheritance sayesinde yeni olusturdugumuz bir class'in var olan bir class'in tum methodlarini ve variable'larini kullanmasini saglaybiliriz
         * Inheritance bu islemin adidir. Inheritance sayesinde child class,parent class'daki public veya protected primitive datalari,objectleri
         * veya methodlari problemsiz bir sekilde kullanabilir.
         * Inheritance sayesinde yazilan bir code'un tekrar tekrar kullanilabilmesi(reusability) mumkun olur.
         * Geneli kapsayan class uyeleri parent class'a, daha spesifik olanlar ise child class'larda olusturulur.
         * Not : Child classlar public ve protected data’lari problemsiz bir sekilde inherit edebilir.
         * Not : Private data’lar inherit edilemez.
         * Not : Default data’lar child ve parent ayni package’da olduklari zaman inherit edilebilirler.
         * Not : Static Methods veya variable’lar inherit edilemezler.
         * 
         * *************************INTERVIEW SORUSU**************************
         * Neden inheritance kullaniyoruz ?
         * Inheritance sayesinde parent olarak tanimlanan class(ve onun parentclass’larindaki) 
         * protected/public class uyelerini kullanabiliriz(reusability).
         * 
         * Inheritance faydalari nelerdir ? 
         * 1) Tekrarlardan kurtuluruz.
         * 2) Daha az kod yazarak islemlerimizi yapabiliriz.
         * 3) Kolayca update yapabiliriz
         * 4) Application'in bakimi ve surdurulmesi(maintenance) kolaylasir.
         */

	

}
