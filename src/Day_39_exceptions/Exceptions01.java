package Day_39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		
		//java ya bir dosya okumasýný veya bir dosya yazmasýný söylediðimizde 
		//java "ya dosyayý bulamazsam" der ve bizden çözüm üretmemzi bekler
		//java kodu yazar yazmaz burada olasý proo-blemð görür CTE verir
		//kodumuzu yazdýðýomýz anda ortaya çýkan bu tür exception lara Checked Exception(kontrol edilebilir sorun) denir
		//dosya bulma ilee ilgili exception turu: FileNotFoundException
		
		// File dosyasi icin File'a sag klik yap, Properties'i sec, Location'i kopyala ve buraya yapistir.
		// Sikayete hala devam ediyor ustune gel Surrond with try catch'i sec
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Windows10\\eclipse-workspace\\course\\src\\Day_39_exceptions\\File");
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();//kod bloke olmadý ama tum hata acýklamalarýný yazdýrýr
			System.out.println(e.getMessage());//daha az hata açýklamsý yazdýrýr
		}
		System.out.println("kod bloke olmamýþ");
	}

}
