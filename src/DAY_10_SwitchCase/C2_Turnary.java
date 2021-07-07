package DAY_10_SwitchCase;

import java.util.Scanner;

public class C2_Turnary {

	public static void main(String[] args) {
		
		//modulus u int deðerlerde kullanýrýz
		
		
		//kullanýcýdan bir sayý alýn
		//sayý çift ise çift deðilse
		//karesini yazdýrýn
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("tamsayý pozitif giriniz :");
		int sayi=scan.nextInt();
		
		//neye tanýmlayacaðýz double mý string e mi int e mi
		//hiçbirine turnary de gerek yok hata veriri doðrudan yazdýrýn
	   
		
		String sonuc=sayi%2==0 ? "çift" : sayi*sayi+"";//burda sonuna hiçlik ekleyince birleþtirme yapar sonuclarý sonucu yazdýrý
		//eðr turnary de 2 durum için farklý sdata tipleri dönüsu oluyorsa 
		//(aþaðýda string sonucta string ve sayi*sayi ile int deðer donuyýr) çalýþtýrmaz
		//ya variavle ye atama yapmadan direk yazdýrýrýz
		//ya da mumkunse sonuclarý ayný data tipine cevirmeye calýsýrýz
			   
			   System.out.println(sayi%2==0 ? "çift" : sayi*sayi);
			   
//			   tamsayý pozitif giriniz :5
//			   25


	}

}
