package DAY_25_arrays;

import java.util.Arrays;

public class MultiDimentional�kiBoyutluArraysCalisma05 {

	public static void main(String[] args) {
		
		//dizi 1 ve dizi 2 olmak �zere 2 dizimiz var
		//1. diziyi 2. ye kopyalamak istiyorsak
		//2. i�in yeni bir diz olu�turmal�y�z
		
		
		int dizi1[]= {4,3,4,5,44,5,6,777,678,7,6};
		
		int dizi2[]=new int[dizi1.length];//dizi2 ye diz1 in boyutu kadar uzunluk verdik
		
		System.arraycopy(dizi1, 3, dizi2, 0, 6);//jav alttaki for lu k�s�m yerine bunuda geli�tirmi�
		
		
		
		/*
		for (int i = 0; i < dizi2.length; i++) {
			
			dizi2[i]=dizi1[i];
			
		}
		*/
		
		for (int i = 0; i < dizi2.length; i++) {

			if(dizi2[i]!=0) {
				
				System.out.print(dizi2[i]+" ");
				//4 3 4 5 44 5 6 777 678 7 6 
				//5 44 5 6 777 678 0 0 0 0 0 -->3 ile 6 aras�
				//4 3 4 5 44 5 6 777 678 7 6 ---->0 dan ba�lad� dizi1 uzunlu�u kadar verdi
				
				//0 lar� yazmas�n� istemiyorsak if le belirt ve i�inde okut
				
				//5 44 5 6 777 678 
			}
			
		
			
		}

	}

}
