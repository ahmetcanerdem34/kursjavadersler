package DAY_49_map;

import java.util.HashMap;
import java.util.Map;

public class Map_03 {

	public static void main(String[] args) {
	
		
      Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(101," Ali, Can, Java");
		map1.putIfAbsent(102, "Veli, Yan ,Java");
		map1.put(103, "Ali, Yan, C#");
		
		System.out.println(map1.get(101));//Ali, Can, Java
		System.out.println(map1.get(105));//null
		
		System.out.println(map1.getOrDefault(105, "Aradýðýnýz key map'te yok"));//Aradýðýnýz key map'te yok
		
		System.out.println(map1.keySet());//[101, 102, 103]-->Buyuk Set eder sýralma , diðeri küçük o getir set et methodu
		
		map1.replace(103, "Mesu, Aksu, Java");//103 u bulacak ve update yapacak, put ile ayný
		
		
			
		Map<String,Integer> map2 = new HashMap<>();
		map2.put("H", 1);
		map2.put("e", 1);
		map2.put("l", 2);
		map2.put("o", 3);
		System.out.println(map2);//{e=1, H=1, l=2, o=3}//alfabetik yazdýrýyor
		
		map2.compute("H", (key,value)->10);//value yerine 10 yazdýr demek//buna funtionalprograming deniyor
		
		System.out.println(map2);//{e=1, H=10, l=2, o=3}
		
		map2.computeIfAbsent("A", k->15);//eðer yoksa key olarka A value olarak 15 i ekleyecek
		map2.computeIfAbsent("H", v->5);//key Olark H yok sa 
		System.out.println(map2);//{A=15, e=1, H=10, l=2, o=3}
		
		map2.computeIfPresent("H", (key,value)->20);
		map2.computeIfPresent("m", (key, value)->20);
		System.out.println(map2);//{A=15, e=1, H=20, l=2, o=3}

	}

}
