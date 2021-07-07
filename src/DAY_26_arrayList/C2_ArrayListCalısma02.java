package DAY_26_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayListCal�sma02 {

	public static void main(String[] args) {
		
		//listin uzunlu�u nas�l bulunur
		
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		//�nce listeyi yazd�ral�m
		System.out.println(list);
		//[10, 11, 12, 13, 14]
		//uzunlu�unu size ile buluyoruz
		System.out.println(list.size());
		//5
		
		System.out.println("*******************");
		//bir eleman� nas�l sileriz
		
		list.remove(2);//12yi yani 2. index i sildirelim
		System.out.println(list);
		//[10, 11, 13, 14]
		
		//list.remove(5);
		//System.out.println(list);
		//olmayan index i sildirmek; RTE verir
		
		System.out.println("*************************");
		
		System.out.println(list.remove(1));
		//11--------->biz syso i�erisinde bir index i kald�r dersek onu getiri bize g�sterir ve kald�r�, 
		//sonraki list te o say� yoktur
		System.out.println(list);
		//[10, 13, 14]

		System.out.println("*****************************");
		
		
		List<String> liststr= new ArrayList<>();
		
		liststr.add("Banglade�");
		liststr.add("Zanzibar");
		liststr.add("Kongo");
		liststr.add("Kenya");
		
		System.out.println(liststr);
		//[Banglade�, Zanzibar, Kongo, Kenya]
		System.out.println(liststr.size());
		//4
		
		System.out.println("******************");
		
		liststr.add("Tunus");
		liststr.remove(1);
		System.out.println(liststr);
		//[Banglade�, Kongo, Kenya, Tunus]
		
		System.out.println("*****************");
		
		List<String> listKelime=new ArrayList<>();
		
		listKelime.add("Ali");
		//[Ali]
		System.out.println(listKelime);
		listKelime.remove("Hasan");
		System.out.println(listKelime);
		//[Ali]
		
		System.out.println(listKelime.remove("Hasan"));
		//false
		System.out.println(listKelime.remove("Ali"));
		//true
		
		
		
		
		
	}

}
