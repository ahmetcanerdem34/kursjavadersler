package DAY_24_arrays;

import java.util.Arrays;

public class Arrays_01 {

	public static void main(String[] args) {
		
		// aynı türden verileri bir arada kalıp olarak tutan veri yapıları 
		int sayi=10;
		int sayi2=20;
		int sayi3=30;
		String isim="Ali";
		
		//java da birden fazla elamanı koyabileceğimiz (store) objectler vardır
		//bugun bunlardan ilkini öğreneceğiz
		
		//Array bir objedir..........
		
		//önce içeriisne int değerler koyacağımı belirtiyorum(int)
		//eşitliğin sağına 3 sayı yazdık, daha fazlasını yazamazsınız
		//lenght 3 tur 4. elemanı ekleyemezsiniz
		//lenght i3 eleman tanımlayıp 3 ve 3 ten az girebilirsiniz
		int arr [] = {10,20,30};	//int[] arr =bu şekilde de olur ama diğer türlü daha çok kullanılıyor	
									//bu örnekte array in elemanlarını direk yazdığım için 
									//uzunluk belirtmeye ihtiyaç kalmadı

		
		
		//peki elemanları konsolda nasıl görebiliriz
		
		System.out.println(arr); //[I@442d9b6e//Array bir objedir, eğer Array i yazdırmak isterseniz, java referansı yazdırır.
		
		System.out.println(Arrays.toString(arr));//[10, 20, 30]
		System.out.println("burası" + (arr.length-1));//burası2
		
		
		
		String takim[]= new String[3];//ben yeni bir array oluşturacağım diyor
		System.out.println(Arrays.toString(takim));
		//[null, null, null]
		
		//peki bu nulları nasıl değiştiririz= değer atayarak
		
		takim[0]="Ali";//ilk kişi yani 0 ıncı index null Ali
		System.out.println(Arrays.toString(takim));
		//[Ali, null, null]
		takim[2]="Hasan";
		takim[1]="Veli";
		System.out.println(Arrays.toString(takim));//[Ali, Veli, Hasan]
		
		//takim[3]="Mehmet";//java run time programdır, dolayısıyla array programi çalıştığında  oluşturulur
					   // 47. satırda syntax olarak hata olmadığında Cte olmaz, RTE verir
		              //program calıştğında 3. index olmadığı için RTE verir
		
		//Array deki bir elemanı update etmek 
		//veli nin yerine kemal girsin
		takim[1]="Kemal";
		System.out.println(Arrays.toString(takim));
		//[Ali, Kemal, Hasan]
		
		//bir Array in uzunluğunu nasıl bulalbiliriz
		
		System.out.println(takim.length);//[]-->bunun içinde ki değer sayısını verir=3
		                          //3
								  // String deki length() böyleeydi, Array delength
		
		
		
		//Array daki son eleman Mehmet yapalim tekrar
		//nasıl yaparız uzunluk-1
		takim[takim.length-1]="Mehmet";
		System.out.println(Arrays.toString(takim));
		
		//ortadaki elemanı can yapalım
		//Array 3 elemeanlıysa 1,2,3 olura olabilir bölerek ama 54 ise 6 ise nasıl olacak
		
		//eğer Array in eleman sayısı tek ise ortadaki eleman ı can yapalım
		
		if (takim.length %2 ==1) {

			int ortaİndex=(takim.length-1)/2;
			
			takim[ortaİndex]="Can";
			
			System.out.println(Arrays.toString(takim));
				//[Ali, Kemal, Hasan, Can, null, null, Mehmet]
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
