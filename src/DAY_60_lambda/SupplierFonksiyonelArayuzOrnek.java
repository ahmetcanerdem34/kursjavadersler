package DAY_60_lambda;

import java.util.function.Supplier;

public class SupplierFonksiyonelArayuzOrnek {

	public static void main(String[] args) {
		
		//not: Supplier arayuzunde fonksiyon,    .get() methodu ile �a�r�labilir
		
		Supplier<BKisi> supplier= () -> new BKisi("Hasan" , 30);
		
		BKisi kisi = supplier.get();
		
		System.out.println("Ki�i Detay�:\n" + kisi.getIsim() + "," + kisi.getYas());
		
//		  Ki�i Detay�:
//			Hasan,30

	}

}
