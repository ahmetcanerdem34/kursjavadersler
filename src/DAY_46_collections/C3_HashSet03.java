package DAY_46_collections;

import java.util.HashSet;
import java.util.Set;

public class C3_HashSet03 {

	public static void main(String[] args) {
		
		Set<String> set1=new HashSet<>();
		set1.add("V");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		set1.add("F");
		System.out.println(set1);//[A, B, C, V, F]
		
		set1.clear();
		System.out.println(set1);//[]
		System.out.println("*************");
		
		set1.add("V");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		System.out.println(set1);//[A, B, V]
		
		System.out.println("****************");
		Set<String> set2=new HashSet<>();
		
		set2.add("V");
		set2.add("B");
		set2.add("A");
		set2.add("B");
		set2.add("F");
		System.out.println(set2);//[A, B, V, F]
		
		System.out.println(set1.containsAll(set2));//false--1 in f si yok
		System.out.println(set1.equals(set2));//false
		//set1.removeAll(set2);//set1. dedi�imiz i�in �nce set1 de�nce i�lem yap�yor, set1 den set2 n�n t�m elemanlar�n� ��kar diyor, 1 tane bulusa bile true da d�ner
		System.out.println(set1);//[]
		System.out.println(set2);//[A, B, V, F]
		
		set1.retainAll(set2);//set1 de olanlar set2 de de varsa muhafaza et anlam�nda ve set 2 de olmayan elemanlar� siler
		System.out.println(set1);
		System.out.println(set2);
		
		
	}

}
