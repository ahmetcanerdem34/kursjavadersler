package Day_39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		
		//while((k=fis.read())!=-1) { // k'ya fis objesi uzerinden read yazdim. Simdi bunu Boolean'lastiracagim. 
            //System.out.print((char) k); //Atamayi parantez icine al ve sona !=-1 yaz, alt satira in syso(k) yaz . Hala sikayet var ustune gel
            // Surrond with try catch yap . Bunun sebebi nedir ? Bir once ki exception turumuz FileNotFoundException'idi (Ya evde yoksa).
            // Dosyayi bulduk ama okuyamiyorsak exception aliyorsak o durumlar icin bunu yapiyoruz . Hata almiyorsak sorun yok.
            // System.out.print(k); boyle oldugu zaman File icinde yazilanlarin ASCII degerlerini veriyor normal degerleri yazdirmak icin;
            // System.out.print((char) k); yazarsak ASCII degil normal yazilanlari veriyor.
		
		
		//e�er kodumuz yazd���m�zda 1 den fazla exception la ili�kili durum olu�uyorsa 
		//i� i�e try-catch bloklar� olu�turabliliriz
		//bu �rnekte ilk �nce dosyay� okutmak istedik
		//java ya dosyay� bulamazsam? diye bizden yard�m eistedi
		//biz de try -catch blogu ile FileNotException ile handle etmesinde yard�mc� olduk
		//sonra sonra dosyadaki yaz�lar� �al��t�k ve java yeniden ya dosyay� okuyamazsam diye yard�m istedi
		//bide try-cath blogu ile IOException ile handle etmesini sa�lad�k
		//
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Windows10\\eclipse-workspace\\course\\src\\Day_39_exceptions\\File");
			
			int k=0;
			try {
				while((k=fis.read())!=-1) {
					
					System.out.print((char)k);//k bir int sen onu char a �evir
					
					
					
				}
			} catch (IOException e) {//dosyalarla ilgili genel yazma ve okuma sorunlar� ile ilgili sorunlar� handle eder
				
				e.printStackTrace();
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();//kod bloke olmad� ama tum hata ac�klamalar�n� yazd�r�r
			System.out.println(e.getMessage());//daha az hata a��klams� yazd�r�r
		}
		System.out.println("");
		System.out.println("kod bloke olmam��");

	}

}
