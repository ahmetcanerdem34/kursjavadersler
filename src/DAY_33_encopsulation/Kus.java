package DAY_33_encopsulation;

public class Kus {
	
	public static String ulke;//bu k�sm� bu class da string constructor � olu�turarak di�ers s�n�fta get set yapmadan ekleyerek kullanabildik
	
	private String co�rafya;
	private String isim;
	private String cins;
	private int yas;
	private String renk;
	private int fiyat;
	

	public Kus(String isim, String cins, int yas,String renk,int fiyat,String co�rafya) {
		
		this.isim=isim;
		this.cins=cins;
		this.yas=yas;
		this.renk=renk;
		this.fiyat=fiyat;
		this.co�rafya=co�rafya;
	
		
		
	}


	public Kus(String ulke) {
		
		//burda public olarak olu�turdu�um de�i�keni sonraki class da parantez i�in sadece onu yazarak set get d���nda kullanabildim
		
		
	}


	public Kus() {
		// TODO Auto-generated constructor stub
	}


	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public String getCins() {
		return cins;
	}


	public void setCins(String cins) {
		this.cins = cins;
	}


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}


	public String getRenk() {
		return renk;
	}


	public void setRenk(String renk) {
		this.renk = renk;
	}


	public int getFiyat() {
		return fiyat;
	}


	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}


	public String getCo�rafya() {
		return co�rafya;
	}


	public void setCo�rafya(String co�rafya) {
		this.co�rafya = co�rafya;
	}
	
	
	
}
