package DAY_35_inheritance;

public class Mammal extends Animal{
	
	public int m=1;
	public int c=4;
	
	public Mammal() {
		super(5);//buraya 5 yazdýðýmýzda gider parent taki yani animal daki parametreli syso yu çalýþtýrýr, deneyelim
		System.out.println("parametesiz Mammal");
//		parametreli animal
//		parametesiz Mammal
//		parametresiz Cat
	}
	public Mammal(char c) {
		super(17);
		System.out.println("parameteli Mammal");
	}
	public void mM() {
		System.out.println("Mammal") ;
		
	}
	public void mC() {
		System.out.println("Mammal + Cat");
	}
}
