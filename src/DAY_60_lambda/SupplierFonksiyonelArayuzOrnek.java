package DAY_60_lambda;

import java.util.function.Supplier;

public class SupplierFonksiyonelArayuzOrnek {

	public static void main(String[] args) {
		
		//not: Supplier arayuzunde fonksiyon,    .get() methodu ile çaðrýlabilir
		
		Supplier<BKisi> supplier= () -> new BKisi("Hasan" , 30);
		
		BKisi kisi = supplier.get();
		
		System.out.println("Kiþi Detayý:\n" + kisi.getIsim() + "," + kisi.getYas());
		
//		  Kiþi Detayý:
//			Hasan,30

	}

}
