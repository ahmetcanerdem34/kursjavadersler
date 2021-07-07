package DAY_29_passValueÝmmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

	public static void main(String[] args) {
		
		String isim="Ali";
		isim.concat("Can");
		System.out.println(isim);//Ali--->String de method uygulayýnca ayný kalýr,, ancak syso da yaparsam yapar
		System.out.println(isim.concat("can"));
		//Alican
		
		System.out.println(isim);//yine Ali yazar
		
		
		
		//stringlerde method ile yaptýðýmýz deðiþiklikler kalýcý olurrrÖNEMLÝ HEMEN ALTTA
		//List ile yaparsak olur
		
		List<String> isimList = new ArrayList<>();
		System.out.println(isimList);
		isimList.add("Ali");
		isimList.add("Can");
		System.out.println(isimList);
		isimList.remove(1);
		System.out.println(isimList);
//		Ali
//		Alican
//		Ali
//		[]
//		[Ali, Can]
//		[Ali]
		
		//String lerde methodlþar ile yaptýðýmýz deðiiklikler kalýcý olmaz
		//çünkü java inmutable yapmýþtý
		//listlerde ise kalýcý olarak deðiþir
		//çünkü list mutable dir
		
		//JAVA NEDEN BÖYLE YAPIYOR
		//

	}

}
