package DAY_36;

import java.util.ArrayList;
import java.util.List;

public class UstaBasi extends Isci {
	public String bolum="takimhane";
	public int sorOlIscisay=20;
	
	public static void main(String[] args) {
		
		//3 clasý oluþturduk geldik artýk obje oluþturmaya
		//be bu class da obje oluþturabilir miyim evet
		
		UstaBasi ub1= new UstaBasi();// 3 class ta farklý 8 variable oluþturduk, þimdi ilk ub1  objesinden oluþturalým
		//onjeyi torun classýnda oluþturunca 3 classa ulaþabiliyoruz
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorOlIscisay);
		System.out.println(ub1.saatUcreti);
		System.out.println(ub1.isim);
//		takimhane
//		20
//		10
//		Mehmet
		
		
		//ub2 objesi oluþturuyorum, ustaBasi iþçide olduðu için baþtaki ustabasýný iþçi yaptýk java izin verdi
		Isci ub2= new UstaBasi();
		//List<String> list = new ArrayList<>();
		//Object str = new String("Hasan"); bunlar ornekti
		//extends ile birbirine baðlý class larda IS-A relation olan
		//data türleri isteðebaðlý olarak kullanýlabilir
		//daha geniþ data turu yazmanýn avantajý
		//kapsamýn daha geniþ olmasý
		
		//dah geniþ yazmanýn dezavantajý ise, 
		//data turu olarak sectiðimiz class ve parent larýna ait datalara ulaþabiliriz
		//kendi class ýndan olanlara ulaþamýyor artýk
	    System.out.println(ub2.departman);
	    System.out.println(ub2.izindeMi);
//	    imalathane
//	    false
	    
	    
	    
		Personel ub3=new UstaBasi();//ustabasi personel olduðu için baþþýnýda personelde yapabiliriz--
		//bu þekilde de yazabiliriz
		//sadece personelde olana ulaþabiliyorum
		//data turu olarak hangi class a cýktýysak o clasýn genel ozellikleri o sýnýffta baþlar yukarý gider
		System.out.println(ub3.id);
		//1001

	}

}
