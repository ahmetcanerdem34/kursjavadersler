package DAY_19_count_do_while;

public class C5_Scope {

	public static void main(String[] args) {
		
		//bir klas i�erisinde olu�turulan� variable lerin nerede ge�erli oldu�u 
		//ve nered kullan�labildi�ini o variable nin scope u belirler
		
		//herkes google yaps�n ve javada scope nedir
		
		
		int sayi=10;//burada sayi diye bir de�i�ken var
		
		//metod olu�turay�m
		
		denemeMetod();
		sayi++;
		System.out.println(sayi);
		//System.out.println(isim);-->kullanamad�k
		

	}

	public static void denemeMetod() {
		// soru: olu�turdu�umuz bu sayi variab le yi olu�trudu�um metodta kullanabilir miyim
		//sayi=20;---> izin vermiyor
		
		String isim ="mehmet";
	}

}
