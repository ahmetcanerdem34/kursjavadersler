package DAY_33_encopsulation;


import DAY_20_scope.Scope1;
import DAY_21_scopeDevam.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		
		//OOP consebten bahsedelim
		//Object Oriented Programing
		//Bir proje kapsam�ndaki clas larda olu�an variable ve method lar�n ba�ka claslarda tekrar tekrar yaz�lmamas� 
		//var oldu�u clas tan obje �retilerek bu variable ve methodlar�n istedndi�i kadar kullan�lmas�d�r(reusulibity) yeniden kullan�lmas� demk
		//write one reuse enywhere
		
		//scope 6 clas�ndaki variable ve methodlara ula�mak istiyorum
		//nas�l ula�abilirim
		//bunun i�in scope 6 clas�ndan obje �retmeliyiz
		
		
		//e�itli�in sol taraf� declaration d�= nelerden olu�ur 2 par�ad�r  �rnek-->int sayi= int data t�t� sayi= isim
		//non primitiveler i�in data t�r� ayn� zamanda class ismi oalbilir
		//e�itli�in sa�� ise ilki new keywordu di�eri construc t�rd�
		//hangi clas tan obje uretmek istersek o class�n construct�r�n� kulla�r�z
		Scope6 obj1 = new Scope6();//alt� k�rm�z� oldu bize uyar� verdi scaopedeva m� onayla �zerine gel oraya g�t�rs�n
		obj1.num1=10;				//scope clas alt�da num ve name yi public ekleyerek burdan ula�abilir yapt�k
		System.out.println(obj1);//10
		
		obj1.add();
		
		
		//a�a��daki public void deneme methodu �a�r�labilir mi?deneme methodunu main methodu i�inden �a��rabilir miyim?
		//ya static eklemeliyim
		//ya da yeni bir obje �reterek bu methoda ula�abilirim
		//deneme static olmad��� i�in main methoddan �a�r�lamaz
		//deneme(); hata verdi
		
		Encapsulation01 obj3= new Encapsulation01();
		obj3.deneme();

	}
	//birde basi method olu�tural�m
	
	public void deneme() {
		
		//bu method i�erisinden scope6 clas�na ula�mak istiyorsam burda da bir obje olu�turmal�y�m
		//projemiz kapsam�nda bulunan tum claslardan public varable ve mthodlara istedi�im yerden obje ureterek ula�abilirim
		//e�er ul�amk iistedi�im class �yeleri (class member) public 
		//de�ilse ba�ka package lerden ula�mak i�in ekstra i�lem yapmam�z gerekir
		Scope1 obj2 = new Scope1();
		obj2.isim="Ahmet";
		obj2.soyisim="�z�elik";
		obj2.sayi=15;
		obj2.method();
		
		//demek ki obje kullanarak ben istedi�im class tan obje uretip oradaki public class �yelerine ula�abilirim
		
		
	}

}
