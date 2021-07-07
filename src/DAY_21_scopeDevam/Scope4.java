package DAY_21_scopeDevam;

public class Scope4 {

	public static void main(String[] args) {
		
		
		int sayi=10;
		//1-bir method içerisinde oluþturulan variable sadece o method içinde kullanýlabilir
		//1-System.out.println(isim);
		
		int sayi2;//(buna declaration denir) // 2-bir local variable deðer atanmadanda oluþturulabilir
		//System.out.println(sayi2);//2-ancak ilk deðer atamasý yapýlmayan variableler kullanýlamaz
		
		//sayi++;//2-sayýnýn ilk deðeri yokki arttýrsýn, arttýrma azaltma yapamayýz
		
		//PEKÝ BUNLARI YAPMAM ÝÇÝN BANA ÝZÝN VERÝYOR
		//2-java deðer atamasý olmadan variiable oluþturulmasýna izin verir, ilerde deðer atanacak diye bekler
		sayi2=15;//(bunada initiliazed=assign denir)//2-oluþturma ayrý satýrda(12.satýr) , deðer atamasý ayrý satýrda yapýlabilir
		
		//3- birden fazla methodun olduðu class larda, her metodda kullanmaýz gerek ortak variable ler varsa
		//3-NE YAPMALIYIZ-->class level da variable oluþturmalýyým
		//3- ortak variable class ýn yapýsýna baðlý olarak instance veya static olabilir
	
	
	}
	
	public static void  staticMethod() {
		
		String isim = "Hasan";
		//1-System.out.println(sayi); bu kurala main method içerisinde oluþturulan variable lar de dahildir
		
	}
public void method() {
	
	boolean isTrue=true;
	//1-System.out.println(sayi);
    //1-bu kural satatic olan veya olmayan tum methodlar için geçerlidir	
	
}
}
