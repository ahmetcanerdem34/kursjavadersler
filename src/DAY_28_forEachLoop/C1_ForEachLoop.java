package DAY_28_forEachLoop;

import java.util.Iterator;

public class C1_ForEachLoop {

	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8,10,12};
		
		for (int i = 0; i < arr.length; i++) {//asýl amaç array in tüm elemanlarýný loop a getirmek
			
			System.out.print(arr[i]+" ");
//			2 4 6 8 10 12 
			
		}
			//for loop yazmamýzýn amacý array in tüm elemanlarý üzerinden iþlem yapmak ise 
			//java bizim iþimizi kolaylaþtýrýyor
			//foreach loop daha kolay kod yamamýzý saðlar
			
			System.out.println();//görevi cursoru alt satýra indirmek
			
			//each==> her bir elemaný al bana getir
			//for each loop istediðim bir topluluktaki tüm elemanlarý birer  birer bana getirir 
			//for each loop ta baþlangýç deðeri yoktur, bitiþ deðeri yoktur, index te yoktur
			
			//nasýl oluþturuuz
			//iki þey önemli
			//1-nereden getireceðim
			//2-neleri getireceði
			//gider sýnýfýn içini topla gel
			//tek tek þeylerde kullanýlmaz
			for (int each : arr) {//array e git ve her bir integer ý bana getir anlamýnda, i yerine w daa olur each de olur
				
				System.out.print(each + " ");
				//2 4 6 8 10 12
			
			
		}

	}

}
