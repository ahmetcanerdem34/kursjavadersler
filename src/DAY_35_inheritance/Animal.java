package DAY_35_inheritance;

public class Animal {

	public int a;
	public int m =3;
	
	public Animal() {//parametresiz animal constructýr
		this('Y');
		System.out.println("parametresiz Animal");
		
		
	}
	public Animal(int i) {//parametreli animal constructor
		System.out.println("parametreli animal");
		
		
	}
	public void mA() {
		
		System.out.println("Animal");
		
	}
	public void mM() {
		System.out.println("Mammal + Animal");
		
	}
}
