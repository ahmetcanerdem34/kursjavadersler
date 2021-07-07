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

		System.out.println("1'den belirtilen de�ere kadar olan tamsay�lar� toplayan ve sonucu d�nd�ren metod");
		System.out.println(range�letopla(5));
//		1'den belirtilen de�ere kadar olan tamsay�lar� toplayan ve sonucu d�nd�ren metod
//		10

		System.out.println();
		System.out.println("rangeClosed�letopla");
		rangeClosed�letopla(9);
		
		
		System.out.println();
		System.out.println("//verilen aral�ktaki tek say�lar� son dahil topla");
		rangeClosed�leTekleritopla(1,7);
		//16
		
		System.out.println();
		System.out.println("belirtilen say�n�nn faktoriyelini hesaplayan functional program�ng ile yaz�n�z");
		System.out.println(foktoriyeliniBul(15));
//		belirtilen say�n�nn faktoriyelini hesaplayan functional program�ng ile yaz�n�z
//		2004310016
		
		System.out.println();
		System.out.println("15 ten buyuk say�lar i�in faktroriyel bulmak i�in Long ile yapmal�y�z");
		System.out.println(foktoriyeliLong�leBul(23));
//		15 ten buyuk say�lar i�in faktroriyel bulmak i�in Long ile yapmal�y�z
//		2969065389987463168
		
		System.out.println();
		System.out.println("Bir double diziyi (notlar) Stream nesnesine d�n��t�rerek bu dizi i�erisinde 50 den buyukleri yazd�r");
		System.out.println(doubleDiziCevirList());
		//[88.5, 52.3, 88.9, 100.0, 99.6]
	}
	// 1'den belirtilen de�ere kadar olan tamsay�lar� toplayan ve sonucu d�nd�ren
	// metodu yaz�n�z
	// for dongusuyle yap�l�r ama biz fonksiyonel programa ile yapaca��z

	public static int range�letopla(int deger) {
		// range �rnek
		// range aral�k demek, sadece range dersek verdi�imiz aral�k k�sm�nda
		// ba�lang��de�erden al�r, son degeri almaz
		// rangeClesed dersek son de�eri de dahil eder

		return IntStream.range(1, deger).sum();// deger +1 eklersek sonda 5 i de toplama dahil eder

	}
	// rangeClosed �rnek

	public static void rangeClosed�letopla(int deger) {

		IntStream.rangeClosed(3, deger).forEach(System.out::println);
	}
	//verilen aral�ktaki tek say�lar� son dahil topla
	
	public static void rangeClosed�leTekleritopla(int alt, int ust) {

		System.out.println(IntStream.rangeClosed(alt,ust).filter(Methodlarimiz::tekMi).sum());
	}
	 //belirtilen say�n�nn faktoriyelini hesaplayan functional program�ng ile yaz�n�z
    //5 girildiyese e�er rangeCloese kullanmak mant�kl� say�ya kadar dahil alacak
    //reduce kullanmal�y�z, ard���k i�lemler i�in kullan�lan bir terminaldir
	
	public static int foktoriyeliniBul(int n) {//int yerine long yazamay�z ��nk� bu sitemde primitive data lar kullan�lm�yor,Long oilman
		
		return IntStream.rangeClosed(1, n).reduce(1, (x,y)->x*y); 
		
	}
	//15 ten buyuk say�lar i�in faktroriyel bulmak i�in Long ile yapmal�y�z
	
	public static Long foktoriyeliLong�leBul(int n) {
		
		return LongStream.rangeClosed(3, n).reduce(3, (x,y)->x*y);
		
	}
	//DoubleStream de range kullan�m� yok, ��nk� virgullu say�da aral�k veremeyiz
	//range yerine iterate yontemi kullan�l�r, sonunda limitle() s�n�rland�r�l�r
	
	public static double faktoriyeliDouble�leBul(int n) {
		
		return DoubleStream.iterate(1,  t-> t+1).limit(n).reduce(1, (x,y)->x*y);
	}
	//Bir double diziyi (notlar) Stream nesnesine d�n��t�rerek bu dizi i�erisinde bulunan
	// say�lar�n 50 den b�y�k olanlar�n� ayr� bir listeye kaydererek yazd�ran metodu tan�mlay�n�z
	
	public static List<Double> doubleDiziCevirList() {
		
		Double notlar[]={88.5,52.3,88.9,100.0,99.6,40.6,34.7,27.6,};//elimizdeki HAZIR D�Z� VARSA,dizi bu stream a �evirece�iz stream.of kullan�yoruz
	Stream<Double> streamNotlar= Stream.of(notlar);
	
	return streamNotlar.filter(t->t>50).collect(Collectors.toList());
	
	}
}