package DAY_60_lambda;

import java.util.function.BiFunction;

public class BiFunctionFonksiyonelArayuzOrnek {

	public static void main(String[] args) {
		
		
		//NOT: BiFunction arayuzunde fonksiyon    .apply() metodu iele çaðrýlabilir
		
		
		BiFunction<BKisi, BKisi, Integer> biFunction = (k1, k2) -> k1.getYas() + k2.getYas();
		
		int toplamYas = biFunction.apply(new BKisi("John", 40), (new BKisi("Jennifer",20)));
		
		System.out.println(toplamYas);
		//60

	}

}
