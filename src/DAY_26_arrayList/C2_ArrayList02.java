package DAY_26_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayList02 {

	public static void main(String[] args) {
		
		//listin uzunluðu nasýl bulunur
	
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
		
		//bir elemaný nasýl sileriz
		list.remove(1);
		System.out.println(list);
		//[10, 8, 12, 20]
		
		
		System.out.println(list.remove(2));//bir üste 2. 12 onu kaldýr dersek bize 12 yi getirir
		//remove index kullandýðýmýzda o index deki elemaný remove eder 
		//ve bunun delili olarak bize o elemený getirir
		//eðer olmayan bir index girersek RTE verir
		//aþaðýda göreceðiz string de ise true false cevabýný veriyor
		System.out.println(list);//[10, 8 ,20]--->12 gitti
		
		
		List<String> list2 = new ArrayList<>();
		list2.add("Ali");
		
		System.out.println(list2.remove("Hasan"));//git Hasan ý kaldýr---->false yazdýrdý, NEDEN? hasaný bulamadýðý içiçn kaldýramadým
		System.out.println(list2);
		
		//deemkki remove(object) methodu kullanýldýðýnda eðer java istenen elemeaný bulup remove ederse 
		//bize remove edilen elemaný true döndürür, listede bulamazsa isteði yerine getirilemediðini anlamamýz için
		// false döndürür
		
		System.out.println(list2.remove("Ali"));//true--->ali gitti
		

	}

}
