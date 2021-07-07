package DAY_26_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayList02 {

	public static void main(String[] args) {
		
		//listin uzunlu�u nas�l bulunur
	
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		
		System.out.println(list);
		//[10, 15, 8, 12, 20]
		
		System.out.println(list.size());
		//	5
			
				
		System.out.println("*******************");
		
		//bir eleman� nas�l sileriz
		list.remove(1);
		System.out.println(list);
		//[10, 8, 12, 20]
		
		
		System.out.println(list.remove(2));//bir �ste 2. 12 onu kald�r dersek bize 12 yi getirir
		//remove index kulland���m�zda o index deki eleman� remove eder 
		//ve bunun delili olarak bize o elemen� getirir
		//e�er olmayan bir index girersek RTE verir
		//a�a��da g�rece�iz string de ise true false cevab�n� veriyor
		System.out.println(list);//[10, 8 ,20]--->12 gitti
		
		
		List<String> list2 = new ArrayList<>();
		list2.add("Ali");
		
		System.out.println(list2.remove("Hasan"));//git Hasan � kald�r---->false yazd�rd�, NEDEN? hasan� bulamad��� i�i�n kald�ramad�m
		System.out.println(list2);
		
		//deemkki remove(object) methodu kullan�ld���nda e�er java istenen elemean� bulup remove ederse 
		//bize remove edilen eleman� true d�nd�r�r, listede bulamazsa iste�i yerine getirilemedi�ini anlamam�z i�in
		// false d�nd�r�r
		
		System.out.println(list2.remove("Ali"));//true--->ali gitti
		

	}

}
