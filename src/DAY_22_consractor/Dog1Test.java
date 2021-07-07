package DAY_22_consractor;

public class Dog1Test {

	public static void main(String[] args) {
		
		
		Dog1 köpek1= new Dog1("Kangal","Çoban Köpeði","Kýrmýzý","Erkek", 3,"Türkiye","Sivas",4000);//constructor
		
		System.out.println("Kangalýn özellkleri");
		
		System.out.println("Adý :" +köpek1.ad);
		System.out.println("Cinsi :" +köpek1.cins);
		System.out.println("Fiyatý :" +köpek1.fiyat);
		System.out.println("Ülkesi :" +köpek1.ulke);
		System.out.println("Þehri :" +köpek1.sehir);
		System.out.println("Doðum Yýlý :" +köpek1.yas);
		System.out.println("Cinsiyeti :" +köpek1.cinsiyet);
		System.out.println("Rengi :" +köpek1.renk);
//		Kangalýn özellkleri
//		Adý :Kangal
//		Cinsi :Çoban Köpeði
//		Fiyatý :4000
//		Ülkesi :Türkiye
//		Þehri :Sivas
//		Doðum Yýlý :3
//		Cinsiyeti :Erkek
//		Rengi :Kýrmýzý
		
		System.out.println("****************");
		System.out.println("Pitbull un özellkleri");
		Dog1 köpek2 = new Dog1("Pitbul", "Staffordshire Bullterrier", "Gri","Diþi", 5,"Amerika","NEW YORK", 3000);
		System.out.println("Pitbulun Özellikleri");
		System.out.println("Adý :" +köpek2.ad);
		System.out.println("Cinsi :" +köpek2.cins);
		System.out.println("Fiyatý :" +köpek2.fiyat);
		System.out.println("Ülkesi :" +köpek2.ulke);
		System.out.println("Þehri :" +köpek2.sehir);
		System.out.println("Doðum Yýlý :" +köpek2.yas);
		System.out.println("Cinsiyeti :" +köpek2.cinsiyet);
		System.out.println("Rengi :" +köpek2.renk);
//		Adý :Pitbul
//		Cinsi :Staffordshire Bullterrier
//		Fiyatý :3000
//		Ülkesi :Amerika
//		Þehri :NEW YORK
//		Doðum Yýlý :5
//		Cinsiyeti :Diþi
//		Rengi :Gri
		
		System.out.println("****************");
		System.out.println("Finonun özellkleri");
		Dog1 köpek3 = new Dog1("Fino", "Kahverengi", 5, 3500);
		
		System.out.println(köpek3.ad);
		System.out.println(köpek3.renk);
		System.out.println(köpek3.yas);
		System.out.println(köpek3.fiyat);
//		Finonun özellkleri
//		Fino
//		Kahverengi
//		5
//		3500
		
		System.out.println("************************");
		System.out.println("Tazýnýn özellikleri");
		Dog1 tazý = new Dog1("Tazý", "Kurt yiyen");
		
		System.out.println(tazý.ad);
		System.out.println(tazý.cins);
		System.out.println(tazý.yas);//Dog1 classýnda oluþturmuþ olduðumuz costructýrda deðer atamasý yapmadýðýmýz için 
									   //int yas, java tarafýndan 0 deðeri verilerek yazdýýrlýr
		tazý.renk="Kýrmýzý";
		tazý.fiyat=5;
		tazý.cinsiyet="Erkek";
		
		System.out.println(tazý.renk);
		System.out.println(tazý.fiyat);
		System.out.println(tazý.cinsiyet);
//		Tazýnýn özellikleri
//		Tazý
//		Kurt yiyen
//		0
//		Kýrmýzý
//		5
//		Erkek


		
		
		
		
		
	}

}
