package DAY_13_ContainsReplace;

public class C8_SoruCevap2 {

	public static void main(String[] args) {
		
		
		/*
		 *String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
			String str1 = �$13.99�
			String str2 = �$10.55�
			ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
		 */
		
		String str1="$13.99";
		str1=str1.replaceAll("\\D","");
		System.out.println(str1);
		
		String str2="$10.55";
		str2=str2.replaceAll("\\D","");
		System.out.println(str2);
		
		//int toplam=str1+str2;bu �ekilde olmaz ��nk� i�eri�i say� olan stringlerdir
		//e�er i�eri�inin tamamen say� oldu�unu bildi�imiz string var ise parse�nteger ya da parseDouble() a �evirmeliyiz
		//primitive  data tipleri methoda sahip olmad�klar�ndan, wrapper class kullanmam laz�m
		
		double sayi1=Double.parseDouble(str1);
		double sayi2=Double.parseDouble(str2);
		
		double toplam=(sayi1+sayi2)/100;
		
		System.out.println(toplam);
//		1399
//		1055
//		24.54		
		

	}

}
