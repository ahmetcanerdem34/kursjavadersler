package DAY_11_StringManipulation;

public class C1_Concatination {

	public static void main(String[] args) {
		// Concatenation= Java'da + i�lemi yap�l�rken e�er toplama ifadelerden biri veya
		//her ikisi String ise Java toplama de�il birle�tirme yapar
		
		System.out.print(15+ 20 + "Merhaba");//35 merhaba yazar, neden java yukardan n a�a�� ve soldan sa�a �al���r
		//�nce 15+ 20 yi g�r�r topla sonra + merhaba yapar
		//ilk ifade sayi, sonras� string , dolay�s�yla concatination yapar
		
		System.out.print( "Merhaba" + 15 + 20);//burda merhaba1520 olur, stringden sonra sart� say� geliyor+ art� birle�tiriyor
		System.out.print( "Merhaba" + (15 + 20));//parantez i�erisnde oldu�u i�in, matematiksel i�lemde oarantez i�i �nemli
		System.out.print( "Merhaba" + 15 * 20);//arada �arp� var, java matematik bilir, �nce �arpmay� yapar, merhaba300 olur
		
		
		String str1 ="World";
		String str2 ="World";
		
		//hello world yazd�rmak istersek
		//str1.concat(str2) methodu str1 in sonuna str2 yi ekler
		System.out.println(str1.concat(str2));//HelloWorld=biti�ik yazar atda bo�luk i�in
		System.out.println(str1.concat(" ").concat(str2)); //2 concat kullanarak aradaki bo�lu�u olu�tururum, istedi�imiz kadar concat kullanabiliriz
		System.out.println(str1+" "+str2);
		System.out.println(str1.concat(" ".concat(str2) ));//bu �ekilde de yapabiliriz
	}

}
