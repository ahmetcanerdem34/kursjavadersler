package DAY_33_encopsulation;

public class Kus {
	
	public static String ulke;//bu kýsmý bu class da string constructor ý oluþturarak diðers sýnýfta get set yapmadan ekleyerek kullanabildik
	
	private String coðrafya;
	private String isim;
	private String cins;
	private int yas;
	private String renk;
	private int fiyat;
	

	public Kus(String isim, String cins, int yas,String renk,int fiyat,String coðrafya) {
		
		this.isim=isim;
		this.cins=cins;
		this.yas=yas;
		this.renk=renk;
		this.fiyat=fiyat;
		this.coðrafya=coðrafya;
	
		
		
	}


	public Kus(String ulke) {
		
		//burda public olarak oluþturduðum deðiþkeni sonraki class da parantez için sadece onu yazarak set get dýþýnda kullanabildim
		
		
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


	public String getCoðrafya() {
		return coðrafya;
	}


	public void setCoðrafya(String coðrafya) {
		this.coðrafya = coðrafya;
	}
	
	
	
}
