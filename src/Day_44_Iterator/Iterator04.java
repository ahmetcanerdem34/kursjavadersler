package Day_44_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {

	public static void main(String[] args) {
		//�erator � kullanarak listenin eleanlar�n� sondan ba�a dogru yazd�r�n
		
		List<Integer> sayiListesi= new ArrayList<>();
		sayiListesi.add(2);
		sayiListesi.add(13);
		sayiListesi.add(56);
		sayiListesi.add(23);
		sayiListesi.add(45);
		sayiListesi.add(14);
		sayiListesi.add(40);
		
		System.out.println(sayiListesi);//[2, 13, 56, 23, 45, 14, 40]
		
		ListIterator li1 = sayiListesi.listIterator();/*�terator interface oldu�u i�in obje uretemem;
		 -bunun yerine kullanaca��m�z collection ismini yaz�p kullanarak �terator methodu �a��rabilirz

		*/


		
		while(li1.hasNext()) {//bu d�ng� hi�bir�ey yapmadan sona gideriz, sondan ba�a 2 ci while ile gelece�iz
			
			li1.next();
		}
		
		while(li1.hasPrevious()) {
		
			System.out.print(li1.previous()+" ");
			//40 14 45 23 56 13 2 
			
		}
	}

}
