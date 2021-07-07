package DAY_33_encopsulation;

public class AtTest {

	public static void main(String[] args) {
	
		
		At beygir = new At();
		At at = new At();
		
		beygir.setİsim("Kara Şimşek");
		beygir.setCins("Arap Atı");
		beygir.setRenk("Kırat");
		beygir.setYas(5);
		beygir.setFiyat(4000);
		
		System.out.println("Yeni alınan 1. at");
		System.out.println("Atın ismi :" +beygir.getİsim());
		System.out.println("Atın cinsi :" +beygir.getCins());
		System.out.println("Atın rengi :" +beygir.getRenk());
		System.out.println("Atın yaşı :" +beygir.getYas());
		System.out.println("Atın ederi :" +beygir.getFiyat()+"tl");
//		Yeni alınan 1. at
//		Atın ismi :Kara Şimşek
//		Atın cinsi :Arap Atı
//		Atın rengi :Kırat
//		Atın yaşı :5
//		Atın ederi :4000
		
		System.out.println("**********************");
		
		at.setİsim("Yıldırım");
		at.setCins("Anadolu Kırması");
		at.setRenk("Dor");
		at.setYas(4);
		at.setFiyat(45000);
		
		System.out.println("Alınan 2. atımız");
		
		System.out.println("Atın ismi :" +at.getİsim());
		System.out.println("Atın cinsi :" +at.getCins());
		System.out.println("Atın rengi :" +at.getRenk());
		System.out.println("Atın yaşı :" +at.getYas());
		System.out.println("Atın ederi :" +at.getFiyat()+"tl");
		
		
//		Alınan 2. atımız
//		Atın ismi :Yıldırım
//		Atın cinsi :Anadolu Kırması
//		Atın rengi :Dor
//		Atın yaşı :4
//		Atın ederi :45000tl

	}

}
