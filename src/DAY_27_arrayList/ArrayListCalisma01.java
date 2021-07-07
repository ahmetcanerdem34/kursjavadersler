package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCalisma01 {

	public static void main(String[] args) {
		
		//bir list olu�turmak istedi�imizde
		
List<String> list=new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ay�e");
		list.add("Fatma");
		
		System.out.println(list);
		//[Ali, Can, Ay�e, Fatma]
		
		System.out.println("*********************");

		System.out.println(list.size());
		//	4
		
		System.out.println("-------------------");

		list.add("Hayriye");
		System.out.println(list);
		//[Ali, Can, Ay�e, Fatma, Hayriye]
		
		System.out.println("********************");
		
		list.remove(1);
		System.out.println(list);
		//[Ali, Ay�e, Fatma, Hayriye]
		
		System.out.println("******************");
		
		System.out.println(list.remove("Ali"));
		//true
		System.out.println(list.remove("Mehmet"));
		//false
		System.out.println(list);
		//[Ay�e, Fatma, Hayriye]//Ali gitti
		
		System.out.println("*****************");
		
		list.remove(0);
		list.remove(1);
		System.out.println(list);
		//[Fatma]
		
		list.remove(0);
		System.out.println(list);
		//[]
		
		//liste bo�ald�

	
		
		
	}

}
