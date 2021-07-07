package DAY_15_methodCreatDevam;

public class C3_MetodOverloading {

	public static void main(String[] args) {
		//java da ayn� isimle 1 den fazla metod olu�turulursa buna overLoading denir
		//overloading yapabilmek i�in Metod Signuture lerinin farkl� olmas� gerekir
		//Metod Signature = isim +parametre + parametre data turu
		//birbirini kapsayan data turleri oldu�unda java en optimum ��z�m� �retir
		//birebir  uyan varsa o metodu �al��t�r�r, birebir yoksa en fazla uyan metodu kullan�r
		//e�er kapsayan bir metod bulamazsa java RTE verir
		
		
		toplama("Ali","Veli");

	}
	
	
	public static void toplama(int sayi1, int sayi2) {
		
		System.out.println("integer method sonucu : "+ (sayi1 + sayi2));
		
	}
	
      public static void toplama(double sayi1, double sayi2) {
		
		System.out.println("double method sonucu : "+ (sayi1 + sayi2));
	
}
      public static void toplama(int sayi1, double sayi2) {
  		
    	  System.out.println("integer/double method sonucu : "+ (sayi1 + sayi2));
    
      } 
      
      public static void toplama(char char1, char char2) {
    		
    	  System.out.println("char method sonucu : "+ (char1 + char2));
      }
      
      public static void toplama(String str1, String str2) {
  		
    	  System.out.println("String method sonucu : "+ (str1 + str2));

	}

}
