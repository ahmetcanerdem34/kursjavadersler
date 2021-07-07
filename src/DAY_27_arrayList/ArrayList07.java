package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList07 {

	public static void main(String[] args) {
		
		
		//verilen array deki tekrarlý elemanlarý silip, tekrarsýz bir array oluþturmak istiyoruz
		//array veya list kullanarak bunu yapýnýz
		
		//bunun array le çözümü çok uundur
		//list le çözmek bir kaç satýr
		
		int arr[]= {1,2,3,5,1,2,4,3,5,1,6,7,1,2,4,6,2,};//marketteki ürünlerin fiyat listesi var ürünlern ifyatý
		
		List <Integer> list= new ArrayList<>();
		///bir for loop ile 1. elemaný alacaðým, kontrol edeceðim listede var mý yoksa yazacaðým
		//hepsi için bunu yapacaðýz, 
		
		for (int i = 0; i < arr.length; i++) {
			
			if(!list.contains(arr[i])) {//bu kýsým listenin i sini içermiyorsa ekle
					
				list.add(arr[i]);
			}
	

	}
		System.out.println(list);//burda liste olarak yazdýrdýk
		//[1, 2, 3, 5, 4, 6, 7]
		
		//tekrar array a çevirdik=çünkü soru array istiyor bizden, bir önceki 06 da yapmýþtýk nasýl oalacaðýný
		Integer tekrarsizArray[]=list.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(tekrarsizArray));//burda array olarak yazdýrdýk
		//[1, 2, 3, 5, 4, 6, 7]
	}
}
