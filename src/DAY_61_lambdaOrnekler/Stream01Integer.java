package DAY_61_lambdaOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream01Integer {

	public static void main(String[] args) {
		
		//�RNEK-1 (FILTER,FOREACH)----> bu sayfada filter() ve forEach() �rnekleri yapt�k
		
		        //.filter() = Streamdeki verileri i�erisinde �a�r�lan fonksiyona(methoda) g�re filtreleyen ara i�lem methodudur
				// .forEach() = gelen verilerin tamam�  i�lenene (verilen methoda g�re) veya bir exception olu�ana kadar iterasyoa devam eder 
				//terminal i�lemdir yani soland�r�c�d�r forEach. Stream i yani ak��� kapat�r sonland�r�r
		
		//2.Y�NTEM: Metot Referans� ve Java metotlar�n� 
		
		//B�R STREAM NASIL OLU�TURULUR
		
		//Stream api de pupeline de islemler lazy'dir
		//Cunku arkadan gelecek islemlerin durumu degisebileceginden dolayi.
		//Terminal islemleri(sonland�r�c�lar) eager'dir.Yazilmazsa calismaz
		//Stream kaynagi:collection,List,Set,Array,File...
		//Ara islemler:Filter()(filtrele)->basta olmali,map()(guncelle),sorted()(sirala),findfirst(ilkeleman)
        //      skip(ilk 5 elamani alma gibi-atlama),dintinc()t(tekrarsiz urun),
        //      limit(sinirlama),flatMap(birden fazla coll birlestirir)
		//Terminal islemleri:forEach(yazdirir),reduce()(kendi term islemi yapabiliriz ama lambda ifadesi),
		//      collect()(olusturulan degerleri yeni coll yapmak icin;Bir listeye saklamak icin),
		//      //max()(verinin max),min()(min deger),count()(kac tane o veriden var)
		
		
				/*-Herhangi bir List, Set gibi bir Collection .stream() methodu Streamler ile �al��abilir hale gelir
				 * 
				 */

				List<Integer> liste = new ArrayList<>();
				liste.stream();//------------------------>art�k pipeline a girebilir
				
				
				//Herhangi bir dizi Stream.of() methodu yard�m�yla Stream'ler ile �al��abil�lir hale gelir.
				//veyea yeni bir Stream olu�turulabilir
				
				Integer[] dizi= {3,1,4,1,5,9};
				Stream<Integer> streamDizi= Stream.of(dizi);
						
				
				Stream<String> kisiler = Stream.of("Ahmet", "Mahmut","John");
				Stream<Integer> numbers = Stream.of(3,1,4,5,9);
				
				//Coolection olu�tural�m Integer tipinde olsun
				
				List<Integer> rakamlar = new ArrayList<>();
				
				rakamlar.add(5);
		        rakamlar.add(7);
		        rakamlar.add(7);
		        rakamlar.add(9);
		        rakamlar.add(-1);
		        rakamlar.add(2);
		        rakamlar.add(4);
		        rakamlar.add(-1000);
		        rakamlar.add(4);
		        //collection �m�z�n ismi rakamlar
		        //stream le tek say�lar� alal�m
		        
		        System.out.println("**********Tek Say�lar*********");
		        rakamlar.stream().filter(t-> t%2!=0).forEach(x ->System.out.print(x+" "));
//		        **********Tek Say�lar*********
//		        5 7 7 9 -1 
		        System.out.println();
		        System.out.println("************�ift Say�lar*********");
		        rakamlar.stream().filter(t->t%2==0).forEach(Methodlarimiz::yazdir);//class ad� ve yazdir methodu
//		        ************�ift Say�lar*********
//		        24-10004
		        
		        System.out.println("*****************Tek mi***************");
		        
		        rakamlar.stream().filter(Methodlarimiz::tekMi).forEach(Methodlarimiz::yazdir);//class ad� ve yazd�r methodu
//		        *****************Tek mi***************
//		        5 7 7 9 -1 
		        System.out.println();
		        System.out.println("**************�ift Mi*****************");
		        
		        rakamlar.stream().filter(Methodlarimiz::�iftMi).forEach(Methodlarimiz::yazdir);
//		        **************�ift Mi*****************
//		        2 4 -1000 4 
		        System.out.println();
		        System.out.println("yap�sal ��z�m ");
		        ciftElemanlariYazdir(rakamlar);
//		        yap�sal ��z�m 
//		        2 4 -1000 4 
		        
		        System.out.println();
		        System.out.println("// 1. y�ntem fonksiyonellambda kullanarak ��z�m");
		        ciftElemanlariYazdirFonksiyonelStream1(rakamlar);
//		        2 4 -1000 4 
		        
		        System.out.println();
		        System.out.println("2. y�ntem Method referans� kullanarak ve java methodlar�n� kullanarak yaz�d�r");
		        ciftElemanlariYazdirFonksiyonelStream2(rakamlar);
//		        24-10004
		        
		        System.out.println();
		        System.out.println("3. y�ntem Method referans� ve kendi methodumuz ile");
		        ciftElemanlariYazdirFonksiyonelStream3(rakamlar);
//		        2 4 -1000 4
		        
	}
	
	
	//bir listeyi parametre olarak alan ve listedeki �ift elemanlar� yan yana yazan methodu yap�sal ve fonksiyonel yaz�n�z
	//buras� yap�sal ��z�m
	public static void ciftElemanlariYazdir(List<Integer> rakamlar) {
		
		for (Integer each : rakamlar) {
			
			if(each%2==0) {
				
				System.out.print(each+" ");
			}
			
			
		}
		
		
	}
	//buras� 1. y�ntem fonksiyonellambda kullanarak ��z�m
	
	public static void ciftElemanlariYazdirFonksiyonelStream1(List<Integer> rakamlar) {
		
		rakamlar.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+" "));
		
		//.filter() = Streamdeki verileri i�erisinde �a�r�lan fonksiyona(methoda) g�re filtreleyen ara i�lem methodudur
		// .forEach() = gelen verilerin tamam�  i�lenene (verilen methoda g�re) veya bir exception olu�ana kadar iterasyoa devam eder 
		//terminal i�lemdir yani soland�r�c�d�r forEach. Stream i yani ak��� kapat�r sonland�r�r
	}
	
	// buras� 2. y�ntem Method referans� kullanarak ve java methodlar�n� kullanarak yaz�d�r, kullanarak ��z�m
	
	public static void ciftElemanlariYazdirFonksiyonelStream2(List<Integer> rakamlar) {
		
		rakamlar.stream().filter(t-> t%2==0).forEach(System.out::print);
	}
	//3. y�ntem Method referans� ve kendi methodumuz ile
	
	public static void ciftElemanlariYazdirFonksiyonelStream3(List<Integer> rakamlar) {
		
		rakamlar.stream().filter(t-> t%2==0).forEach(Methodlarimiz::yazdir);
		
	
			}	
}
