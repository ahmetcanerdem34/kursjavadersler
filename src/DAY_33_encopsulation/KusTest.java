package DAY_33_encopsulation;

public class KusTest {

	public static void main(String[] args) {
		
		
		Kus kus=new Kus("Kartal","Uzun Kanat",3,"Siyah", 6000, "Ortado�u");
		System.out.println(kus.getIsim());
		System.out.println(kus.getCins());
		System.out.println(kus.getYas());
		System.out.println(kus.getRenk());
		System.out.println(kus.getFiyat());
		System.out.println(kus.getCo�rafya());
		kus.ulke="M�s�r";
		System.out.println(kus.ulke);
//		Kartal
//		Uzun Kanat
//		3
//		Siyah
//		6000
//		Ortado�u
//		M�s�r
		
		
		System.out.println("**********************************");
		Kus kus1 = new Kus("Karga", "Siyah", 10, "Siyah", 0,"istersem buraya co�rafya ekleyebilirim");
		
		System.out.println(kus1.getIsim());
		System.out.println(kus1.getCins());
		System.out.println(kus1.getYas());
		System.out.println(kus1.getRenk());
		System.out.println(kus1.getFiyat());
		System.out.println(kus1.getCo�rafya());
//		Karga
//		Siyah
//		10
//		Siyah
//		0
//		istersem buraya co�rafya ekleyebilirim
	
		System.out.println("********************************");
		//parametresiz constroctor olu�tuurp gidip private olan clas�m�zda parametresi class olu�truup burda de�erlerini vermek istiyorum
		
		Kus kus2 = new Kus("L�bnan");
		
		kus2.setIsim("G�vercin");
		kus2.setCins("Mardin Kanat");
		kus2.setYas(3);
		kus2.setRenk("Alaca");
		kus2.setFiyat(50000);
		kus2.ulke="L�bnan";
		kus2.setCo�rafya("Ortado�u");
		
		
		
		System.out.println(kus2.getIsim());
		System.out.println(kus2.getCins());
		System.out.println(kus2.getYas());
		System.out.println(kus2.getRenk());
		System.out.println(kus2.getFiyat());
		System.out.println(kus2.ulke);
		System.out.println(kus2.getCo�rafya());
//		G�vercin
//		Mardin Kanat
//		3
//		Alaca
//		50000
//		L�bnan
//		Ortado�u
	
	}

}
