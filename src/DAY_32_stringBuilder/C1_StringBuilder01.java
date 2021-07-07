package DAY_32_stringBuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {
		
		
		StringBuilder sb1 = new StringBuilder("Arnold");//apend methodunun i�ine string yazd�k
		System.out.println(sb1);//Arnold
		sb1.append(" ").append("S�vazlandagel");
		System.out.println(sb1);
		//Arnold S�vazlandagel
		
		String cumle="Javay� �ok sever";
		sb1.append(cumle, 6, 10);//subStringin k�salt�lm�� hali
		System.out.println(sb1);
		//Arnold S�vazlandagel �ok//6 y� ald� 10 u almad�
		
		System.out.println(sb1.length());//SB nin uzunluk bilgisini bize verir
		System.out.println(sb1.capacity());//kapasitesini bize verir
//		24
//		46

		sb1.charAt(1);//indexi girece�iz o indekstek karakteri verecek----//char� i�erde yazmay�nca  sb1 en ba�taki de�eri getirir
		System.out.println(sb1.charAt(1));//r
		
		sb1.charAt(5);
		System.out.println(sb1);//char� i�erde yazmay�nca  sb1 en ba�taki de�eri getirir
		//Arnold S�vazlandagel �ok
		
		sb1.delete(4, 10);//4 ile 10 aras�n� silelim
		System.out.println(sb1);
		//Arnoazlandagel �ok
		
		
		sb1.deleteCharAt(10);//SB nin istedi�imiz indexin karakterini siler
		System.out.println(sb1);
		//Arnoazlandgel �ok
		String isim="Arnold S�vazlandagel";
		System.out.println(sb1.equals(isim));//e�it olmaz ��nk� 2 si farkl� data t�rleri var
		//1i String
		//1i StringBuilder
		//false
		
		StringBuilder sb2 = new StringBuilder("Arnold S�vazlandagel");//yeni bir obje olu�tracak
		System.out.println(sb1==sb2);//false
		//new kelimesi yeni bir obje olu�turuyor referanslar farkl� oluyor art�k, hata verir ayn� de�il
		
		System.out.println(sb1.equals(sb2));//false
		//bunu da ��yle aa��klar�z, StringBuilder da string methodu string den farkl� �al���r
		//ancak ayn� obje ile k�yasland���nda , yani kendisiyle k�yasland���nda true verir
		
		System.out.println(sb1.equals(sb1));//true//String deki == e �it e�it gibi �al���r
		
		System.out.println("*******************************");
		System.out.println(sb2.indexOf("Arnold"));
		System.out.println(sb2.indexOf("a", 5));//7-->5 ten sonra ka�ta a var
		//10. indexte var
		
		System.out.println("*******************************");
		sb2.insert(2, " ");//2 ye bo�luk eklesin
		System.out.println(sb2);
		 //Ar nold S�vazlandagel
		
		System.out.println("*********************");
		
		System.out.println(sb1);
		
		cumle="d��mana korku";
		sb1.insert(0, cumle, 0, 8);//0: SBa hangi indext den itibaren eklenecek
									//cumle: hangi Stringden eklenecek
									//2.0 s�f�r ise: cumlenin hangi indexsinden ba�lanacak
									//8 :biti� index i
		System.out.println(sb1);
		//d��mana Arnoazlandgel �ok
		
		
		
		sb1.insert(3, cumle, 5, 6);
		System.out.println(sb1);
		//d��nmana Arnoazlandgel �ok
		
		System.out.println("******************");

		System.out.println(sb1.lastIndexOf("z"));//istenen stringin kulan�ld��� son index i verir
		//14
		System.out.println(sb1.lastIndexOf("m",10 ));//10 dan �nceki son m//istenen index in �ncesine bakar
		//4
		
		System.out.println("********************");
		
		
		sb1.replace(8, 13, "Tarkan");//SB nin ba�lang�� ve biti� indexleri aras�ndaki k�sm� verilen String ile de�i�tirir
		System.out.println(sb1);
		//d��nmanaTarkanazlandgel �ok
		
		
		sb1.reverse();//bir c�mle kelime ne varsa tersinden yazd�r�
		System.out.println(sb1);
		//ko� legdnalzanakraTanamn��d
		sb1.reverse();
		
		sb1.setCharAt(10,'d');//char �eklinde yazmal�y�, istedi�imiz index istedi�imiz harf
		System.out.println(sb1);
		//d��nmanaTadkanazlandgel �ok
		
		
		System.out.println(sb1.subSequence(8, 13));//istedi�imizindexler ara�ndaki b�l�m� verir
		//Tadka
		
		System.out.println(sb1.substring(8));//8 den sonras�n� yazd�r
		//Tadkanazlandgel �ok
		
		System.out.println("*************************");
		
		StringBuilder sb3= new StringBuilder("Java �ok g�zel");
		StringBuilder sb4= new StringBuilder("Java �ok g�zel");
		
		System.out.println(sb3.equals(sb4));//false
		//i�eriklerinini e�it olup olmad���na bakmak i�in String deki equals methodu kullanal�m
		
		System.out.println(sb3.toString().equals(sb4.toString()));//2 sini de stirnge �evirdik kar��la�t�r�nca tru verir, i�erikler ayn� ise e�it
		//	True
		
		sb3.toString().concat("java �ok g�zel, insan sevdik�e sevesi geliyor");
		System.out.println(sb3);//String class �na ait methodlar kullan�l�nca kal�c� de�erler olmaz
		//Java �ok g�zel
		
		//toString() methodunu kullan�nca SB String e donusmus olur
		//dolay�s�yla tum string methodlar� kullan�labilir, nokta koyduktan sonra
		//concat te string methodudur kulland�k
		System.out.println(	sb3.toString().concat("java �ok g�zel, insan sevdik�e sevesi geliyor"));
		//Java �ok g�zeljava �ok g�zel, insan sevdik�e sevesi geliyor
		
		System.out.println(sb1.length());//27
		System.out.println(sb1.capacity());//46
		sb1.trimToSize();//trim ba� ve sondaki java n�n verdiklerini geri ald�
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
//		27
//		27
		
		System.out.println("**********************");
		//Ascii y�ntemiyle her harfi say�sal olarak kar��la�tr��yor--farkl� harflerden 2 sini kar��la�t�r� buyuk asciden ku�u�u ��kar�r
		//k���k olan� verir
		StringBuilder sb5= new StringBuilder("Jova �ok g�zel");
		StringBuilder sb6= new StringBuilder("Java �ok g�zel");
		System.out.println(sb5.compareTo(sb6));
		//14
		System.out.println(sb6.compareTo(sb5));
		//-14
	}

}
