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
		
		
		//eðer kodumuz yazdýðýmýzda 1 den fazla exception la iliþkili durum oluþuyorsa 
		//iç içe try-catch bloklarý oluþturabliliriz
		//bu örnekte ilk önce dosyayý okutmak istedik
		//java ya dosyayý bulamazsam? diye bizden yardým eistedi
		//biz de try -catch blogu ile FileNotException ile handle etmesinde yardýmcý olduk
		//sonra sonra dosyadaki yazýlarý çalýþtýk ve java yeniden ya dosyayý okuyamazsam diye yardým istedi
		//bide try-cath blogu ile IOException ile handle etmesini saðladýk
		//
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Windows10\\eclipse-workspace\\course\\src\\Day_39_exceptions\\File");
			
			int k=0;
			try {
				while((k=fis.read())!=-1) {
					
					System.out.print((char)k);//k bir int sen onu char a çevir
					
					
					
				}
			} catch (IOException e) {//dosyalarla ilgili genel yazma ve okuma sorunlarý ile ilgili sorunlarý handle eder
				
				e.printStackTrace();
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();//kod bloke olmadý ama tum hata acýklamalarýný yazdýrýr
			System.out.println(e.getMessage());//daha az hata açýklamsý yazdýrýr
		}
		System.out.println("");
		System.out.println("kod bloke olmamýþ");

	}

}
