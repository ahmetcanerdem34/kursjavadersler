package DAY_22_consractor;

public class ArabaTest02 {

	public static void main(String[] args) {
		
		
		Araba araba1 =new Araba("Mersedes" , "Yok ki", 2013, "K�rm�z�");//new nesne olu�turur, yeni bir araba constructor yapaca��z 
		//Merhaba---> nerden geldi bu merhaba araba clas� n�n i�indeki constructor dan
		
		
		//burdaki araban�n �zelliklerini Araba clas�nda verebiliriz ve gidip verdik
		
		System.out.println("Mraka :"+ araba1.marka);
		System.out.println("Mraka :"+ araba1.model);
		System.out.println("Mraka :"+ araba1.renk);
		System.out.println("Mraka :"+ araba1.year);
		
//		Mraka :Mersedes
//		Mraka :Yok ki
//		Mraka :K�rm�z�
//		Mraka :2013

		System.out.println("*******************");
		
		Araba araba2 = new Araba("Ser�e" , "Yok ki", 2013, "Mavi");
		System.out.println("Araba 2");
		System.out.println("Mraka :"+ araba2.marka);
		System.out.println("Mraka :"+ araba2.model);
		System.out.println("Mraka :"+ araba2.renk);
		System.out.println("Mraka :"+ araba2.year);
		
//		Araba 2
//		Mraka :Ser�e
//		Mraka :Yok ki
//		Mraka :Mavi
//		Mraka :2013

	}

}
