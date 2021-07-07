package DAY_28_forEachLoop;

public class C1_ForEachLoopCalisma01 {

	public static void main(String[] args) {


		int arr[]= {2,4,6,8,10,12};
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
			//2 4 6 8 10 12 
			
		}
		System.out.println();
		
		
		for (int i : arr) {
			
			System.out.print(i +" ");
			//2 4 6 8 10 12 
			
		}
		

	}

}
