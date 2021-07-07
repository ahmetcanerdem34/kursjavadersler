package DAY_21_scopeDevam;

public class Scope2 {

	public static void main(String[] args) {
		
		//static variable ler için obje oluturma ihtiyacý yoktur
		//baþka bir class tan static varavle veya metgodlara ulaþmak istdiðimizde 
		//ulaþmak istediðimiz classs ýn adý.static variable yazmamýz yeterlidir
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulÝd);//ne yazdýrýr 
		//bir önceki clastan-->Java Run Time programdýr.. þuan için Scope1 deki çalýþma oraya aitti, þidi Scope2 deyiz
		//burda yeni bir baþlangýç yapacaktýr.........Scope1 çalýþmazzzzzzz
		//dolayýsýyla en baþta oluþturulan veya atanan deðerler geçerli olur
		
//		Yýldýz Koleji
//		1201
		
		
		//PEKÝ BURDAN okulÝd sini deðiþtirebilir miyim
		Scope1.okulAdi="Mehmet Koleji";
		System.out.println(Scope1.okulAdi);//önce yukarýyý yazdýrýr sonra gelir yeni atamayý yazar,, aþaðýda//Mehmet Koleji
		
//		Yýldýz Koleji
//		1201
//		Mehmet Koleji
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulÝd);//
		System.out.println(Scope1.okulAdi);//
		
//		Yýldýz Koleji
//		1201
//		Mehmet Koleji
//		1201 Mehmet Koleji false
//		Mehmet Koleji
//		1203

	}

}
