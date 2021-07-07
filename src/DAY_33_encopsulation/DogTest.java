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
//		uygun olmayan cins giriþi yapýldý, varsayýlan olarak cins ismi tür atandý
//		Kangal
//		tür
//		4
//		gri

		System.out.println("********************");
		System.out.println("pitbulun özellikleri");
		Dog pitbul = new Dog();
		
		pitbul.isimVer("Pitbul");
		pitbul.cinsVer("Amerikan tyler");
		pitbul.yas(5);
		pitbul.renkGir("kýrmýzý");
		pitbul.fiyatVer(4999);
		
		System.out.println(pitbul.isimAl());
		System.out.println(pitbul.cinsAl());
		System.out.println(pitbul.yasAl());
		System.out.println(pitbul.renkAl());
		System.out.println(pitbul.fiyatAl());
		
//		pitbulun özellikleri
//		Pitbul
//		Amerikan tyler
//		5
//		kýrmýzý
//		4999
	
		System.out.println("**********************");
		System.out.println("finonun özellikleri");
		Dog fino = new Dog("Fino", "Küçük", 5, "Kýrmýzý");
		
		System.out.println(fino.isimAl());
		System.out.println(fino.cinsAl());
		System.out.println(fino.yasAl());
		System.out.println(fino.renkAl());
//		finonun özellikleri
//		Fino
//		Küçük
//		5
//		Kýrmýzý
		
		System.out.println("****************************");
		Dog sus = new Dog("Süs köpeði", "Ev Köpeði", 4, "Pembe");
		
		System.out.println(sus.isimAl());
		System.out.println(sus.cinsAl());
		System.out.println(sus.yasAl());
		System.out.println(sus.renkAl());
//		Süs köpeði
//		Ev Köpeði
//		4
//		Pembe

		
		
		
		
	}

}
