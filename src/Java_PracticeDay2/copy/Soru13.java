package Java_PracticeDay2.copy;

import java.util.Scanner;

public class Soru13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("String ve say� kar���m�giriniz");
		String yazi=scan.nextLine();
		
		sumOfDigit(yazi);

	}
public static void sumOfDigit(String str) {
	
	int sum=0;
	
	for (int i = 0; i < str.length(); i++) {
		
		
		if(Character.isDigit(str.charAt(i))) {//string i�indeki sayy�y� belirledi�inde if true oluor a�a��ya g�nderiyor topluyor
			
			sum+=Integer.valueOf(""+str.charAt(i));//aski de�eri olarak almas�n iye t�rnak koyduk
		}
		
	}
	System.out.println("girilen stringdeki say�lar�n toplam� =" +sum);
	
//	String ve say� kar���m�giriniz
//	ttu7665jtg
//	girilen stringdeki say�lar�n toplam� =24
}
}
