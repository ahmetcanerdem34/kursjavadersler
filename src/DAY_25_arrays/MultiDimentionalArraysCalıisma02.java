package DAY_25_arrays;

public class MultiDimentionalArraysCal�isma02 {

	public static void main(String[] args) {
		
		
		int arr[][]= {{1,2,3},{5,8},{9,6,5,1}};
		int toplam =0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				toplam+=arr[i][j];
				
			}
			
		}
		System.out.println("array daki tum elemanlar�n toplam� :"+ toplam);
		//array daki tum elemanlar�n toplam� :40
	}

}
