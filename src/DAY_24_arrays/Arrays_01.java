package DAY_24_arrays;

import java.util.Arrays;

public class Arrays_01 {

	public static void main(String[] args) {
		
		// ayn� t�rden verileri bir arada kal�p olarak tutan veri yap�lar� 
		int sayi=10;
		int sayi2=20;
		int sayi3=30;
		String isim="Ali";
		
		//java da birden fazla elaman� koyabilece�imiz (store) objectler vard�r
		//bugun bunlardan ilkini ��renece�iz
		
		//Array bir objedir..........
		
		//�nce i�eriisne int de�erler koyaca��m� belirtiyorum(int)
		//e�itli�in sa��na 3 say� yazd�k, daha fazlas�n� yazamazs�n�z
		//lenght 3 tur 4. eleman� ekleyemezsiniz
		//lenght i3 eleman tan�mlay�p 3 ve 3 ten az girebilirsiniz
		int arr [] = {10,20,30};	//int[] arr =bu �ekilde de olur ama di�er t�rl� daha �ok kullan�l�yor	
									//bu �rnekte array in elemanlar�n� direk yazd���m i�in 
									//uzunluk belirtmeye ihtiya� kalmad�

		
		
		//peki elemanlar� konsolda nas�l g�rebiliriz
		
		System.out.println(arr); //[I@442d9b6e//Array bir objedir, e�er Array i yazd�rmak isterseniz, java referans� yazd�r�r.
		
		System.out.println(Arrays.toString(arr));//[10, 20, 30]
		System.out.println("buras�" + (arr.length-1));//buras�2
		
		
		
		String takim[]= new String[3];//ben yeni bir array olu�turaca��m diyor
		System.out.println(Arrays.toString(takim));
		//[null, null, null]
		
		//peki bu nullar� nas�l de�i�tiririz= de�er atayarak
		
		takim[0]="Ali";//ilk ki�i yani 0 �nc� index null Ali
		System.out.println(Arrays.toString(takim));
		//[Ali, null, null]
		takim[2]="Hasan";
		takim[1]="Veli";
		System.out.println(Arrays.toString(takim));//[Ali, Veli, Hasan]
		
		//takim[3]="Mehmet";//java run time programd�r, dolay�s�yla array programi �al��t���nda  olu�turulur
					   // 47. sat�rda syntax olarak hata olmad���nda Cte olmaz, RTE verir
		              //program cal��t��nda 3. index olmad��� i�in RTE verir
		
		//Array deki bir eleman� update etmek 
		//veli nin yerine kemal girsin
		takim[1]="Kemal";
		System.out.println(Arrays.toString(takim));
		//[Ali, Kemal, Hasan]
		
		//bir Array in uzunlu�unu nas�l bulalbiliriz
		
		System.out.println(takim.length);//[]-->bunun i�inde ki de�er say�s�n� verir=3
		                          //3
								  // String deki length() b�yleeydi, Array delength
		
		
		
		//Array daki son eleman Mehmet yapalim tekrar
		//nas�l yapar�z uzunluk-1
		takim[takim.length-1]="Mehmet";
		System.out.println(Arrays.toString(takim));
		
		//ortadaki eleman� can yapal�m
		//Array 3 elemeanl�ysa 1,2,3 olura olabilir b�lerek ama 54 ise 6 ise nas�l olacak
		
		//e�er Array in eleman say�s� tek ise ortadaki eleman � can yapal�m
		
		if (takim.length %2 ==1) {

			int orta�ndex=(takim.length-1)/2;
			
			takim[orta�ndex]="Can";
			
			System.out.println(Arrays.toString(takim));
				//[Ali, Kemal, Hasan, Can, null, null, Mehmet]
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
