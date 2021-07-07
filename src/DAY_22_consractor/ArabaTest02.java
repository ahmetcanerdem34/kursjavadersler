package DAY_22_consractor;

public class ArabaTest02 {

	public static void main(String[] args) {
		
		
		Araba araba1 =new Araba("Mersedes" , "Yok ki", 2013, "Kırmızı");//new nesne oluşturur, yeni bir araba constructor yapacağız 
		//Merhaba---> nerden geldi bu merhaba araba clası nın içindeki constructor dan
		
		
		//burdaki arabanın özelliklerini Araba clasında verebiliriz ve gidip verdik
		
		System.out.println("Mraka :"+ araba1.marka);
		System.out.println("Mraka :"+ araba1.model);
		System.out.println("Mraka :"+ araba1.renk);
		System.out.println("Mraka :"+ araba1.year);
		
//		Mraka :Mersedes
//		Mraka :Yok ki
//		Mraka :Kırmızı
//		Mraka :2013

		System.out.println("*******************");
		
		Araba araba2 = new Araba("Serçe" , "Yok ki", 2013, "Mavi");
		System.out.println("Araba 2");
		System.out.println("Mraka :"+ araba2.marka);
		System.out.println("Mraka :"+ araba2.model);
		System.out.println("Mraka :"+ araba2.renk);
		System.out.println("Mraka :"+ araba2.year);
		
//		Araba 2
//		Mraka :Serçe
//		Mraka :Yok ki
//		Mraka :Mavi
//		Mraka :2013

	}

}
