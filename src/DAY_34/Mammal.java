package DAY_34;

public class Mammal extends Animal {//Mammal(memelileri) animal yani hayvanlar�n �ocu�u yapaca��z, bir class  ba�ka bir class �n �ocu�u yapmak �in 
	                 //�nce o class a gitmek gerekir
	//extends den �nceki yani solundaki class child class sa��ndaki parent class  d�r
	
	public Mammal() {
		System.out.println("Mammal parametresiz construct�r");
		
	}

	public void sutleIleBesle() {
		System.out.println("yavrular�n� s�t ile beslerler");
		
		
	}
	public void dogum() {
		System.out.println("do�um yaparlar");
	}

}
