package DAY_24_arrays;

public class Arrays_CalismaGelismisForDongusuDiziYazdirma {

	public static void main(String[] args) {

		// dizi oluþturabilirdik ama deðer vererek hýzlica yapalým
		// int sayilar[]= new int[];
		
		int toplam=0;

		int sayilar[] = { 3, 4, 55, 667, 443, 455, 67, 65, 54, 332, 56 };
		
		//eelamnalarýný nasýl yazdýrýrýz forla
		
		for (int i = 0; i < sayilar.length; i++) {
			
			System.out.print(sayilar[i]+ " ");
			
		}
		
		System.out.println("**********************");
		
		//farklý þekilde de yazdýorabiliriz
		
		for(int i:sayilar) {//sayýlar dizisinin ilk elemanýný i ye veriyor
			
			System.out.print(i+" ");
			//3 4 55 667 443 455 67 65 54 332 56 
			
		}
		//toplamayýda yapabiliri bu þekilde
	
		for(int i : sayilar) {
			
			toplam+=i;
		}
		System.out.println("toplam :" +toplam);
//		toplam :2201
		

	}

}
