package DAY_22_consractor;

public class ArabaTest01 {

	public static void main(String[] args) {
		
		//araba t��rnde olu�turmak istiyorum
		
		//NESNELER(objeler) new ANAHTAR KEL�MES�YLE OLU�TURULUR UNUTMAYIN
		
		Araba araba1= new Araba("Mersedes" , "Yok ki", 2013, "K�rm�z�");//�uan araban�n iskeletini sadece �rettik,, renk yok , model yok vb. 
		
		//�zellikler verelim
		
		araba1.marka="Mercedes";
		araba1.model="cla180";
		araba1.renk="Gri";
		araba1.year=2012;
		
		//�imdi �zelliklerini yazd�ral�m
		System.out.println("Marka : "+araba1.marka );
		System.out.println("Model: "+araba1.model );
		System.out.println("Renk : "+araba1.renk );
		System.out.println("Ya�� : "+(2021 - araba1.year));
		
		
		//�imdide yeni bir araba clas�ndan yeni bir  t�r, nesne olu�tural�m
		
		Araba araba2 = new Araba("Mersedes" , "Yok ki", 2013, "K�rm�z�");
		
		araba2.marka="BMW";
		araba2.model="520i";
		araba2.renk="Bej";
		araba2.year=2021;
		
		System.out.println("Marka : "+araba2.marka );
		System.out.println("Model: "+araba2.model );
		System.out.println("Renk : "+araba2.renk );
		System.out.println("Ya�� : "+(2021 - araba2.year));
		
//		Marka : BMW
//		Model: 520i
//		Renk : Bej
//		Ya�� : 0
		
		
		Araba araba3= new Araba("pejo", "128");
		
		System.out.println(araba3.marka);
		System.out.println(araba3.model);
		
	}

}
