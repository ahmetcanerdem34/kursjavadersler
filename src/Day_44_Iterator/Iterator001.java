package Day_44_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator001 {

	public static void main(String[] args) {
		
		
		List<String> list1= new ArrayList<>();
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("A");
		System.out.println(list1);//[B, C, D, A]
		
		
		//burdaki list in elemanlarýný for loop ve for each ile yazdýrýnýz
		
		for (int i = 0; i < list1.size(); i++) {

			System.out.print(list1.get(i)+" ");	//B C D A 
			
		}
		System.out.println();
		
		for (String each : list1) {
			System.out.print(each + " ");//B C D A 
			
		}
		System.out.println();
		//list1 i deki elemanlarý sonuna for loop kullanrak "!" iþareti ekleyininz ve list1 iyadýrýnýz
		
		for (int i = 0; i < list1.size(); i++) {//set methodutylal þstte ekleme yapýyorduk
			list1.set(i,list1.get(i)+"!");
		
		}
		System.out.println(list1);//[B!, C!, D!, A!]
		
		//list1 i deki elemanlarý sonuna for each loop kullanrak "!" iþareti ekleyininz ve list1 iyadýrýnýz
		//gördüüðünüz gibi set() methodunu kullanamk için index lazým ama for each loop index kullanamz
		//bu yuzden for each loop kullanarak list ler update edilemezler
		
		/*
		 for loop kullanrak listleri update etmek istemiyorum
		 for each loop listleri update edemiyoru,bu durumda for loop lkullanmadan listleri update edebilmek için ýterator larý kullanýrýz
		 */
		List<String> list2=new ArrayList<>();
		list2.add("U");
		list2.add("V");
		list2.add("Y");
		list2.add("Z");
		list2.add("W");
		list2.add("Q");
		System.out.println(list2);//[U, V, Y, Z, W, Q]
		
		Iterator<String> it2= list2.iterator();
		
		while(it2.hasNext()) {
			
			it2.next();//bu elemaný içine çekiyor
			it2.remove();//buda elemaný yok ediyor
		}
		System.out.print(list2);//[]
		
		
		List<String> list3=new ArrayList<>();
		list3.add("K");		list2.add("L");
		list3.add("M");
		list3.add("N");
		list3.add("O");
		list3.add("P");
		System.out.println(list2);//[K, L, M, N, O, P]
		
		ListIterator<String> it3 = list3.listIterator();
		
		while(it3.hasNext()) {
			
			String el = it3.next();//pointer ilerleteip elemaný alýyor bana veriyor
			it3.set(el + "!");//list eleamnlarýný update eder
			it3.add(el);//[K!, K, M!, M, N!, N, O!, O, P!, P]--->list e eleman ekler
		}
		System.out.print(list3);//[K!, M!, N!, O!, P!]
		System.out.println();
		
		List<String> list4=new ArrayList<>();
		list4.add("T");		list2.add("L");
		list4.add("P");
		list4.add("L");
		list4.add("Þ");
		list4.add("S");
		System.out.println(list4);//[K, L, M, N, O, P]
		
		
		ListIterator<String> it4 = list4.listIterator();
		/*
		 *NOT: hasPrevious() ve previous() methodlarýný kullanamdan önce hasNext() ve next() methodlarýný kullanarak pointer ý en saða getirirriz
		
		 *sade son elemanýn baþýna "*" koyunuz ve list elemanlarýný sondan baþa yazdýrýnýz
		 */
		int counter=0;
		while(it4.hasNext()) {
			String el=it4.next();
			if(counter==2) {
				it4.set("*" + el);//S Þ *L P T 
			}
			counter++;
		}
		
		while(it4.hasPrevious()) {
			String el=it4.previous();
			
			System.out.print(el+" ");
		}
		/*
		 ýterator ile listýterator arasýndaki farklar nelerdir
		 1- iterator sadece hasNext(), next() ve remove() ve forEachRemaining var az kulanýlýr methodlarýný içerir
		 
		 listiterator iterator ýn child interface sidir. ise has next remove ve set previoue larýn hepsini kullanýr
		 2- listýterator sadece sadece listtler için kullanýlýr array filan kullanamz
		 -iterator ise list map ve set gibi dier collectionlar içinde kullanýlýr
		 
		 3-iterator kullanrak sadece bastan sona doðru seyaht edebilirisniz
		 -listýterator da çift yonlu seyahat edersiniz
		 
		 4-iterator ile çlaýþýrken imlec in nerede olduðu çok önemlidir
		 */
	}

}
