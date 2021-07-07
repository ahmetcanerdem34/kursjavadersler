package DAY_60_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFonksiyonelArayuzOrnek {

	public static void main(String[] args) {
		
		//NOT: Consumer aray�zz�nde fonksiyon    .accept() metodu iel �a�rlabilir
		
		List<BKisi> kisilerListesi = new ArrayList<BKisi>();
		
		kisilerListesi.add(new BKisi("Ali", 27));
		kisilerListesi.add(new BKisi("Veli", 26));
		
		
		Consumer<BKisi> consumer = (k) -> {
			
			System.out.println(k.getIsim());
			System.out.println(k.getYas());
//			Ay�e
//			22
//			Mehmet
//			45
			
		};		
		consumer.accept(new BKisi ("Ay�e", 22));
		consumer.accept(new BKisi("Mehmet", 45));
		

	}

}
