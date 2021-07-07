package DAY_21_scopeDevam;

public class Scope1 {

	
	static int okul�d=1201;
	static String okulAdi="Y�ld�z Koleji";
	static boolean acikMi;//de�er atamd�k a�a��da false d�ner
	
	//static variable ler class level da olu�turuldu�u i�in clas�n her yerinden kullan�labilirler
	//instance variable ler static olmayan methodlarda direk kullan�labiliyorken, static methodlarda
	//obje olu�turularak kullan�labiliyordu
	//static variableler iste ister static ister static olmayan tum metodlarda diirek kullan�labilir
	
	public static void main(String[] args) {//buras� static, yukardakilerde static oldu�u i�in main i�inde rahat kullan�r�m
		
		
		System.out.println(okul�d + " " + okulAdi+" "+acikMi);//yazd�r�sak 2101 Y�ld�z Koleji false
		okul�d=1202;//okul id sini de�i�tirdei
		acikMi=true;//true ye cevirdim
		
		staticMethod();
		//method(); �a��ramad�k ��nk� static de�il a�a��s�
		
		System.out.println(okul�d + " " + okulAdi+" "+acikMi);//buras� ne yazd�r�r?
		
//		1201 Y�ld�z Koleji false
//		1202 Y�ld�z Koleji true
//		1203 Y�ld�z Koleji true
		
	}

	//mai nmetodu d���nda metod olu�tural�m 
	//bi static olsun biri olmas�n
	public static void staticMethod() {
		
		System.out.println(okul�d + " " + okulAdi+" "+acikMi);//burda yazd�rsak ne olur//yazd�r�sak 2101 Y�ld�z Koleji true
		okul�d=1203;//BURDA DE���T�RD�M
	}
	
	public void method() {
		okul�d=1205;
		
		
		
	}
}
