package DAY_11_StringManipulation;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		// str.toLowerCase() ---> bütün verilen stringin tammaýný küçük harfe çevirir.
		//str.toUpperCase--> verilen stringin tamamýný büyük harfe çevirir
		
		
		String str="Techproeducation";
		//büyük harf ile yazdýrmak istersek, iþimiz kolay
		
		System.out.println(str.toUpperCase());
		
		//str ý büyük harfe çevirmek istersek, atama yapmalýyým assigmentÖNEMLÝ YAZDIRMAMALIYIZ ÇEVÝRMELÝYÝZ DÝYORUZ
		
		str=str.toUpperCase();// 17. satýrdan sonra kalýcý olarak str büyük harflerden oluþan bir stringtir
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));//burasýda harfleri istediðimiz dile çevirebiliriz
		
		
		

	}

}
