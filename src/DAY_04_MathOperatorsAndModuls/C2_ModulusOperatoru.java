package DAY_04_MathOperatorsAndModuls;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		
		//modulus bir b�lme i�leminde kalan� veriri
		
		//15 tek mi �ift mi, 
		//15 i 2 ye b�ld���mde kaln 1 ise tek, kalna s�f�r ise �ift
		
		
		int kalan=15%4;
		System.out.println(kalan);//3
		
		System.out.println(26 % 8);// kaln 2
		
		//856 say�s�n�n birler basam�� ka�t�r
		
		int birler=856 % 10;//birler basam�� modul 10 yaparak buluruz
		System.out.println("say�n�n birler basama�� :" + birler);
		//say�n�n birler basama�� :6
		
		//soru 856 say�s�n�n onlar basam�� ka�t�r
		
		int onlar=(856/10) % 10;
		System.out.println("onalr basam�� : " + onlar);
		//onalr basam�� : 5
		
		int yuzler=856/100;
		System.out.println("say�n�n yuzler basam�� : "+ yuzler);
		//say�n�n yuzler basam�� : 8

	}

}
