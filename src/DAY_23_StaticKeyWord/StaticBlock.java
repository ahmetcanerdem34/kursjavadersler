package DAY_23_StaticKeyWord;

public class StaticBlock {
	
	
	static String isim;
	//stati block class cal��t�r�ld���nda ilk olarak �al��r(main method dan bile �nce �al���r)
	//static bloclar ne i�in kullan�l�r= static variablelere de�er atamak i�in kullan�l�r
	//e�er 1 den fazla block varsa en �stteki en �nce �al���r
	//mehmet block unu g�t�r�p en a�a�� koysak yine s�ralam de�i�mez
	
	static {//static block olu�turduk, main methodu i�ine gidelim
		isim="Mehmet";
		System.out.println(isim);

	}

	static {
		System.out.println("2. static block �al��t�");
	}
	public static void main(String[] args) {
		
		isim="Alican";
		System.out.println(isim);
		isim="tugrul";
		System.out.println(isim);
//		Mehmet
//		2. static block �al���t
//		Alican

		

	}

}
