package DAY_13_ContainsReplace;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		
		// Kullanicidan bir cumle isteyin
				// cumledeki tum bosluklari silin ve
				// tum a'larin yerine e yazdirin
		
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("l�tfen bir c�mle giriniz :");
		String str =scan.nextLine();
		
		
		str=str.replace(" ", "");//bo�luklar� hi�likle de�i�tirdik
		str=str.replace("a", "e");
		
		System.out.println("str");//atama yapmazsan�z manipule  str i de�i�tirmez
		//e�er atama yaparsak str jkal�c� olarak de�i�ti�i i�in biz bir daha orj�nal str ye ula�amay�z
		//bunun i�in kullan�c�dan ald���m�z str ya de�il yeni bir stringe atamak daha mant�kl�
		
		System.out.print("l�tfen bir c�mle giriniz :");
		String str2 =scan.nextLine();
		
		System.out.println(str2.replace(" ", "").replace('a', 'e'));
		
		//hem a hemde e yerine i atayal�m
		System.out.println(str2.replace('a', 'i').replace('e', 'i'));
//		l�tfen bir c�mle giriniz :kale i�inde armut
//		kelei�indeermut
//		kili i�indi irmut
		
		
		//hem a hemde e yerine i atayal�m, b�y�k k���k harf g�zetmeksizin
		
		System.out.println(str2.toLowerCase().replace('a', 'i').replace('e', 'i'));
//		l�tfen bir c�mle giriniz :Kale ��inde Armut
//		Kele��indeArmut
//		Kili ��indi Armut
//		kili i�indi irmut
		
	scan.close();

	}

}
