package DAY_29_passValue�mmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

	public static void main(String[] args) {
		
		String isim="Ali";
		isim.concat("Can");
		System.out.println(isim);//Ali--->String de method uygulay�nca ayn� kal�r,, ancak syso da yaparsam yapar
		System.out.println(isim.concat("can"));
		//Alican
		
		System.out.println(isim);//yine Ali yazar
		
		
		
		//stringlerde method ile yapt���m�z de�i�iklikler kal�c� olurrr�NEML� HEMEN ALTTA
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
		
		//String lerde methodl�ar ile yapt���m�z de�iiklikler kal�c� olmaz
		//��nk� java inmutable yapm��t�
		//listlerde ise kal�c� olarak de�i�ir
		//��nk� list mutable dir
		
		//JAVA NEDEN B�YLE YAPIYOR
		//

	}

}
