package DAY_34;

public class Animal {//animal de methodlarý oluþturalým
	
	public Animal(){ 
		System.out.println("Animal parametresiz");
		
	}
	
	public void hareket() {//static olamdýðý için bunlar static deðil instanc emethodlar
		//ÖNEMLÝ parent class kendi clasýndaki methodlarý kullanýrken, çocuk clasýndaki methodlarý kullanamýyor, gerçek hayatta da böyledir
		//oðlan babasýnýn eþyalarýný kullanýr, baba oðlununkileri kullanmaz
		System.out.println("hareket eder");
		
		
	}
	public void yeme() {
		System.out.println("yemek yerler");
		
		
	}
	public void icme() {
		System.out.println("Su içerler");
		
	}

}
