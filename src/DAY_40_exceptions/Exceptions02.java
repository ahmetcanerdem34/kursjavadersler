package DAY_40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Windows10\\eclipse-workspace\\course\\src\\Day_39_exceptions\\File");
		/*
		 /*
    Throws Throw
    Throw keyword'u 1 exc. firlatmak icin. Throw declare etmiyor
    Throws ise bir veya daha fazla exc.'i declera etmek icindir. "," ile ayrilarak yazilabilir.
    
    Throw method'un icinde kullanilir.
    Throws keyword ise method signature'inda kullanilir.
    
     Throw'dan sonra new diyip exc. turunu yazmamis lazim.
     Throws'dan sonra sadece exc. turu yazilmasi yeterlidir.
    
    */
		
		/*
		 * 
		 * 
		 THROW:
	1- Aleni sekilde exception throw eder
	2- throw bir tane exception firlatmakicin kullanilir
	3- throw method icinde kullanilir
	4- Syntac olarak throw kelimesinden sonra instance variable kullanilir
		 */
		
		/*
		 *throw new ile kullanilir throws main metoddan sonra veya metoddan sonra yazilir
		 */
		
		
		//try-catch blogu exception ile handle etmekte kullan�l�r
		//throws keyword u ise sadece declaration d�r, 
		//dolay��syla throw kullan�lan bir method da exception olu�ursa KOD BLOKE olur
		
		int k=0;
		
		while((k=fis.read())!=-1) {
			
			System.out.print((char)k);//k bir int sen onu char a �evir
			
		}
		//e�er 1 den fazla exception i�in throws keyword u kullanacaksak
		//yazaca��m�z exception lar�n ara�ndaki ili�ki ve s�ralama �nmeli olur
		//e�er yazd���m�z exceptionlar ars�nda paret child ili�kisi varsa 
		//�nce child exception yaz�lmal�d�r, aksi taktirde child exception eri�ilemez olur
		
		//e�er 
	}

}
