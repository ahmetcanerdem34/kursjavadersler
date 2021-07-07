package DAY_33_encopsulation;

public class Encapsulation02 {
	
	private String okul�smi="Y�ld�z Koleji";
	//okul ismini ba�ka claslardan okunmas�n� ama de�er atanamamas�n� istiyorsak getter methodu olu�turuyoruz, sadece ismi getirir
	
					//obje olu�turularak de�er atan�p kullan�lms�n� istedi�imiz ama 
	//ilk atad���m� z de�erin g�r�lmemesini istiyorsa o zaman setter methodu kullan�r�z
	private String tcNo="12345678901";//say�lardan olu�sada matematik i�lem yapmayaca��n�z �eyleri string �zerinden yazabiliriz
									//int flout filan olsa tc f li filan yazar 
    private int hesapNo=5554321;
    
    public int sayi=100;
    
    
	public static void main(String[] args) {
		
		//e�er ul�amk iistedi�im class �yeleri (class member) public de�ilse 
		//ba�ka package lerden ula�mak i�in ekstra i�lem yapmam�z gerekir.
		
		//usteki bu 2 cumle �ok �nemlii,
		
		//yapabilece�imiz i�lemlerden 1. si encapsulation dir, yani kapsulleme(data hiding) data saklama
		//bu class da kimseyle payla�mak istemedi�imiz variable ve methodlar olu�tural�m
		
		//private yap�nca g�venlik konusunu halletmi� olduk
		//ancak yeni bir problem le kar��kar��yay�z nedir o
		//class ��yelerinin private olmas� OOP concepte ayk�r�---<her�ey �zel olursa nas�l OOP yi kullanaca��z NASIL OLACAK??
		
		//Encapsulation class�m�zda olu�turdu�umuz class uyelerine kimlerin ula�abilece�ini belirlemek i�in yap�l�r
		

	}
	private void denemeMethod()
	{
		
		System.out.println("deneme methodu �al��t�");
	}
	public String getOkul�smi() {
		return okul�smi;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}
	
}
