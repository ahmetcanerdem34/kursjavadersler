package DAY_22_consractor;

public class Otomobil {

	
	public Otomobil (String renk){//class ismi parantez body= baþýnda public yazalým
		// istersek constructor ý parametreli oluþturabiliriz(String renk)
		
		
		
	}
	//biz bir constructor oluþturduðumuzda java default u siler yokeder
	//dolayýsýyla biz bir constructor oluþturduðumuzda mutlaka default constructur ýn yerinede 1 constructor yazmalýyýz
		
	public Otomobil() {//default constructor un yerine bunu yazmalýyýz
		
		
	}
	
	//ÖNEMLÝ NOT: default constructor dan baþka bir constructor yazdýðýnýzda 
	//java default olaný yok ettiði için MUTLAKA biz default yerine de constructor yazmalýyýz
	
		String marka;
	    String model;
	    int yil;
	    boolean kazasiVarMi;
	
	    public void yakit(String yakit) { // method
	        System.out.println("Araba yakit olarak " + yakit  + " kullanir");
	    }
	    
	    public void vites(String vites) { // method
	        System.out.println("Araba " + vites + " viteslidir");
	    }
	

	}


