package DAY_01_Variables;

public class C3_VariablesMetods {

	public static void main(String[] args) {
		
		//string de�i�keni olu�turural�m ismimizi atayal�m
		
		String isim="Java ayd�nl�k olur in�";
		String soy�sim="ayd�nl�k";
		//�imdi isim ve soyismi birlikte yazd�rmak istersek ne yapar�z + 
		
		System.out.println(isim+" "+soy�sim);
		System.out.print(isim+" ");
		System.out.println(soy�sim);
		/*
		 * Java ayd�nl�k olur in� ayd�nl�k
			Java ayd�nl�k olur in� ayd�nl�k
		 */
		//string de�i�kenlerde toplam i�lemi yaparsak de�i�kenleri art arda ekler
		
		char bosluk=' ';
		
		System.out.println(isim+bosluk+soy�sim);
		//Java ayd�nl�k olur in� ayd�nl�k
		
		int sayi1=5;
		int sayi2=7;
		
		System.out.println(sayi1+sayi2+isim);//java �nce matematiksel i�lemi g�r�rse toplar
		//12Java ayd�nl�k olur in�

		
		System.out.println(isim+sayi1+sayi2);//burda �nce java ile 5 i toplar 
		//java5 yapar ve art�k java5 bir stringtir+ 7 yapt�m� onda stringe dahile eder--
		//stringle ba�lad��� i�in sonras�n� String olarak kabul etti
		//Java ayd�nl�k olur in�57
		//e�er bu �ekilde toplmamak isterse--->isim +(sayi1+sayi2) yapar�z
		
	}
		
}
