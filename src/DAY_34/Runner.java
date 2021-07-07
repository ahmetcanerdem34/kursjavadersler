package DAY_34;

public class Runner {

	public static void main(String[] args) {
		//�nceki class larda �zellikleri olu�turduk, onlara main koymad�k buraya koyduk motor main burasu� burdan �al��acak
		//�nceki claslarda olu�turmu� oldu�umuz methodlar ba�lar�nda public var ama static olmad�klar� i�in instance dirler yani dinamik de�illerdir
		//biz de main methodundan onlara ula�mak i�in onlardan OBJE�retip ula�maya �al���yoruz
		
		Animal a1= new Animal();//animal class�n� kullanmak i�in a1obje si olu�turdum ve static yapm�� olduk, sa� taraftakiAnimal(9-->default constructor d�r
		//�NEML� parent class kendi clas�ndaki methodlar� kullan�rken, �ocuk clas�ndaki methodlar� kullanam�yor, ger�ek hayatta da b�yledir
				//o�lan babas�n�n e�yalar�n� kullan�r, baba o�lununkileri kullanmaz
		//kendi clas�nda 3 method vard�
		a1.hareket();
		a1.yeme();
		a1.icme();
		//3 �nede main den ula�t���m i�in art�k animal class �n�n methodlar�n�  �al��t�rabilirim
//		hareket eder
//		yemek yerler
//		Su i�erler
		System.out.println("********************");
		//static olmayan Mammal clas�ndaki methodlara daula�mak i�in m1 OBJE olu�turuyorum
		//Mammal animal �n �ocu�u oldu�u i�in kendi clas�ndaki methodlar dahil
		//babas� olan An�mal class�ndaki methodlara daula�abilirim
		//yani onlar� miras alabilirim
		
		Mammal m1= new Mammal();//new Mammal()-- maml k�sm� default constructor d�r, a�a��dakilerde de ayn�
		m1.dogum();
		m1.sutleIleBesle();
		m1.icme();
		m1.yeme();
		m1.hareket();
//		do�um yaparlar
//		yavrular�n� s�t ile beslerler
//		Su i�erler
//		yemek yerler
//		hareket eder
		
		System.out.println("******************************");
		
		//static olmayan Cat clas�ndaki methodlara daula�mak i�in c1 OBJE si olu�turuyorum
		
		Cat c1 = new Cat();
		//kendi clas� dahil babas� ve dedsine ula�abilirim
		
		c1.miyav();
		c1.dogum();
		c1.sutleIleBesle();
		c1.icme();
		c1.yeme();
		c1.hareket();
//		miyavlarlar
//		do�um yaparlar
//		yavrular�n� s�t ile beslerler
//		Su i�erler
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
//		do�um yaparlar
//		yavrular�n� s�t ile beslerler
//		Su i�erler
//		yemek yerler
//		hareket eder
		
		
		System.out.println("**********************");
		
		Fish f1= new Fish();
		//fish mammal �n �ocu�u olmad��� i�in sutle beslenirler yok
		f1.yumurtla();
		f1.icme();
		f1.yeme();
		f1.hareket();
//		yumurtlarlar
//		Su i�erler
//		yemek yerler
//		hareket eder
		
	}

}
