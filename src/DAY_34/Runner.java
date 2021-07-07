package DAY_34;

public class Runner {

	public static void main(String[] args) {
		//önceki class larda özellikleri oluþturduk, onlara main koymadýk buraya koyduk motor main burasuý burdan çalýþacak
		//önceki claslarda oluþturmuþ olduðumuz methodlar baþlarýnda public var ama static olmadýklarý için instance dirler yani dinamik deðillerdir
		//biz de main methodundan onlara ulaþmak için onlardan OBJEüretip ulaþmaya çalýþýyoruz
		
		Animal a1= new Animal();//animal classýný kullanmak için a1obje si oluþturdum ve static yapmýþ olduk, sað taraftakiAnimal(9-->default constructor dýr
		//ÖNEMLÝ parent class kendi clasýndaki methodlarý kullanýrken, çocuk clasýndaki methodlarý kullanamýyor, gerçek hayatta da böyledir
				//oðlan babasýnýn eþyalarýný kullanýr, baba oðlununkileri kullanmaz
		//kendi clasýnda 3 method vardý
		a1.hareket();
		a1.yeme();
		a1.icme();
		//3 ünede main den ulaþtýðým için artýk animal class ýnýn methodlarýný  çalýþtýrabilirim
//		hareket eder
//		yemek yerler
//		Su içerler
		System.out.println("********************");
		//static olmayan Mammal clasýndaki methodlara daulaþmak için m1 OBJE oluþturuyorum
		//Mammal animal ýn çocuðu olduðu için kendi clasýndaki methodlar dahil
		//babasý olan Anýmal classýndaki methodlara daulaþabilirim
		//yani onlarý miras alabilirim
		
		Mammal m1= new Mammal();//new Mammal()-- maml kýsmý default constructor dýr, aþaðýdakilerde de ayný
		m1.dogum();
		m1.sutleIleBesle();
		m1.icme();
		m1.yeme();
		m1.hareket();
//		doðum yaparlar
//		yavrularýný süt ile beslerler
//		Su içerler
//		yemek yerler
//		hareket eder
		
		System.out.println("******************************");
		
		//static olmayan Cat clasýndaki methodlara daulaþmak için c1 OBJE si oluþturuyorum
		
		Cat c1 = new Cat();
		//kendi clasý dahil babasý ve dedsine ulaþabilirim
		
		c1.miyav();
		c1.dogum();
		c1.sutleIleBesle();
		c1.icme();
		c1.yeme();
		c1.hareket();
//		miyavlarlar
//		doðum yaparlar
//		yavrularýný süt ile beslerler
//		Su içerler
//		yemek yerler
//		hareket eder
		System.out.println("******************************");
		
		Dog d1=new Dog();
		
		d1.havla();
		d1.dogum();
		d1.sutleIleBesle();
		d1.icme();
		d1.yeme();
		d1.hareket();
//		havlarlar
//		doðum yaparlar
//		yavrularýný süt ile beslerler
//		Su içerler
//		yemek yerler
//		hareket eder
		
		
		System.out.println("**********************");
		
		Fish f1= new Fish();
		//fish mammal ýn çocuðu olmadýðý için sutle beslenirler yok
		f1.yumurtla();
		f1.icme();
		f1.yeme();
		f1.hareket();
//		yumurtlarlar
//		Su içerler
//		yemek yerler
//		hareket eder
		
	}

}
