package DAY_12_ÝndexOf;

import java.util.Scanner;

public class C4_ÝndexOf {

	public static void main(String[] args) {
		
		//IndexOf metodu bize istediðimiz karakterlerin indeksini, sýrasýný döndürür
		
		String str = "java öðren, iþ sahibi ol";
		
		System.out.println(str.charAt(6));//ð-->þimdide ð nin indeksini isteyelim
		
		System.out.println("char arama" + str.indexOf('ð'));//char içinde yazmalýyým
		System.out.println("String arama" + str.indexOf("ð"));
		System.out.println("String kelime arama:"+ str.indexOf("iþ"));
		
		System.out.println("birden fazla varsa:" + str.indexOf('i'));//birden fazla varsa ilk i yi getirir
		
		
		System.out.println("baþlangýç indexi ile " + str.indexOf('a', 4));//4.indexten sonraki ayý bul demek
		//baþlangýç indexi ile 16
		
		System.out.println("olmayan harf "+ str.indexOf("dert"));//-1 veriri olmayanindex
		//olmayan harf -1
		
		//kullanýcýdan bir cümle isteyin 
		//case sensitive olmadan java keliemsi olup olmadýðýný yazdýrýn
		
		
		
		Scanner sc=new Scanner (System.in);
		System.out.print("string giriniz :");
		String cumle=sc.nextLine().toLowerCase();//aldýðýmý küçüke çevirdiðim için aradýðýmýda küçük e çevirdim
		
		
		//neden int yapmalýyýz, index sayý içeriyor olduðundan int e atadýk
		int sonuc=cumle.indexOf("java");//java varsa ilk java kelimesinin indexini döndürür, java yoksa -1 döndürür
		System.out.println(cumle.indexOf("java"));
		
		//turnery ilede yapalým
		
		System.out.println(sonuc==-1 ? "java içeriyor" : "java içermiyor");
		//string giriniz :javayý seviyorum
		//java içeriyor
		
		if(cumle.indexOf("üze")>=0) {
			
			System.out.println("içeriyor");
		}else {
			System.out.println("içermiyor");
			//içeriyor
			//içeriyor
			
			
		}
		

	}

}
