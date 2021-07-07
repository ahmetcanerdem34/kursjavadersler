package DAY_61_lambdaOrnekler;

import java.util.ArrayList;
import java.util.List;

public class A_StreamNedirAra�slemlerVeSonland�r�c�lar {

	public static void main(String[] args) {
		//STREAM API NED�R
		/*
		 * -Buyuk veri i�eren nesnelrini (Collection vb.) fonksiyonel programlama ile i�lememize imkan sa�layan bir API dir
		 * 
		 * -Stream bir veri yap�s� de�ildir ve bellekte yer tutmaz. sadece var olan veri yap�lar�n� girdi olarak al�r, 
		 * ve girdilerin veri yap�s�n� de�i�tirmeden i�ler
		 *
		 * -Veilerin s�ral� i�lemlerdne (pipeline) ge�irilerek i�lenmesini ve istenilen sonu�lar�n elde eedilmesini sa�lar
		 * 
		 * -Stream API , ilk olarak Java8 ile geli�mi�tir ve java.util.stream paketinde yer almaktad�r
		 * 
		 * -Stram API i�erisinde methodlar LAMBDA �FADELER�N� desteklemektedir
		 * *Method i�erisinde fonksiyonel aray�zler kulland��� i�in Lambda ifaelerini kullanamk m�mk�n
		 * 
		 * -D�ng� ve benzeri i�lemleri kullanamk yerine haz��r methodlar�n kullan�m� sayesinde �ok daha k�sa ve anla��l�r kod yazmak m�mk�nd�r
		 * 
		 * -ParallelStreams sayesinde multi-threadind i�lemleri yapmak daha kolayd�r
		 * 
		 * -Girdi olarak ald��� nesneleri (veri) de�i�tirmedi�i i�in DAHA G�VEN�L�R program yazmak m�mk�nd�r.
		 * 
		 * -Dezavantaj� ise geleneksel d�ng� tabanl� programlamaya g�re �o�u durumda DAHA YAVA� SONU� �retmektedir
		 */
		
		//STREAM PIPELINE (HAT)
		
		/*
		 * -Bir Stream hatt�; bir KAYNAK'tan(Collection,List,Set,File,Array vb.), 
		 * -Onu takip eden 0 veya daha fazla ARA��LEM (Filter,map,sort,distinct,limit gibi Stream d�nd�ren metotlar)
		 * -Ve bir TERM�NAL(sonland�r�c�=forEach, collect,reduce, min, count gibi void veya stream d�nd�rmeyen methodlar) i�lem i�erir
		 * 
		 * -Streamlerde(Collection,List,Set,File,Array vb) ara i�lemler , tembel(lazy) olarak y�r�t�l�r. Yani terminal(sonland�r�c�lar) i�lemi �a�r�lana kadarko�turulmazlar
		 * *Sadece yeni bir stream nesnesi haz�rlarlar
		 * 
		 * -Terminal(sonland��rc�lar)  i�lemi ��a�r�ld���nda ise bu streamler al�narak tek rek ara i�lemler ger�ekle�tirilir ve sonu� olu�turulur.
		 */
		
		//ARA ��LEMLER
		
		/*
		 * -Ara i�lemler 0 ya da daha fazla olabilir
		 * 
		 * -��lemlerin s�ras� �zellikle b�y�k miktardaki veriler i�in �nem arz eder
		 * *�nce filtreleme(filter), sonra s�ralama(sort) ve de��tirme(map)
		 * 
		 * -B�y�k miktardaki veriler i�n ParallelStream kullnamak mant�kl�d�r,,
		 * 
		 * 
		 * --Yayg�n kullan�lan ara i�lemlerden baz�lar�
		 * 
		 * 	filter()
		 *	map()
		 *	sorted()
		 *	distinct()
		 *	limit()
		 *	findFirst()
		 *	skip()
		 *	flatMap()
		 * 
		 * --------Stream--->filter-->sort---map-->collect
		 * 
		 */
		
		//TERM�NAL ��LEMLER�
		
		/*
		 * -Terminal i�lemi Stream nesnesini(Collection,List,Set,File,Array vb.), al�r ve t�ketir(eager)
		 * -Sadece tek terminal(sonland�r�c�lar =forEach, collect,reduce, min, count gibi void veya steam d�nd�rmeyen methodlar) i�lemi kullan�labilir
		 *-Yyag�n olarak kullan�lan terminal(sonland�r�c� i�lemlerin baz�lar�
		 *
		 *	forEach()
		 *	reduce()
		 *	collect()
		 *	max()
		 *	min()
		 *	count()
		 *--------Stream--->filter-->sort---map-->collect
		 ***
		 */
		
		

	}

}
