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

		System.out.println("1'den belirtilen deðere kadar olan tamsayýlarý toplayan ve sonucu döndüren metod");
		System.out.println(rangeÝletopla(5));
//		1'den belirtilen deðere kadar olan tamsayýlarý toplayan ve sonucu döndüren metod
//		10

		System.out.println();
		System.out.println("rangeClosedÝletopla");
		rangeClosedÝletopla(9);
		
		
		System.out.println();
		System.out.println("//verilen aralýktaki tek sayýlarý son dahil topla");
		rangeClosedÝleTekleritopla(1,7);
		//16
		
		System.out.println();
		System.out.println("belirtilen sayýnýnn faktoriyelini hesaplayan functional programýng ile yazýnýz");
		System.out.println(foktoriyeliniBul(15));
//		belirtilen sayýnýnn faktoriyelini hesaplayan functional programýng ile yazýnýz
//		2004310016
		
		System.out.println();
		System.out.println("15 ten buyuk sayýlar için faktroriyel bulmak için Long ile yapmalýyýz");
		System.out.println(foktoriyeliLongÝleBul(23));
//		15 ten buyuk sayýlar için faktroriyel bulmak için Long ile yapmalýyýz
//		2969065389987463168
		
		System.out.println();
		System.out.println("Bir double diziyi (notlar) Stream nesnesine dönüþtürerek bu dizi içerisinde 50 den buyukleri yazdýr");
		System.out.println(doubleDiziCevirList());
		//[88.5, 52.3, 88.9, 100.0, 99.6]
	}
	// 1'den belirtilen deðere kadar olan tamsayýlarý toplayan ve sonucu döndüren
	// metodu yazýnýz
	// for dongusuyle yapýlýr ama biz fonksiyonel programa ile yapacaðýz

	public static int rangeÝletopla(int deger) {
		// range örnek
		// range aralýk demek, sadece range dersek verdiðimiz aralýk kýsmýnda
		// baþlangýçdeðerden alýr, son degeri almaz
		// rangeClesed dersek son deðeri de dahil eder

		return IntStream.range(1, deger).sum();// deger +1 eklersek sonda 5 i de toplama dahil eder

	}
	// rangeClosed örnek

	public static void rangeClosedÝletopla(int deger) {

		IntStream.rangeClosed(3, deger).forEach(System.out::println);
	}
	//verilen aralýktaki tek sayýlarý son dahil topla
	
	public static void rangeClosedÝleTekleritopla(int alt, int ust) {

		System.out.println(IntStream.rangeClosed(alt,ust).filter(Methodlarimiz::tekMi).sum());
	}
	 //belirtilen sayýnýnn faktoriyelini hesaplayan functional programýng ile yazýnýz
    //5 girildiyese eðer rangeCloese kullanmak mantýklý sayýya kadar dahil alacak
    //reduce kullanmalýyýz, ardýþýk iþlemler için kullanýlan bir terminaldir
	
	public static int foktoriyeliniBul(int n) {//int yerine long yazamayýz çünkü bu sitemde primitive data lar kullanýlmýyor,Long oilman
		
		return IntStream.rangeClosed(1, n).reduce(1, (x,y)->x*y); 
		
	}
	//15 ten buyuk sayýlar için faktroriyel bulmak için Long ile yapmalýyýz
	
	public static Long foktoriyeliLongÝleBul(int n) {
		
		return LongStream.rangeClosed(3, n).reduce(3, (x,y)->x*y);
		
	}
	//DoubleStream de range kullanýmý yok, çünkü virgullu sayýda aralýk veremeyiz
	//range yerine iterate yontemi kullanýlýr, sonunda limitle() sýnýrlandýrýlýr
	
	public static double faktoriyeliDoubleÝleBul(int n) {
		
		return DoubleStream.iterate(1,  t-> t+1).limit(n).reduce(1, (x,y)->x*y);
	}
	//Bir double diziyi (notlar) Stream nesnesine dönüþtürerek bu dizi içerisinde bulunan
	// sayýlarýn 50 den büyük olanlarýný ayrý bir listeye kaydererek yazdýran metodu tanýmlayýnýz
	
	public static List<Double> doubleDiziCevirList() {
		
		Double notlar[]={88.5,52.3,88.9,100.0,99.6,40.6,34.7,27.6,};//elimizdeki HAZIR DÝZÝ VARSA,dizi bu stream a çevireceðiz stream.of kullanýyoruz
	Stream<Double> streamNotlar= Stream.of(notlar);
	
	return streamNotlar.filter(t->t>50).collect(Collectors.toList());
	
	}
}