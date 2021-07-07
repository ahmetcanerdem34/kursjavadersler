package DAY_25_arrays;

import java.util.Arrays;

public class Calisma_Array4 {

	public static void main(String[] args) {
		
		
		//iki array in eþit olduðunu kontrol etme
		
		int sayilar1[]= {3,4,5,65,76,78};
		int sayilar2[]= {3,5,4,53,74,72};
		
		System.out.println("iki dize içindeki sayýlar eþit mi?" +" "+Arrays.equals(sayilar1, sayilar2));
		//iki dize içindeki sayýlar eþit mi? false
		
		System.out.println("*******************");
		
		int sayilar3[]= {3,4,5,65,76,78};
		int sayilar4[]= {3,4,5,65,76,78};
		
		//sort ile bu sayýlarý küçükten büyüðe sýralayalaým
		
		Arrays.sort(sayilar3);
		Arrays.sort(sayilar4);
	System.out.println("Sayilar 3 ve 4  birbirine eþit mi?"+" "+(Arrays.equals(sayilar3, sayilar4)));
	//Sayilar 3 ve 4  birbirine eþit mi? true
	}

}
