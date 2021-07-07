package DAY_61_lambdaOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream01Integer {

	public static void main(String[] args) {
		
		//ÖRNEK-1 (FILTER,FOREACH)----> bu sayfada filter() ve forEach() örnekleri yaptýk
		
		        //.filter() = Streamdeki verileri içerisinde çaðrýlan fonksiyona(methoda) göre filtreleyen ara iþlem methodudur
				// .forEach() = gelen verilerin tamamý  iþlenene (verilen methoda göre) veya bir exception oluþana kadar iterasyoa devam eder 
				//terminal iþlemdir yani solandýrýcýdýr forEach. Stream i yani akýþý kapatýr sonlandýrýr
		
		//2.YÖNTEM: Metot Referansý ve Java metotlarýný 
		
		//BÝR STREAM NASIL OLUÞTURULUR
		
		//Stream api de pupeline de islemler lazy'dir
		//Cunku arkadan gelecek islemlerin durumu degisebileceginden dolayi.
		//Terminal islemleri(sonlandýrýcýlar) eager'dir.Yazilmazsa calismaz
		//Stream kaynagi:collection,List,Set,Array,File...
		//Ara islemler:Filter()(filtrele)->basta olmali,map()(guncelle),sorted()(sirala),findfirst(ilkeleman)
        //      skip(ilk 5 elamani alma gibi-atlama),dintinc()t(tekrarsiz urun),
        //      limit(sinirlama),flatMap(birden fazla coll birlestirir)
		//Terminal islemleri:forEach(yazdirir),reduce()(kendi term islemi yapabiliriz ama lambda ifadesi),
		//      collect()(olusturulan degerleri yeni coll yapmak icin;Bir listeye saklamak icin),
		//      //max()(verinin max),min()(min deger),count()(kac tane o veriden var)
		
		
				/*-Herhangi bir List, Set gibi bir Collection .stream() methodu Streamler ile çalýþabilir hale gelir
				 * 
				 */

				List<Integer> liste = new ArrayList<>();
				liste.stream();//------------------------>artýk pipeline a girebilir
				
				
				//Herhangi bir dizi Stream.of() methodu yardýmýyla Stream'ler ile çalýþabilþlir hale gelir.
				//veyea yeni bir Stream oluþturulabilir
				
				Integer[] dizi= {3,1,4,1,5,9};
				Stream<Integer> streamDizi= Stream.of(dizi);
						
				
				Stream<String> kisiler = Stream.of("Ahmet", "Mahmut","John");
				Stream<Integer> numbers = Stream.of(3,1,4,5,9);
				
				//Coolection oluþturalým Integer tipinde olsun
				
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
		        //collection ýmýzýn ismi rakamlar
		        //stream le tek sayýlarý alalým
		        
		        System.out.println("**********Tek Sayýlar*********");
		        rakamlar.stream().filter(t-> t%2!=0).forEach(x ->System.out.print(x+" "));
//		        **********Tek Sayýlar*********
//		        5 7 7 9 -1 
		        System.out.println();
		        System.out.println("************Çift Sayýlar*********");
		        rakamlar.stream().filter(t->t%2==0).forEach(Methodlarimiz::yazdir);//class adý ve yazdir methodu
//		        ************Çift Sayýlar*********
//		        24-10004
		        
		        System.out.println("*****************Tek mi***************");
		        
		        rakamlar.stream().filter(Methodlarimiz::tekMi).forEach(Methodlarimiz::yazdir);//class adý ve yazdýr methodu
//		        *****************Tek mi***************
//		        5 7 7 9 -1 
		        System.out.println();
		        System.out.println("**************Çift Mi*****************");
		        
		        rakamlar.stream().filter(Methodlarimiz::çiftMi).forEach(Methodlarimiz::yazdir);
//		        **************Çift Mi*****************
//		        2 4 -1000 4 
		        System.out.println();
		        System.out.println("yapýsal çözüm ");
		        ciftElemanlariYazdir(rakamlar);
//		        yapýsal çözüm 
//		        2 4 -1000 4 
		        
		        System.out.println();
		        System.out.println("// 1. yöntem fonksiyonellambda kullanarak çözüm");
		        ciftElemanlariYazdirFonksiyonelStream1(rakamlar);
//		        2 4 -1000 4 
		        
		        System.out.println();
		        System.out.println("2. yöntem Method referansý kullanarak ve java methodlarýný kullanarak yazýdýr");
		        ciftElemanlariYazdirFonksiyonelStream2(rakamlar);
//		        24-10004
		        
		        System.out.println();
		        System.out.println("3. yöntem Method referansý ve kendi methodumuz ile");
		        ciftElemanlariYazdirFonksiyonelStream3(rakamlar);
//		        2 4 -1000 4
		        
	}
	
	
	//bir listeyi parametre olarak alan ve listedeki çift elemanlarý yan yana yazan methodu yapýsal ve fonksiyonel yazýnýz
	//burasý yapýsal çözüm
	public static void ciftElemanlariYazdir(List<Integer> rakamlar) {
		
		for (Integer each : rakamlar) {
			
			if(each%2==0) {
				
				System.out.print(each+" ");
			}
			
			
		}
		
		
	}
	//burasý 1. yöntem fonksiyonellambda kullanarak çözüm
	
	public static void ciftElemanlariYazdirFonksiyonelStream1(List<Integer> rakamlar) {
		
		rakamlar.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+" "));
		
		//.filter() = Streamdeki verileri içerisinde çaðrýlan fonksiyona(methoda) göre filtreleyen ara iþlem methodudur
		// .forEach() = gelen verilerin tamamý  iþlenene (verilen methoda göre) veya bir exception oluþana kadar iterasyoa devam eder 
		//terminal iþlemdir yani solandýrýcýdýr forEach. Stream i yani akýþý kapatýr sonlandýrýr
	}
	
	// burasý 2. yöntem Method referansý kullanarak ve java methodlarýný kullanarak yazýdýr, kullanarak çözüm
	
	public static void ciftElemanlariYazdirFonksiyonelStream2(List<Integer> rakamlar) {
		
		rakamlar.stream().filter(t-> t%2==0).forEach(System.out::print);
	}
	//3. yöntem Method referansý ve kendi methodumuz ile
	
	public static void ciftElemanlariYazdirFonksiyonelStream3(List<Integer> rakamlar) {
		
		rakamlar.stream().filter(t-> t%2==0).forEach(Methodlarimiz::yazdir);
		
	
			}	
}
