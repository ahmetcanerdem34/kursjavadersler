package DAY_35_inheritance;

public class Runner {

	public static void main(String[] args) {
		// c1 objesi oluþturalým
		
		Cat c1= new Cat("X");
		//burasý parametresizken
//		parametresiz Animal
//		parametesiz Mammal
//		parametresiz Cat
		
		//ayný isimli valuable þlerde hangisinin kullanýldýðýna karar vermek için 
		//oluþturulan object in data typýna(burda CAT) eþitliðin solunda-bakýn
		//Varaible i araþtýrmaya dat typý clasýndan baþlayýnýz
		System.out.println(c1.a);//0
		System.out.println(c1.c);//2
		System.out.println(c1.d);//5
		System.out.println(c1.m);//1
//		0
//		2
//		5
//		1
		
		
		Mammal c2 =new Cat("X");//Cat()-->cat constructýrýný kullanýrken dat ismi olarak parentlerden birini seçebiliriz 
							    //ve daha geniþ bir alana hitap etmiþ oluruz, kendisi ve üstü mümkün alt olmaz
		
		System.out.println(c2.c);//4--> nedne ustte cat teki 2 yi aldýda burda  m deki c4 u aldý cunkü datatipi Mammal, oraya öncelik verdi
		System.out.println(c2.m);//1
		//System.out.println(c2.d); d yi görmedi çünkü data týpi maamldan ve yukarýsýndan yazdýrýrý artýk cat teki d yi görmez CTE verir
//		4
//		1
		
		
		//burasý parametreli iken
//		parametreli animal
//		parametesiz Mammal
//		parametresiz Cat
//		parametreli Cat
		
		
		//methodlar içn yeni bir obje oluþturuyorum
		//valuable bulmada data type onemlidir
		//method bulmada constructor onemlidir
		//method çaðrýlýrkýn ayný isimli methodlardan hangisinin çaðrýlacaðýna const veriri
		//methodlarý araþtýrmaya constructor ismi taþýyan classdan baþlayýn ve parentlarda araþtýrmaya devam edin
		
		Cat c3 = new Cat();
		c3.mA();
		c3.mC();
        c3.mM();
//        Animal
//        Cat
//        Mammal
		
		System.out.println("***************");
		//yeni bir obje
		
		Animal c4 = new Mammal();//const Mammal
		//sadece mA,mM yi kullanabiliyorum
		
		System.out.println("**********");
		
		Mammal c5 = new Mammal();
		c5.mA();
		c5.mC();
		c4.mM();
//		Animal
//		Mammal + Cat
//		Mammal
		
		

	}

}
