package DAY_21_scopeDevam;

public class Scope1 {

	
	static int okulÝd=1201;
	static String okulAdi="Yýldýz Koleji";
	static boolean acikMi;//deðer atamdýk aþaðýda false döner
	
	//static variable ler class level da oluþturulduðu için clasýn her yerinden kullanýlabilirler
	//instance variable ler static olmayan methodlarda direk kullanýlabiliyorken, static methodlarda
	//obje oluþturularak kullanýlabiliyordu
	//static variableler iste ister static ister static olmayan tum metodlarda diirek kullanýlabilir
	
	public static void main(String[] args) {//burasý static, yukardakilerde static olduðu için main içinde rahat kullanýrým
		
		
		System.out.println(okulÝd + " " + okulAdi+" "+acikMi);//yazdýrýsak 2101 Yýldýz Koleji false
		okulÝd=1202;//okul id sini deðiþtirdei
		acikMi=true;//true ye cevirdim
		
		staticMethod();
		//method(); çaðýramadýk çünkü static deðil aþaðýsý
		
		System.out.println(okulÝd + " " + okulAdi+" "+acikMi);//burasý ne yazdýrýr?
		
//		1201 Yýldýz Koleji false
//		1202 Yýldýz Koleji true
//		1203 Yýldýz Koleji true
		
	}

	//mai nmetodu dýþýnda metod oluþturalým 
	//bi static olsun biri olmasýn
	public static void staticMethod() {
		
		System.out.println(okulÝd + " " + okulAdi+" "+acikMi);//burda yazdýrsak ne olur//yazdýrýsak 2101 Yýldýz Koleji true
		okulÝd=1203;//BURDA DEÐÝÞTÝRDÝM
	}
	
	public void method() {
		okulÝd=1205;
		
		
		
	}
}
