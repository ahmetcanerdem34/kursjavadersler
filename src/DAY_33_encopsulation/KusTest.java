package DAY_33_encopsulation;

public class KusTest {

	public static void main(String[] args) {
		
		
		Kus kus=new Kus("Kartal","Uzun Kanat",3,"Siyah", 6000, "Ortadoðu");
		System.out.println(kus.getIsim());
		System.out.println(kus.getCins());
		System.out.println(kus.getYas());
		System.out.println(kus.getRenk());
		System.out.println(kus.getFiyat());
		System.out.println(kus.getCoðrafya());
		kus.ulke="Mýsýr";
		System.out.println(kus.ulke);
//		Kartal
//		Uzun Kanat
//		3
//		Siyah
//		6000
//		Ortadoðu
//		Mýsýr
		
		
		System.out.println("**********************************");
		Kus kus1 = new Kus("Karga", "Siyah", 10, "Siyah", 0,"istersem buraya coðrafya ekleyebilirim");
		
		System.out.println(kus1.getIsim());
		System.out.println(kus1.getCins());
		System.out.println(kus1.getYas());
		System.out.println(kus1.getRenk());
		System.out.println(kus1.getFiyat());
		System.out.println(kus1.getCoðrafya());
//		Karga
//		Siyah
//		10
//		Siyah
//		0
//		istersem buraya coðrafya ekleyebilirim
	
		System.out.println("********************************");
		//parametresiz constroctor oluþtuurp gidip private olan clasýmýzda parametresi class oluþtruup burda deðerlerini vermek istiyorum
		
		Kus kus2 = new Kus("Lübnan");
		
		kus2.setIsim("Güvercin");
		kus2.setCins("Mardin Kanat");
		kus2.setYas(3);
		kus2.setRenk("Alaca");
		kus2.setFiyat(50000);
		kus2.ulke="Lübnan";
		kus2.setCoðrafya("Ortadoðu");
		
		
		
		System.out.println(kus2.getIsim());
		System.out.println(kus2.getCins());
		System.out.println(kus2.getYas());
		System.out.println(kus2.getRenk());
		System.out.println(kus2.getFiyat());
		System.out.println(kus2.ulke);
		System.out.println(kus2.getCoðrafya());
//		Güvercin
//		Mardin Kanat
//		3
//		Alaca
//		50000
//		Lübnan
//		Ortadoðu
	
	}

}
