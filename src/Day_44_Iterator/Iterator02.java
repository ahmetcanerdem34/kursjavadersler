package Day_44_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

	public static void main(String[] args) {
		
		
List<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);

			//her elemana B harfini ekleyelim
		
		ListIterator li1 = list.listIterator();/*�terator interface oldu�u i�in obje uretemem;
		 -bunun yerine kullanaca��m�z collection ismini yaz�p kullanarak �terator methodu �a��rabilirz*/
		
		while(li1.hasNext()){//her donuste yan�nda eleman var � d�ye sorar varsa tru der al�r geirir
			
			String temp=(String) li1.next();//yukarda a y� once get, neden string e aatad�k hasnext asdece bak�yor i�lem yapm�yor
			li1.set(temp+"B");//her eleman� getirib B yi ekleyecek, set edecek yani
		}
		System.out.println(list);
		//[AB, BB, CB, DB]
	}

}
