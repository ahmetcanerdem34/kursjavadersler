package JavaOfficeHoursDay2;

import java.util.Iterator;
import java.util.Scanner;

public class C5_MukemmelSay�Ornek {

	public static void main(String[] args) {

		/*
		 * Bir say�n�n m�kemmel olup olmad���n� bulan bir program yaz�n�z. M�kemmel say�
		 * : bir say�n�n kendisi hari� b�lenlerinin toplam�, kendisine e�itse o say�
		 * m�kemmeldir. ORNEK: INPUT : 6 OUTPUT : 1,2,3 1+2+3 = 6 = 6 (M�kemmel)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
		
		System.out.println(checkPerfectNumber(sayi));
		boolean flag;
		flag = checkPerfectNumber(sayi);
		System.out.println(flag);
		
		String result = checkPerfectNumber(sayi)? "Sayi mukemmel sayidir" 
				: "Sayi mukemmel sayi degildir";
		System.out.println(result);
}

public static boolean checkPerfectNumber(int sayi){
	int toplam = 0;
	boolean flag = false; // durum kontrol� (a��k kapal� gibi) "flag ismi bir onem arzetmiyor"
	for(int i = 1; i<sayi; i++){
		if(sayi%i==0){
			toplam = toplam + i; // toplam += i;
		}
	}
	if(toplam == sayi){
		flag=true;
	}
	
	return flag;
	
	
	
}
}


