package DAY_34;

public class Encapsulation {

	private String okulİsmi="Yıldız Koleji";
	private int okulHesapNo=12345;
	private boolean okulAcikMi=true;
	
	
	public String getokulİsmi() {
		return okulİsmi;
	}
	public int getokulHesapNo() {
		return okulHesapNo;
		
		
	}
	public boolean isokulAcikMi() {
		return okulAcikMi;
		
		
	}
	public void setokulİsmi(String okulİsmi) {
		this.okulİsmi=okulİsmi;//bir sonraki derste bu kısımda yeni bir okul ismi oluştruduğumuz için 
		//burası this olacak ve parametre olarak da String okulİsmi diye yeni bir değişken oluşturuyoruz 
	
	}
	public void okulHesapNo(int okulHesapNo) {
		this.okulHesapNo=okulHesapNo;
	}
	public void isokulAcikMi(boolean okulAcikMi) {
		this.okulAcikMi=okulAcikMi;
}
}