package DAY_25_arrays;

import java.util.Arrays;

public class Calisma_Array3 {

	public static void main(String[] args) {
				//verilen bir stringi array e �eviriniz, nas�l �eviririz
				//verilen bir c�mlede ka� kelime oldu�unu bulunuz
				//verilen c�mlede her kelimenin ilk harfini b�y�k yaz�n�z...gibi
		
		String str="javay� kim tan�sa sever";
		
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		//[javay�, kim, tan�sa, sever]
		
		System.out.println("*******************");
		
		String str2="java d�nays� �ok geni�";
		
		String arr2[]=str2.split(" ");
		System.out.println(Arrays.toString(arr2));
		//[java, d�nays�, �ok, geni�]
		
		System.out.println("*******************");
		
		String arr3[]=str2.split("java");
		System.out.println(Arrays.toString(arr3));
		//[,  d�nays� �ok geni�] //str2 deki java k�sm�n� atlad�k
		

		System.out.println("*******************");
		
		String arr4[]=str2.split("�");
		System.out.println(Arrays.toString(arr4));
	//	[java d�nays� , ok geni�]
		
		System.out.println("*******************");
		
		String arr5[]=str.split("");
		System.out.println(Arrays.toString(arr5));
		//[j, a, v, a, y, �,  , k, i, m,  , t, a, n, �, s, a,  , s, e, v, e, r]

	}

}
