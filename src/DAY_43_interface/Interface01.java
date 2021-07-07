package DAY_43_interface;

public interface Interface01 {
	
	//java da interface olu�turmak istiyorsak ba�atan o �ekilde olu�turmal�y�z
	//bir class sonradan baz� keyword ler
	//interface bir class de�ildir, interface interface dir
	//class de�ilse obje �retmez
	//onje �retmiyorsa construct�r � yoktur

	public void motor(); //interface i�inde abstruct methodlar ve �zel concrete methodlar olabilir
	
	/*
	 bir abstruct methodun bodysi olmad���ndan o methodun istenen dinamik �zelli�i
	 nas�l ger�ekle�tirece�ini bilmemiz m�mk�n de�ildir
	 sadece ne yapaca��nz belirsiz
	 
	 bu method bize �unu anlat�r, beni inherit eden her concrete class�n dinamik motor �zelli�i olmal�d�r
	 */
	void vites();//bu method bize �unu anlat�r, beni inherit eden her concrete class�n dinamik vites �zelli�i olmal�d�r
	abstract void kasa();//bu method bize �unu anlat�r, beni inherit eden her concrete class�n dinamik kasa �zelli�i olmal�d�r
	
	String ISIM ="Mustafa";//isim kelimesini italik ve bold yapt�
						   //demekki tu variableler final ve static tir
	
	
	//interface de sadece ABSTRUCT, PUBL�C, methodlar olur
	//bu 2 keywor du yazsakta yazmasakta java t�m methodlar� bu �ekilde kabul eder
	/*
    - Interface'lerin simgesinin sag ust kosesine "I" harfi cikar ayirt edilebilmesi icin.
    - Interface bir class degildir . Interface INTERFACE'dir.
    - Interface icinde sadece kendisinden tureyen siniflarin icini doldurmak zorunda oldugu,
    body'si olmayan method'larin olusturuldugu bir yapidir.
    - Kisacasi kendisini inherit eden class'lar icin yerine getirmeleri gereken methodlari belirten
    "tum alanlari doldurulmak zorunda olan bir sablon" gibidir.
    - Interface'ler somutlastirilamaz(can not be instantiated) yani Interface'de obje OLUSTURULAMAZ.
    - Interface bir cesit to do list'tir. Concrete class'lari interface'deki tum methodlari implement etmek zorunda birakir.
    Nasil yapilacagina degil ne yapilacagina odaklanir.
    - Bir class birden fazla class'a extend edilemez ama birden fazla interface'e implement edilebilir.
     NOT : Abstract class'lar interface'deki abstract methodlari implement etmek zorunda degildir.
    - Optional bazi method'lar koymak istersek, en uste concrete bir parent koyariz.
    - Bir class 4 farkli class'a inherit edemez AMA bir class istedigimiz kadar INTERFACE'e implements ile baglanabilir.
    - Birden fazla class'i parents olarak kabul edemeyiz fazla birden fazla Interface'i parent olarak kabul edebiliriz.
    
    ABSTRACT vs INTERFACE
    1) Abstract :
     1.1 - Class�dir.
     1.2 - Abstract ve concrete method�lar konabilir.
     1.3 - Kismi olarak abstraction saglar.
     1.4 - Birden fazla abstract class�a direk child olunamaz. Coklu inheritance�i desteklemez.
     1.5 - Hiz acisindan avantajlidir
     1.6 - Icindeki t�m nesnelerin �public� olmasi zorunlu degildir.
     1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
     1.8 - Abstract class constructor�a sahiptir 
    
    2) Interface : 
    2.1 - Class degildir.
    2.2 - Sadece abstract method�lar konabilir.
    2.3 - Tam abstraction (soyutluk) saglar
    2.4 - Bir class�dan istediginiz kadar interface�i inherit edebilirsiniz. Coklu inheritance�a uygundur.
    2.5 - Hiz acisindan abstract class�a gore yavastir.
    2.6 - Icindeki t�m nesnelerin �public� olmas� gerekir.
    2.7 - Method'lar static olamaz
    2.8 - Abstract class constructor�a sahiptir
    */
}
