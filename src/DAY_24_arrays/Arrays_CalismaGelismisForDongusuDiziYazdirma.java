package DAY_24_arrays;

public class Arrays_CalismaGelismisForDongusuDiziYazdirma {

	public static void main(String[] args) {

		// dizi olu�turabilirdik ama de�er vererek h�zlica yapal�m
		// int sayilar[]= new int[];
		
		int toplam=0;

		int sayilar[] = { 3, 4, 55, 667, 443, 455, 67, 65, 54, 332, 56 };
		
		//eelamnalar�n� nas�l yazd�r�r�z forla
		
		for (int i = 0; i < sayilar.length; i++) {
			
			System.out.print(sayilar[i]+ " ");
			
		}
		
		System.out.println("**********************");
		
		//farkl� �ekilde de yazd�orabiliriz
		
		for(int i:sayilar) {//say�lar dizisinin ilk eleman�n� i ye veriyor
			
			System.out.print(i+" ");
			//3 4 55 667 443 455 67 65 54 332 56 
			
		}
		//toplamay�da yapabiliri bu �ekilde
	
		for(int i : sayilar) {
			
			toplam+=i;
		}
		System.out.println("toplam :" +toplam);
//		toplam :2201
		

	}

}
