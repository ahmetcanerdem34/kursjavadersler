package DAY_11_StringManipulation;

public class C2_CharAt_Metodu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// charAt(index)
		//scan.next().charAt(0) 0. indexteki karakteri verir
		
		
		String str="Java �ok g�zel";//kelimenin uzunlu�u 14, index ise 13
		System.out.println(str.charAt(0));// J yi verir
		
		System.out.println(str.charAt(5));// bana � yi verir
		
		System.out.println(str.charAt(13));//l yi verir
		//kelimenin uzunlu�u son index + 1 dir
		//son index kelimenin uzunlu�u -1 dir.(lenght)-1 uzunluk verir
		
		
		
		//KULLANICI 10 HARFL� B�R KEL�ME G�RERSE BANA 
		//bana son harfi verecek kodu yaz�n�z
		
		System.out.println(str.charAt(9));
		//e�er index olarak kelimenin veya stringin  uzunlu�u daha b�y�k bir say� girilirse
		
		//String str3=5; //burda derleme Zaman hatas� veriir Compile Time Error CTE, t�rnak kulanmazsak
		//bu t�r hatalar d�zeltilmeden java kodu �al��t�rmaz
		
		
		System.out.println(str.charAt(14));//peki bu ne sonu� verir --->HATA, 14 uygun olmasada neden okutmadan hata vermedi
		//burda mant�ksal bir hata yok, kod gider str ismindeki yere gider 14 � bulur, ama java bizim karakteri �al��t�rmadan i�erisindekileri bilemez
		//yukardakileri �al��t�r�r gelir 14 � �al��t�r�r ve bakar ki hatal�.
		//baz� hatalar sytax tan anla��lmaz ancak; kod �al��t�r�ld�ktan sonra Java i�lemi yaparken anla��l�r
		//kod run edildi�inde ortaya ��kt��� i�in bu t�r hatalara RunTime Eror denir RTE
		

	}

}
