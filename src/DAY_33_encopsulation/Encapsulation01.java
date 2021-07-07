package DAY_33_encopsulation;


import DAY_20_scope.Scope1;
import DAY_21_scopeDevam.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		
		//OOP consebten bahsedelim
		//Object Oriented Programing
		//Bir proje kapsamýndaki clas larda oluþan variable ve method larýn baþka claslarda tekrar tekrar yazýlmamasý 
		//var olduðu clas tan obje üretilerek bu variable ve methodlarýn istedndiði kadar kullanýlmasýdýr(reusulibity) yeniden kullanýlmasý demk
		//write one reuse enywhere
		
		//scope 6 clasýndaki variable ve methodlara ulaþmak istiyorum
		//nasýl ulaþabilirim
		//bunun için scope 6 clasýndan obje üretmeliyiz
		
		
		//eþitliðin sol tarafý declaration dý= nelerden oluþur 2 parçadýr  örnek-->int sayi= int data tütü sayi= isim
		//non primitiveler için data türü ayný zamanda class ismi oalbilir
		//eþitliðin saðý ise ilki new keywordu diðeri construc týrdý
		//hangi clas tan obje uretmek istersek o classýn constructýrýný kullaýrýz
		Scope6 obj1 = new Scope6();//altý kýrmýzý oldu bize uyarý verdi scaopedeva mý onayla üzerine gel oraya götürsün
		obj1.num1=10;				//scope clas altýda num ve name yi public ekleyerek burdan ulaþabilir yaptýk
		System.out.println(obj1);//10
		
		obj1.add();
		
		
		//aþaðýdaki public void deneme methodu çaðrýlabilir mi?deneme methodunu main methodu içinden çaðýrabilir miyim?
		//ya static eklemeliyim
		//ya da yeni bir obje üreterek bu methoda ulaþabilirim
		//deneme static olmadýðý için main methoddan çaðrýlamaz
		//deneme(); hata verdi
		
		Encapsulation01 obj3= new Encapsulation01();
		obj3.deneme();

	}
	//birde basi method oluþturalým
	
	public void deneme() {
		
		//bu method içerisinden scope6 clasýna ulaþmak istiyorsam burda da bir obje oluþturmalýyým
		//projemiz kapsamýnda bulunan tum claslardan public varable ve mthodlara istediðim yerden obje ureterek ulaþabilirim
		//eðer ulþamk iistediðim class üyeleri (class member) public 
		//deðilse baþka package lerden ulaþmak için ekstra iþlem yapmamýz gerekir
		Scope1 obj2 = new Scope1();
		obj2.isim="Ahmet";
		obj2.soyisim="Özçelik";
		obj2.sayi=15;
		obj2.method();
		
		//demek ki obje kullanarak ben istediðim class tan obje uretip oradaki public class üyelerine ulaþabilirim
		
		
	}

}
