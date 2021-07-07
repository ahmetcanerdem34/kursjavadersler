package ODEVLER_5;

public class Soru_02 {

	public static void main(String[] args) {
		/*
		1-20 arasindaki -20 dahil olmak üzere-  çift sayýlarý yazdýrýn. e.g.2 4 6 .. 20


		1-20 arasindaki -20 dahil olmak üzere-  tek sayýlarý yazdýrýn. e.g 1,3,5,7,...,19 Virgul dahil!


		20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin. e.g.20,15,10,5
		 
		1 - 20 arasýndaki tüm çift sayýlarýn toplamýný bulun.

		11 veya 15 hariç 1-20 arasýndaki tüm sayýlarý yazdýrýn; break or continue kullanin. 
		*/
		
		
		for (int i = 0; i <=20; i+=2) {
			
			System.out.print(i);
			//02468101214161820
			
		}
		System.out.println();
		System.out.println("***************************");
		
		for (int i = 1; i <=20; i+=2) {
			
			System.out.print(i+",");
			//1,3,5,7,9,11,13,15,17,19,
			
		}
		System.out.println();
		System.out.println("***************************");

		for (int i = 20; i >0; i--) {
			
			if(i%5==0) {
				System.out.print(i+",");
				//20,15,10,5,
			}
		
		}
		System.out.println();
		System.out.println("***************************");
		int toplam=0;
		
		for (int i = 0; i <20; i+=2) {
			
			toplam+=i;
			
			
		}
		System.out.println("sayýlarýn toplamý :"+toplam);
		//sayýlarýn toplamý :90
		
		System.out.println();
		System.out.println("***************************");
		
		
		for (int i = 0; i <20; i++) {
			
			if(i==11) {
				continue;
			}else if(i==15){
				continue;
				
			}
			System.out.print(i+",");
			//0,1,2,3,4,5,6,7,8,9,10,12,13,14,16,17,18,19,
		}
		
	}

}
