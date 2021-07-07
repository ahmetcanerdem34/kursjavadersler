package DAY_11_StringManipulation;

public class C4_Equals_Metodu {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2 yi karþýlaþtýrýr ve String olarak eþit olup olmadýðýna bakar
		//sonuç olarak true veya false döndürür
		
		//bazý metodlarýn yaptýklarý iþlem ile döndürdükleri sonuç farklý olabilir, 
		// ne gibi; metoda git ali ismindeki elementi sil deriz. burda bu metodun görevi gidip aliyi bulup silmek
		//o da gidip aliyi bulur ve siler, 
		
		
		String str="Ali can";
		String str2="Ali Can";
		
		
		//str ile str2 nin eþit olup olmadýðýný yazdýrýn
		
		System.out.println(str.equals(str2));//burasý bana false yazdýrýr
		// biz true istemiyoruz eþit mi deðilmi onu istiyoruz, çevirmemiz gerekiyor
		
		System.out.println(str.equals(str2) ?"eþit" : "eþit deðil");// eþit deðil yazdýrýr// turnary yöntemi
		
		//	Java da Stringler case sensitive dir.(büyük küçük harf duyarlýdýr.
		//bir fark bile olsa Stringler eþit olmaz

	}

}
