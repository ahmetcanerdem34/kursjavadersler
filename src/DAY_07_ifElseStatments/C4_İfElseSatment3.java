package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C4_�fElseSatment3 {

	public static void main(String[] args) {
		
		//soru: kullan�c�dan ya��n� sorun 65 ten buyukse e�itse emekl� olabilirsin yoksa olmazs�n yazd�r�n
		
		Scanner scan =new Scanner (System.in);
		System.out.print("ya��n�z� giriniz:");
		int yas=scan.nextInt();
		
		
		if (yas>=65) {
			System.out.println("emekli olabilirsiniz");
			
		} else {
			System.out.println("emekli olamazs�n�z");
			
//			ya��n�z� giriniz:65
//			emekli olabilirsiniz	
			
//			ya��n�z� giriniz:34
//			emekli olamazs�n�z
			
		}
		scan.close();
 
	}

}
