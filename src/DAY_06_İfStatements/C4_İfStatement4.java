package DAY_06_�fStatements;

import java.util.Scanner;

public class C4_�fStatement4 {

	public static void main(String[] args) {
		
		//kullan�c�dan gun ismini al�n gun hafta i�i veya hafta sonu oldu�unu yazd�r�n
		//��nk� string non primitivedir ve metodu vard�r
		
		
		Scanner scan= new Scanner(System.in);
		System.out.print("g�n ismi giriniz :");
		
		String gun=scan.nextLine().toLowerCase();
		//buray� k����e �evirdiysek k���k harfle gun girmeliyim, buyukse buyuk harfle upper sa yani
		
		if(gun.equals("pazartesi") || gun.equals("sal�") || gun.equals("�ar�amba") || gun.equals("per�embe") || gun.equals("cuma")) {
			System.out.println("girilen g�n haftai�i");
		}
		if(gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println("girilen g�n haftasonu");
			
//			g�n ismi giriniz :pazar
//			girilen g�n haftasonu
			
//			g�n ismi giriniz :sal�
//			girilen g�n haftai�i

			scan.close();
		}
		
	}

}
