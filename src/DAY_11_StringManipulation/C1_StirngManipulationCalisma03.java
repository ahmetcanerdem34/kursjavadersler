package DAY_11_StringManipulation;

public class C1_StirngManipulationCalisma03 {

	public static void main(String[] args) {
		
		  //concat= bir stringi diðerine ekler
		
		String str1 ="Yalancý baharýn yalan";
		String str2="çiçeði";
		String str3="vefasýzlýk senin meziyetinmiþ";
		
		System.out.println(str1+" "+str2);
		//bir stringi diðerine ekler
		
		System.out.println(str1+" "+"çiçeði"+" "+str3);
		//Yalancý baharýn yalan çiçeði vefasýzlýk senin meziyetinmiþ
		
		System.out.println("***************************");
		
	     //equals =iki stringin eþit olup olmadýðýný kontrol edersonuç boolean olarak döner
		
		System.out.println(str1.equals(str3));//false
		
		String str4 = "Çiçeði";
		String str5="çiçeði";
		System.out.println(str2.equals(str4));//false
		System.out.println(str2.equals(str5));//true
		System.out.println(str2.equalsIgnoreCase(str4));//true

	}

}
