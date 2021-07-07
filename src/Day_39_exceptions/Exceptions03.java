package Day_39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
		//i� i�e try-ctach yerine 
		//1 tane try ve multiple catch blogu kullanabiliriz
		//ancak bu durumda yazd���m�z exceptionslar ars�nda Parent-child ili�kisi varsa �nce child class �yazmal�y�z, 
		//aksi taktirde yani �nce Parent yaz�l�rsa child a is kalmaz 
		//java eri�ilemez catch blo�u diyerek CTE verir
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Windows10\\eclipse-workspace\\course\\src\\Day_39_exceptions\\File");
			
			int k=0;
			
				while((k=fis.read())!=-1) {
					
					System.out.print((char)k);//k bir int sen onu char a �evir
					
					
					
				}
			} catch (FileNotFoundException e) { //�nce child exception � yazd�k
												//dosyalarla ilgili genel yazma ve okuma sorunlar� ile ilgili sorunlar� handle eder
				
				e.printStackTrace();
			
			
			
			
			
		} catch (IOException e) {
			
			//e.printStackTrace();//kod bloke olmad� ama tum hata ac�klamalar�n� yazd�r�r
			System.out.println(e.getMessage());//daha az hata a��klams� yazd�r�r
		}
		System.out.println("");
		System.out.println("kod bloke olmam��");


	}

}
