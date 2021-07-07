package DAY_49_map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Map04_VeriTabani {
	public static void main(String[] args) {

		String dosyaYolu = "C:\\Users\\Windows10\\Desktop\\veritabani.csv";

		Map<String, String> veriMap = veriTabaniAl(dosyaYolu);// bu method u sonucu döndürmek için oluþturduk
		System.out.println(veriMap);

	}

	public static Map<String, String> veriTabaniAl(String dosyaYolu) {

		Map<String, String> eklenecekMap = new HashMap<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));// br objesi oluþturduk
			String satir = br.readLine();// readline satýrý okuyor

			// bu satýr itabari ile satir = isim,Ali
			while (satir != null) {// satir boþ deðilse while body si çalýþýr//elimizde isim, Al, diye vir veri var
				System.out.println(satir);
				String keyValueArr[] = satir.split(",");// isim ve ali yi burda array yaptý ve keyvalueArray e aktardýk
				eklenecekMap.put(keyValueArr[0], keyValueArr[1]);// burada isim ve Aliyi map e ekledik, sýfýr yerine
																	// isim, 1 yerine ali indekxleri olacak
																	// sonra eþittirein karþýsýnda map e ekledik
				satir = br.readLine();// burasý bir sonraki satýrý okur redad line next görevi görür ýd,101, adres ankara
			}
		} catch (IOException e) {

			e.printStackTrace(); // detayli hata raporu verir
			
	//while sonunda 3 defa dönerek 3 veriyide iþleyecek
		}

		return eklenecekMap;
	}
}