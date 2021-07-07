package DAY_15_methodCreatDevam;

public class C3_MetodOverloading {

	public static void main(String[] args) {
		//java da ayný isimle 1 den fazla metod oluþturulursa buna overLoading denir
		//overloading yapabilmek için Metod Signuture lerinin farklý olmasý gerekir
		//Metod Signature = isim +parametre + parametre data turu
		//birbirini kapsayan data turleri olduðunda java en optimum çözümü üretir
		//birebir  uyan varsa o metodu çalýþtýrýr, birebir yoksa en fazla uyan metodu kullanýr
		//eðer kapsayan bir metod bulamazsa java RTE verir
		
		
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
