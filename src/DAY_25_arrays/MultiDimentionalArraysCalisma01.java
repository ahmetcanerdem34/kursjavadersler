package DAY_25_arrays;

import java.util.Arrays;

public class MultiDimentionalArraysCalisma01 {

	public static void main(String[] args) {
		
		
		int arr[] []= {{23,43,4,54,65},{4,35,4,6},{34,65,56}};
	    System.out.println(Arrays.deepToString(arr));//[[23, 43, 4, 54, 65], [4, 35, 4, 6], [34, 65, 56]]
		
		int arr2[][]= new int[2][3];
		System.out.println(Arrays.toString(arr2));
		//[[I@442d9b6e, [I@ee7d9f1, [I@15615099]
		//not multi array lerde to.string kullanılmaz
		//((deep String kullanılır))
		
		System.out.println(Arrays.deepToString(arr2));
//		[[0, 0], [0, 0], [0, 0]]==>resimde acıklaması var
		
		

	}

}
