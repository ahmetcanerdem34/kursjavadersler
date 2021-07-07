package Day_44_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);//[A, B, C, D]
		
		//her elemana b harfini ekleyelim
		
		for (String each : list) {//her bir eleman� al�p getirecek
			each+="B";
			
			System.out.print(each+" ");
		}
		System.out.println(" ");
		System.out.println(list);
		
//		        [A, B, C, D]
//				AB BB CB DB  
//				[A, B, C, D]
		
		//Collection da her yap� index i desteklemez ornegin set te �ndex olmaz
		//index olmay�nca mecburen tum elemanlara ulamak i�in for each loop kullan�l�r
		//For each loop ilede update veya delete yapamay�z
		//bunun i�in java Iterator interface ini olu�turmu�tur
		
		Iterator it1= list.iterator();/*�terator interface oldu�u i�in obje uretemem;
		 -bunun yerine kullanaca��m�z collection ismini yaz�p kullanarak �terator methodu �a��rabilirz*/
		//next(), hasNext(), remove() methodlar�na sahiptir
		//listedeki tum elemanlar� iterator kullanarak silelim
		
		// Iterator 4 tane method'a sahiptir. 
        // 1) next() bir sonrakine gecer,
        // 2) hasNext() booleandir bir sonraki var mi diye sorar,
        // 3) remove() siler
        // 4) forEachRemaining()
		
		while(it1.hasNext()) {
			
			it1.next();
			it1.remove();
			
		}
		
		System.out.println(list);
		System.out.println(list.size());//0
//		        [A, B, C, D]
//				AB BB CB DB  
//				[A, B, C, D]
//				[]
//		

	}

}
