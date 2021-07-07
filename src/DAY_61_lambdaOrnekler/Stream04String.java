package DAY_61_lambdaOrnekler;

import java.util.ArrayList;
import java.util.List;

public class Stream04String {

	public static void main(String[] args) {

		List<String> liste = new ArrayList<>();
		liste.add("Ali");
		liste.add("Mark");
		liste.add("Jackson");
		liste.add("Amanda");
		liste.add("Alihano");
		liste.add("Mariano");
		liste.add("Alberto");
		liste.add("Alonzo");
		liste.add("Tucker");
		liste.add("Alfonso");
		liste.add("Christ");

		System.out.println(" Listedeki ba� harfi A ile ba�layan isimleri yazd�ran metodu tan�mlayal�m..");
		a�leBaslayanlar(liste);
//        Listedeki ba� harfi A ile ba�layan isimleri yazd�ran metodu tan�mlayal�m..
//        Ali
//        Amanda
//        Alihano
//        Alberto
//        Alonzo
//        Alfonso

		System.out.println();
		System.out.println("Listedeki t�m isimleri b�y�k harfe �eviren metodu tan�mlayal�m");
		buyukHarfeCevir(liste);
//        Listedeki t�m isimleri b�y�k harfe �eviren metodu tan�mlayal�m
//        AL�
//        MARK
//        JACKSON
//        AMANDA
//        AL�HANO
//        MAR�ANO
//        ALBERTO
//        ALONZO
//        TUCKER
//        ALFONSO
//        CHR�ST
		
		System.out.println();System.out.println("Listedeki t�m elemanlar�n uzunluklar� belirtilen uzunluktan fazla ise bunlar� yazd�ran");
//		belirliUzunluktanFazala�se(liste,5);
//		Listedeki t�m elemanlar�n uzunluklar� belirtilen uzunluktan fazla ise bunlar� yazd�ran
//		Jackson
//		Amanda
//		Alihano
//		Mariano
//		Alberto
//		Alonzo
//		Tucker
//		Alfonso
//		Christ
		
		System.out.println();
		System.out.println("Listedeki T�M elemanlar�n uzunluklar� belirtilen uzunluktan K���K m�");
		belirliUzunluktanKucuk�se(liste,6);
//		Listedeki T�M elemanlar�n uzunluklar� belirtilen uzunluktan K���K m�
//		Ali
//		Mark
		
		System.out.println();
		System.out.println("ALLMATCH() Belirtilen �artlar� t�m elemanlar sa�l�yorsa true d�nd�r�r. yoksa false");
		System.out.println(belitilenSartlariSagliyorsa(liste,7));
		//false
		
		System.out.println();
		System.out.println("Listedeki T�M elemanlar�n belirtilen harfi ile ba�lamad���n� kontrol eden metodu yaz�n�z.");
		System.out.println(baslayanHarfVarMi(liste,"c"));
		//true
		
		System.out.println();
		System.out.println("Listede Herhangi bir elaman belirtilen bir harf ile bitiyor mu diye kontrol eden metodu yaz�n�z.");
		System.out.println(buHarf�leBitiyorMu(liste,"p"));
		//false
		
		System.out.println();
		System.out.println("A ile ba�lay�p O ile biten elemanlar� yazd�ran metotu tan�mlay�nz.");
		a�leBaslayipOileBitenleriYazdir(liste);

//		A ile ba�lay�p O ile biten elemanlar� yazd�ran metotu tan�mlay�nz.
//		Alihano
//		Alberto
//		Alonzo
//		Alfonso
		
	}
	// Listedeki ba� harfi A ile ba�layan isimleri yazd�ran metodu tan�mlayal�m..

	public static void a�leBaslayanlar(List<String> liste) {

		liste.stream().filter(h -> h.startsWith("A")).forEach(System.out::println);
	}
	// Listedeki t�m isimleri b�y�k harfe �eviren metodu tan�mlayal�m..

	public static void buyukHarfeCevir(List<String> liste) {

		liste.stream().map(h -> h.toUpperCase()).forEach(System.out::println);
	}
//Listedeki t�m elemanlar�n uzunluklar� belirtilen uzunluktan fazla ise bunlar� yazd�ran
// metodu tan�mlayal�m..

	public static void belirliUzunluktanFazala�se(List<String> liste, int uzunluk) {

		liste.stream().filter(h-> h.length()> uzunluk).forEach(System.out::println);
	}
	//Listedeki T�M elemanlar�n uzunluklar� belirtilen uzunluktan K���K m�
   
	public static void belirliUzunluktanKucuk�se(List<String> liste, int uzunluk) {

		liste.stream().filter(h-> h.length() < uzunluk).forEach(System.out::println);
	}
	///ALLMATCH() Belirtilen �artlar� t�m elemanlar sa�l�yorsa true d�nd�r�r. yoksa false
	public static boolean belitilenSartlariSagliyorsa(List<String> liste, int uzunluk) {

		return liste.stream().allMatch(t->t.length()<uzunluk);
	}
	//Listedeki T�M elemanlar�n belirtilen harfi ile ba�lamad���n� kontrol eden metodu yaz�n�z.
	
	public static boolean baslayanHarfVarMi(List<String> liste, String harf) {

		return liste.stream().noneMatch(t->t.startsWith(harf));
	}
	//Listede Herhangi bir elaman belirtilen bir harf ile bitiyor mu diye kontrol eden metodu yaz�n�z.
	
	public static boolean buHarf�leBitiyorMu(List<String> liste, String harf) {

		return liste.stream().anyMatch(t->t.endsWith(harf));
	}
	//A ile ba�lay�p O ile biten elemanlar� yazd�ran metotu tan�mlay�nz.
	
	public static void a�leBaslayipOileBitenleriYazdir(List<String> liste) {

		liste.stream().filter(x->x.startsWith("A") && x.endsWith("o")).forEach(System.out::println);
	}
	
}
