package DAY_22_consractor;

public class DogTest01 {

	public static void main(String[] args) {
		
		
		//nesneler new anahtar kelimesiyle oluþturuluyor
		//deðerler main de verilir , main de yazdýrýlýr
		
		Dog köpek = new Dog();//türümüz dog deðiþken adý köpek, köpek sýnýfýnýn özelliklerini yazacaðýz
		
		köpek.cins="Çoban Köpeði ";
		köpek.cinsiyet="Erkek";
		köpek.ulke="Türkiye";
		köpek.sehir="Sivas";
		köpek.renk="Beyaz";
		köpek.yas=2021-5;
		köpek.fiyat=2500;
		
		
		System.out.println(köpek.cins);
		System.out.println(köpek.cinsiyet);
		System.out.println(köpek.ulke);
		System.out.println(köpek.sehir);
		System.out.println(köpek.renk);
		System.out.println("Dopym yýlý:" +köpek.yas);
		System.out.println(köpek.fiyat);
//		Çoban Köpeði 
//		Erkek
//		Türkiye
//		Sivas
//		Beyaz
//		Dopym yýlý:2016
//		2500
		
		System.out.println("****************************");
		
		//köpeklerin cinsleri ayný mý oluyor hayýr farklý özelliklerde köpeklerde yazalým
		
		Dog köpek2 = new Dog();//türümüz dog deðiþken adý köpek2, köpek sýnýfýnýn özelliklerini yazacaðýz
		
		köpek2.cins="Pitbul Staffordshire Bullterrier";
		köpek2.cinsiyet="Diþi";
		köpek2.renk="Kýrmýzý";
		köpek2.ulke="Amerika";
		köpek2.fiyat=5000;
		köpek2.yas=5;
		
		System.out.println(köpek2.cins);
		System.out.println(köpek2.cinsiyet);
		System.out.println(köpek2.renk);
		System.out.println(köpek2.ulke);
		System.out.println(köpek2.fiyat);
		System.out.println(köpek2.yas);
//		Pitbul Staffordshire Bullterrier
//		Diþi
//		Kýrmýzý
//		Amerika
//		5000
//		5
//		
		
		
		
		
		
		
		
		
	}

}
