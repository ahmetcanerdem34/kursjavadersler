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

		System.out.println(" Listedeki baþ harfi A ile baþlayan isimleri yazdýran metodu tanýmlayalým..");
		aÝleBaslayanlar(liste);
//        Listedeki baþ harfi A ile baþlayan isimleri yazdýran metodu tanýmlayalým..
//        Ali
//        Amanda
//        Alihano
//        Alberto
//        Alonzo
//        Alfonso

		System.out.println();
		System.out.println("Listedeki tüm isimleri büyük harfe çeviren metodu tanýmlayalým");
		buyukHarfeCevir(liste);
//        Listedeki tüm isimleri büyük harfe çeviren metodu tanýmlayalým
//        ALÝ
//        MARK
//        JACKSON
//        AMANDA
//        ALÝHANO
//        MARÝANO
//        ALBERTO
//        ALONZO
//        TUCKER
//        ALFONSO
//        CHRÝST
		
		System.out.println();System.out.println("Listedeki tüm elemanlarýn uzunluklarý belirtilen uzunluktan fazla ise bunlarý yazdýran");
//		belirliUzunluktanFazalaÝse(liste,5);
//		Listedeki tüm elemanlarýn uzunluklarý belirtilen uzunluktan fazla ise bunlarý yazdýran
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
		System.out.println("Listedeki TÜM elemanlarýn uzunluklarý belirtilen uzunluktan KÜÇÜK mü");
		belirliUzunluktanKucukÝse(liste,6);
//		Listedeki TÜM elemanlarýn uzunluklarý belirtilen uzunluktan KÜÇÜK mü
//		Ali
//		Mark
		
		System.out.println();
		System.out.println("ALLMATCH() Belirtilen þartlarý tüm elemanlar saðlýyorsa true döndürür. yoksa false");
		System.out.println(belitilenSartlariSagliyorsa(liste,7));
		//false
		
		System.out.println();
		System.out.println("Listedeki TÜM elemanlarýn belirtilen harfi ile baþlamadýðýný kontrol eden metodu yazýnýz.");
		System.out.println(baslayanHarfVarMi(liste,"c"));
		//true
		
		System.out.println();
		System.out.println("Listede Herhangi bir elaman belirtilen bir harf ile bitiyor mu diye kontrol eden metodu yazýnýz.");
		System.out.println(buHarfÝleBitiyorMu(liste,"p"));
		//false
		
		System.out.println();
		System.out.println("A ile baþlayýp O ile biten elemanlarý yazdýran metotu tanýmlayýnz.");
		aÝleBaslayipOileBitenleriYazdir(liste);

//		A ile baþlayýp O ile biten elemanlarý yazdýran metotu tanýmlayýnz.
//		Alihano
//		Alberto
//		Alonzo
//		Alfonso
		
	}
	// Listedeki baþ harfi A ile baþlayan isimleri yazdýran metodu tanýmlayalým..

	public static void aÝleBaslayanlar(List<String> liste) {

		liste.stream().filter(h -> h.startsWith("A")).forEach(System.out::println);
	}
	// Listedeki tüm isimleri büyük harfe çeviren metodu tanýmlayalým..

	public static void buyukHarfeCevir(List<String> liste) {

		liste.stream().map(h -> h.toUpperCase()).forEach(System.out::println);
	}
//Listedeki tüm elemanlarýn uzunluklarý belirtilen uzunluktan fazla ise bunlarý yazdýran
// metodu tanýmlayalým..

	public static void belirliUzunluktanFazalaÝse(List<String> liste, int uzunluk) {

		liste.stream().filter(h-> h.length()> uzunluk).forEach(System.out::println);
	}
	//Listedeki TÜM elemanlarýn uzunluklarý belirtilen uzunluktan KÜÇÜK mü
   
	public static void belirliUzunluktanKucukÝse(List<String> liste, int uzunluk) {

		liste.stream().filter(h-> h.length() < uzunluk).forEach(System.out::println);
	}
	///ALLMATCH() Belirtilen þartlarý tüm elemanlar saðlýyorsa true döndürür. yoksa false
	public static boolean belitilenSartlariSagliyorsa(List<String> liste, int uzunluk) {

		return liste.stream().allMatch(t->t.length()<uzunluk);
	}
	//Listedeki TÜM elemanlarýn belirtilen harfi ile baþlamadýðýný kontrol eden metodu yazýnýz.
	
	public static boolean baslayanHarfVarMi(List<String> liste, String harf) {

		return liste.stream().noneMatch(t->t.startsWith(harf));
	}
	//Listede Herhangi bir elaman belirtilen bir harf ile bitiyor mu diye kontrol eden metodu yazýnýz.
	
	public static boolean buHarfÝleBitiyorMu(List<String> liste, String harf) {

		return liste.stream().anyMatch(t->t.endsWith(harf));
	}
	//A ile baþlayýp O ile biten elemanlarý yazdýran metotu tanýmlayýnz.
	
	public static void aÝleBaslayipOileBitenleriYazdir(List<String> liste) {

		liste.stream().filter(x->x.startsWith("A") && x.endsWith("o")).forEach(System.out::println);
	}
	
}
