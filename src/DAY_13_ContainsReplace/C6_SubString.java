package DAY_13_ContainsReplace;

public class C6_SubString {

	public static void main(String[] args) {
		
		
		//alt string diye düþünelim
		//bize verilen bir cümleyle alakalý bazý yerlerini almamýz gerebilir
		
		
		String str="her ders java gibi olsa";
		
		//str ýn son ilk on katakteri yýldýz ile gizleyin, geriye kalanlar nomal yazýlsýn
		//burada substring devreye girer 
		//10. harf ile 20. harfini alma
		
		System.out.println(str.substring(10));//10. index dahil(inclusive) sonuna kadar kýsmý alýr
		//ava gibi olsa
		
		System.out.println(str.substring(str.length()-10));//son 10 basamak için bu yapýlýr
		// gibi olsa
		
		
		//ilk 10 karakteri alma
		System.out.println(str.substring(0, 10));//subString (0,10) yazýldýðýnda , sýfýr dahil olur 10 olmaz
		//her ders j							 //0 inclusice, 10 exclusive 
		
		//11. karakterden sona kadar olan stringi yazdýralým
		
		System.out.println(str.substring(11));
		//va gibi olsa
		
		
		System.out.println("**********" + str.substring(10));//baþ kýsma 10 yýldýz yaz gerisini sunStringle al
		//**********ava gibi olsa
		
		
		//baþka bir yöntem
		
		
		System.out.println(str.substring(0, 10).replaceAll("\\D", "*") +
			               str.substring(10));
			               
		System.out.println(str.substring(10, 10));//baþlangýç i,ndeksi olsun der ama bitiþ indexi olmasýn der, java son söylenenni yapar
		
		
		System.out.println(str.substring(8, 7));//hata verir.. RTE
		
		System.out.println(str.substring(23));//boþluk verdi, hiçlik
		System.out.println(str.substring(22));//length-1 son karakter
		System.out.println(str.substring(24));//lenght() den sonra verilen son karakter hata verir
		
		
		
		//str ýn son ilk on katakteri yýldýz ile gizleyin, geriye kalanlar nomal yazýlsýn
		
		String str3= str.substring(0, 10);//ilk 10 harfini aldýk
		str3=str.replaceAll("\\W", "a");
		System.out.println(str3.replaceAll("\\w", "*")+str.substring(10));
		//**********ava gibi olsa
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
