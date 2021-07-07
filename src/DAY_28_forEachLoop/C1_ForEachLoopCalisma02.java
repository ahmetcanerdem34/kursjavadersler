package DAY_28_forEachLoop;

public class C1_ForEachLoopCalisma02 {

	public static void main(String[] args) {
		
		
		 // Bir integer array olusturunuz ve 
        // bu array’deki tum sayilarin carpimini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		
		int arr[]= {23,43,56,56,76,7};
		
		int carpim=1;
		
		for (int i : arr) {
			
			carpim*=i;
			
			
			
		}
		System.out.println("array elemanlarýnýn çarpýmý = " +" "+carpim);

	}

}
