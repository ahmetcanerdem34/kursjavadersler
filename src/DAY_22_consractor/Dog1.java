package DAY_22_consractor;

public class Dog1 {
	
	public String ad;
	public String cins;
	public String renk;
	public String cinsiyet;
	public int yas;
	public String ulke;
	public String sehir;
	public int fiyat;

	
	
		
	public Dog1(String a,String c) {

		ad=a;
		cins=c;
		
		
	}
	
	
	public Dog1(String a, String c, String r,String ci,int y,String u,String s,int f) {
		
	 ad=a;
	 cins=c;
	 renk=r;
	 cinsiyet=ci;
	 yas=y;
	 ulke=u;
	 sehir=s;
	 fiyat=f;
		
	}
	
	public Dog1(String a,String r,int y, int f) {
		
		
		ad=a;
		renk=r;
		yas=y;
		fiyat=f;
	}

}
