package DAY_46_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class C4_LinkedHasSet {

	public static void main(String[] args) {
		// Tekrarli eleman kabul etmezler
        // Elemanlari ekleme sirasina (insertion order)'e gore dizerler.
        // Ekleme ve remove islemleride hizlidirlar.
        // LinkedHashSet, HashSet'den yavastir.
		
		Set<String> set1= new LinkedHashSet<>();
		set1.add("D");
		set1.add("A");
		set1.add("F");
		set1.add("D");
		set1.add("F");
		System.out.println(set1);//[D, A, F]
		//for içine alarak hýzýný ölçelim----------->LinkedHash dah yavaþ aþaðýdaki HashSet e göre
		
		for (int i = 0; i < 1000; i++) {
		set1.add(""+i);	
		}
		System.out.println(System.currentTimeMillis());
		System.out.println("**************************");
		
		Set<String> set2= new HashSet<>();
		
		for (int i = 0; i < 1000; i++) {
			set2.add(""+i);	
			}
		System.out.println(System.currentTimeMillis());
//		1617826009378---LinkedHash
//		**************************
//		1617826009382--HashSet
	}

}
