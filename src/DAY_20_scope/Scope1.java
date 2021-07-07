package DAY_20_scope;

import java.util.Scanner;

public class Scope1 {
	
	
	//buras� static de�il 
	public int sayi;//java buna itiraz etmez, fakat main metodu d���nda olu�turulan 
	//ve static olmayan variable lara instance variable diyoruz
	//instance variable nin di�er ad� INSTANCE--->(object)(nesne)tir
	//clas level da olu�turuldu�u i�in clas�n her yerinden belli �artlarla kullan�labilir
	//instance variable ler obje ye ba�l� olarak �al���r(��retmen ad� veya, ��renci notu gibi)

	//mainde sayi yi yazd�rsak yazmaz, onu static yap der
	
	public String soyisim;//String i�in default de�er null
	public String isim="mehmet";
	public boolean izindeMi;// de�ersizse false
	public char ilkHarf;//buda de�ersizse bo�luk verir
	
	
	public static void main(String[] args) {
		
		//System.out.println(sayi);//-->static olmayan bir variableye static method i�inden ula�amay�z
		//main methodumuz static oldu�u i�in static olmayan methodlara direk ula�amay�oz
		
		
		//PEK� NASIL KULLANACA�IZ
		//instance bir variable ye main method i�erisinden ula�mak istedi�imizde ---> object olu�turmal�y�z
		
		
		//2 method olu�tural�m
		//main araban�n motoru gibi
		//bir metodu �a��rmam�z i�in onun static olmas� gerekirdi
		
		staticMethod();///bunu �a��rsak �al���r
		
	//	method();//CTE veriyor----bu �al��maz, static olmayan bir metodu static olan main metoduna �a��ramazs�n
		
		
		
//		Scanner //class ismi   scan//obje ismi  = new//keyword Scanner  //tekrar class ad� (System.in);//parantez i�i parametre
		
		//bir obje olu�turmak istedi�imizde 
		//1. class ismi
		//2.obje ismi
		//3. keyword
		//4. class ismi
		//5. () parantez i�i parametredir olmas� �art de�il
		
		Scope1 obj1 = new Scope1();//--> yeni bir scanner olu�turdum
		
		System.out.println(obj1.sayi);//buna de�er atamad�k java 0 verdi
		System.out.println(obj1.isim);
		System.out.println(obj1.soyisim);
		//instance variable lar olu�turuldu�unda biz istersek de�er atar�z
		//biz de�er atamazsaj java default yani null de�eri atar
		
//		0
//		mehmet
//		null

		
		
		Scope1 obj2 = new Scope1();
		obj2.isim="M�sl�m";
		obj2.soyisim="Baba";
		obj2.izindeMi=false;
		System.out.println(obj2.isim + " "+ obj2.soyisim+" "+obj2.izindeMi);
		//M�sl�m Baba false
		
		
		
		//yeni bir obje olu�tural�m
		
		Scope1 obj3= new Scope1();
		obj3.isim="Ferdi";
		obj3.soyisim="Tayfur";
		obj3.izindeMi=true;
		System.out.println(obj3.isim +" "+ obj3.soyisim+" "+obj3.izindeMi);
		//Ferdi Tayfur true
		
	}

	public static void staticMethod() {
		
		System.out.println("static method �al��t�");
		
	}
	
	public void method() {
		
		System.out.println(sayi);//hata vermedi-->bu method static olmad��� i�in instance variable lere direk eri�ebilir
		sayi=sayi+20;//itiraz etmedi--->direk eri�ebilir ve bu method i�eriisnde olmak �zere de�erini de�i�tirebilir
		
		
		
	}
	
}
