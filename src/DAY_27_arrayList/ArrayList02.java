package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {

		// set methodu=istenen indexteki elemaný kaldýrýr; bizim istediðimiz elemaný
		// replace eder yani koyar

		List<String> list = new ArrayList<>();

		list.add("Ali");
		list.add("Can");
		list.add("Ayþe");
		list.add("Fatma");

		list.set(2, "Kemal");// 2 numaralý index e kemali yerleþtir
		System.out.println(list);
		// [Ali, Can, Kemal, Fatma]
		System.out.println("*****************");

		list.set(0, "Semih");
		System.out.println(list);
		// [Semih, Can, Kemal, Fatma]

		System.out.println("***********************");

		// list.set(4, "Mustafa");//sýnýrlarýn dýþýnda diye hata verir RTE

		list.add(2, "Yasin");// ad ekliyor; set deðiþtiriyor
		System.out.println(list);
		// [Semih, Can, Yasin, Kemal, Fatma]

		System.out.println("**************");

		list.add(5, "Hürriyet");
		System.out.println(list);
		// [Semih, Can, Yasin, Kemal, Fatma, Hürriyet]

		// list.add(10, "Sefer");// eklemez, çünkü size dan 1 fazlasýný, (birinin
		// arkasýna) ekliyor, daha fazla sayýdakini eklemiyor

		System.out.println("******************");

		System.out.println(list.contains("Hürriyet"));// true yada false vermeli
		System.out.println(list.contains("Mehmet"));
//		true
//		false

		System.out.println("**************");
		System.out.println(list.contains("cemal"));
		// false
		System.out.println(list);

		System.out.println("****************");

		// LÝSTÝN ELEMANLARI NASIL SIRALANIR= ARRAYDA ARRAYS.SORT tu burda
		// COLLECTÝONS.SORT

		Collections.sort(list);
		System.out.println(list);// alfabeye göre sýralyacak
		// [Can, Fatma, Hürriyet, Kemal, Semih, Yasin]

	}

}
