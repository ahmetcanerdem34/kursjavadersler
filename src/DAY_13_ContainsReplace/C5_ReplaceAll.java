package DAY_13_ContainsReplace;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		
		String str="java ogren mutlu ol, java candýr";
		
		System.out.println(str.replace("java", "hava"));//burasý replace
		
		//þimdidide replaceAll a bakalým
		
		//replaceAll() metodu replace() metoduna benzer ama 2 farký vardýr
		//replace() metodu char kabul ediyordu
		//replaceAll kabul etmez
		
		//replaceAll() metodu regexp kullanýmýna izin veririr.. REGEX NEDÝR?
		
		System.out.println(str.replaceAll("\\w", "*"));//tüm harf ve rakamlar yerine * yýldýz yazacak
		System.out.println(str.replaceAll("\\W", "*"));//küçük w nun tersi
		System.out.println(str.replaceAll("\\d", "."));//d-->sayý olan yere nokta yazar
		System.out.println(str.replaceAll("\\D", "."));//büyük D sayý dýþýndakileri nokta yapar, boþ býrakýrsak boþþa çevirir
		System.out.println(str.replaceAll("\\s", "&"));//bosluklarý & and yapar
		System.out.println(str.replaceAll("\\S", "&"));//büyük S (space)bosluk olmayan herþeyi and yapar
		System.out.println(str.replaceAll("\\d", ""));// küçük d sayýlarý siler
		
		
//		hava ogren mutlu ol, hava candýr
//		**** ***** ***** **, **** ****ý*
//		java*ogren*mutlu*ol**java*cand*r
//		java ogren mutlu ol, java candýr
//		................................
//		java&ogren&mutlu&ol,&java&candýr
//		&&&& &&&&& &&&&& &&& &&&& &&&&&&
//		java ogren mutlu ol, java candýr

		
		
		
		
		
		
		
		
	}

}
