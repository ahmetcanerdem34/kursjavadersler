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
		
		
		//burdaki list in elemanlar�n� for loop ve for each ile yazd�r�n�z
		
		for (int i = 0; i < list1.size(); i++) {

			System.out.print(list1.get(i)+" ");	//B C D A 
			
		}
		System.out.println();
		
		for (String each : list1) {
			System.out.print(each + " ");//B C D A 
			
		}
		System.out.println();
		//list1 i deki elemanlar� sonuna for loop kullanrak "!" i�areti ekleyininz ve list1 iyad�r�n�z
		
		for (int i = 0; i < list1.size(); i++) {//set methodutylal �stte ekleme yap�yorduk
			list1.set(i,list1.get(i)+"!");
		
		}
		System.out.println(list1);//[B!, C!, D!, A!]
		
		//list1 i deki elemanlar� sonuna for each loop kullanrak "!" i�areti ekleyininz ve list1 iyad�r�n�z
		//g�rd����n�z gibi set() methodunu kullanamk i�in index laz�m ama for each loop index kullanamz
		//bu yuzden for each loop kullanarak list ler update edilemezler
		
		/*
		 for loop kullanrak listleri update etmek istemiyorum
		 for each loop listleri update edemiyoru,bu durumda for loop lkullanmadan listleri update edebilmek i�in �terator lar� kullan�r�z
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
			
			it2.next();//bu eleman� i�ine �ekiyor
			it2.remove();//buda eleman� yok ediyor
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
			
			String el = it3.next();//pointer ilerleteip eleman� al�yor bana veriyor
			it3.set(el + "!");//list eleamnlar�n� update eder
			it3.add(el);//[K!, K, M!, M, N!, N, O!, O, P!, P]--->list e eleman ekler
		}
		System.out.print(list3);//[K!, M!, N!, O!, P!]
		System.out.println();
		
		List<String> list4=new ArrayList<>();
		list4.add("T");		list2.add("L");
		list4.add("P");
		list4.add("L");
		list4.add("�");
		list4.add("S");
		System.out.println(list4);//[K, L, M, N, O, P]
		
		
		ListIterator<String> it4 = list4.listIterator();
		/*
		 *NOT: hasPrevious() ve previous() methodlar�n� kullanamdan �nce hasNext() ve next() methodlar�n� kullanarak pointer � en sa�a getirirriz
		
		 *sade son eleman�n ba��na "*" koyunuz ve list elemanlar�n� sondan ba�a yazd�r�n�z
		 */
		int counter=0;
		while(it4.hasNext()) {
			String el=it4.next();
			if(counter==2) {
				it4.set("*" + el);//S � *L P T 
			}
			counter++;
		}
		
		while(it4.hasPrevious()) {
			String el=it4.previous();
			
			System.out.print(el+" ");
		}
		/*
		 �terator ile list�terator aras�ndaki farklar nelerdir
		 1- iterator sadece hasNext(), next() ve remove() ve forEachRemaining var az kulan�l�r methodlar�n� i�erir
		 
		 listiterator iterator �n child interface sidir. ise has next remove ve set previoue lar�n hepsini kullan�r
		 2- list�terator sadece sadece listtler i�in kullan�l�r array filan kullanamz
		 -iterator ise list map ve set gibi dier collectionlar i�inde kullan�l�r
		 
		 3-iterator kullanrak sadece bastan sona do�ru seyaht edebilirisniz
		 -list�terator da �ift yonlu seyahat edersiniz
		 
		 4-iterator ile �la���rken imlec in nerede oldu�u �ok �nemlidir
		 */
	}

}
