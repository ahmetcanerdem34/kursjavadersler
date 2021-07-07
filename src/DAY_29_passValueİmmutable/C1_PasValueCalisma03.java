package DAY_29_passValueÝmmutable;

import java.util.ArrayList;
import java.util.List;

public class C1_PasValueCalisma03 {

	public static void main(String[] args) {
		
		
		/*
		 * Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method
		 * olusturup list elemanlarini artirmayi deneyelim - 1. Method’da elemanlari for
		 * each loop kullanarak artirin - 2. Method’da elemanlari set method’u
		 * kullanarak artirin - Method’lari arka arkaya cagirip artislarin kalici olup
		 * olmadiklarini kontrol edelim.
		 */
		
		List<Integer> list= new ArrayList<>();
		
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list);
		//[10, 11, 12]
		
		degistirFor(list);
		System.out.println("1. method call dan sonra : " + list);
		//1. method call dan sonra : [10, 11, 12]
		
		degistirSetList(list);
		System.out.println("set ile deðiþtirdiðimiz liste methodun içinde " + list);
		//set ile deðiþtirdiðimiz liste methodun içinde [15, 16, 17]
	}

	public static void degistirSetList(List<Integer> list) {
		
		
		for (int i = 0; i <list.size(); i++) {
			
			list.set(i, list.get(i)+ 5);
			
		}
		System.out.println("set ile deðiþtirdiðimiz liste methodun içinde " + list);
		//set ile deðiþtirdiðimiz liste methodun içinde [15, 16, 17]
	}
	

	public static void degistirFor(List<Integer> list) {
		
		for (Integer each : list) {
			
			each+=5;
			
			System.out.print(each +" ");
			//15 16 17  
		}
		System.out.println();
		System.out.print(list);
		//[10, 12, 13]//liste olarak yazdýrýnca köþeli ile yazdý
		
		
		
	}

}
