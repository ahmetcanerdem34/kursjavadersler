package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCalisma02 {

	public static void main(String[] args) {
		
		
		//set methodu=istenen indexteki eleman� kald�r�r;  bizim istedi�imiz eleman� replace eder yani koyar
		
		List<String> list=new ArrayList<>();
				
				list.add("Ali");
				list.add("Can");
				list.add("Ay�e");
				list.add("Fatma");
				
				System.out.println(list.set(0, "Mahmet Tuncer"));
				//Ali----> kald�raca�� eleman� g�sterir, yeniden listeyi g�ncelle, yani yazd�r
				System.out.println(list);
				//[Mahmet Tuncer, Can, Ay�e, Fatma]
				
				System.out.println("***********************");
				
				list.set(1, "Ferdi Tayfur");
				System.out.println(list);
				//[Mahmet Tuncer, Ferdi Tayfur, Ay�e, Fatma]
				
				System.out.println("***********************");
				
				list.add(2, "Fatma Girik");
				list.add(3, "T�rkan �oray");
				System.out.println(list);
				//[Mahmet Tuncer, Ferdi Tayfur, Fatma Girik, T�rkan �oray, Ay�e, Fatma]
				
				list.set(4, "Ne�e Karab�cek");
				list.set(5, "Belk�s Akkale");
				System.out.println(list);
				//[Mahmet Tuncer, Ferdi Tayfur, Fatma Girik, T�rkan �oray, Ne�e Karab�cek, Belk�s Akkale]

				
				System.out.println("********************");
				
				//contains methoduna bakal�m,
				System.out.println(list.contains("Kemal"));
				//false
				System.out.println("**************************");
				
				//L�ST�N ELEMANLARI NASIL SIRALANIR= ARRAYDA ARRAYS.SORT  tu burda
			    //COLLECT�ONS.SORT
				
				Collections.sort(list);
				System.out.println(list);
				//[Belk�s Akkale, Fatma Girik, Ferdi Tayfur, Mahmet Tuncer, Ne�e Karab�cek, T�rkan �oray]
				
				
	}

}
