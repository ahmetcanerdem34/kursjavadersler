package DAY_33_encopsulation;

public class AtTest {

	public static void main(String[] args) {
	
		
		At beygir = new At();
		At at = new At();
		
		beygir.set�sim("Kara �im�ek");
		beygir.setCins("Arap At�");
		beygir.setRenk("K�rat");
		beygir.setYas(5);
		beygir.setFiyat(4000);
		
		System.out.println("Yeni al�nan 1. at");
		System.out.println("At�n ismi :" +beygir.get�sim());
		System.out.println("At�n cinsi :" +beygir.getCins());
		System.out.println("At�n rengi :" +beygir.getRenk());
		System.out.println("At�n ya�� :" +beygir.getYas());
		System.out.println("At�n ederi :" +beygir.getFiyat()+"tl");
//		Yeni al�nan 1. at
//		At�n ismi :Kara �im�ek
//		At�n cinsi :Arap At�
//		At�n rengi :K�rat
//		At�n ya�� :5
//		At�n ederi :4000
		
		System.out.println("**********************");
		
		at.set�sim("Y�ld�r�m");
		at.setCins("Anadolu K�rmas�");
		at.setRenk("Dor");
		at.setYas(4);
		at.setFiyat(45000);
		
		System.out.println("Al�nan 2. at�m�z");
		
		System.out.println("At�n ismi :" +at.get�sim());
		System.out.println("At�n cinsi :" +at.getCins());
		System.out.println("At�n rengi :" +at.getRenk());
		System.out.println("At�n ya�� :" +at.getYas());
		System.out.println("At�n ederi :" +at.getFiyat()+"tl");
		
		
//		Al�nan 2. at�m�z
//		At�n ismi :Y�ld�r�m
//		At�n cinsi :Anadolu K�rmas�
//		At�n rengi :Dor
//		At�n ya�� :4
//		At�n ederi :45000tl

	}

}
