package DAY_15_methodCreatDevam;

import java.util.Iterator;

public class C4_ForLoop {

	public static void main(String[] args) {
		
		
		//5 defa hello world yazd�ral�m
		
	/*	
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		
		*/
		
		
		//bunun yerine loop kullan�yoruz
		//ne yapaca��m�z� java ya soyluyoruz kac kere yapmas� gerektigini s�yluyoruz
		
		//tu loop larda 3 seyi yazmak zorunday�z
		// 1- baslang�c de�eri
		//2- biti� de�eri
		//3- ka�ar ka�ar saymal�y�z
		
		
		
		
		 for (int i=10; i<=5 ;i++) {// for loop u i�in i de�i�keni ve onada 1 de�eri atad�k
			 
			 //for (int i=10; i>3 ;i++)== bu int max de�erine kadar gider, i-- yaparsak geriye sayar 3 te durur
			 
			 //not= e�er sart k�sm� bizim art���m�za g�re hep true verirse loop sonsuz d�ng�ye girer, istenen durum de�il 
			// not: loop ta art�� de�eri pozitif oldu�u gibi negatif de olabilir i--
			 //for (int i=10; i<=5 ;i-=5)--> buda i yi 5 5 azalt�r ve i+=5 5-5 artt�r�r
			 //not= e�er loop un �art� hi� true olmazsa loop body hi� devreye girmez
			 
			 
			 System.out.println(i+"="+ "hello world");
			 
//			 hello world
//			 hello world
//			 hello world
//			 hello world
//			 hello world
			 
//			 1 hello world
//			 2 hello world
//			 3 hello world
//			 4 hello world
//			 5 hello world
			 
//			 		 1=hello world
//					 2=hello world
//					 3=hello world
//					 4=hello world
//					 5=hello world

			 
			 
		 }
		
		}

		
		
		
		
	}
	
	
	


