package DAY_25_arrays;

import java.util.Arrays;

public class Calisma_Array1 {

	public static void main(String[] args) {
	
		
		int arr[]= {10,23,54};
		
		System.out.println(Arrays.toString(arr));
		//[10, 23, 54]
		System.out.println("*****************");
		
		
		String isimler[]=new String[4];
		isimler[0]="Ali";
		isimler[1]="Veli";
		isimler[2]="Ayten";
		isimler[3]="Dursun";
		
		System.out.println(isimler[1] +" "+isimler[3]+" "+isimler[2]);
		///Veli Dursun Ayten
		
		System.out.println(isimler);
		//[Ljava.lang.String;@368102c8
		
		System.out.println(Arrays.toString(isimler));
		//[Ali, Veli, Ayten, Dursun]
		
		System.out.println("**********************");
		
		for (int i = 0; i < isimler.length; i++) {
			
			System.out.println(Arrays.toString(isimler));
			
//					[Ali, Veli, Ayten, Dursun]
//					[Ali, Veli, Ayten, Dursun]
//					[Ali, Veli, Ayten, Dursun]
//					[Ali, Veli, Ayten, Dursun]
	}
		System.out.println("*******************");
		//karýþýk þekilde  verilen String isimler dizisini sýralayalým
		
		String isimler2[]=new String[4];
		isimler2[0]="Ali";
		isimler2[3]="Dursun";
		isimler2[2]="Ayten";
		isimler2[1]="Veli";
		
		Arrays.sort(isimler2);
		System.out.println(Arrays.toString(isimler2));
		//[Ali, Ayten, Dursun, Veli]
		

	}

}
