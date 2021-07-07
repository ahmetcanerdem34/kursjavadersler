package DAY_49_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_01 {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(101," Ali, Can, Java");
		map1.putIfAbsent(102, "Veli, Yan ,Java");
		map1.put(103, "Ali, Yan, C#");
		
		System.out.println(map1);//{101= Ali, Can, Java, 102=Veli, Yan ,Java, 103=Ali, Yan, C#}--bir alttaki ile parantez farký
		System.out.println(map1.size());//3
		
		System.out.println(map1.entrySet());//[101= Ali, Can, Java, 102=Veli, Yan ,Java, 103=Ali, Yan, C#]--yukardakinden farký köþeli set parantezi
		
		System.out.println(map1.entrySet().size());//3
		//entry key, value ikilisinden ooluþan tum eleman
		
		Set<Entry<Integer,String>> mapdanSet = map1.entrySet();//map i set e çeviriken data turu bu þekþlde yapýlýr

		for (Entry<Integer, String> each : mapdanSet) {
			
			System.out.println(each);
//			        101= Ali, Can, Java
//					102=Veli, Yan ,Java
//					103=Ali, Yan, C#
			
			
			System.out.println(map1.equals(mapdanSet));//false-->içindeki elemanlar olsada 1i set biri map , exception fýrlatmadý
			
			System.out.println(map1.get(101));// Ali, Can, Java
			
			
			
		}
	}

}
