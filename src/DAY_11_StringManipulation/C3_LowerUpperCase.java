package DAY_11_StringManipulation;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		// str.toLowerCase() ---> b�t�n verilen stringin tamma�n� k���k harfe �evirir.
		//str.toUpperCase--> verilen stringin tamam�n� b�y�k harfe �evirir
		
		
		String str="Techproeducation";
		//b�y�k harf ile yazd�rmak istersek, i�imiz kolay
		
		System.out.println(str.toUpperCase());
		
		//str � b�y�k harfe �evirmek istersek, atama yapmal�y�m assigment�NEML� YAZDIRMAMALIYIZ �EV�RMEL�Y�Z D�YORUZ
		
		str=str.toUpperCase();// 17. sat�rdan sonra kal�c� olarak str b�y�k harflerden olu�an bir stringtir
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));//buras�da harfleri istedi�imiz dile �evirebiliriz
		
		
		

	}

}
