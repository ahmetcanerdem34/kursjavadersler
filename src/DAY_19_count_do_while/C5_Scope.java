package DAY_19_count_do_while;

public class C5_Scope {

	public static void main(String[] args) {
		
		//bir klas içerisinde oluşturulanı variable lerin nerede geçerli olduğu 
		//ve nered kullanılabildiğini o variable nin scope u belirler
		
		//herkes google yapsın ve javada scope nedir
		
		
		int sayi=10;//burada sayi diye bir değişken var
		
		//metod oluşturayım
		
		denemeMetod();
		sayi++;
		System.out.println(sayi);
		//System.out.println(isim);-->kullanamadık
		

	}

	public static void denemeMetod() {
		// soru: oluşturduğumuz bu sayi variab le yi oluştruduğum metodta kullanabilir miyim
		//sayi=20;---> izin vermiyor
		
		String isim ="mehmet";
	}

}
