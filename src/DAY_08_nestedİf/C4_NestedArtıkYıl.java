package DAY_08_nestedÝf;

import java.util.Scanner;

public class C4_NestedArtýkYýl {

	public static void main(String[] args) {


		//nested la yapalým
		
				//4 ile bölünemyen yýllar artýk yýl olamaz
				//4 un katý lamsýna raðmen 100 ile bolunebiklen yýllardan sadece 400 un katý olanyýllar artýk yýldýr
				
				
				Scanner scan=new Scanner (System.in);
				
				System.out.print("bir yýl giriniz :");
				int yil=scan.nextInt();
				
				//2 durum var ya 100 ile bölünebiliyor ya da bölünemiyor
				
				if (yil%100==0) {//100 e bölünebiliyor, 100 e bölünebiliyorsa bir þart daha lazým
					
					if (yil%400==0) {//400 e bölünüyorsa 
						System.out.println("arýk yýl");
						
					} else {//bölünemiyorsa deðil
						System.out.println("artýk yýl deðil");

					}
				
				} else {//100 e bölünemiyorsa  ve 4 ile bölünüyorsa artýk yýl, bölünemiyorsa deðil, yeni bir if else aç

				if (yil%4==0) {
					System.out.println("artýk yýl");
				
					
				} else {
					System.out.println("artýk yýl deðil");
					
//					bir yýl giriniz :2021
//					artýk yýl deðil
					
//					bir yýl giriniz :1985
//					artýk yýl deðil
					
//					bir yýl giriniz :2096
//					artýk yýl

				}
				
	scan.close();			
				}
	}
}
					
				

	


