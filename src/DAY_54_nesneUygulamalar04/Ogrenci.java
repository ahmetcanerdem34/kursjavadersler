package DAY_54_nesneUygulamalar04;

import java.util.ArrayList;

public class Ogrenci {
	
	private String isim;
	
	private String soy�sim;
	
	private int dogumYili;
	
	private String okulNumaras�;
	
	private ArrayList<String> dersler;
	
	public Ogrenci() {
		
	}

	public Ogrenci(String isim, String soy�sim, int dogumYili, String okulNumaras�, ArrayList<String> dersler) {
	
		this.isim = isim;
		this.soy�sim = soy�sim;
		this.dogumYili = dogumYili;
		this.okulNumaras� = okulNumaras�;
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

	public String getSoy�sim() {
		return soy�sim;
	}

	public void setSoy�sim(String soy�sim) {
		this.soy�sim = soy�sim;
	}

	public int getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}

	public String getOkulNumaras�() {
		return okulNumaras�;
	}

	public void setOkulNumaras�(String okulNumaras�) {
		this.okulNumaras� = okulNumaras�;
	}

	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", soy�sim=" + soy�sim + ", dogumYili=" + dogumYili + ", okulNumaras�="
				+ okulNumaras� + ", dersler=" + dersler + "]";
	}
	
	
	
}
	