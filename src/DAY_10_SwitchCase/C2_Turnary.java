package DAY_10_SwitchCase;

import java.util.Scanner;

public class C2_Turnary {

	public static void main(String[] args) {
		
		//modulus u int de�erlerde kullan�r�z
		
		
		//kullan�c�dan bir say� al�n
		//say� �ift ise �ift de�ilse
		//karesini yazd�r�n
		
		
		Scanner scan =new Scanner (System.in);
		System.out.print("tamsay� pozitif giriniz :");
		int sayi=scan.nextInt();
		
		//neye tan�mlayaca��z double m� string e mi int e mi
		//hi�birine turnary de gerek yok hata veriri do�rudan yazd�r�n
	   
		
		String sonuc=sayi%2==0 ? "�ift" : sayi*sayi+"";//burda sonuna hi�lik ekleyince birle�tirme yapar sonuclar� sonucu yazd�r�
		//e�r turnary de 2 durum i�in farkl� sdata tipleri d�n�su oluyorsa 
		//(a�a��da string sonucta string ve sayi*sayi ile int de�er donuy�r) �al��t�rmaz
		//ya variavle ye atama yapmadan direk yazd�r�r�z
		//ya da mumkunse sonuclar� ayn� data tipine cevirmeye cal�s�r�z
			   
			   System.out.println(sayi%2==0 ? "�ift" : sayi*sayi);
			   
//			   tamsay� pozitif giriniz :5
//			   25


	}

}
