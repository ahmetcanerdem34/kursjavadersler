package DAY_02_scanners;

import java.util.Scanner;

public class C2_Scanner02 {

	public static void main(String[] args) {
		//kullan�c�dan yar� �ap� isteyin ve dairenin alan� yazd�r�n
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("alan�n� hesaplamak i�in dairenin yar��ap�n� giriniz :");
		
		double ycap=scan.nextDouble();
		
		System.out.println("dairenin alan� =" + 3.14*ycap*ycap);

//		alan�n� hesaplamak i�in dairenin yar��ap�n� giriniz :3.45
//		dairenin alan� =37.373850000000004
	}

}
