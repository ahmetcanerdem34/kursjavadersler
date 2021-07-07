package JavaOfficeHours;

import java.util.Scanner;

public class C2_SoruOrnek2 {

	public static void main(String[] args) {
	
		
		/*
		 Kullanicidan kilosunu ve boyunu alip
	Vucut kitle indeksini hesaplayan bir program yaziniz.
	Ipucu : Vucut 
	Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
	ORNEK:
	INPUT      : Kilo: 71
	                  Boy: 1,72
	OUTPUT  : Vucut Kitle Indeksiniz : 23
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("boyunuzu girniz :");
		double boy=scan.nextDouble();
		System.out.print("kg girniz :");
		double kilo=scan.nextDouble();
		
		boy=boy/100;//boyu cm den metreye çevirdik-->boy/=100;
		
		//vucut kütle indeksi formülü yukarda
		double vki=kilo / (boy*boy);
		
		System.out.println(vki);
		
		
		
		
//		boyunuzu girniz :190
//		kg girniz :83
//		22.991689750692522
		
		System.out.println(Math.round(vki));//Math. roun deðerleri yuvarlar verir

//		boyunuzu girniz :190
//		kg girniz :82
//		22.714681440443215
//		23
//		
		scan.close();
	}

}
