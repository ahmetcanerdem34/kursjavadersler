package DAY_13_ContainsReplace;

import java.util.Scanner;

public class C1_StringContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kullan�c�dan bir c�mle ve alrak istedi�i bir String isteyin
		//c�mle stringi i�eriyorsa"ba�ar�l�" de�ilse "ba�ar�s�z" yaz�n
		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("bir c�mle giriniz :");
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.print("hangi kelimeyi ar�yorsunuz :");
		String aranan=scan.nextLine().toLowerCase();
		
		cumle.contains(aranan);///bu i�lemin sonucu boolean
		
		System.out.println(cumle.contains(aranan) ? "ba�ar�l�" : "ba�ar�s�z");
		
		if(aranan.contains("java")) {
		System.out.println("ba�ar�l�");
		
		}else {
		System.out.println("ba�ar�s�z");
		
		
		//kullan�c�dan mail adresini isteyin
		//mail adresi Qgmail.com i�eriyorsa-->mailiniz kaydedildi yazs�n
		//yoksa mail adresini girin yazs�n
		
		Scanner scan2=new Scanner(System.in);
		
		System.out.print("mail adresinizi giriniz :");
		String mail=scan2.nextLine().toLowerCase();
		System.out.print("hangi kelimeyi ar�yorsunuz :");
		String arananMail=scan2.nextLine().toLowerCase();
		
		arananMail.contains("@gmail.com");//contains mi m� anlam� ta��r---> arananMail @gmail.com i�eriyor mu
		
		System.out.println(mail.contains(mail) ? "kaydedildi" : "tekrar mail giriniz");
		
		
		//last index of la ��zelim
		//e�er gmail.com un en sonda kontrol oldu�unu etmek istersek
		
		int sondami= arananMail.indexOf("@gmail.com",arananMail.length()-10);//mail sonda m� diye bakt�k
		//e�er email gmail.com ile bitiyorsa bu i�lemin sonucu index olur
		//e�er bulamazsa -1 verir
		
		
	
		
		
		
	}

	}
}
