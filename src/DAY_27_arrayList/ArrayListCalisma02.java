package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCalisma02 {

	public static void main(String[] args) {
		
		
		//set methodu=istenen indexteki elemaný kaldýrýr;  bizim istediðimiz elemaný replace eder yani koyar
		
		List<String> list=new ArrayList<>();
				
				list.add("Ali");
				list.add("Can");
				list.add("Ayþe");
				list.add("Fatma");
				
				System.out.println(list.set(0, "Mahmet Tuncer"));
				//Ali----> kaldýracaðý elemaný gösterir, yeniden listeyi güncelle, yani yazdýr
				System.out.println(list);
				//[Mahmet Tuncer, Can, Ayþe, Fatma]
				
				System.out.println("***********************");
				
				list.set(1, "Ferdi Tayfur");
				System.out.println(list);
				//[Mahmet Tuncer, Ferdi Tayfur, Ayþe, Fatma]
				
				System.out.println("***********************");
				
				list.add(2, "Fatma Girik");
				list.add(3, "Türkan Þoray");
				System.out.println(list);
				//[Mahmet Tuncer, Ferdi Tayfur, Fatma Girik, Türkan Þoray, Ayþe, Fatma]
				
				list.set(4, "Neþe Karaböcek");
				list.set(5, "Belkýs Akkale");
				System.out.println(list);
				//[Mahmet Tuncer, Ferdi Tayfur, Fatma Girik, Türkan Þoray, Neþe Karaböcek, Belkýs Akkale]

				
				System.out.println("********************");
				
				//contains methoduna bakalým,
				System.out.println(list.contains("Kemal"));
				//false
				System.out.println("**************************");
				
				//LÝSTÝN ELEMANLARI NASIL SIRALANIR= ARRAYDA ARRAYS.SORT  tu burda
			    //COLLECTÝONS.SORT
				
				Collections.sort(list);
				System.out.println(list);
				//[Belkýs Akkale, Fatma Girik, Ferdi Tayfur, Mahmet Tuncer, Neþe Karaböcek, Türkan Þoray]
				
				
	}

}
