package DAY_24_array;

import java.util.Arrays;

public class Arrays_02 {

	public static void main(String[] args) {
		
		/*
		 Soru 1: Verilen bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
		 
		  Ornek; array [1,2, 3] ise output [2, 3, 1] olacak
		 */
		
		
		
		int arr[] = {1,2,3,4,5,6};
		int temp = arr[0];//1 i kaydýramadýðýmýzda buraya atadýk bekletiyoruz
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
	//[2, 3, 4, 5, 6, 1]
		
		
				//   0	 1.  2.  3.  4.  5. 	
		int arrr[]= {1 , 2 , 3 , 4 , 5 , 6 };
				//   2   3   4   5   6   1 
		int tep=arrr[0];
		
		for (int i = 1; i < arrr.length; i++) {
			arrr[i-1]=arrr[i];
		}
		arrr[arrr.length-1]=tep;
		System.out.println(Arrays.toString(arrr));
		
		
		
		}

}
