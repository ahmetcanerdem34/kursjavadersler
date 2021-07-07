package Java_PracticeDay2.copy;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		
	/*	
		* Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 *
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.print("A B C harflerinden biriniz giriniz :");
		char harf = scan.next().toUpperCase().charAt(0);
		
		
		switch (harf) {
		case 'A': System.out.println("Java is easy"); break;
		case 'B': System.out.println("Java is funny"); break;
		case 'C': System.out.println("Ineed to study"); break;
		default:System.out.println("geçerli harf giriniz...");
		
//		A B C harflerinden biriniz giriniz :a
//		Java is easy
		
//		A B C harflerinden biriniz giriniz :6
//		geçerli harf giriniz...
		
		//ankara da yazsak char olduðu için a yý alýr
		}
		
	
	scan.close();	
		
		
	}

}
