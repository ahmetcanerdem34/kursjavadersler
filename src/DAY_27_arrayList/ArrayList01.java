package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		//bir list olu�turmak istedi�imizde
		
		List<String> list=new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ay�e");
		list.add("Fatma");
		
		System.out.println(list);
		//[Ali, Can, Ay�e, Fatma]
		
		System.out.println("******************");
		
		System.out.println(list.size());
		//4
		
		System.out.println("********************");
		
		System.out.println(list.remove(1));//index i 1 olan can � silip eleman� ana d�nd�recek
		System.out.println(list);
//		Can//d�nd�rd�
//		[Ali, Ay�e, Fatma]
		
		System.out.println("*********************");
		
		System.out.println(list.remove("Ay�e"));
		System.out.println(list);//ay�eyi silip bize true d�nd�recek
//		true
//		[Ali, Fatma]
		System.out.println("**********************");
		
		System.out.println(list.remove("Mehmet"));//mehmeti bulamad��� i�in silemeyecek bize dalse d�necek
		System.out.println(list);
//		false
//		[Ali, Fatma]
		
		System.out.println("***********");

		
		list.remove(1);
		list.remove("Ali");
		System.out.println(list);
		//[]----->hepsini bo�altt�k
		
		
		
	}

}
