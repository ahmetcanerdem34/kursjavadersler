package DAY_11_StringManipulation;

public class C1_StirngManipulationCalisma03 {

	public static void main(String[] args) {
		
		  //concat= bir stringi di�erine ekler
		
		String str1 ="Yalanc� bahar�n yalan";
		String str2="�i�e�i";
		String str3="vefas�zl�k senin meziyetinmi�";
		
		System.out.println(str1+" "+str2);
		//bir stringi di�erine ekler
		
		System.out.println(str1+" "+"�i�e�i"+" "+str3);
		//Yalanc� bahar�n yalan �i�e�i vefas�zl�k senin meziyetinmi�
		
		System.out.println("***************************");
		
	     //equals =iki stringin e�it olup olmad���n� kontrol edersonu� boolean olarak d�ner
		
		System.out.println(str1.equals(str3));//false
		
		String str4 = "�i�e�i";
		String str5="�i�e�i";
		System.out.println(str2.equals(str4));//false
		System.out.println(str2.equals(str5));//true
		System.out.println(str2.equalsIgnoreCase(str4));//true

	}

}
