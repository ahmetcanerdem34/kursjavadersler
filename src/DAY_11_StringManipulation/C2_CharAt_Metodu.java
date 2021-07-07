package DAY_11_StringManipulation;

public class C2_CharAt_Metodu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// charAt(index)
		//scan.next().charAt(0) 0. indexteki karakteri verir
		
		
		String str="Java çok güzel";//kelimenin uzunluðu 14, index ise 13
		System.out.println(str.charAt(0));// J yi verir
		
		System.out.println(str.charAt(5));// bana ç yi verir
		
		System.out.println(str.charAt(13));//l yi verir
		//kelimenin uzunluðu son index + 1 dir
		//son index kelimenin uzunluðu -1 dir.(lenght)-1 uzunluk verir
		
		
		
		//KULLANICI 10 HARFLÝ BÝR KELÝME GÝRERSE BANA 
		//bana son harfi verecek kodu yazýnýz
		
		System.out.println(str.charAt(9));
		//eðer index olarak kelimenin veya stringin  uzunluðu daha büyük bir sayý girilirse
		
		//String str3=5; //burda derleme Zaman hatasý veriir Compile Time Error CTE, týrnak kulanmazsak
		//bu tür hatalar düzeltilmeden java kodu çalýþtýrmaz
		
		
		System.out.println(str.charAt(14));//peki bu ne sonuç verir --->HATA, 14 uygun olmasada neden okutmadan hata vermedi
		//burda mantýksal bir hata yok, kod gider str ismindeki yere gider 14 ü bulur, ama java bizim karakteri çalýþtýrmadan içerisindekileri bilemez
		//yukardakileri çalýþtýrýr gelir 14 ü çalýþtýrýr ve bakar ki hatalý.
		//bazý hatalar sytax tan anlaþýlmaz ancak; kod çalýþtýrýldýktan sonra Java iþlemi yaparken anlaþýlýr
		//kod run edildiðinde ortaya çýktýðý için bu tür hatalara RunTime Eror denir RTE
		

	}

}
