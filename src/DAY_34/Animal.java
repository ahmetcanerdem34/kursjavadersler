package DAY_34;

public class Animal {//animal de methodlar� olu�tural�m
	
	public Animal(){ 
		System.out.println("Animal parametresiz");
		
	}
	
	public void hareket() {//static olamd��� i�in bunlar static de�il instanc emethodlar
		//�NEML� parent class kendi clas�ndaki methodlar� kullan�rken, �ocuk clas�ndaki methodlar� kullanam�yor, ger�ek hayatta da b�yledir
		//o�lan babas�n�n e�yalar�n� kullan�r, baba o�lununkileri kullanmaz
		System.out.println("hareket eder");
		
		
	}
	public void yeme() {
		System.out.println("yemek yerler");
		
		
	}
	public void icme() {
		System.out.println("Su i�erler");
		
	}

}
