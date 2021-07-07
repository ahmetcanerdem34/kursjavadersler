package DAY_33_encopsulation;

public class At {

	private String isim;
	private String cins;
	private String renk;
	private int yas;
	private int fiyat;

	public void setİsim(String i) {
		isim = i;
	}

	public String getİsim() {
		return isim;
	}

	public void setCins(String c) {
		cins = c;
	}

	public String getCins() {
		return cins;
	}

	public void setRenk(String r) {
		renk = r;
	}

	public String getRenk() {
		return renk;
	}

	public void setYas(int y) {
		yas = y;
	}

	public int getYas() {
		return yas;
	}
	public void setFiyat(int f) {
		fiyat=f;
	}
	public int getFiyat() {
		return fiyat;
	}

}
