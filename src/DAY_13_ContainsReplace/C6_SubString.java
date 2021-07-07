package DAY_13_ContainsReplace;

public class C6_SubString {

	public static void main(String[] args) {
		
		
		//alt string diye d���nelim
		//bize verilen bir c�mleyle alakal� baz� yerlerini almam�z gerebilir
		
		
		String str="her ders java gibi olsa";
		
		//str �n son ilk on katakteri y�ld�z ile gizleyin, geriye kalanlar nomal yaz�ls�n
		//burada substring devreye girer 
		//10. harf ile 20. harfini alma
		
		System.out.println(str.substring(10));//10. index dahil(inclusive) sonuna kadar k�sm� al�r
		//ava gibi olsa
		
		System.out.println(str.substring(str.length()-10));//son 10 basamak i�in bu yap�l�r
		// gibi olsa
		
		
		//ilk 10 karakteri alma
		System.out.println(str.substring(0, 10));//subString (0,10) yaz�ld���nda , s�f�r dahil olur 10 olmaz
		//her ders j							 //0 inclusice, 10 exclusive 
		
		//11. karakterden sona kadar olan stringi yazd�ral�m
		
		System.out.println(str.substring(11));
		//va gibi olsa
		
		
		System.out.println("**********" + str.substring(10));//ba� k�sma 10 y�ld�z yaz gerisini sunStringle al
		//**********ava gibi olsa
		
		
		//ba�ka bir y�ntem
		
		
		System.out.println(str.substring(0, 10).replaceAll("\\D", "*") +
			               str.substring(10));
			               
		System.out.println(str.substring(10, 10));//ba�lang�� i,ndeksi olsun der ama biti� indexi olmas�n der, java son s�ylenenni yapar
		
		
		System.out.println(str.substring(8, 7));//hata verir.. RTE
		
		System.out.println(str.substring(23));//bo�luk verdi, hi�lik
		System.out.println(str.substring(22));//length-1 son karakter
		System.out.println(str.substring(24));//lenght() den sonra verilen son karakter hata verir
		
		
		
		//str �n son ilk on katakteri y�ld�z ile gizleyin, geriye kalanlar nomal yaz�ls�n
		
		String str3= str.substring(0, 10);//ilk 10 harfini ald�k
		str3=str.replaceAll("\\W", "a");
		System.out.println(str3.replaceAll("\\w", "*")+str.substring(10));
		//**********ava gibi olsa
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
