package DAY_33_encopsulation;

public class Dog {

	private String isim;

	private String cins;

	private int yas;

	private String renk;
	public int fiyat;

//yukardaki eri�im belirte�leri praivte d���nda olsayd�i ki�ilerin kullan�m�na a��k olup 
	// istedikleri �ekilde construct�r yazarak kullanbilirlerdi
//bizde burdan istediklerimizi private yaparak ki�iler kulland�klar� zaman method olu�turarak 
	// istedikleri �ekilde kullanmalr�n� engellmi� olduk

	public Dog() {// parametresiz dog construct�r

	}

	public Dog(String i, String c, int y, String r) {// burada public olan bir durumda construct�r �ok rahat
														// kulan�l�yor,
		// a�a��da ise istenildi�i �ekilde kullan�lmas�n diye private yap�l�p method la
		// i�lemler y�nlendiriiyor

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
			System.out.println("uygun olmayan isim giri�i yap�ld�, varsay�lan olarak k�pek ismi isim atand�");

		} else {// isim 3 harften k���k de�ilse kullan�c�n�n i ye girdi�i normal de�er atan�r
			isim = i;

		}

	}

	public void cinsVer(String c) {

		if (c.length() < 3) {
			cins = "t�r";
			System.out.println("uygun olmayan cins giri�i yap�ld�, varsay�lan olarak cins ismi t�r atand�");

		} else {// isim 3 harften k���k de�ilse kullan�c�n�n i ye girdi�i normal de�er atan�r
			cins = c;

		}
	}

	public void yas(int y) {

		if (y <= 0 || y >= 20) {
			y = 0;
			System.out.println("uygun olmayan ya� giri�i yap�ld�, varsay�lan olarak 0 atand�");

		} else {// isim 3 harften k���k de�ilse kullan�c�n�n i ye girdi�i normal de�er atan�r
			yas = y;

		}
	}

	public void renkGir(String r) {

		if (r.length() < 2 && r.length() > 7) {
			renk = "beyaz";
			System.out.println("uygun olmayan renk harf say�s� giri�i yap�ld�, varsay�lan olarak beyaz atand�");

		} else {// isim 3 harften k���k de�ilse kullan�c�n�n i ye girdi�i normal de�er atan�r
			renk = r;
		}
		
	
	}
	public void fiyatVer(int f) {
		
		if(f>5000) {
			
			System.out.println("girmi� oldu�unuz miktar kabul g�rmeye bilir");
		}else {
			
			fiyat=f;
		}
		
		
	}
}
