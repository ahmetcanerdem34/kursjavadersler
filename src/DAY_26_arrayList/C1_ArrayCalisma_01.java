package DAY_26_arrayList;

import java.util.Arrays;

public class C1_ArrayCalisma_01 {

	public static void main(String[] args) {
		
		
		   //Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip, 
	       //  kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
		
		int arr[]= {2,3,5,3,6,4,3,6,7};
		int sayi=3;
		
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==sayi) {
				
				count++;
			}
			
		}
		
		int temp=0;
		int arr2[]=new int[arr.length-count];
		
		for (int i = 0; i < arr2.length; i++) {
			
			if(arr[i]!=sayi) {
				
				arr[temp]=arr[i];
				temp++;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

}
