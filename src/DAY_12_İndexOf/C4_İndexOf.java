package DAY_12_�ndexOf;

import java.util.Scanner;

public class C4_�ndexOf {

	public static void main(String[] args) {
		
		//IndexOf metodu bize istedi�imiz karakterlerin indeksini, s�ras�n� d�nd�r�r
		
		String str = "java ��ren, i� sahibi ol";
		
		System.out.println(str.charAt(6));//�-->�imdide � nin indeksini isteyelim
		
		System.out.println("char arama" + str.indexOf('�'));//char i�inde yazmal�y�m
		System.out.println("String arama" + str.indexOf("�"));
		System.out.println("String kelime arama:"+ str.indexOf("i�"));
		
		System.out.println("birden fazla varsa:" + str.indexOf('i'));//birden fazla varsa ilk i yi getirir
		
		
		System.out.println("ba�lang�� indexi ile " + str.indexOf('a', 4));//4.indexten sonraki ay� bul demek
		//ba�lang�� indexi ile 16
		
		System.out.println("olmayan harf "+ str.indexOf("dert"));//-1 veriri olmayanindex
		//olmayan harf -1
		
		//kullan�c�dan bir c�mle isteyin 
		//case sensitive olmadan java keliemsi olup olmad���n� yazd�r�n
		
		
		
		Scanner sc=new Scanner (System.in);
		System.out.print("string giriniz :");
		String cumle=sc.nextLine().toLowerCase();//ald���m� k���ke �evirdi�im i�in arad���m�da k���k e �evirdim
		
		
		//neden int yapmal�y�z, index say� i�eriyor oldu�undan int e atad�k
		int sonuc=cumle.indexOf("java");//java varsa ilk java kelimesinin indexini d�nd�r�r, java yoksa -1 d�nd�r�r
		System.out.println(cumle.indexOf("java"));
		
		//turnery ilede yapal�m
		
		System.out.println(sonuc==-1 ? "java i�eriyor" : "java i�ermiyor");
		//string giriniz :javay� seviyorum
		//java i�eriyor
		
		if(cumle.indexOf("�ze")>=0) {
			
			System.out.println("i�eriyor");
		}else {
			System.out.println("i�ermiyor");
			//i�eriyor
			//i�eriyor
			
			
		}
		

	}

}
