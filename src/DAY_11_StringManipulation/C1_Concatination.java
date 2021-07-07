package DAY_11_StringManipulation;

public class C1_Concatination {

	public static void main(String[] args) {
		// Concatenation= Java'da + iþlemi yapýlýrken eðer toplama ifadelerden biri veya
		//her ikisi String ise Java toplama deðil birleþtirme yapar
		
		System.out.print(15+ 20 + "Merhaba");//35 merhaba yazar, neden java yukardan n aþaðý ve soldan saða çalýþýr
		//önce 15+ 20 yi görür topla sonra + merhaba yapar
		//ilk ifade sayi, sonrasý string , dolayýsýyla concatination yapar
		
		System.out.print( "Merhaba" + 15 + 20);//burda merhaba1520 olur, stringden sonra sartý sayý geliyor+ artý birleþtiriyor
		System.out.print( "Merhaba" + (15 + 20));//parantez içerisnde olduðu için, matematiksel iþlemde oarantez içi önemli
		System.out.print( "Merhaba" + 15 * 20);//arada çarpý var, java matematik bilir, önce çarpmayý yapar, merhaba300 olur
		
		
		String str1 ="World";
		String str2 ="World";
		
		//hello world yazdýrmak istersek
		//str1.concat(str2) methodu str1 in sonuna str2 yi ekler
		System.out.println(str1.concat(str2));//HelloWorld=bitiþik yazar atda boþluk için
		System.out.println(str1.concat(" ").concat(str2)); //2 concat kullanarak aradaki boþluðu oluþtururum, istediðimiz kadar concat kullanabiliriz
		System.out.println(str1+" "+str2);
		System.out.println(str1.concat(" ".concat(str2) ));//bu þekilde de yapabiliriz
	}

}
