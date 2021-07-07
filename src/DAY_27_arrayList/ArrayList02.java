package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {

		// set methodu=istenen indexteki eleman� kald�r�r; bizim istedi�imiz eleman�
		// replace eder yani koyar

		List<String> list = new ArrayList<>();

		list.add("Ali");
		list.add("Can");
		list.add("Ay�e");
		list.add("Fatma");

		list.set(2, "Kemal");// 2 numaral� index e kemali yerle�tir
		System.out.println(list);
		// [Ali, Can, Kemal, Fatma]
		System.out.println("*****************");

		list.set(0, "Semih");
		System.out.println(list);
		// [Semih, Can, Kemal, Fatma]

		System.out.println("***********************");

		// list.set(4, "Mustafa");//s�n�rlar�n d���nda diye hata verir RTE

		list.add(2, "Yasin");// ad ekliyor; set de�i�tiriyor
		System.out.println(list);
		// [Semih, Can, Yasin, Kemal, Fatma]

		System.out.println("**************");

		list.add(5, "H�rriyet");
		System.out.println(list);
		// [Semih, Can, Yasin, Kemal, Fatma, H�rriyet]

		// list.add(10, "Sefer");// eklemez, ��nk� size dan 1 fazlas�n�, (birinin
		// arkas�na) ekliyor, daha fazla say�dakini eklemiyor

		System.out.println("******************");

		System.out.println(list.contains("H�rriyet"));// true yada false vermeli
		System.out.println(list.contains("Mehmet"));
//		true
//		false

		System.out.println("**************");
		System.out.println(list.contains("cemal"));
		// false
		System.out.println(list);

		System.out.println("****************");

		// L�ST�N ELEMANLARI NASIL SIRALANIR= ARRAYDA ARRAYS.SORT tu burda
		// COLLECT�ONS.SORT

		Collections.sort(list);
		System.out.println(list);// alfabeye g�re s�ralyacak
		// [Can, Fatma, H�rriyet, Kemal, Semih, Yasin]

	}

}
