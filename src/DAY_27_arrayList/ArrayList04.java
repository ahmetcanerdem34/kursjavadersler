package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		
		//yeni bir list oluþturalým
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(20);
		list2.add(10);
		
		//equals metodu 2 listeyi hem elemanlarý hem de elemanlarýn index i ile karþýlaþtýrý
		//her ikisi eþitse true döner yoksa false döner
		System.out.println(list1.equals(list2));//eþit mi		
		//true
		System.out.println("*********************");
		//düzenlediðimizde de olur
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1.equals(list2));
		//true
		
		System.out.println("*******************");
		
		//yeni bir method
		list1.clear();
		System.out.println(list1);//temizler
		//[]

		
	}

}
