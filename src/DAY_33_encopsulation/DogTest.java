package DAY_33_encopsulation;

public class DogTest {

	public static void main(String[] args) {
	
		
		Dog kangal = new Dog();
		
		kangal.isimVer("Kangal");
		kangal.cinsVer("al");
		kangal.yas(4);
		kangal.renkGir("gri");

		System.out.println(kangal.isimAl());
		System.out.println(kangal.cinsAl());
		System.out.println(kangal.yasAl());
		System.out.println(kangal.renkAl());
//		uygun olmayan cins giri�i yap�ld�, varsay�lan olarak cins ismi t�r atand�
//		Kangal
//		t�r
//		4
//		gri

		System.out.println("********************");
		System.out.println("pitbulun �zellikleri");
		Dog pitbul = new Dog();
		
		pitbul.isimVer("Pitbul");
		pitbul.cinsVer("Amerikan tyler");
		pitbul.yas(5);
		pitbul.renkGir("k�rm�z�");
		pitbul.fiyatVer(4999);
		
		System.out.println(pitbul.isimAl());
		System.out.println(pitbul.cinsAl());
		System.out.println(pitbul.yasAl());
		System.out.println(pitbul.renkAl());
		System.out.println(pitbul.fiyatAl());
		
//		pitbulun �zellikleri
//		Pitbul
//		Amerikan tyler
//		5
//		k�rm�z�
//		4999
	
		System.out.println("**********************");
		System.out.println("finonun �zellikleri");
		Dog fino = new Dog("Fino", "K���k", 5, "K�rm�z�");
		
		System.out.println(fino.isimAl());
		System.out.println(fino.cinsAl());
		System.out.println(fino.yasAl());
		System.out.println(fino.renkAl());
//		finonun �zellikleri
//		Fino
//		K���k
//		5
//		K�rm�z�
		
		System.out.println("****************************");
		Dog sus = new Dog("S�s k�pe�i", "Ev K�pe�i", 4, "Pembe");
		
		System.out.println(sus.isimAl());
		System.out.println(sus.cinsAl());
		System.out.println(sus.yasAl());
		System.out.println(sus.renkAl());
//		S�s k�pe�i
//		Ev K�pe�i
//		4
//		Pembe

		
		
		
		
	}

}
