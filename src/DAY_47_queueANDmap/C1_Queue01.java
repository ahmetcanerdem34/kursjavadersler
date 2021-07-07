package DAY_47_queueANDmap;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1_Queue01 {

	public static void main(String[] args) {
		//LinkedList;Queue nin child �d�r
		//Queue de priorty yoksa sona ekler hep
		//Queue de istedi�iniz index e bi�ey ekleyeemzsiniz, ��nk� index yok
		//QUEUE B�R �NTERFACE D�R O NEDENLE OBJE �RETEMEY�Z
		//chill class� olan PriorityQueue ve LinkedList constructor se�imine 
		//g�re olusturdugumuz queue'nun davranislari degisir
		
		//Queue(kuyruk) yap�c� gere�i insertion order a g�re s�ralama yapmas� beklenir
		//ancak constructor olarak PriortyQueue se�ti�imiz i�in Java taraaf�ndan belirlenen
		//priority g�re s�ralama yapar
		
		//bizde istersek priorty kural�n� tan�mlaya biliriz.. Ozaman bizim istedi�imize g�re s�ralar
		Queue<String> k1 = new PriorityQueue<>();
		k1.add("C");
		k1.add("M");
		k1.add("A");
		System.out.println(k1);//[A, M, C]
		
		Queue<String> k2 = new LinkedList<>();//burayada LinkedList ile bakal�m
		//ayn� elemanlarla fakat LinkedList construct�r � kullanarak olu�turdu�umuz
		//queue ise beklenenlere uygun oalrak ekleme s�ras�n ag�re yazd�r�
		k2.add("C");
		k2.add("M");
		k2.add("A");
		System.out.println(k2);//[C, M, A]
		System.out.println(k2.element());//silmeden ilk eleman� getirir, peek ten fark� son eleman kalmad�ysa excep verir
		//Queue n�n yap��s F�FO( first �n firt out) ge�erlidir
		
		k2.offer("Z");//offer ad gibi sona ekler--  ad en fark� 	Queue ye has �al���r
		System.out.println(k2);//[C, M, A, Z]

		k1.offer("Z");//PraortyQueue ye g�re yapt�k k1 oran�n o kafas�na g�re ekledi
		k1.offer("L");
		System.out.println(k1);//[A, L, C, Z, M]
		
		k2.peek();//i�ine bi�ey yazd�r�m�yor, syso i�inde yazal�m
		System.out.println(k2.peek());//C--->silmeden ilk eleman� getirir
		
		k2.remove();//ilk gelen ilk gideri silinir, sonra girene s�rlamya g�re siler
		System.out.println(k2);//[M, A, Z]
		
		k2.remove();
		System.out.println(k2);//[A, Z]
		k2.poll();
		System.out.println(k2);//[Z] ilk eleman� siler, enson kalan a ve z idi zaten
		k2.poll();//poll bo� bir queue kullan�l�rsa ecxep vermez, null d�ner syso i�inde
		//k2.remove();//bu sat�rda son elemandasilindi, e57 de k2.remove() yazsak exception atar
		//k2.remove();
		System.out.println(k2.isEmpty());//true
		//bo� bir queue den remove ile eleman silmek istersek exception olur
		
		
	}

}
