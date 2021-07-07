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

		Map<String, String> veriMap = veriTabaniAl(dosyaYolu);// bu method u sonucu d�nd�rmek i�in olu�turduk
		System.out.println(veriMap);

	}

	public static Map<String, String> veriTabaniAl(String dosyaYolu) {

		Map<String, String> eklenecekMap = new HashMap<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));// br objesi olu�turduk
			String satir = br.readLine();// readline sat�r� okuyor

			// bu sat�r itabari ile satir = isim,Ali
			while (satir != null) {// satir bo� de�ilse while body si �al���r//elimizde isim, Al, diye vir veri var
				System.out.println(satir);
				String keyValueArr[] = satir.split(",");// isim ve ali yi burda array yapt� ve keyvalueArray e aktard�k
				eklenecekMap.put(keyValueArr[0], keyValueArr[1]);// burada isim ve Aliyi map e ekledik, s�f�r yerine
																	// isim, 1 yerine ali indekxleri olacak
																	// sonra e�ittirein kar��s�nda map e ekledik
				satir = br.readLine();// buras� bir sonraki sat�r� okur redad line next g�revi g�r�r �d,101, adres ankara
			}
		} catch (IOException e) {

			e.printStackTrace(); // detayli hata raporu verir
			
	//while sonunda 3 defa d�nerek 3 veriyide i�leyecek
		}

		return eklenecekMap;
	}
}