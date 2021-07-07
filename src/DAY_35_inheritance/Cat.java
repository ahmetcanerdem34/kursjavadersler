package DAY_35_inheritance;

public class Cat extends Mammal {
	public int c=2;
	public int d =5;
	
	public Cat() {
		//super parantez constructýr ýn içinde ve ilk satýrda sadece kullanýlýr, baþla yere koyarsanýz CTE verir this . gibi
		System.out.println("parametresiz Cat");
//		parametresiz Animal
//		parameteli Mammal
//		parametresiz Cat
	}
	public Cat(String s) {
		this();
		//parent class valuavle vey amethod seçmek için "super" keywordunu kullanak isityorum diyorum kullanýyorum
		System.out.println(super.c);//4
		System.out.println("parametreli Cat");
	}
	public void mC() {
		System.out.println("Cat");
	}
}
