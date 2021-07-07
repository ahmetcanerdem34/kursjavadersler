package Mentoring;

public class OgrenciOlusturma {
	
	private int ogrNum;
	private String ogrAd;
    private String ogrSoyad;
    private double ogrOrtalama;
    
    	
    public OgrenciOlusturma() {
   
    }
	public int getOgrNum() {
		return ogrNum;
	}
	public void setOgrNum(int ogrNum) {
		this.ogrNum = ogrNum;
	}
	public String getOgrAd() {
		return ogrAd;
	}
	public void setOgrAd(String ogrAd) {
		this.ogrAd = ogrAd;
	}
	public String getOgrSoyad() {
		return ogrSoyad;
	}
	public void setOgrSoyad(String ogrSoyad) {
		this.ogrSoyad = ogrSoyad;
	}
	public double getOgrOrtalama() {
		return ogrOrtalama;
	}
	public void setOgrOrtalama(double ogrOrtalama) {
		this.ogrOrtalama = ogrOrtalama;
	}
	public OgrenciOlusturma(int ogrNum, String ogrAd, String ogrSoyad, double ogrOrtalama) {
		super();
		this.ogrNum = ogrNum;
		this.ogrAd = ogrAd;
		this.ogrSoyad = ogrSoyad;
		this.ogrOrtalama = ogrOrtalama;
	}

}
