package DAY_22_consractor;

public class Otomobil {

	
	public Otomobil (String renk){//class ismi parantez body= ba��nda public yazal�m
		// istersek constructor � parametreli olu�turabiliriz(String renk)
		
		
		
	}
	//biz bir constructor olu�turdu�umuzda java default u siler yokeder
	//dolay�s�yla biz bir constructor olu�turdu�umuzda mutlaka default constructur �n yerinede 1 constructor yazmal�y�z
		
	public Otomobil() {//default constructor un yerine bunu yazmal�y�z
		
		
	}
	
	//�NEML� NOT: default constructor dan ba�ka bir constructor yazd���n�zda 
	//java default olan� yok etti�i i�in MUTLAKA biz default yerine de constructor yazmal�y�z
	
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


