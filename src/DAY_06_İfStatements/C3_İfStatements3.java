package DAY_06_�fStatements;

import java.util.Scanner;

public class C3_�fStatements3 {

	public static void main(String[] args) {
		
		
		//soru: kullan��cdan g�n isminin ilk harfini isteyin ve harfe uygun olan g�nleri girin ve g�nleri yad�r�n

		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("istedi�iniz g�n�n ilk harfini giriniz :");
		
		char gun=scan.next().toUpperCase().charAt(0);//string le alamam ��nk� ilk harf diyor char � tercih etmeliyiz
		//bu �ekilde girilen ilk karakteri alm�� oldum
		
		char ilkHarf=scan.next().charAt(0);//bu �ekildede yazd���m�zda b�y�k ve k���k harfe g�re  || or ile �art haz�rlamal�y�m
		
		if(ilkHarf=='p' || ilkHarf=='P') {
			System.out.println("pazar, pazartesi, sal�");
		}
		
		if(ilkHarf=='c' || ilkHarf=='C') {
			System.out.println("cuma, cumartesi");
		}
		
		if(gun == 'P') {
			
			System.out.println("Pazartesi");
		}
		
		if(gun=='S') {
			
			System.out.println("Sal�");
		}
		if(gun=='�') {
			System.out.println("�ar�amba");
		}
		
		if(gun=='�') {
			
			System.out.println("Per�embe");
		}
		if(gun=='C') {
			System.out.println("Cuma");
		}
		if(gun=='J') {
			System.out.println("Cumartesi");
		}
		if(gun=='R') {
			System.out.println("Pazar");
			
			if(gun!='p' && gun!='s' && gun!='�' && gun!='�' && gun!='j' && gun!='r' ) {
				System.out.println("ge�erli g�n harfi giriniz");
			}
			
			
//			istedi�iniz g�n�n ilk harfini giriniz :J
//			Cumartesi		
//			
//			istedi�iniz g�n�n ilk harfini giriniz :cu
//			Cuma
			
//			istedi�iniz g�n�n ilk harfini giriniz :�
//			Per�embe		
		
			
			scan.close();
		}
		
		
	}

}
