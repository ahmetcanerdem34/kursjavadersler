package DAY_45_linkedList;

import java.util.LinkedList;

public class C2_LinkedList02 {

	public static void main(String[] args) {
		
		//collections da e�itli�in sol taraf�nda <> i�inde data t�r� yaz�lmasa
		//veya data turu Objeckt yaz�lsa collectiion �al���r
		//ama b�yle bir kullan�mda surekli casting yap�ld��� i�in 
		//zaman ve haf�za a��s�ndan verimli de�ildir
		LinkedList<Object> ll1 = new LinkedList<>();//linkedlist olu�turduk
		
		System.out.println(System.currentTimeMillis());//1617737791013--->�al��ma h�z verimine bakm�� olduk di�erleirnede bakabiliriz
		for (int i = 0; i < 1000; i++) {				//dei�erlerinide ya�znca hangisinin dah h�zl� oldu�u anla��l�r, pc ler b�yle �al���r yava� i�lemler
														//olunca bu akla gelmeli
			ll1.add("A"+i);//concatination
			ll1.add(20+i);//toplama
			ll1.add('C');//ascii de�erleri
		}
		
		
		///bu listte add methodu ile a ekleyeyim, ekler, di�erlerini eklemiyordu Object e �evirince yukar�y� oldu.//en geni�tir ��nk� hzadem..
//		ll1.add("A");
//		ll1.add(20);
//		ll1.add('C');
//		System.out.println(ll1);//[A, 20, C]
		
		
		LinkedList ll2 = new LinkedList<>();//<Object> tamamen sildik kabul etti

		ll2.add("B");
		ll2.add(20);
		ll2.add('K');
		System.out.println(ll2);//[B, 20, K]
		
//		LinkedList<String> ll3 = new LinkedList<>();//kabul etmedi
//
//		ll3.add("B");
//		ll3.add(20);
//		ll3.add('K');
//		System.out.println(ll3);
	}

}
