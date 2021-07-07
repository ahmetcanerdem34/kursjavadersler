package DAY_47_queueANDmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Map02 {

	public static void main(String[] args) {
		
		//a�a��da verilen bir mapde yaz�l�m dili olan java k�s� isimlerini(Ali Veli) liste olarak d�nd�ren 
		//bir method yaz�n�z
		
		
		Map<Integer,String>map1 = new HashMap<>();     //ben methoda ne g�nderece�im---method bana ne d�nd�recek

		map1.put(101, "Ali, Can, Java");
		map1.put(102, "Veli, Yan, Java");
		map1.put(103, "Ali, Yan, C#");
		
		String istenenDil="Java";
		
		//buras� methodun conteyn�r�, methoddan gelen buraya assigh edilecek
		List<String> isimList = javaBilenler(map1,istenenDil);//buras� method ve call da  map a g�nderdi�imiz parametreler i�indemethod bana ne d�nd�recek
		
		System.out.println(isimList);//[Ali, Veli]
	}

	private static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {
		
		List<String> isimListesi = new ArrayList<>();
		
		for (String each : map1.values()) {//bu k�sm� yaz�nca multidimantinol array gibi hareket ediyor..
											//value bize de�erleri verecek ilki AL� CAN jAVA, SONRA D��ERLER� TOPLAM 3 K��
			//System.out.println(each);
//			Ali, Can, Java
//			Veli, Yan, Java
//			Ali, Yan, C#
			//splitle her birini ayr� alall�m virg�lle
			
			String arr[]=each.split(", ");//each ilk �nce Ali can jav y� ald�, split yap�nca , ve bo�luk koyduk[Ali,Can,Java] bu �ekle split array e d�n��t�rd�
			
			if(arr[2].equalsIgnoreCase(istenenDil)) {//2. indexi Java olanin 0. indexini d�nd�r
				isimListesi.add(arr[0]);
			}
		}
		
		return isimListesi;
		
		// Method olusturmam gerekirse sunlari dusunmeliyim
        // > 1. Ben methoda ne gonderecegim > map'i ve java(string) kelimesini yollayacagim
        // > 2. Method bana ne dondurecek > list olarak isimleri donecek
        // 1) Value'lari birer birer almam lazim
        
        // Maps komplex bir yapidadir Key ve value'lardan olusur. 
        // Elemanlari bana tek tek getir diyemeyiz
        // {101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#}
        // Map yapisindan benim handle edebilecegm bir yapiya gecmem lazim.
        // Bunun icin de map1.values() ile komplex map yapisindan cikarak 
        // multidimensional array'e donusuyr gibi dusunebiliriz  
        // >> {{Ali, Can, Java}, { Veli, Yan, Java},{Ali, Yan, C#}} 
        // komplex yapida ki map'im collectiona donmus oldu
        // Collection'dan bahsedince artik for-each kullanabiliriz
        // For-each ile collection'da ki her bir elemani tek tek ele alabilirim
        // 1. Eleman > Ali, Can, Java 
        // String arr[] = each.split(", "); >> stringi ", " ile ayirarak array'e cevirdi 
        // maptan collectiona ordan da stringe ve kelimeleri tek tek kullanabilecegm array'a donmus oldum
        // if ile Array'in 2. indexi "Java" ise isim olan 1. indexi olusturdugum listeme ekle diyoruz
        // 2. ve 3. elemanlar icin de ayn islemi yapacak ve donguden cikarak istendigi sekilde listeyi return edecek
	
	}

}
