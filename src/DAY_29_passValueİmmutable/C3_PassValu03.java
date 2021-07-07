package DAY_29_passValue�mmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassValu03 {

	public static void main(String[] args) {

		/*
		 * Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method
		 * olusturup list elemanlarini artirmayi deneyelim - 1. Method�da elemanlari for
		 * each loop kullanarak artirin - 2. Method�da elemanlari set method�u
		 * kullanarak artirin - Method�lari arka arkaya cagirip artislarin kalici olup
		 * olmadiklarini kontrol edelim.
		 */

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list);
		// [10, 11, 12]

		// �imdi 2 method aa�aca��z

		de�istirFor(list);// void olsun orda yazd�rm�� oluruz///
		System.out.println("1. method call dan sonra : " + list);// 10 11 12

		degistirSet(list);
		System.out.println("set ile de�i�tirdi�imiz liste methodun i�inde " + list);// 13 14 15

//		       [10, 11, 12]
//				13 14 15 
//				[10, 11, 12]
//				1. method call dan sonra : [10, 11, 12]
//				set ile de�i�tirdi�imiz liste methodun i�inde [13, 14, 15]
//				set ile de�i�tirdi�imiz liste methodun i�inde [13, 14, 15]

		/*
		 * // pbv bir method cagirildigi zaman methoda olusan clone value gider // pbr
		 * ise method call yapildiginda methoda orjinal variable gidier // java pbv'dur
		 * bunun istisnasi ile list'deki set methodu istisnadir, method icinde yapilsa
		 * bile degisiklikleri kalici olarak yapar.
		 */

	}

	public static void degistirSet(List<Integer> list) {
		// set methoduyla nas�l yap�yprduk
		// foreach loop da index li ��zulmez, ozam for la sadece

		for (int i = 0; i < list.size(); i++) {// list in length i olmaz size olur

			list.set(i, list.get(i) + 3);// 0 . index teki say�y� art�raca��m�z i�in get ir onu diyoruz artt�ral�m

		}
		System.out.println("set ile de�i�tirdi�imiz liste methodun i�inde " + list);// 13 14 15
		// java pass by value kullan�r; fakat ama listedeki set methodu istirnai olarak
		// methodun i�inde yap�lan de�i�iklikleri de kal�c� hale getiri

	}

	public static void de�istirFor(List<Integer> list) {

		for (Integer each : list) {// for each loop ile listeyi g�ncellemiyoruz
									// sadece herbir eleman� tek tek ca��r�p 3 fazlas�n� yazd�rd�k

			each += 3;
			System.out.print(each + " ");
			// 13 14 15

		}
		System.out.println();
		System.out.println(list);// listen�n kendisinin de�i�medi�ini g�rd�k
		// [10, 11, 12]//list olarak yazd�rd���m�z i�in k��eli yazd�

	}

}
