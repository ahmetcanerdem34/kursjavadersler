package DAY_25_arrays;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		
		
		//verilen bir sstringi array e �eviriniz, nas�l �eviririz
		//verilen bir c�mlede ka� kelime oldu�unu bulunuz
		//verilen c�mlede her kelimenin ilk harfini b�y�k yaz�n�z...gibi
		
		String str="herkes javay� tan�sa severdi";//her bo�luk �ncesi 1 kelime sonras� bir eklime, java bunu yap�yor
		//java bunu yap�yor
		//bu stringi kelimelere ay�ral�m
		//split(ay�rma) methodu
		
		//�nce bir array olu�turmal�y�z i�erisnde de string olacak
		
		String arr[]=str.split(" ");
		
		System.out.println(Arrays.toString(arr));
		//[herkes, javay�, tan�sa, severdi]==>burdaki bo�luklar array in virg�lle koydu�u d�zg�n g�r�ls�n bo�lu�u
		//java yukaraki space leri �ld�r�r geriye kalan lar 1 er elemend�r, tet tek koyduk ,(" ") koyar
		
		
		String arr2[]=str.split("java");
		System.out.println(Arrays.toString(arr2));
		
		String arr3[]=str.split("a");
		System.out.println(Arrays.toString(arr3));
		
		String arr4[]=str.split("");
		System.out.println(Arrays.toString(arr4));
		
//		[herkes, javay�, tan�sa, severdi]
//				[herkes , y� tan�sa severdi]
//				[herkes j, v, y� t, n�s,  severdi]
//				[h, e, r, k, e, s,  , j, a, v, a, y, �,  , t, a, n, �, s, a,  , s, e, v, e, r, d, i]


	}

}
