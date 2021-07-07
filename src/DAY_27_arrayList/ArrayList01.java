package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		//bir list oluþturmak istediðimizde
		
		List<String> list=new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayþe");
		list.add("Fatma");
		
		System.out.println(list);
		//[Ali, Can, Ayþe, Fatma]
		
		System.out.println("******************");
		
		System.out.println(list.size());
		//4
		
		System.out.println("********************");
		
		System.out.println(list.remove(1));//index i 1 olan can ý silip elemaný ana döndürecek
		System.out.println(list);
//		Can//döndürdü
//		[Ali, Ayþe, Fatma]
		
		System.out.println("*********************");
		
		System.out.println(list.remove("Ayþe"));
		System.out.println(list);//ayþeyi silip bize true döndürecek
//		true
//		[Ali, Fatma]
		System.out.println("**********************");
		
		System.out.println(list.remove("Mehmet"));//mehmeti bulamadýðý için silemeyecek bize dalse dönecek
		System.out.println(list);
//		false
//		[Ali, Fatma]
		
		System.out.println("***********");

		
		list.remove(1);
		list.remove("Ali");
		System.out.println(list);
		//[]----->hepsini boþalttýk
		
		
		
	}

}
