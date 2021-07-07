package DAY_26_arrayList;

import java.util.Arrays;

public class C1_Array_01 {

	public static void main(String[] args) {
		
		//Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip, 
       //  kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
		
		
		int arr[]= {2,3,5,3,6,4,3,6,7};//3 leri yok edeceðiz{2,5,6,4,6,7}= bunu yapayacaðýz 
		//yeni bir array oluþturarak bunu yapabiliriz=arr2 oluþturaslým
		int sayi=3;	//aþaðýda sayi kýsmýnda bulup eksilteceðiz
		
		//1. adým olarak arr içinde kaldýrmam istenen sayý kaç tane var onu bulmalýyým
		//for loop la ve count la kaç 3 olduðunu buluruz
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==sayi) {///aradýðýmýz sayi=3 yukarda sayi yazýnca yeterli
				count++;
			}
			
		}
		
		//2. aadým yeni aeeay oluþturalým
		//yukarda uzunluktan 3 leri çýkaramak gerekeceki þimdiki uzunluk bulunmuþ olsun
		int arr2[]=new int[arr.length-count];//buray kaç elemanlý olmasý gerektiðini yazmalýyýz
		
		//3. adým arr arrayinden elemanlarý tek tek alýp istenen sayýya eþit deðilse 
		//arr2 ye ekleyeceðim
		
		
		//yukardaki ilk haline göre bir for oluþturduk
		//birde temp oluþturalým, bunula yeni array in indexlerini kontrol edeceðim
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
