package DAY_06_ÝfStatements;

import java.util.Scanner;

public class C4_ÝfStatement4 {

	public static void main(String[] args) {
		
		//kullanýcýdan gun ismini alýn gun hafta içi veya hafta sonu olduðunu yazdýrýn
		//çünkü string non primitivedir ve metodu vardýr
		
		
		Scanner scan= new Scanner(System.in);
		System.out.print("gün ismi giriniz :");
		
		String gun=scan.nextLine().toLowerCase();
		//burayý küçüðe çevirdiysek küçük harfle gun girmeliyim, buyukse buyuk harfle upper sa yani
		
		if(gun.equals("pazartesi") || gun.equals("salý") || gun.equals("çarþamba") || gun.equals("perþembe") || gun.equals("cuma")) {
			System.out.println("girilen gün haftaiçi");
		}
		if(gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println("girilen gün haftasonu");
			
//			gün ismi giriniz :pazar
//			girilen gün haftasonu
			
//			gün ismi giriniz :salý
//			girilen gün haftaiçi

			scan.close();
		}
		
	}

}
