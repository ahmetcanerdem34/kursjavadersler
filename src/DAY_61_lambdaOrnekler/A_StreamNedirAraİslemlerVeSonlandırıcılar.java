package DAY_61_lambdaOrnekler;

import java.util.ArrayList;
import java.util.List;

public class A_StreamNedirAraÝslemlerVeSonlandýrýcýlar {

	public static void main(String[] args) {
		//STREAM API NEDÝR
		/*
		 * -Buyuk veri içeren nesnelrini (Collection vb.) fonksiyonel programlama ile iþlememize imkan saðlayan bir API dir
		 * 
		 * -Stream bir veri yapýsý deðildir ve bellekte yer tutmaz. sadece var olan veri yapýlarýný girdi olarak alýr, 
		 * ve girdilerin veri yapýsýný deðiþtirmeden iþler
		 *
		 * -Veilerin sýralý iþlemlerdne (pipeline) geçirilerek iþlenmesini ve istenilen sonuçlarýn elde eedilmesini saðlar
		 * 
		 * -Stream API , ilk olarak Java8 ile geliþmiþtir ve java.util.stream paketinde yer almaktadýr
		 * 
		 * -Stram API içerisinde methodlar LAMBDA ÝFADELERÝNÝ desteklemektedir
		 * *Method içerisinde fonksiyonel arayüzler kullandýðý için Lambda ifaelerini kullanamk mümkün
		 * 
		 * -Döngü ve benzeri iþlemleri kullanamk yerine hazýýr methodlarýn kullanýmý sayesinde çok daha kýsa ve anlaþýlýr kod yazmak mümkündür
		 * 
		 * -ParallelStreams sayesinde multi-threadind iþlemleri yapmak daha kolaydýr
		 * 
		 * -Girdi olarak aldýüý nesneleri (veri) deðiþtirmediði için DAHA GÜVENÝLÝR program yazmak mümkündür.
		 * 
		 * -Dezavantajý ise geleneksel döngü tabanlý programlamaya göre çoðu durumda DAHA YAVAÞ SONUÇ üretmektedir
		 */
		
		//STREAM PIPELINE (HAT)
		
		/*
		 * -Bir Stream hattý; bir KAYNAK'tan(Collection,List,Set,File,Array vb.), 
		 * -Onu takip eden 0 veya daha fazla ARAÝÞLEM (Filter,map,sort,distinct,limit gibi Stream döndüren metotlar)
		 * -Ve bir TERMÝNAL(sonlandýrýcý=forEach, collect,reduce, min, count gibi void veya stream döndürmeyen methodlar) iþlem içerir
		 * 
		 * -Streamlerde(Collection,List,Set,File,Array vb) ara iþlemler , tembel(lazy) olarak yürütülür. Yani terminal(sonlandýrýcýlar) iþlemi çaðrýlana kadarkoþturulmazlar
		 * *Sadece yeni bir stream nesnesi hazýrlarlar
		 * 
		 * -Terminal(sonlandýýrcýlar)  iþlemi çöaðrýldýðýnda ise bu streamler alýnarak tek rek ara iþlemler gerçekleþtirilir ve sonuç oluþturulur.
		 */
		
		//ARA ÝÞLEMLER
		
		/*
		 * -Ara iþlemler 0 ya da daha fazla olabilir
		 * 
		 * -Ýþlemlerin sýrasý özellikle büyük miktardaki veriler için önem arz eder
		 * *Önce filtreleme(filter), sonra sýralama(sort) ve deðþtirme(map)
		 * 
		 * -Büyük miktardaki veriler içn ParallelStream kullnamak mantýklýdýr,,
		 * 
		 * 
		 * --Yaygýn kullanýlan ara iþlemlerden bazýlarý
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
		
		//TERMÝNAL ÝÞLEMLERÝ
		
		/*
		 * -Terminal iþlemi Stream nesnesini(Collection,List,Set,File,Array vb.), alýr ve tüketir(eager)
		 * -Sadece tek terminal(sonlandýrýcýlar =forEach, collect,reduce, min, count gibi void veya steam döndürmeyen methodlar) iþlemi kullanýlabilir
		 *-Yyagýn olarak kullanýlan terminal(sonlandýrýcý iþlemlerin bazýlarý
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
