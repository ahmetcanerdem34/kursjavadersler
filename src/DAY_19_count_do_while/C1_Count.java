package DAY_19_count_do_while;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		//count tek tek sayar
		//flag boolean gibi var yok anlam�na gelir
		
		//kullan�c�dan 1 bir c�mle ve harf isteyin
		//while loop kullanrak istenen harf ka� kez kullan�lm�� yazd�r�n
		//case sensetive olsun
		
		
		
		Scanner scan= new Scanner (System.in);
		System.out.print("bir c�mle giriniz :");
		String cumle=scan.nextLine();
		System.out.println("bir harf giriniz :");//-----> lengt -1 le yapaca��z
		String harf=scan.next().substring(0, 1);//--> String olarak ilk harfi al�r// char at kullan�rsak string metodunu kullanamay�z
		

		int count =0;//>ba�lang��ta s�f�r bulduk�a arta��k
		
		//ba�lang�� variable olu�turuyoruz while loopta		
		int index=0;
		
		
		//bitme ko�ulumuzu while i�inde verece�iz
		
		while(index<cumle.length()) {
			
			if (cumle.substring(index,index+1).equals(harf)) {//index in ilk harfi substringe g�re 0. index +1 artarak gidecek. e�itmi istene harfe
				count++;//e�itse 1 artt�r.
				//count bitmeden art��� yazmam laz�m
				
				
			}
			index++;//index e g�re yap�yoruz ��nk�
		}
		System.out.println("c�mlede " + harf+" "+"harfi"+" " + count +" "+"defa kullan�lm��");
		
//		bir c�mle giriniz :Ali okula ay�e ile geldi
//		bir harf giriniz :
//		a
//		c�mlede a harfi 2 defa kullan�lm��
		
//		bir c�mle giriniz :ata bak
//		bir harf giriniz :
//		k
//		c�mlede k harfi 1 defa kullan�lm��
		
		scan.close();
		 
	}

}
