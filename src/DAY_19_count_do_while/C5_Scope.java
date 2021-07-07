package DAY_19_count_do_while;

public class C5_Scope {

	public static void main(String[] args) {
		
		//bir klas içerisinde oluþturulaný variable lerin nerede geçerli olduðu 
		//ve nered kullanýlabildiðini o variable nin scope u belirler
		
		//herkes google yapsýn ve javada scope nedir
		
		
		int sayi=10;//burada sayi diye bir deðiþken var
		
		//metod oluþturayým
		
		denemeMetod();
		sayi++;
		System.out.println(sayi);
		//System.out.println(isim);-->kullanamadýk
		

	}

	public static void denemeMetod() {
		// soru: oluþturduðumuz bu sayi variab le yi oluþtruduðum metodta kullanabilir miyim
		//sayi=20;---> izin vermiyor
		
		String isim ="mehmet";
	}

}
