package DAY_32_stringBuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {
		
		
		StringBuilder sb1 = new StringBuilder("Arnold");//apend methodunun içine string yazdýk
		System.out.println(sb1);//Arnold
		sb1.append(" ").append("Sývazlandagel");
		System.out.println(sb1);
		//Arnold Sývazlandagel
		
		String cumle="Javayý çok sever";
		sb1.append(cumle, 6, 10);//subStringin kýsaltýlmýþ hali
		System.out.println(sb1);
		//Arnold Sývazlandagel çok//6 yý aldý 10 u almadý
		
		System.out.println(sb1.length());//SB nin uzunluk bilgisini bize verir
		System.out.println(sb1.capacity());//kapasitesini bize verir
//		24
//		46

		sb1.charAt(1);//indexi gireceðiz o indekstek karakteri verecek----//charý içerde yazmayýnca  sb1 en baþtaki deðeri getirir
		System.out.println(sb1.charAt(1));//r
		
		sb1.charAt(5);
		System.out.println(sb1);//charý içerde yazmayýnca  sb1 en baþtaki deðeri getirir
		//Arnold Sývazlandagel çok
		
		sb1.delete(4, 10);//4 ile 10 arasýný silelim
		System.out.println(sb1);
		//Arnoazlandagel çok
		
		
		sb1.deleteCharAt(10);//SB nin istediðimiz indexin karakterini siler
		System.out.println(sb1);
		//Arnoazlandgel çok
		String isim="Arnold Sývazlandagel";
		System.out.println(sb1.equals(isim));//eþit olmaz çünkü 2 si farklý data türleri var
		//1i String
		//1i StringBuilder
		//false
		
		StringBuilder sb2 = new StringBuilder("Arnold Sývazlandagel");//yeni bir obje oluþtracak
		System.out.println(sb1==sb2);//false
		//new kelimesi yeni bir obje oluþturuyor referanslar farklý oluyor artýk, hata verir ayný deðil
		
		System.out.println(sb1.equals(sb2));//false
		//bunu da þöyle aaçýklarýz, StringBuilder da string methodu string den farklý çalýþýr
		//ancak ayný obje ile kýyaslandýðýnda , yani kendisiyle kýyaslandýðýnda true verir
		
		System.out.println(sb1.equals(sb1));//true//String deki == e þit eþit gibi çalýþýr
		
		System.out.println("*******************************");
		System.out.println(sb2.indexOf("Arnold"));
		System.out.println(sb2.indexOf("a", 5));//7-->5 ten sonra kaçta a var
		//10. indexte var
		
		System.out.println("*******************************");
		sb2.insert(2, " ");//2 ye boþluk eklesin
		System.out.println(sb2);
		 //Ar nold Sývazlandagel
		
		System.out.println("*********************");
		
		System.out.println(sb1);
		
		cumle="düþmana korku";
		sb1.insert(0, cumle, 0, 8);//0: SBa hangi indext den itibaren eklenecek
									//cumle: hangi Stringden eklenecek
									//2.0 sýfýr ise: cumlenin hangi indexsinden baþlanacak
									//8 :bitiþ index i
		System.out.println(sb1);
		//düþmana Arnoazlandgel çok
		
		
		
		sb1.insert(3, cumle, 5, 6);
		System.out.println(sb1);
		//düþnmana Arnoazlandgel çok
		
		System.out.println("******************");

		System.out.println(sb1.lastIndexOf("z"));//istenen stringin kulanýldýðý son index i verir
		//14
		System.out.println(sb1.lastIndexOf("m",10 ));//10 dan önceki son m//istenen index in öncesine bakar
		//4
		
		System.out.println("********************");
		
		
		sb1.replace(8, 13, "Tarkan");//SB nin baþlangýç ve bitiþ indexleri arasýndaki kýsmý verilen String ile deðiþtirir
		System.out.println(sb1);
		//düþnmanaTarkanazlandgel çok
		
		
		sb1.reverse();//bir cümle kelime ne varsa tersinden yazdýrý
		System.out.println(sb1);
		//koç legdnalzanakraTanamnþüd
		sb1.reverse();
		
		sb1.setCharAt(10,'d');//char þeklinde yazmalýyý, istediðimiz index istediðimiz harf
		System.out.println(sb1);
		//düþnmanaTadkanazlandgel çok
		
		
		System.out.println(sb1.subSequence(8, 13));//istediðimizindexler araýndaki bölümü verir
		//Tadka
		
		System.out.println(sb1.substring(8));//8 den sonrasýný yazdýr
		//Tadkanazlandgel çok
		
		System.out.println("*************************");
		
		StringBuilder sb3= new StringBuilder("Java çok güzel");
		StringBuilder sb4= new StringBuilder("Java çok güzel");
		
		System.out.println(sb3.equals(sb4));//false
		//içeriklerinini eþit olup olmadýðýna bakmak için String deki equals methodu kullanalým
		
		System.out.println(sb3.toString().equals(sb4.toString()));//2 sini de stirnge çevirdik karþýlaþtýrýnca tru verir, içerikler ayný ise eþit
		//	True
		
		sb3.toString().concat("java çok güzel, insan sevdikçe sevesi geliyor");
		System.out.println(sb3);//String class ýna ait methodlar kullanýlýnca kalýcý deðerler olmaz
		//Java çok güzel
		
		//toString() methodunu kullanýnca SB String e donusmus olur
		//dolayýsýyla tum string methodlarý kullanýlabilir, nokta koyduktan sonra
		//concat te string methodudur kullandýk
		System.out.println(	sb3.toString().concat("java çok güzel, insan sevdikçe sevesi geliyor"));
		//Java çok güzeljava çok güzel, insan sevdikçe sevesi geliyor
		
		System.out.println(sb1.length());//27
		System.out.println(sb1.capacity());//46
		sb1.trimToSize();//trim baþ ve sondaki java nýn verdiklerini geri aldý
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
//		27
//		27
		
		System.out.println("**********************");
		//Ascii yöntemiyle her harfi sayýsal olarak karþýlaþtrýýyor--farklý harflerden 2 sini karþýlaþtýrý buyuk asciden kuçuðu çýkarýr
		//küçük olaný verir
		StringBuilder sb5= new StringBuilder("Jova çok güzel");
		StringBuilder sb6= new StringBuilder("Java çok güzel");
		System.out.println(sb5.compareTo(sb6));
		//14
		System.out.println(sb6.compareTo(sb5));
		//-14
	}

}
