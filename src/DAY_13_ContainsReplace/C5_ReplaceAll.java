package DAY_13_ContainsReplace;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		
		String str="java ogren mutlu ol, java cand�r";
		
		System.out.println(str.replace("java", "hava"));//buras� replace
		
		//�imdidide replaceAll a bakal�m
		
		//replaceAll() metodu replace() metoduna benzer ama 2 fark� vard�r
		//replace() metodu char kabul ediyordu
		//replaceAll kabul etmez
		
		//replaceAll() metodu regexp kullan�m�na izin veririr.. REGEX NED�R?
		
		System.out.println(str.replaceAll("\\w", "*"));//t�m harf ve rakamlar yerine * y�ld�z yazacak
		System.out.println(str.replaceAll("\\W", "*"));//k���k w nun tersi
		System.out.println(str.replaceAll("\\d", "."));//d-->say� olan yere nokta yazar
		System.out.println(str.replaceAll("\\D", "."));//b�y�k D say� d���ndakileri nokta yapar, bo� b�rak�rsak bo��a �evirir
		System.out.println(str.replaceAll("\\s", "&"));//bosluklar� & and yapar
		System.out.println(str.replaceAll("\\S", "&"));//b�y�k S (space)bosluk olmayan her�eyi and yapar
		System.out.println(str.replaceAll("\\d", ""));// k���k d say�lar� siler
		
		
//		hava ogren mutlu ol, hava cand�r
//		**** ***** ***** **, **** ****�*
//		java*ogren*mutlu*ol**java*cand*r
//		java ogren mutlu ol, java cand�r
//		................................
//		java&ogren&mutlu&ol,&java&cand�r
//		&&&& &&&&& &&&&& &&& &&&& &&&&&&
//		java ogren mutlu ol, java cand�r

		
		
		
		
		
		
		
		
	}

}
