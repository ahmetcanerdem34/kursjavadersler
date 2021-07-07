package DAY_33_encopsulation;

public class Encapsulation02 {
	
	private String okulÝsmi="Yýldýz Koleji";
	//okul ismini baþka claslardan okunmasýný ama deðer atanamamasýný istiyorsak getter methodu oluþturuyoruz, sadece ismi getirir
	
					//obje oluþturularak deðer atanýp kullanýlmsýný istediðimiz ama 
	//ilk atadýðýmý z deðerin görülmemesini istiyorsa o zaman setter methodu kullanýrýz
	private String tcNo="12345678901";//sayýlardan oluþsada matematik iþlem yapmayacaðýnýz þeyleri string üzerinden yazabiliriz
									//int flout filan olsa tc f li filan yazar 
    private int hesapNo=5554321;
    
    public int sayi=100;
    
    
	public static void main(String[] args) {
		
		//eðer ulþamk iistediðim class üyeleri (class member) public deðilse 
		//baþka package lerden ulaþmak için ekstra iþlem yapmamýz gerekir.
		
		//usteki bu 2 cumle çok önemlii,
		
		//yapabileceðimiz iþlemlerden 1. si encapsulation dir, yani kapsulleme(data hiding) data saklama
		//bu class da kimseyle paylaþmak istemediðimiz variable ve methodlar oluþturalým
		
		//private yapýnca güvenlik konusunu halletmiþ olduk
		//ancak yeni bir problem le karþýkarþýyayýz nedir o
		//class üüyelerinin private olmasý OOP concepte aykýrý---<herþey özel olursa nasýl OOP yi kullanacaðýz NASIL OLACAK??
		
		//Encapsulation classýmýzda oluþturduðumuz class uyelerine kimlerin ulaþabileceðini belirlemek için yapýlýr
		

	}
	private void denemeMethod()
	{
		
		System.out.println("deneme methodu çalýþtý");
	}
	public String getOkulÝsmi() {
		return okulÝsmi;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}
	
}
