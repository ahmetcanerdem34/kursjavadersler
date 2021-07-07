package DAY_27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList07 {

	public static void main(String[] args) {
		
		
		//verilen array deki tekrarl� elemanlar� silip, tekrars�z bir array olu�turmak istiyoruz
		//array veya list kullanarak bunu yap�n�z
		
		//bunun array le ��z�m� �ok uundur
		//list le ��zmek bir ka� sat�r
		
		int arr[]= {1,2,3,5,1,2,4,3,5,1,6,7,1,2,4,6,2,};//marketteki �r�nlerin fiyat listesi var �r�nlern ifyat�
		
		List <Integer> list= new ArrayList<>();
		///bir for loop ile 1. eleman� alaca��m, kontrol edece�im listede var m� yoksa yazaca��m
		//hepsi i�in bunu yapaca��z, 
		
		for (int i = 0; i < arr.length; i++) {
			
			if(!list.contains(arr[i])) {//bu k�s�m listenin i sini i�ermiyorsa ekle
					
				list.add(arr[i]);
			}
	

	}
		System.out.println(list);//burda liste olarak yazd�rd�k
		//[1, 2, 3, 5, 4, 6, 7]
		
		//tekrar array a �evirdik=��nk� soru array istiyor bizden, bir �nceki 06 da yapm��t�k nas�l oalaca��n�
		Integer tekrarsizArray[]=list.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(tekrarsizArray));//burda array olarak yazd�rd�k
		//[1, 2, 3, 5, 4, 6, 7]
	}
}
