package DAY_21_scopeDevam;

public class Scope2 {

	public static void main(String[] args) {
		
		//static variable ler i�in obje oluturma ihtiyac� yoktur
		//ba�ka bir class tan static varavle veya metgodlara ula�mak istdi�imizde 
		//ula�mak istedi�imiz classs �n ad�.static variable yazmam�z yeterlidir
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okul�d);//ne yazd�r�r 
		//bir �nceki clastan-->Java Run Time programd�r.. �uan i�in Scope1 deki �al��ma oraya aitti, �idi Scope2 deyiz
		//burda yeni bir ba�lang�� yapacakt�r.........Scope1 �al��mazzzzzzz
		//dolay�s�yla en ba�ta olu�turulan veya atanan de�erler ge�erli olur
		
//		Y�ld�z Koleji
//		1201
		
		
		//PEK� BURDAN okul�d sini de�i�tirebilir miyim
		Scope1.okulAdi="Mehmet Koleji";
		System.out.println(Scope1.okulAdi);//�nce yukar�y� yazd�r�r sonra gelir yeni atamay� yazar,, a�a��da//Mehmet Koleji
		
//		Y�ld�z Koleji
//		1201
//		Mehmet Koleji
		
		Scope1.staticMethod();
		System.out.println(Scope1.okul�d);//
		System.out.println(Scope1.okulAdi);//
		
//		Y�ld�z Koleji
//		1201
//		Mehmet Koleji
//		1201 Mehmet Koleji false
//		Mehmet Koleji
//		1203

	}

}
