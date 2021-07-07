package DAY_26_arrayList;

import java.util.Arrays;

public class C1_Array_01 {

	public static void main(String[] args) {
		
		//Soru 6) Verilen bir Array�den isten degere esit olan elamanlari kaldirip, 
       //  kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
		
		
		int arr[]= {2,3,5,3,6,4,3,6,7};//3 leri yok edece�iz{2,5,6,4,6,7}= bunu yapayaca��z 
		//yeni bir array olu�turarak bunu yapabiliriz=arr2 olu�turasl�m
		int sayi=3;	//a�a��da sayi k�sm�nda bulup eksiltece�iz
		
		//1. ad�m olarak arr i�inde kald�rmam istenen say� ka� tane var onu bulmal�y�m
		//for loop la ve count la ka� 3 oldu�unu buluruz
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==sayi) {///arad���m�z sayi=3 yukarda sayi yaz�nca yeterli
				count++;
			}
			
		}
		
		//2. aad�m yeni aeeay olu�tural�m
		//yukarda uzunluktan 3 leri ��karamak gerekeceki �imdiki uzunluk bulunmu� olsun
		int arr2[]=new int[arr.length-count];//buray ka� elemanl� olmas� gerekti�ini yazmal�y�z
		
		//3. ad�m arr arrayinden elemanlar� tek tek al�p istenen say�ya e�it de�ilse 
		//arr2 ye ekleyece�im
		
		
		//yukardaki ilk haline g�re bir for olu�turduk
		//birde temp olu�tural�m, bunula yeni array in indexlerini kontrol edece�im
		int temp=0;
		for (int i = 0; i < arr2.length; i++) {
			
			if(arr[i]!=sayi) {
				
				arr[temp]=arr[i];
				temp++;
				
				/*
		         * i = 0 dan  8e giderken
		         *  index     sayi                             temp
		         *    0        2==3 F   arr[0]=2   temp++   0 idi 1 oldu     
		         *    1        3==3 T              artmadi      1
		         *    2        5==3 F   arr[1]=5   temp++       1              
		         *    3        3==3 T              artmadi      2                  
		         *    4        6==3 F   arr[2]=6   temp++       2        
		         *    5        4==3 F   arr[3]=4   temp++       3    
		         *    6        3==3 T              artmadi      4   
		         */ 
			}
			
		}
		System.out.println(Arrays.toString(arr2));
	}

}
