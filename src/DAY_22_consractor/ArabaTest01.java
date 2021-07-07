package DAY_22_consractor;

public class ArabaTest01 {

	public static void main(String[] args) {
		
		//araba tðürnde oluþturmak istiyorum
		
		//NESNELER(objeler) new ANAHTAR KELÝMESÝYLE OLUÞTURULUR UNUTMAYIN
		
		Araba araba1= new Araba("Mersedes" , "Yok ki", 2013, "Kýrmýzý");//þuan arabanýn iskeletini sadece ürettik,, renk yok , model yok vb. 
		
		//özellikler verelim
		
		araba1.marka="Mercedes";
		araba1.model="cla180";
		araba1.renk="Gri";
		araba1.year=2012;
		
		//þimdi özelliklerini yazdýralým
		System.out.println("Marka : "+araba1.marka );
		System.out.println("Model: "+araba1.model );
		System.out.println("Renk : "+araba1.renk );
		System.out.println("Yaþý : "+(2021 - araba1.year));
		
		
		//þimdide yeni bir araba clasýndan yeni bir  tür, nesne oluþturalým
		
		Araba araba2 = new Araba("Mersedes" , "Yok ki", 2013, "Kýrmýzý");
		
		araba2.marka="BMW";
		araba2.model="520i";
		araba2.renk="Bej";
		araba2.year=2021;
		
		System.out.println("Marka : "+araba2.marka );
		System.out.println("Model: "+araba2.model );
		System.out.println("Renk : "+araba2.renk );
		System.out.println("Yaþý : "+(2021 - araba2.year));
		
//		Marka : BMW
//		Model: 520i
//		Renk : Bej
//		Yaþý : 0
		
		
		Araba araba3= new Araba("pejo", "128");
		
		System.out.println(araba3.marka);
		System.out.println(araba3.model);
		
	}

}
