package DAY_22_consractor;

public class Dog1Test {

	public static void main(String[] args) {
		
		
		Dog1 k�pek1= new Dog1("Kangal","�oban K�pe�i","K�rm�z�","Erkek", 3,"T�rkiye","Sivas",4000);//constructor
		
		System.out.println("Kangal�n �zellkleri");
		
		System.out.println("Ad� :" +k�pek1.ad);
		System.out.println("Cinsi :" +k�pek1.cins);
		System.out.println("Fiyat� :" +k�pek1.fiyat);
		System.out.println("�lkesi :" +k�pek1.ulke);
		System.out.println("�ehri :" +k�pek1.sehir);
		System.out.println("Do�um Y�l� :" +k�pek1.yas);
		System.out.println("Cinsiyeti :" +k�pek1.cinsiyet);
		System.out.println("Rengi :" +k�pek1.renk);
//		Kangal�n �zellkleri
//		Ad� :Kangal
//		Cinsi :�oban K�pe�i
//		Fiyat� :4000
//		�lkesi :T�rkiye
//		�ehri :Sivas
//		Do�um Y�l� :3
//		Cinsiyeti :Erkek
//		Rengi :K�rm�z�
		
		System.out.println("****************");
		System.out.println("Pitbull un �zellkleri");
		Dog1 k�pek2 = new Dog1("Pitbul", "Staffordshire Bullterrier", "Gri","Di�i", 5,"Amerika","NEW YORK", 3000);
		System.out.println("Pitbulun �zellikleri");
		System.out.println("Ad� :" +k�pek2.ad);
		System.out.println("Cinsi :" +k�pek2.cins);
		System.out.println("Fiyat� :" +k�pek2.fiyat);
		System.out.println("�lkesi :" +k�pek2.ulke);
		System.out.println("�ehri :" +k�pek2.sehir);
		System.out.println("Do�um Y�l� :" +k�pek2.yas);
		System.out.println("Cinsiyeti :" +k�pek2.cinsiyet);
		System.out.println("Rengi :" +k�pek2.renk);
//		Ad� :Pitbul
//		Cinsi :Staffordshire Bullterrier
//		Fiyat� :3000
//		�lkesi :Amerika
//		�ehri :NEW YORK
//		Do�um Y�l� :5
//		Cinsiyeti :Di�i
//		Rengi :Gri
		
		System.out.println("****************");
		System.out.println("Finonun �zellkleri");
		Dog1 k�pek3 = new Dog1("Fino", "Kahverengi", 5, 3500);
		
		System.out.println(k�pek3.ad);
		System.out.println(k�pek3.renk);
		System.out.println(k�pek3.yas);
		System.out.println(k�pek3.fiyat);
//		Finonun �zellkleri
//		Fino
//		Kahverengi
//		5
//		3500
		
		System.out.println("************************");
		System.out.println("Taz�n�n �zellikleri");
		Dog1 taz� = new Dog1("Taz�", "Kurt yiyen");
		
		System.out.println(taz�.ad);
		System.out.println(taz�.cins);
		System.out.println(taz�.yas);//Dog1 class�nda olu�turmu� oldu�umuz costruct�rda de�er atamas� yapmad���m�z i�in 
									   //int yas, java taraf�ndan 0 de�eri verilerek yazd��rl�r
		taz�.renk="K�rm�z�";
		taz�.fiyat=5;
		taz�.cinsiyet="Erkek";
		
		System.out.println(taz�.renk);
		System.out.println(taz�.fiyat);
		System.out.println(taz�.cinsiyet);
//		Taz�n�n �zellikleri
//		Taz�
//		Kurt yiyen
//		0
//		K�rm�z�
//		5
//		Erkek


		
		
		
		
		
	}

}
