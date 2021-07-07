package DAY_42_abstract;

public abstract class Honda {
	
	//body si {} olmayan class a abstract denir., cinler melekler gibi body leri yok
	//bit methodu abstruct yapt���m�z zaman child lar onu mecbur kullanmak zorunda kal�rlar 
	//bir methoda body koymad���m�z zamn onu alan butun child lar onu kullnmak i�in body {} koymka zorundad�rlar
	
	
	/*
	 1- bazen child class lar parent clastaki methodlar�n body ler ide�i�teirere kkulan�rlar
	 -bu gibi durumlarda parent class taki method body i koymak anlams�zd�r
	 -bu anlmas�zl��� gidermek i�in Java bize body siz method uretme imkan� verir.
	 -Body siz methodlara abstruct method denir
	 
	 2-parent class taki body siz methodlar�(abstruclar�) child class lar override etmek zorundad�rlar(al�p kullnmak zorundad�rlar)
	 -biz bir application olu�tururken  child classlar� parent class daki baz� methodlar� override etmek zorunda b�rakmak istersek
	 -o methodlar� abstruct method yapar�z
	 
	 3- aces mod�fier den sonra abstract keywordunu koyunuz
	 
	 4-abstract methodlar sadece abstract class da olu�trulur
	 
	 5-abstract class olu�turmak i�in acce modifierden sonra public ten s�onra abstrack keywordunu koyun
	 
	 6-abstruct keyword u ile method body bir arada kullan�lamaz
	 
	 7-abstruct class i�erisinde hem abstract hem de abstruact(soyut) olmayan(concrete-somut-beton) methodlar da kullan�labilir 
	 
	 8-bir concrete class abstract classs extend etti�inde, abstruct class i�indeki tum abstract  methodlar� ovverride etmek zorundad�r(motor)
	 -aksi takdirde CTE veriri Compile Time Error. fakat concrete methodlar� ovverride etmek istemesi iste�e ba�l�d�r. (deri) meselesinde g�rd�k
	 
	 9-bir abstract class ba�ka bir abstract class a extend edildi�inde override etmek zorunda de�ildir, isterse ovveride etmer isterse etmez
	 
	 10-finall classlar�n child class � olamaz. abstract class lar child class larar talimat vermek i�in olu�turulurlar
	 -e�er bir class final yapars�n�z o class �n child class � olamayaca��nda abstract olmas� mant�kl� de�ildir. 
	 -bu yuzden java abstract class lar�n final olmas�na musade etmez
	 
	 11- abstract method uretmem�z�n sebebi child class lar�n kullan�labilmesidir. e�er mthodu finall yaparsak
	 -bu o method veeride edilemez demektir yani; child class lar kullanamz demektir. bu �eli�kiden dolay�
	 -Java abstract methodlar�n final olmas�na musade etmez
	 
	 12-abstract methodlar privite olmazlar cunk�, abstruct methodlar ba�ka class lardan kullan�lmak i�in �retilir
	 -halbuki private methodlar ba�ka class lar taraf�ndan kullan�lmaz
	 
	 13- abstract methodlar static olamaz, ��nk� staticler ��nk� ovvrire edilemezler. halbuki biz abstruct methodlar� ovvride etmek i�in kullan�r�z
	
	 		ABSTRACT METHODLARDAN OBJE �RET�LEMEZ!!!!!!!! 
	 */

	
	public abstract void motor();//abstruct method olu�tukturduk-- body koyamazs�n--abstract class i�inde abstract olmayan body de kullan�labilir
	//bu methodu static yapabilir miyim?
	
	public void deri() {
		System.out.println("Koltuklar� deri olsun");
		
	}
}
