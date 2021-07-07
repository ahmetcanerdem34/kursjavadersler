package DAY_25_arrays;

import java.util.Arrays;

public class Calisma_Array2 {

	public static void main(String[] args) {
		
		
		int arr[]= {23,45,43,45,65};//bu dizi içerisinde 25 var mý diye soralým
		
		boolean flag=false;
		int sayi=25;//bu dizi içerisinde 25 var mý diye soralým
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] ==sayi) {
				
				flag=true;
			}
			
		}
		
		if(flag) {
			
			System.out.println("dizi istenilen sayýyý içeriyor");
		}
		else {
			
			System.out.println("içermiyor");
			
			//25 için ==içermiyor
			//23 için==dizi istenilen sayýyý içeriyor
		}
		
		System.out.println("****************************************");
		
		//binary yöntemiyle yapalým ama öncesinde sýralamalýyýz
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 23));//0 ýncý indexte
		System.out.println(Arrays.binarySearch(arr, 25));
		System.out.println(Arrays.binarySearch(arr, 44));
		System.out.println(Arrays.binarySearch(arr, 50));
		//olmayanlarý sýralamaya koyar ve olsaydý kaçýncý olurdu yu- ile veirir
//		0
//		-2
//		-3
//		-5

	}

}
