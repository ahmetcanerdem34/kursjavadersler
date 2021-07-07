package DAY_34;

public class Mammal extends Animal {//Mammal(memelileri) animal yani hayvanlarýn çocuðu yapacaðýz, bir class  baþka bir class ýn çocuðu yapmak çin 
	                 //önce o class a gitmek gerekir
	//extends den önceki yani solundaki class child class saðýndaki parent class  dýr
	
	public Mammal() {
		System.out.println("Mammal parametresiz constructýr");
		
	}

	public void sutleIleBesle() {
		System.out.println("yavrularýný süt ile beslerler");
		
		
	}
	public void dogum() {
		System.out.println("doðum yaparlar");
	}

}
