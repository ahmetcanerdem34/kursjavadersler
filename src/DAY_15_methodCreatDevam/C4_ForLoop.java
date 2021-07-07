package DAY_15_methodCreatDevam;

import java.util.Iterator;

public class C4_ForLoop {

	public static void main(String[] args) {
		
		
		//5 defa hello world yazdýralým
		
	/*	
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		
		*/
		
		
		//bunun yerine loop kullanýyoruz
		//ne yapacaðýmýzý java ya soyluyoruz kac kere yapmasý gerektigini söyluyoruz
		
		//tu loop larda 3 seyi yazmak zorundayýz
		// 1- baslangýc deðeri
		//2- bitiþ deðeri
		//3- kaçar kaçar saymalýyýz
		
		
		
		
		 for (int i=10; i<=5 ;i++) {// for loop u için i deðiþkeni ve onada 1 deðeri atadýk
			 
			 //for (int i=10; i>3 ;i++)== bu int max deðerine kadar gider, i-- yaparsak geriye sayar 3 te durur
			 
			 //not= eðer sart kýsmý bizim artýþýmýza göre hep true verirse loop sonsuz döngüye girer, istenen durum deðil 
			// not: loop ta artýþ deðeri pozitif olduðu gibi negatif de olabilir i--
			 //for (int i=10; i<=5 ;i-=5)--> buda i yi 5 5 azaltýr ve i+=5 5-5 arttýrýr
			 //not= eðer loop un þartý hiç true olmazsa loop body hiç devreye girmez
			 
			 
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
	
	
	


