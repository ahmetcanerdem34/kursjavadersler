package DAY_25_arrays;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		
		
		//verilen bir sstringi array e çeviriniz, nasýl çeviririz
		//verilen bir cümlede kaç kelime olduðunu bulunuz
		//verilen cümlede her kelimenin ilk harfini büyük yazýnýz...gibi
		
		String str="herkes javayý tanýsa severdi";//her boþluk öncesi 1 kelime sonrasý bir eklime, java bunu yapýyor
		//java bunu yapýyor
		//bu stringi kelimelere ayýralým
		//split(ayýrma) methodu
		
		//önce bir array oluþturmalýyýz içerisnde de string olacak
		
		String arr[]=str.split(" ");
		
		System.out.println(Arrays.toString(arr));
		//[herkes, javayý, tanýsa, severdi]==>burdaki boþluklar array in virgülle koyduðu düzgün görülsün boþluðu
		//java yukaraki space leri öldürür geriye kalan lar 1 er elemendýr, tet tek koyduk ,(" ") koyar
		
		
		String arr2[]=str.split("java");
		System.out.println(Arrays.toString(arr2));
		
		String arr3[]=str.split("a");
		System.out.println(Arrays.toString(arr3));
		
		String arr4[]=str.split("");
		System.out.println(Arrays.toString(arr4));
		
//		[herkes, javayý, tanýsa, severdi]
//				[herkes , yý tanýsa severdi]
//				[herkes j, v, yý t, nýs,  severdi]
//				[h, e, r, k, e, s,  , j, a, v, a, y, ý,  , t, a, n, ý, s, a,  , s, e, v, e, r, d, i]


	}

}
