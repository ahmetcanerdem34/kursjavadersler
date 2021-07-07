package DAY_02_scanners;

import java.util.Scanner;

public class C2_Scanner02 {

	public static void main(String[] args) {
		//kullanýcýdan yarý çapý isteyin ve dairenin alaný yazdýrýn
		
		
		Scanner scan=new Scanner (System.in);
		System.out.print("alanýný hesaplamak için dairenin yarýçapýný giriniz :");
		
		double ycap=scan.nextDouble();
		
		System.out.println("dairenin alaný =" + 3.14*ycap*ycap);

//		alanýný hesaplamak için dairenin yarýçapýný giriniz :3.45
//		dairenin alaný =37.373850000000004
	}

}
