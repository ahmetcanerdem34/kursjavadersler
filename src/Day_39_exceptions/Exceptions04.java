package Day_39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions04 {

	public static void main(String[] args) {
		/*
		 e�er handle edilecek exceptionslar aras�nda parent-child ili�kisi varsa bu duurmda child exception i�in catch blogu yazmasakta
		 kodumuz �al���r
		 child exception � silmenin pozitif yan� : tek cach blogu ile tum exceptionslar handle edilebilir
		 negatif yan�: bir sorunla kars�lat���m�z zaman bunun dosya bulunmad��� i�in mi yoksa dosya kullan�lmad��� i�in mi oldu�u anla��lmaz
		 */
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Windows10\\eclipse-workspace\\course\\src\\Day_39_exceptions\\File");
			
			int k=0;
			
				while((k=fis.read())!=-1) {
					
					System.out.print((char)k);//k bir int sen onu char a �evir	
					fis.close();
				}
	
		} catch (IOException e) {
			
			//e.printStackTrace();//kod bloke olmad� ama tum hata ac�klamalar�n� yazd�r�r
			System.out.println(e.getMessage());//daha az hata a��klams� yazd�r�r
		}
		System.out.println("");
		System.out.println("kod bloke olmam��");
	}

}
