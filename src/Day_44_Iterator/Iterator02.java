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
		
		ListIterator li1 = list.listIterator();/*ýterator interface olduðu için obje uretemem;
		 -bunun yerine kullanacaðýmýz collection ismini yazýp kullanarak ýterator methodu çaðýrabilirz*/
		
		while(li1.hasNext()){//her donuste yanýnda eleman var ý dþye sorar varsa tru der alýr geirir
			
			String temp=(String) li1.next();//yukarda a yý once get, neden string e aatadýk hasnext asdece bakýyor iþlem yapmýyor
			li1.set(temp+"B");//her elemaný getirib B yi ekleyecek, set edecek yani
		}
		System.out.println(list);
		//[AB, BB, CB, DB]
	}

}
