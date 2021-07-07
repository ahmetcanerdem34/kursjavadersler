package DAY_29_passValueÝmmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassValu03 {

	public static void main(String[] args) {

		/*
		 * Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method
		 * olusturup list elemanlarini artirmayi deneyelim - 1. Method’da elemanlari for
		 * each loop kullanarak artirin - 2. Method’da elemanlari set method’u
		 * kullanarak artirin - Method’lari arka arkaya cagirip artislarin kalici olup
		 * olmadiklarini kontrol edelim.
		 */

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list);
		// [10, 11, 12]

		// þimdi 2 method aaçacaðýz

		deðistirFor(list);// void olsun orda yazdýrmýþ oluruz///
		System.out.println("1. method call dan sonra : " + list);// 10 11 12

		degistirSet(list);
		System.out.println("set ile deðiþtirdiðimiz liste methodun içinde " + list);// 13 14 15

//		       [10, 11, 12]
//				13 14 15 
//				[10, 11, 12]
//				1. method call dan sonra : [10, 11, 12]
//				set ile deðiþtirdiðimiz liste methodun içinde [13, 14, 15]
//				set ile deðiþtirdiðimiz liste methodun içinde [13, 14, 15]

		/*
		 * // pbv bir method cagirildigi zaman methoda olusan clone value gider // pbr
		 * ise method call yapildiginda methoda orjinal variable gidier // java pbv'dur
		 * bunun istisnasi ile list'deki set methodu istisnadir, method icinde yapilsa
		 * bile degisiklikleri kalici olarak yapar.
		 */

	}

	public static void degistirSet(List<Integer> list) {
		// set methoduyla nasýl yapýyprduk
		// foreach loop da index li çözulmez, ozam for la sadece

		for (int i = 0; i < list.size(); i++) {// list in length i olmaz size olur

			list.set(i, list.get(i) + 3);// 0 . index teki sayýyý artýracaðýmýz için get ir onu diyoruz arttýralým

		}
		System.out.println("set ile deðiþtirdiðimiz liste methodun içinde " + list);// 13 14 15
		// java pass by value kullanýr; fakat ama listedeki set methodu istirnai olarak
		// methodun içinde yapýlan deðiþiklikleri de kalýcý hale getiri

	}

	public static void deðistirFor(List<Integer> list) {

		for (Integer each : list) {// for each loop ile listeyi güncellemiyoruz
									// sadece herbir elemaný tek tek caðýrýp 3 fazlasýný yazdýrdýk

			each += 3;
			System.out.print(each + " ");
			// 13 14 15

		}
		System.out.println();
		System.out.println(list);// listenýn kendisinin deðiþmediðini gördük
		// [10, 11, 12]//list olarak yazdýrdýðýmýz için köþeli yazdý

	}

}
