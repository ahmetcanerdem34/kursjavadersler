package DAY_34;

public class Encapsulation {

	private String okul�smi="Y�ld�z Koleji";
	private int okulHesapNo=12345;
	private boolean okulAcikMi=true;
	
	
	public String getokul�smi() {
		return okul�smi;
	}
	public int getokulHesapNo() {
		return okulHesapNo;
		
		
	}
	public boolean isokulAcikMi() {
		return okulAcikMi;
		
		
	}
	public void setokul�smi(String okul�smi) {
		this.okul�smi=okul�smi;//bir sonraki derste bu k�s�mda yeni bir okul ismi olu�trudu�umuz i�in 
		//buras� this olacak ve parametre olarak da String okul�smi diye yeni bir de�i�ken olu�turuyoruz 
	
	}
	public void okulHesapNo(int okulHesapNo) {
		this.okulHesapNo=okulHesapNo;
	}
	public void isokulAcikMi(boolean okulAcikMi) {
		this.okulAcikMi=okulAcikMi;
}
}