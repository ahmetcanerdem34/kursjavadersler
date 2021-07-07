package DAY_28_forEachLoop;

import java.util.Iterator;

public class C1_ForEachLoop {

	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8,10,12};
		
		for (int i = 0; i < arr.length; i++) {//as�l ama� array in t�m elemanlar�n� loop a getirmek
			
			System.out.print(arr[i]+" ");
//			2 4 6 8 10 12 
			
		}
			//for loop yazmam�z�n amac� array in t�m elemanlar� �zerinden i�lem yapmak ise 
			//java bizim i�imizi kolayla�t�r�yor
			//foreach loop daha kolay kod yamam�z� sa�lar
			
			System.out.println();//g�revi cursoru alt sat�ra indirmek
			
			//each==> her bir eleman� al bana getir
			//for each loop istedi�im bir topluluktaki t�m elemanlar� birer  birer bana getirir 
			//for each loop ta ba�lang�� de�eri yoktur, biti� de�eri yoktur, index te yoktur
			
			//nas�l olu�turuuz
			//iki �ey �nemli
			//1-nereden getirece�im
			//2-neleri getirece�i
			//gider s�n�f�n i�ini topla gel
			//tek tek �eylerde kullan�lmaz
			for (int each : arr) {//array e git ve her bir integer � bana getir anlam�nda, i yerine w daa olur each de olur
				
				System.out.print(each + " ");
				//2 4 6 8 10 12
			
			
		}

	}

}
