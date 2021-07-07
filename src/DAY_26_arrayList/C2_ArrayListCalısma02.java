package DAY_26_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayListCalýsma02 {

	public static void main(String[] args) {
		
		//listin uzunluðu nasýl bulunur
		
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		//önce listeyi yazdýralým
		System.out.println(list);
		//[10, 11, 12, 13, 14]
		//uzunluðunu size ile buluyoruz
		System.out.println(list.size());
		//5
		
		System.out.println("*******************");
		//bir elemaný nasýl sileriz
		
		list.remove(2);//12yi yani 2. index i sildirelim
		System.out.println(list);
		//[10, 11, 13, 14]
		
		//list.remove(5);
		//System.out.println(list);
		//olmayan index i sildirmek; RTE verir
		
		System.out.println("*************************");
		
		System.out.println(list.remove(1));
		//11--------->biz syso içerisinde bir index i kaldýr dersek onu getiri bize gösterir ve kaldýrý, 
		//sonraki list te o sayý yoktur
		System.out.println(list);
		//[10, 13, 14]

		System.out.println("*****************************");
		
		
		List<String> liststr= new ArrayList<>();
		
		liststr.add("Bangladeþ");
		liststr.add("Zanzibar");
		liststr.add("Kongo");
		liststr.add("Kenya");
		
		System.out.println(liststr);
		//[Bangladeþ, Zanzibar, Kongo, Kenya]
		System.out.println(liststr.size());
		//4
		
		System.out.println("******************");
		
		liststr.add("Tunus");
		liststr.remove(1);
		System.out.println(liststr);
		//[Bangladeþ, Kongo, Kenya, Tunus]
		
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
