package DAY_34;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		 Encapsulation obj1= new Encapsulation();
	        System.out.println(obj1.isokulAcikMi());
	        System.out.println(obj1.getokulHesapNo());
	        System.out.println(obj1.isokulAcikMi());
	        
	        obj1.setokul›smi("Mehmet Koleji"); // obj1 icin okul ismini degistirdik
	        System.out.println(obj1.isokulAcikMi());// Mehmet Koleji
	        Encapsulation obj2= new Encapsulation();
	        System.out.println(obj2.isokulAcikMi()); // Yildiz koleji
	        
	        /*
	         * 
	         * Tum variable'lar private ve sadece getter() methodlari olusturdum.  
	         * Bu tarz bir class'da datalar sadece okunabilir ama degistirilemez. 
	         * String'lerde degistirilemez yani immutable'dir . 
	         * Bu tarz class'lara immutable class denir, yani Setter'i OLMAYAN classlara denir.

	         * 
	         */


	}

}
