package DAY_13_ContainsReplace;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		
		// Kullanicidan bir cumle isteyin
				// cumledeki tum bosluklari silin ve
				// tum a'larin yerine e yazdirin
		
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("lütfen bir cümle giriniz :");
		String str =scan.nextLine();
		
		
		str=str.replace(" ", "");//boþluklarý hiçlikle deðiþtirdik
		str=str.replace("a", "e");
		
		System.out.println("str");//atama yapmazsanýz manipule  str i deðiþtirmez
		//eðer atama yaparsak str jkalýcý olarak deðiþtiði için biz bir daha orjýnal str ye ulaþamayýz
		//bunun için kullanýcýdan aldýðýmýz str ya deðil yeni bir stringe atamak daha mantýklý
		
		System.out.print("lütfen bir cümle giriniz :");
		String str2 =scan.nextLine();
		
		System.out.println(str2.replace(" ", "").replace('a', 'e'));
		
		//hem a hemde e yerine i atayalým
		System.out.println(str2.replace('a', 'i').replace('e', 'i'));
//		lütfen bir cümle giriniz :kale içinde armut
//		keleiçindeermut
//		kili içindi irmut
		
		
		//hem a hemde e yerine i atayalým, büyük küçük harf gözetmeksizin
		
		System.out.println(str2.toLowerCase().replace('a', 'i').replace('e', 'i'));
//		lütfen bir cümle giriniz :Kale Ýçinde Armut
//		KeleÝçindeArmut
//		Kili Ýçindi Armut
//		kili içindi irmut
		
	scan.close();

	}

}
