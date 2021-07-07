package DAY_20_scope;

import java.util.Scanner;

public class Scope1 {
	
	
	//burasý static deðil 
	public int sayi;//java buna itiraz etmez, fakat main metodu dýþýnda oluþturulan 
	//ve static olmayan variable lara instance variable diyoruz
	//instance variable nin diðer adý INSTANCE--->(object)(nesne)tir
	//clas level da oluþturulduðu için clasýn her yerinden belli þartlarla kullanýlabilir
	//instance variable ler obje ye baðlý olarak çalýþýr(öðretmen adý veya, öðrenci notu gibi)

	//mainde sayi yi yazdýrsak yazmaz, onu static yap der
	
	public String soyisim;//String için default deðer null
	public String isim="mehmet";
	public boolean izindeMi;// deðersizse false
	public char ilkHarf;//buda deðersizse boþluk verir
	
	
	public static void main(String[] args) {
		
		//System.out.println(sayi);//-->static olmayan bir variableye static method içinden ulaþamayýz
		//main methodumuz static olduðu için static olmayan methodlara direk ulaþamayýoz
		
		
		//PEKÝ NASIL KULLANACAÐIZ
		//instance bir variable ye main method içerisinden ulaþmak istediðimizde ---> object oluþturmalýyýz
		
		
		//2 method oluþturalým
		//main arabanýn motoru gibi
		//bir metodu çaðýrmamýz için onun static olmasý gerekirdi
		
		staticMethod();///bunu çaðýrsak çalýþýr
		
	//	method();//CTE veriyor----bu çalýþmaz, static olmayan bir metodu static olan main metoduna çaðýramazsýn
		
		
		
//		Scanner //class ismi   scan//obje ismi  = new//keyword Scanner  //tekrar class adý (System.in);//parantez içi parametre
		
		//bir obje oluþturmak istediðimizde 
		//1. class ismi
		//2.obje ismi
		//3. keyword
		//4. class ismi
		//5. () parantez içi parametredir olmasý þart deðil
		
		Scope1 obj1 = new Scope1();//--> yeni bir scanner oluþturdum
		
		System.out.println(obj1.sayi);//buna deðer atamadýk java 0 verdi
		System.out.println(obj1.isim);
		System.out.println(obj1.soyisim);
		//instance variable lar oluþturulduðunda biz istersek deðer atarýz
		//biz deðer atamazsaj java default yani null deðeri atar
		
//		0
//		mehmet
//		null

		
		
		Scope1 obj2 = new Scope1();
		obj2.isim="Müslüm";
		obj2.soyisim="Baba";
		obj2.izindeMi=false;
		System.out.println(obj2.isim + " "+ obj2.soyisim+" "+obj2.izindeMi);
		//Müslüm Baba false
		
		
		
		//yeni bir obje oluþturalým
		
		Scope1 obj3= new Scope1();
		obj3.isim="Ferdi";
		obj3.soyisim="Tayfur";
		obj3.izindeMi=true;
		System.out.println(obj3.isim +" "+ obj3.soyisim+" "+obj3.izindeMi);
		//Ferdi Tayfur true
		
	}

	public static void staticMethod() {
		
		System.out.println("static method çalýþtý");
		
	}
	
	public void method() {
		
		System.out.println(sayi);//hata vermedi-->bu method static olmadýðý için instance variable lere direk eriþebilir
		sayi=sayi+20;//itiraz etmedi--->direk eriþebilir ve bu method içeriisnde olmak üzere deðerini deðiþtirebilir
		
		
		
	}
	
}
