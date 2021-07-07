package DAY_54_nesneUygulamalar04;

import java.util.ArrayList;

public class Ogrenci {
	
	private String isim;
	
	private String soyİsim;
	
	private int dogumYili;
	
	private String okulNumarası;
	
	private ArrayList<String> dersler;
	
	public Ogrenci() {
		
	}

	public Ogrenci(String isim, String soyİsim, int dogumYili, String okulNumarası, ArrayList<String> dersler) {
	
		this.isim = isim;
		this.soyİsim = soyİsim;
		this.dogumYili = dogumYili;
		this.okulNumarası = okulNumarası;
		this.dersler = dersler;
	}
	
	public void setDersler(ArrayList<String> dersler) {
		this.dersler=dersler;
		
	}
	public ArrayList<String> getDersler(){
		return dersler;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyİsim() {
		return soyİsim;
	}

	public void setSoyİsim(String soyİsim) {
		this.soyİsim = soyİsim;
	}

	public int getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}

	public String getOkulNumarası() {
		return okulNumarası;
	}

	public void setOkulNumarası(String okulNumarası) {
		this.okulNumarası = okulNumarası;
	}

	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", soyİsim=" + soyİsim + ", dogumYili=" + dogumYili + ", okulNumarası="
				+ okulNumarası + ", dersler=" + dersler + "]";
	}
	
	
	
}
	