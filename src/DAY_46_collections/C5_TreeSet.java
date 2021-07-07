package DAY_46_collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C5_TreeSet {

	public static void main(String[] args) {
		//sýralama çok önemli ise tree yi kullanmalýsýnýz
		
		
		Set<String> set1 = new TreeSet<>();//1617826750469
//TreeSet in hýzýna bakalým
		
		for (int i = 0; i < 10000; i++) {
			set1.add(""+i);	
			}
			System.out.println(System.currentTimeMillis());//1617826750470
			System.out.println("**************************");
			
			Set<String> set2= new HashSet<>();
			System.out.println(System.currentTimeMillis());
			for (int i = 0; i < 10000; i++) {
				set2.add(""+i);	
				}
			TreeSet<String> set3= new TreeSet<>(set2);//1617826750642-- 
			System.out.println(System.currentTimeMillis());

	}

}
