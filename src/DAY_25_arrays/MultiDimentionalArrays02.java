package DAY_25_arrays;

public class MultiDimentionalArrays02 {

	public static void main(String[] args) {
		//verilen 2 katl� bir array in tum elemanlar�n� toplam�n� bulal�m

		
		int arr[][]= {{1,2,3},{5,8},{9,6,5,1}};
		int toplam=0;
		//for i�inde for la ��zerim
		
		for (int i = 0; i < arr.length; i++) {//outer array 3 de�erden olu�uyor
			
			for (int j = 0; j < arr[i].length; j++) {//innerlar
				
				toplam +=arr[i][j];//i� i�e 2 for loop olunca 
			}
			
		}
		System.out.println("array daki tum elemanlar�n toplam� :"+ toplam);
		//array daki tum elemanlar�n toplam� :40		
		
		/*
         * arr[0][0] = 1 // i = 0 olunca burasi
         * arr[0][1] = 2
         * arr[0][2] = 3 
         * 
         * arr[1][0] = 5 // i = 1 olunca burasi
         * arr[1][1] = 8 
         * 
         * arr[2][0] = 9 // i = 2 olunca burasi
         * arr[2][1] = 6
         * arr[2][2] = 5
         * arr[2][3] = 1 
         */
	}

}
