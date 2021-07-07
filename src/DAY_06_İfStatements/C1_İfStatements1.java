package DAY_06_ÝfStatements;

public class C1_ÝfStatements1 {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=8;
		
		if(a>b) {//java bacaka þart true ise body devreye girer yani süslü içi
			System.out.println("a büyüktür b");
			//a büyüktür b
		
		}
		
		if (a*b < 0) {//burasý false verir, þart saðlanmaz--->bu if bana hiçbir þey yazdýrmaz
			
			System.out.println("sayýlarýn çarpýmý negatif");
			//biþey yazmaz
		}
		
		if(a<b || b>0) {//ilki false ikincisi true== þart saðladý or var
			
			System.out.println("or lu cümle çalýþýr");
			//or lu cümle çalýþýr
		
			
		}
		if(a-b>0 && a*b>0) {
			
			System.out.println("and cümlesi çalýþtý");
			//and cümlesi çalýþtý
		}
		

	}

}
