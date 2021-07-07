package DAY_24_array;

import java.util.Arrays;

public class Arrays_06Ornek {
	
public static void main(String[] args) {
        
        /*
         * Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
         *  Ornek; array [1,2, 3] ise output [2, 3, 1] olacak
         */
        
        int arr[]= {1,2,3,4,5}; // 
                  //0 1 2 3 4
        
        int temp = arr[arr.length-1]; // 5
        System.out.println(temp);
        
        for (int i=arr.length-1; i>0; i--) {
            arr[i]=arr[i-1]; // 4 3  // 2 3 // 1 2 // 0 1 //
        }
        /*
         * arr[4]=arr[3]
         * arr[3]=arr[2]
         * arr[2]=arr[1]
         * arr[1]=arr[0]
         */
        
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }


}
