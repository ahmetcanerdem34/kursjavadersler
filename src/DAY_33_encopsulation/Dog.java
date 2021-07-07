package DAY_33_encopsulation;

public class Dog {

	private String isim;

	private String cins;

	private int yas;

	private String renk;
	public int fiyat;

//yukardaki eriþim belirteçleri praivte dýþýnda olsaydýi kiþilerin kullanýmýna açýk olup 
	// istedikleri þekilde constructýr yazarak kullanbilirlerdi
//bizde burdan istediklerimizi private yaparak kiþiler kullandýklarý zaman method oluþturarak 
	// istedikleri þekilde kullanmalrýný engellmiþ olduk

	public Dog() {// parametresiz dog constructýr

	}

	public Dog(String i, String c, int y, String r) {// burada public olan bir durumda constructýr çok rahat
														// kulanýlýyor,
		// aþaðýda ise istenildiði þekilde kullanýlmasýn diye private yapýlýp method la
		// iþlemler yönlendiriiyor

		isim = i;
		cins = c;
		yas = y;
		renk = r;
	}

	public String isimAl() {
		return isim;

	}

	public String cinsAl() {

		return cins;
	}

	public int yasAl() {

		return yas;
	}

	public String renkAl() {
		return renk;
	}
	public int fiyatAl() {
		return fiyat;
		
	}

	public void isimVer(String i) {

		if (i.length() < 3) {
			isim = "isim";
			System.out.println("uygun olmayan isim giriþi yapýldý, varsayýlan olarak köpek ismi isim atandý");

		} else {// isim 3 harften küçük deðilse kullanýcýnýn i ye girdiði normal deðer atanýr
			isim = i;

		}

	}

	public void cinsVer(String c) {

		if (c.length() < 3) {
			cins = "tür";
			System.out.println("uygun olmayan cins giriþi yapýldý, varsayýlan olarak cins ismi tür atandý");

		} else {// isim 3 harften küçük deðilse kullanýcýnýn i ye girdiði normal deðer atanýr
			cins = c;

		}
	}

	public void yas(int y) {

		if (y <= 0 || y >= 20) {
			y = 0;
			System.out.println("uygun olmayan yaþ giriþi yapýldý, varsayýlan olarak 0 atandý");

		} else {// isim 3 harften küçük deðilse kullanýcýnýn i ye girdiði normal deðer atanýr
			yas = y;

		}
	}

	public void renkGir(String r) {

		if (r.length() < 2 && r.length() > 7) {
			renk = "beyaz";
			System.out.println("uygun olmayan renk harf sayýsý giriþi yapýldý, varsayýlan olarak beyaz atandý");

		} else {// isim 3 harften küçük deðilse kullanýcýnýn i ye girdiði normal deðer atanýr
			renk = r;
		}
		
	
	}
	public void fiyatVer(int f) {
		
		if(f>5000) {
			
			System.out.println("girmiþ olduðunuz miktar kabul görmeye bilir");
		}else {
			
			fiyat=f;
		}
		
		
	}
}
