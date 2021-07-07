package Day_39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		
		//java ya bir dosya okumas�n� veya bir dosya yazmas�n� s�yledi�imizde 
		//java "ya dosyay� bulamazsam" der ve bizden ��z�m �retmemzi bekler
		//java kodu yazar yazmaz burada olas� proo-blem� g�r�r CTE verir
		//kodumuzu yazd���om�z anda ortaya ��kan bu t�r exception lara Checked Exception(kontrol edilebilir sorun) denir
		//dosya bulma ilee ilgili exception turu: FileNotFoundException
		
		// File dosyasi icin File'a sag klik yap, Properties'i sec, Location'i kopyala ve buraya yapistir.
		// Sikayete hala devam ediyor ustune gel Surrond with try catch'i sec
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Windows10\\eclipse-workspace\\course\\src\\Day_39_exceptions\\File");
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();//kod bloke olmad� ama tum hata ac�klamalar�n� yazd�r�r
			System.out.println(e.getMessage());//daha az hata a��klams� yazd�r�r
		}
		System.out.println("kod bloke olmam��");
	}

}
