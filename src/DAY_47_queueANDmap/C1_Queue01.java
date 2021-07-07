package DAY_47_queueANDmap;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1_Queue01 {

	public static void main(String[] args) {
		//LinkedList;Queue nin child ýdýr
		//Queue de priorty yoksa sona ekler hep
		//Queue de istediðiniz index e biþey ekleyeemzsiniz, çünkü index yok
		//QUEUE BÝR ÝNTERFACE DÝR O NEDENLE OBJE ÜRETEMEYÝZ
		//chill classý olan PriorityQueue ve LinkedList constructor seçimine 
		//göre olusturdugumuz queue'nun davranislari degisir
		
		//Queue(kuyruk) yapýcý gereði insertion order a göre sýralama yapmasý beklenir
		//ancak constructor olarak PriortyQueue seçtiðimiz için Java taraafýndan belirlenen
		//priority göre sýralama yapar
		
		//bizde istersek priorty kuralýný tanýmlaya biliriz.. Ozaman bizim istediðimize göre sýralar
		Queue<String> k1 = new PriorityQueue<>();
		k1.add("C");
		k1.add("M");
		k1.add("A");
		System.out.println(k1);//[A, M, C]
		
		Queue<String> k2 = new LinkedList<>();//burayada LinkedList ile bakalým
		//ayný elemanlarla fakat LinkedList constructýr ý kullanarak oluþturduðumuz
		//queue ise beklenenlere uygun oalrak ekleme sýrasýn agöre yazdýrý
		k2.add("C");
		k2.add("M");
		k2.add("A");
		System.out.println(k2);//[C, M, A]
		System.out.println(k2.element());//silmeden ilk elemaný getirir, peek ten farký son eleman kalmadýysa excep verir
		//Queue nýn yapýýs FÝFO( first ýn firt out) geçerlidir
		
		k2.offer("Z");//offer ad gibi sona ekler--  ad en farký 	Queue ye has çalýþýr
		System.out.println(k2);//[C, M, A, Z]

		k1.offer("Z");//PraortyQueue ye göre yaptýk k1 oranýn o kafasýna göre ekledi
		k1.offer("L");
		System.out.println(k1);//[A, L, C, Z, M]
		
		k2.peek();//içine biþey yazdýrýmýyor, syso içinde yazalým
		System.out.println(k2.peek());//C--->silmeden ilk elemaný getirir
		
		k2.remove();//ilk gelen ilk gideri silinir, sonra girene sýrlamya göre siler
		System.out.println(k2);//[M, A, Z]
		
		k2.remove();
		System.out.println(k2);//[A, Z]
		k2.poll();
		System.out.println(k2);//[Z] ilk elemaný siler, enson kalan a ve z idi zaten
		k2.poll();//poll boþ bir queue kullanýlýrsa ecxep vermez, null döner syso içinde
		//k2.remove();//bu satýrda son elemandasilindi, e57 de k2.remove() yazsak exception atar
		//k2.remove();
		System.out.println(k2.isEmpty());//true
		//boþ bir queue den remove ile eleman silmek istersek exception olur
		
		
	}

}
