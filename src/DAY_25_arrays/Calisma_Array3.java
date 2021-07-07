package DAY_25_arrays;

import java.util.Arrays;

public class Calisma_Array3 {

	public static void main(String[] args) {
				//verilen bir stringi array e çeviriniz, nasýl çeviririz
				//verilen bir cümlede kaç kelime olduðunu bulunuz
				//verilen cümlede her kelimenin ilk harfini büyük yazýnýz...gibi
		
		String str="javayý kim tanýsa sever";
		
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		//[javayý, kim, tanýsa, sever]
		
		System.out.println("*******************");
		
		String str2="java dünaysý çok geniþ";
		
		String arr2[]=str2.split(" ");
		System.out.println(Arrays.toString(arr2));
		//[java, dünaysý, çok, geniþ]
		
		System.out.println("*******************");
		
		String arr3[]=str2.split("java");
		System.out.println(Arrays.toString(arr3));
		//[,  dünaysý çok geniþ] //str2 deki java kýsmýný atladýk
		

		System.out.println("*******************");
		
		String arr4[]=str2.split("ç");
		System.out.println(Arrays.toString(arr4));
	//	[java dünaysý , ok geniþ]
		
		System.out.println("*******************");
		
		String arr5[]=str.split("");
		System.out.println(Arrays.toString(arr5));
		//[j, a, v, a, y, ý,  , k, i, m,  , t, a, n, ý, s, a,  , s, e, v, e, r]

	}

}
