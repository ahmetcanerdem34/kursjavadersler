package DAY_36;

import java.util.ArrayList;
import java.util.List;

public class UstaBasi extends Isci {
	public String bolum="takimhane";
	public int sorOlIscisay=20;
	
	public static void main(String[] args) {
		
		//3 clas� olu�turduk geldik art�k obje olu�turmaya
		//be bu class da obje olu�turabilir miyim evet
		
		UstaBasi ub1= new UstaBasi();// 3 class ta farkl� 8 variable olu�turduk, �imdi ilk ub1  objesinden olu�tural�m
		//onjeyi torun class�nda olu�turunca 3 classa ula�abiliyoruz
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorOlIscisay);
		System.out.println(ub1.saatUcreti);
		System.out.println(ub1.isim);
//		takimhane
//		20
//		10
//		Mehmet
		
		
		//ub2 objesi olu�turuyorum, ustaBasi i��ide oldu�u i�in ba�taki ustabas�n� i��i yapt�k java izin verdi
		Isci ub2= new UstaBasi();
		//List<String> list = new ArrayList<>();
		//Object str = new String("Hasan"); bunlar ornekti
		//extends ile birbirine ba�l� class larda IS-A relation olan
		//data t�rleri iste�eba�l� olarak kullan�labilir
		//daha geni� data turu yazman�n avantaj�
		//kapsam�n daha geni� olmas�
		
		//dah geni� yazman�n dezavantaj� ise, 
		//data turu olarak secti�imiz class ve parent lar�na ait datalara ula�abiliriz
		//kendi class �ndan olanlara ula�am�yor art�k
	    System.out.println(ub2.departman);
	    System.out.println(ub2.izindeMi);
//	    imalathane
//	    false
	    
	    
	    
		Personel ub3=new UstaBasi();//ustabasi personel oldu�u i�in ba���n�da personelde yapabiliriz--
		//bu �ekilde de yazabiliriz
		//sadece personelde olana ula�abiliyorum
		//data turu olarak hangi class a c�kt�ysak o clas�n genel ozellikleri o s�n�ffta ba�lar yukar� gider
		System.out.println(ub3.id);
		//1001

	}

}
