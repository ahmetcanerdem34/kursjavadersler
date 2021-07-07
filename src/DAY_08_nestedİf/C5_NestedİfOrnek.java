package DAY_08_nestedİf;

import java.util.Scanner;

public class C5_NestedİfOrnek {

	public static void main(String[] args) {
		
		
		//soru: kullanıcıdan bir şifre girmesini isteyin
		//eğer ilk harf büyük harf ise "A" olup olmadığını kontrol edin-- A ise geçerli şifere diyeceğiz, değilse değil
		//  eğer ilk harf küçük harf ise "z" olup -- küçük z ise geçerli değilse geçersiz yazdırırnr

		
		Scanner scan =new Scanner (System.in);
		System.out.print("şifre giriniz :");
		char ilkharf=scan.next().charAt(0);
		
		
		//1. işlem kullanıcıdan harf alıp bak buyuk mu küçük mü
		
		if (ilkharf>='A' && ilkharf<='Z') {//ilk harf buyukse
			

			if (ilkharf=='A') {
				System.out.println("şifre geçerli");
				
			} else {
				System.out.println("şifre geçersiz");

			}
			
				
		} else if(ilkharf>='a' && ilkharf<='z'){//ilk harf kucukse
			
			
			if (ilkharf=='z') {
				System.out.println("şifre geçerli");
				
			} else {
				System.out.println("şifre geçersiz");

			}

		}else {//ilk hark buyu harf veya kuçuk harf değilse
		
		System.out.println("şifre geçersiz");
		
//		şifre giriniz :Sakarya
//		şifre geçersiz
		
//		şifre giriniz :Ankara1453
//		şifre geçerli
		
//		şifre giriniz :zeki
//		şifre geçerli

		
	}
		
		scan.close();

}
}