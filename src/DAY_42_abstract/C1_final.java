package DAY_42_abstract;

public class C1_final {

	
	final static int SAY�=10;//final static olursa buyuk yaz�yoruz
	//instance bir variavle� final ve static yaparsan�z java onu bold yapar
	//bizde buyuk harfle uyazar�z
	
	String isim;
	//instance variablelere ilk de�er atamas� yapmak zorunda de�iliz
	//de�er atamad���m�da java turunu g�re de�er atar; mesela string e null
	
	//final String soyisim;
	//final varaiblelere de�eri sonradan de�eri de�i�tirilemeyece�i i�in ilk atama yap�lmadan olu�turulmas�na java izin vermez
	public static void main(String[] args) {
		
		System.out.println(SAY�);
		
		System.out.println(Integer.MAX_VALUE);
	}
	//final kelimesini method lar iinde kullanabiliyoruz
	public void deneme() {
		
		System.out.println("deneme yap�yoruz");
		
		
	}
	public final void deneme2() {
		System.out.println("denem yap�yoruz");
		
	}

}
