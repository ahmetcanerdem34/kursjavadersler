package DAY_61_lambdaOrnekler;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Stream05Digerleri {

	public static void main(String[] args) {
		/*
		 * Collection'larimizi stream method;u ile Stream'e cevirmeyi ogrendik.
		 * Collection : List,Map,HashMap vb.. Stream'e cevirdikten sonra Stream API
		 * kullanarak pipeLine'a sokuyorduk. IntStream : Integer seklinde Stream
		 * olusturabiliriz. LongStream, DoubleStream Bunlarin ne artisi var ? Sayisal
		 * degerlerle islem yapacaksak isleri kolaylastiriyor. Biz istersek Integer,
		 * Double, Long tipinde Stream'ler olusturabiliyoruz.
		 */

		System.out.println("1'den belirtilen değere kadar olan tamsayıları toplayan ve sonucu döndüren metod");
		System.out.println(rangeİletopla(5));
//		1'den belirtilen değere kadar olan tamsayıları toplayan ve sonucu döndüren metod
//		10

		System.out.println();
		System.out.println("rangeClosedİletopla");
		rangeClosedİletopla(9);
		
		
		System.out.println();
		System.out.println("//verilen aralıktaki tek sayıları son dahil topla");
		rangeClosedİleTekleritopla(1,7);
		//16
		
		System.out.println();
		System.out.println("belirtilen sayınınn faktoriyelini hesaplayan functional programıng ile yazınız");
		System.out.println(foktoriyeliniBul(15));
//		belirtilen sayınınn faktoriyelini hesaplayan functional programıng ile yazınız
//		2004310016
		
		System.out.println();
		System.out.println("15 ten buyuk sayılar için faktroriyel bulmak için Long ile yapmalıyız");
		System.out.println(foktoriyeliLongİleBul(23));
//		15 ten buyuk sayılar için faktroriyel bulmak için Long ile yapmalıyız
//		2969065389987463168
		
		System.out.println();
		System.out.println("Bir double diziyi (notlar) Stream nesnesine dönüştürerek bu dizi içerisinde 50 den buyukleri yazdır");
		System.out.println(doubleDiziCevirList());
		//[88.5, 52.3, 88.9, 100.0, 99.6]
	}
	// 1'den belirtilen değere kadar olan tamsayıları toplayan ve sonucu döndüren
	// metodu yazınız
	// for dongusuyle yapılır ama biz fonksiyonel programa ile yapacağız

	public static int rangeİletopla(int deger) {
		// range örnek
		// range aralık demek, sadece range dersek verdiğimiz aralık kısmında
		// başlangıçdeğerden alır, son degeri almaz
		// rangeClesed dersek son değeri de dahil eder

		return IntStream.range(1, deger).sum();// deger +1 eklersek sonda 5 i de toplama dahil eder

	}
	// rangeClosed örnek

	public static void rangeClosedİletopla(int deger) {

		IntStream.rangeClosed(3, deger).forEach(System.out::println);
	}
	//verilen aralıktaki tek sayıları son dahil topla
	
	public static void rangeClosedİleTekleritopla(int alt, int ust) {

		System.out.println(IntStream.rangeClosed(alt,ust).filter(Methodlarimiz::tekMi).sum());
	}
	 //belirtilen sayınınn faktoriyelini hesaplayan functional programıng ile yazınız
    //5 girildiyese eğer rangeCloese kullanmak mantıklı sayıya kadar dahil alacak
    //reduce kullanmalıyız, ardışık işlemler için kullanılan bir terminaldir
	
	public static int foktoriyeliniBul(int n) {//int yerine long yazamayız çünkü bu sitemde primitive data lar kullanılmıyor,Long oilman
		
		return IntStream.rangeClosed(1, n).reduce(1, (x,y)->x*y); 
		
	}
	//15 ten buyuk sayılar için faktroriyel bulmak için Long ile yapmalıyız
	
	public static Long foktoriyeliLongİleBul(int n) {
		
		return LongStream.rangeClosed(3, n).reduce(3, (x,y)->x*y);
		
	}
	//DoubleStream de range kullanımı yok, çünkü virgullu sayıda aralık veremeyiz
	//range yerine iterate yontemi kullanılır, sonunda limitle() sınırlandırılır
	
	public static double faktoriyeliDoubleİleBul(int n) {
		
		return DoubleStream.iterate(1,  t-> t+1).limit(n).reduce(1, (x,y)->x*y);
	}
	//Bir double diziyi (notlar) Stream nesnesine dönüştürerek bu dizi içerisinde bulunan
	// sayıların 50 den büyük olanlarını ayrı bir listeye kaydererek yazdıran metodu tanımlayınız
	
	public static List<Double> doubleDiziCevirList() {
		
		Double notlar[]={88.5,52.3,88.9,100.0,99.6,40.6,34.7,27.6,};//elimizdeki HAZIR DİZİ VARSA,dizi bu stream a çevireceğiz stream.of kullanıyoruz
	Stream<Double> streamNotlar= Stream.of(notlar);
	
	return streamNotlar.filter(t->t>50).collect(Collectors.toList());
	
	}
}