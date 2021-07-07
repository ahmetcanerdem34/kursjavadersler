package DAY_43_interface;

public class Runner {

	public static void main(String[] args) {
		
		Civic c1=new Civic();
		c1.hareket();
		c1.benzin();
		c1.direksiyon();
		c1.ayna();
		c1.far();
		c1.kaporta();
		c1.garanti();
		c1.jant();
		
//		hýzlý vee konomik hareket eder
//		benzin kullanýr
//		deri hidrolik direksiyon
//		otomatik kararma özelliði
//		Led far
//		Psalanamz çelik
//		100.000 km garanti
//		çelik jant

		//c1.fiyat=30000;//The final field IcDonanim.fiyat cannot be assigned
		//CTE VERÝR ÇÜNKÜ ÝNTERFACE DE EN BAÞTA VERÝLEN FÝYATLAR FÝNAL DIR SONRKÝ OBJE OLUÞUMLARINDA  DEÐÝÞTÝRÝLMEZ
		
		
		//fiyat variable sine interface ismi ile ulaþabiliriz, obje uretmeye gerek yok
		//demekki interface deki variable ler statictir
		System.out.println(IcDonanim.FÝYAT);//20000

		
		//interfacedi tum class memberler public tir
		//oyleyese interface deki variabelelr public + static + final dýr
		
		
		//ayný isimli ayný datatipli variableler parent interface deoluþruulur ancak
		//ama ayný isimli variableleri obje kullanarak çaðýrýrsanýz java hangidsini çaðýracaðýna karar veremez ve CTE verir
		//CTE alamamak için ayný isimli variableeler interface isimleriyle çaðýrýlmalýdýr
		//zaten ýnterface lerdeki tum variable ler static olduðundan doðrusu variableler INTERFACE ile çaðýrmaktýr
		//java staticleri obje ile çalýþýnca hata verir
		
		//System.out.println(c1.MARKA;);
		
		
		System.out.println(IcDonanim.MARKA);//Honda
		System.out.println(DisDonanim.MARKA);//Mazda
		System.out.println(Lastik.MARKA);//Audi

		
		
	}

}
