package DAY_22_consractor;

public class Araba {

	//arabanýn deðiþken özellikleri
	//burada arabayý tasarladýk
	//hangi özelliklere sahip olduðunu yazdýk
	
	//main olan kýsýmda  bu özelliklere sahip arba oluþturduk
	//heryerde bu arab  nýn özelliklerini kullanbilirsiniz
	String marka;
	
	String model;
	
	int year;
	
	String renk;
	
	//yeni bir ara-ba clasý oluþturacaðýz yani nesne
	
	
	//onun için yeni bir class açalým
	
	public Araba() {
		
		
		
	}
	
	public Araba(String m, String mo) {
		
		marka=m;
		model=mo;
		
		
		
	}
	
	
	//consructor(ypýlandýrýcý oluþturdum, baþka ayfalarda kullanabilirim
		public Araba(String m, String mo, int y, String r) {
			
			marka=m;
			model=mo;
			year=y;
			renk=r;
			
			//bunlarý gidip arabates2 sýnýýfnda yazdýrabiliriz
			
			System.out.println("Merhaba");
			//Merhaba
		}
}
