package DAY_25_arrays;

import java.util.Arrays;

public class MultiDimentionalÝkiBoyutluArraysCalisma05 {

	public static void main(String[] args) {
		
		//dizi 1 ve dizi 2 olmak üzere 2 dizimiz var
		//1. diziyi 2. ye kopyalamak istiyorsak
		//2. için yeni bir diz oluþturmalýyýz
		
		
		int dizi1[]= {4,3,4,5,44,5,6,777,678,7,6};
		
		int dizi2[]=new int[dizi1.length];//dizi2 ye diz1 in boyutu kadar uzunluk verdik
		
		System.arraycopy(dizi1, 3, dizi2, 0, 6);//jav alttaki for lu kýsým yerine bunuda geliþtirmiþ
		
		
		
		/*
		for (int i = 0; i < dizi2.length; i++) {
			
			dizi2[i]=dizi1[i];
			
		}
		*/
		
		for (int i = 0; i < dizi2.length; i++) {

			if(dizi2[i]!=0) {
				
				System.out.print(dizi2[i]+" ");
				//4 3 4 5 44 5 6 777 678 7 6 
				//5 44 5 6 777 678 0 0 0 0 0 -->3 ile 6 arasý
				//4 3 4 5 44 5 6 777 678 7 6 ---->0 dan baþladý dizi1 uzunluðu kadar verdi
				
				//0 larý yazmasýný istemiyorsak if le belirt ve içinde okut
				
				//5 44 5 6 777 678 
			}
			
		
			
		}

	}

}
