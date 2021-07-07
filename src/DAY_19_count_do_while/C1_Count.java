package DAY_19_count_do_while;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		//count tek tek sayar
		//flag boolean gibi var yok anlamýna gelir
		
		//kullanýcýdan 1 bir cümle ve harf isteyin
		//while loop kullanrak istenen harf kaç kez kullanýlmýþ yazdýrýn
		//case sensetive olsun
		
		
		
		Scanner scan= new Scanner (System.in);
		System.out.print("bir cümle giriniz :");
		String cumle=scan.nextLine();
		System.out.println("bir harf giriniz :");//-----> lengt -1 le yapacaðýz
		String harf=scan.next().substring(0, 1);//--> String olarak ilk harfi alýr// char at kullanýrsak string metodunu kullanamayýz
		

		int count =0;//>baþlangýçta sýfýr buldukça artaçýk
		
		//baþlangýç variable oluþturuyoruz while loopta		
		int index=0;
		
		
		//bitme koþulumuzu while içinde vereceðiz
		
		while(index<cumle.length()) {
			
			if (cumle.substring(index,index+1).equals(harf)) {//index in ilk harfi substringe göre 0. index +1 artarak gidecek. eþitmi istene harfe
				count++;//eþitse 1 arttýr.
				//count bitmeden artýþý yazmam lazým
				
				
			}
			index++;//index e göre yapýyoruz çünkü
		}
		System.out.println("cümlede " + harf+" "+"harfi"+" " + count +" "+"defa kullanýlmýþ");
		
//		bir cümle giriniz :Ali okula ayþe ile geldi
//		bir harf giriniz :
//		a
//		cümlede a harfi 2 defa kullanýlmýþ
		
//		bir cümle giriniz :ata bak
//		bir harf giriniz :
//		k
//		cümlede k harfi 1 defa kullanýlmýþ
		
		scan.close();
		 
	}

}
