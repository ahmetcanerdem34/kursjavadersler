package DAY_01_Variables;

public class C3_VariablesMetods {

	public static void main(String[] args) {
		
		//string değişkeni oluştururalım ismimizi atayalım
		
		String isim="Java aydınlık olur inş";
		String soyİsim="aydınlık";
		//şimdi isim ve soyismi birlikte yazdırmak istersek ne yaparız + 
		
		System.out.println(isim+" "+soyİsim);
		System.out.print(isim+" ");
		System.out.println(soyİsim);
		/*
		 * Java aydınlık olur inş aydınlık
			Java aydınlık olur inş aydınlık
		 */
		//string değişkenlerde toplam işlemi yaparsak değişkenleri art arda ekler
		
		char bosluk=' ';
		
		System.out.println(isim+bosluk+soyİsim);
		//Java aydınlık olur inş aydınlık
		
		int sayi1=5;
		int sayi2=7;
		
		System.out.println(sayi1+sayi2+isim);//java önce matematiksel işlemi görürse toplar
		//12Java aydınlık olur inş

		
		System.out.println(isim+sayi1+sayi2);//burda önce java ile 5 i toplar 
		//java5 yapar ve artık java5 bir stringtir+ 7 yaptımı onda stringe dahile eder--
		//stringle başladığı için sonrasını String olarak kabul etti
		//Java aydınlık olur inş57
		//eğer bu şekilde toplmamak isterse--->isim +(sayi1+sayi2) yaparız
		
	}
		
}
