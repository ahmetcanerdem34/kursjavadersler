package DAY_42_abstract;

public class C1_final {

	
	final static int SAYÝ=10;//final static olursa buyuk yazýyoruz
	//instance bir variavleý final ve static yaparsanýz java onu bold yapar
	//bizde buyuk harfle uyazarýz
	
	String isim;
	//instance variablelere ilk deðer atamasý yapmak zorunda deðiliz
	//deðer atamadýðýmýda java turunu göre deðer atar; mesela string e null
	
	//final String soyisim;
	//final varaiblelere deðeri sonradan deðeri deðiþtirilemeyeceði için ilk atama yapýlmadan oluþturulmasýna java izin vermez
	public static void main(String[] args) {
		
		System.out.println(SAYÝ);
		
		System.out.println(Integer.MAX_VALUE);
	}
	//final kelimesini method lar iinde kullanabiliyoruz
	public void deneme() {
		
		System.out.println("deneme yapýyoruz");
		
		
	}
	public final void deneme2() {
		System.out.println("denem yapýyoruz");
		
	}

}
