package DAY_25_arrays;

public class MultiDimentionalÝkiBoyutluArraysCalisma03 {

	public static void main(String[] args) {
	
		
		/*
		**tek boyutlu diziyi eleman vererek yazdýralým
		int sayilar[] = new int[5];
		
		for (int i = 0; i < sayilar.length; i++) {
			
			sayilar[i]=10;
			
		}
		for (int i = 0; i < sayilar.length; i++) {
			
			System.out.println(sayilar[i]);
		}
		*/
		 //çift boyutlu eleman yazdýralým
		
		int tablo [] []= new int[5][5];
		
		for (int i = 0; i < tablo.length; i++) {
			
			for (int j = 0; j < tablo[i].length; j++) {
				tablo[i][j]=10 ;
				
				
				
			}
			
		}
	
		
		for (int i = 0; i < tablo.length; i++) {
			
			for (int j = 0; j < tablo[i].length; j++) {
				
				System.out.print(tablo[i][j]+" ");
		
	}
			System.out.println();

}
	}
}