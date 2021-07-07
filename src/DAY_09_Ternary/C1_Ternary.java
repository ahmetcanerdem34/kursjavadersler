package DAY_09_Ternary;

public class C1_Ternary {

	public static void main(String[] args) {
		
		//turnary de de bir deðiþkene tama yapmalýyým, yoksa hata verir sonuca atayalým mesela
		
		int sayi= 10;
		//burda neden String a atadýk çünkü son yazdýrdýðýmýz string= çift veya tek
		
	String sonuc = sayi%2==0? "çift" : "tek sayý";// paranteze alsakt aolur almasakta
		
	
	//peki bir variable ye asign etmek isteemzsem 
	//sonucu nasýl görüürüm
	//o zamn syso içinde yazarým

	System.out.println(sayi%2==0? "çift" : "tek sayý");
	
	//baþýna açýklama yazmak istersem itiraz eder= parantez içerisine almalýyým ternary operatörünü
	
	System.out.println("iþlem sonucu :" +(sayi%2==0? "çift" : "tek sayý"));
	
	
	
	}

}
