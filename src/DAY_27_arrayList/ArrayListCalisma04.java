package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCalisma04 {

	public static void main(String[] args) {
		
		
		//yeni bir list oluþturalým
		
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		System.out.println(list1);
		//[10, 20]
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(20);
		list2.add(10);
		//eþit mi diye bakalým
		
		System.out.println(list1.equals(list2));
		//false
		
		System.out.println("******************");
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1.equals(list2));
		//true
		
		
		System.out.println("1*********************");
		//butun listeyi temizleyelim
		
		list1.clear();
		System.out.println(list1);//bu temiz
		System.out.println(list2);
		
//		[]
//		[10, 20]

		
		
		
	}

}
