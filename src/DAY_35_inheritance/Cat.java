package DAY_35_inheritance;

public class Cat extends Mammal {
	public int c=2;
	public int d =5;
	
	public Cat() {
		//super parantez construct�r �n i�inde ve ilk sat�rda sadece kullan�l�r, ba�la yere koyarsan�z CTE verir this . gibi
		System.out.println("parametresiz Cat");
//		parametresiz Animal
//		parameteli Mammal
//		parametresiz Cat
	}
	public Cat(String s) {
		this();
		//parent class valuavle vey amethod se�mek i�in "super" keywordunu kullanak isityorum diyorum kullan�yorum
		System.out.println(super.c);//4
		System.out.println("parametreli Cat");
	}
	public void mC() {
		System.out.println("Cat");
	}
}
