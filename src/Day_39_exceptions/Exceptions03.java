package Day_39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
		//iç içe try-ctach yerine 
		//1 tane try ve multiple catch blogu kullanabiliriz
		//ancak bu durumda yazdýðýmýz exceptionslar arsýnda Parent-child iliþkisi varsa önce child class ýyazmalýyýz, 
		//aksi taktirde yani önce Parent yazýlýrsa child a is kalmaz 
		//java eriþilemez catch bloðu diyerek CTE verir
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Windows10\\eclipse-workspace\\course\\src\\Day_39_exceptions\\File");
			
			int k=0;
			
				while((k=fis.read())!=-1) {
					
					System.out.print((char)k);//k bir int sen onu char a çevir
					
					
					
				}
			} catch (FileNotFoundException e) { //önce child exception ý yazdýk
												//dosyalarla ilgili genel yazma ve okuma sorunlarý ile ilgili sorunlarý handle eder
				
				e.printStackTrace();
			
			
			
			
			
		} catch (IOException e) {
			
			//e.printStackTrace();//kod bloke olmadý ama tum hata acýklamalarýný yazdýrýr
			System.out.println(e.getMessage());//daha az hata açýklamsý yazdýrýr
		}
		System.out.println("");
		System.out.println("kod bloke olmamýþ");


	}

}
