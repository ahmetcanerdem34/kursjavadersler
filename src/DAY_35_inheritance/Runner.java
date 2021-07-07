package DAY_35_inheritance;

public class Runner {

	public static void main(String[] args) {
		// c1 objesi olu�tural�m
		
		Cat c1= new Cat("X");
		//buras� parametresizken
//		parametresiz Animal
//		parametesiz Mammal
//		parametresiz Cat
		
		//ayn� isimli valuable �lerde hangisinin kullan�ld���na karar vermek i�in 
		//olu�turulan object in data typ�na(burda CAT) e�itli�in solunda-bak�n
		//Varaible i ara�t�rmaya dat typ� clas�ndan ba�lay�n�z
		System.out.println(c1.a);//0
		System.out.println(c1.c);//2
		System.out.println(c1.d);//5
		System.out.println(c1.m);//1
//		0
//		2
//		5
//		1
		
		
		Mammal c2 =new Cat("X");//Cat()-->cat construct�r�n� kullan�rken dat ismi olarak parentlerden birini se�ebiliriz 
							    //ve daha geni� bir alana hitap etmi� oluruz, kendisi ve �st� m�mk�n alt olmaz
		
		System.out.println(c2.c);//4--> nedne ustte cat teki 2 yi ald�da burda  m deki c4 u ald� cunk� datatipi Mammal, oraya �ncelik verdi
		System.out.println(c2.m);//1
		//System.out.println(c2.d); d yi g�rmedi ��nk� data t�pi maamldan ve yukar�s�ndan yazd�r�r� art�k cat teki d yi g�rmez CTE verir
//		4
//		1
		
		
		//buras� parametreli iken
//		parametreli animal
//		parametesiz Mammal
//		parametresiz Cat
//		parametreli Cat
		
		
		//methodlar i�n yeni bir obje olu�turuyorum
		//valuable bulmada data type onemlidir
		//method bulmada constructor onemlidir
		//method �a�r�l�rk�n ayn� isimli methodlardan hangisinin �a�r�laca��na const veriri
		//methodlar� ara�t�rmaya constructor ismi ta��yan classdan ba�lay�n ve parentlarda ara�t�rmaya devam edin
		
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
