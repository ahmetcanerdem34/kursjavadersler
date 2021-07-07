package DAY_13_ContainsReplace;

import java.util.Scanner;

public class C1_StringContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kullanýcýdan bir cümle ve alrak istediði bir String isteyin
		//cümle stringi içeriyorsa"baþarýlý" deðilse "baþarýsýz" yazýn
		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("bir cümle giriniz :");
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.print("hangi kelimeyi arýyorsunuz :");
		String aranan=scan.nextLine().toLowerCase();
		
		cumle.contains(aranan);///bu iþlemin sonucu boolean
		
		System.out.println(cumle.contains(aranan) ? "baþarýlý" : "baþarýsýz");
		
		if(aranan.contains("java")) {
		System.out.println("baþarýlý");
		
		}else {
		System.out.println("baþarýsýz");
		
		
		//kullanýcýdan mail adresini isteyin
		//mail adresi Qgmail.com içeriyorsa-->mailiniz kaydedildi yazsýn
		//yoksa mail adresini girin yazsýn
		
		Scanner scan2=new Scanner(System.in);
		
		System.out.print("mail adresinizi giriniz :");
		String mail=scan2.nextLine().toLowerCase();
		System.out.print("hangi kelimeyi arýyorsunuz :");
		String arananMail=scan2.nextLine().toLowerCase();
		
		arananMail.contains("@gmail.com");//contains mi mý anlamý taþýr---> arananMail @gmail.com içeriyor mu
		
		System.out.println(mail.contains(mail) ? "kaydedildi" : "tekrar mail giriniz");
		
		
		//last index of la çözelim
		//eðer gmail.com un en sonda kontrol olduðunu etmek istersek
		
		int sondami= arananMail.indexOf("@gmail.com",arananMail.length()-10);//mail sonda mý diye baktýk
		//eðer email gmail.com ile bitiyorsa bu iþlemin sonucu index olur
		//eðer bulamazsa -1 verir
		
		
	
		
		
		
	}

	}
}
