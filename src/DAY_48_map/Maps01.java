package DAY_48_map;

import java.util.HashMap;
import java.util.Map;

public class Maps01 {

	public static void main(String[] args) {
		
		//key ler umique olmal�d�r
		Map<Integer,String>map1 = new HashMap<>();
		HashMap<Integer,String>map2 = new HashMap<>();//basa hash de yazabiliriz yukardaki ile ayn�
		
		
		map1.put(101, "Ali, Can, Java");
		map1.put(102, "Veli, Yan, Java");
		map1.put(103, "Ali, Yan, C#");
		
		System.out.println(map1);//{101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#}
		
		map2.put(101, "Vali, Zan, SQL");
		map2.put(102, "Deli, Yan, Java");
		map2.put(103, "Bali, Jan, C#");
		System.out.println(map2);//{101=Vali, Zan, SQL, 102=Deli, Yan, Java, 103=Ali, Yan, C#}
		
		
		map1.putAll(map2);//map2 y� map 1 e ekleiyorum
		System.out.println(map1);//{101=Vali, Zan, SQL, 102=Deli, Yan, Java, 103=Bali, Jan, C#}
		//map e yeni bir eleman(entry) ekledi�imizde, Java key nm�aras�na bakar
		//ilk map te eklenecek key varsa o zaman bu key ait value eklenen value ile update olur
		
		
		map2.put(104, "�mer, Ar�, SQL" );//104 yoktu getirdi s�ralamay ekledi
		map1.putAll(map2);
		System.out.println(map1);//{101=Vali, Zan, SQL, 102=Deli, Yan, Java, 103=Bali, Jan, C#, 104=�mer, Ar�, SQL}
		//key farkl� oldu�u i�in getirdi ekledi
		
		map1.putIfAbsent(102, "Ahmet, Demir, Java");//java ya dedik ki map1 102 yoksa ekle, vard� eklemedi
		System.out.println(map1);//{101=Vali, Zan, SQL, 102=Deli, Yan, Java, 103=Bali, Jan, C#, 104=�mer, Ar�, SQL}
		
		map1.putIfAbsent(100, "Ahmet, Demir, Java");//javaya dedik map1 de 100 yoksa ekle, yoktu ekledi
		System.out.println(map1);//{100=Ahmet, Demir, Java, 101=Vali, Zan, SQL, 102=Deli, Yan, Java, 103=Bali, Jan, C#, 104=�mer, Ar�, SQL}
		
		System.out.println("**************************************");
		System.out.println(map1.containsKey(101));//ture
		System.out.println(map1.containsValue("Java"));//ture
		System.out.println(map1.containsValue("Vehri, Bas, Java"));//false
		// aranan degere tam olarak esit olan bir value varsa true dondurur
        // value icinde gecen kelime veya String'leri bulmaz
        
		
		
	}

}
