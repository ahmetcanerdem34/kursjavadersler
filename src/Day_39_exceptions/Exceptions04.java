package Day_39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions04 {

	public static void main(String[] args) {
		/*
		 eðer handle edilecek exceptionslar arasýnda parent-child iliþkisi varsa bu duurmda child exception için catch blogu yazmasakta
		 kodumuz çalýþýr
		 child exception ý silmenin pozitif yaný : tek cach blogu ile tum exceptionslar handle edilebilir
		 negatif yaný: bir sorunla karsýlatýðýmýz zaman bunun dosya bulunmadýðý için mi yoksa dosya kullanýlmadýðý için mi olduðu anlaþýlmaz
		 */
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Windows10\\eclipse-workspace\\course\\src\\Day_39_exceptions\\File");
			
			int k=0;
			
				while((k=fis.read())!=-1) {
					
					System.out.print((char)k);//k bir int sen onu char a çevir	
					fis.close();
				}
	
		} catch (IOException e) {
			
			//e.printStackTrace();//kod bloke olmadý ama tum hata acýklamalarýný yazdýrýr
			System.out.println(e.getMessage());//daha az hata açýklamsý yazdýrýr
		}
		System.out.println("");
		System.out.println("kod bloke olmamýþ");
	}

}
