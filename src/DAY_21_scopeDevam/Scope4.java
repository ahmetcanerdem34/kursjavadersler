package DAY_21_scopeDevam;

public class Scope4 {

	public static void main(String[] args) {
		
		
		int sayi=10;
		//1-bir method i�erisinde olu�turulan variable sadece o method i�inde kullan�labilir
		//1-System.out.println(isim);
		
		int sayi2;//(buna declaration denir) // 2-bir local variable de�er atanmadanda olu�turulabilir
		//System.out.println(sayi2);//2-ancak ilk de�er atamas� yap�lmayan variableler kullan�lamaz
		
		//sayi++;//2-say�n�n ilk de�eri yokki artt�rs�n, artt�rma azaltma yapamay�z
		
		//PEK� BUNLARI YAPMAM ���N BANA �Z�N VER�YOR
		//2-java de�er atamas� olmadan variiable olu�turulmas�na izin verir, ilerde de�er atanacak diye bekler
		sayi2=15;//(bunada initiliazed=assign denir)//2-olu�turma ayr� sat�rda(12.sat�r) , de�er atamas� ayr� sat�rda yap�labilir
		
		//3- birden fazla methodun oldu�u class larda, her metodda kullanma�z gerek ortak variable ler varsa
		//3-NE YAPMALIYIZ-->class level da variable olu�turmal�y�m
		//3- ortak variable class �n yap�s�na ba�l� olarak instance veya static olabilir
	
	
	}
	
	public static void  staticMethod() {
		
		String isim = "Hasan";
		//1-System.out.println(sayi); bu kurala main method i�erisinde olu�turulan variable lar de dahildir
		
	}
public void method() {
	
	boolean isTrue=true;
	//1-System.out.println(sayi);
    //1-bu kural satatic olan veya olmayan tum methodlar i�in ge�erlidir	
	
}
}
