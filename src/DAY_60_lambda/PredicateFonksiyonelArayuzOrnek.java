package DAY_60_lambda;

import java.util.function.Predicate;

public class PredicateFonksiyonelArayuzOrnek {

	public static void main(String[] args) {
		
		//Predicate arayuzunde foksiyon     .test()   methodu ile çaðrýlabilir
  		
		Predicate<BKisi> predicate = (kisi) -> kisi.getYas() > 18;
		boolean sonuc= predicate.test(new BKisi("Yusuf",20));
		System.out.println(sonuc);//true

	}

}
