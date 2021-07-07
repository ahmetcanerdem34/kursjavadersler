package DAY_11_StringManipulation;

public class C4_Equals_Metodu {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2 yi kar��la�t�r�r ve String olarak e�it olup olmad���na bakar
		//sonu� olarak true veya false d�nd�r�r
		
		//baz� metodlar�n yapt�klar� i�lem ile d�nd�rd�kleri sonu� farkl� olabilir, 
		// ne gibi; metoda git ali ismindeki elementi sil deriz. burda bu metodun g�revi gidip aliyi bulup silmek
		//o da gidip aliyi bulur ve siler, 
		
		
		String str="Ali can";
		String str2="Ali Can";
		
		
		//str ile str2 nin e�it olup olmad���n� yazd�r�n
		
		System.out.println(str.equals(str2));//buras� bana false yazd�r�r
		// biz true istemiyoruz e�it mi de�ilmi onu istiyoruz, �evirmemiz gerekiyor
		
		System.out.println(str.equals(str2) ?"e�it" : "e�it de�il");// e�it de�il yazd�r�r// turnary y�ntemi
		
		//	Java da Stringler case sensitive dir.(b�y�k k���k harf duyarl�d�r.
		//bir fark bile olsa Stringler e�it olmaz

	}

}
