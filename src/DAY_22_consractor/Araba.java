package DAY_22_consractor;

public class Araba {

	//araban�n de�i�ken �zellikleri
	//burada arabay� tasarlad�k
	//hangi �zelliklere sahip oldu�unu yazd�k
	
	//main olan k�s�mda  bu �zelliklere sahip arba olu�turduk
	//heryerde bu arab  n�n �zelliklerini kullanbilirsiniz
	String marka;
	
	String model;
	
	int year;
	
	String renk;
	
	//yeni bir ara-ba clas� olu�turaca��z yani nesne
	
	
	//onun i�in yeni bir class a�al�m
	
	public Araba() {
		
		
		
	}
	
	public Araba(String m, String mo) {
		
		marka=m;
		model=mo;
		
		
		
	}
	
	
	//consructor(yp�land�r�c� olu�turdum, ba�ka ayfalarda kullanabilirim
		public Araba(String m, String mo, int y, String r) {
			
			marka=m;
			model=mo;
			year=y;
			renk=r;
			
			//bunlar� gidip arabates2 s�n��fnda yazd�rabiliriz
			
			System.out.println("Merhaba");
			//Merhaba
		}
}
