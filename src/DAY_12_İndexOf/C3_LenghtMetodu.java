package DAY_12_�ndexOf;

import java.util.Scanner;

public class C3_LenghtMetodu {

	public static void main(String[] args) {
		
		//kullan�c�dan bir string girmesini isteyin 
		//girilen stringin son harfini b�y�k harf olarak yazd��rn
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("l�tfen bir c�mle giriniz :");
		String str=scan.nextLine().toUpperCase();
		
		System.out.println("girdi�iniz c�mlenin son harfi :" + str.charAt(str.length()-1));
		/*l�tfen bir c�mle giriniz :javay� sevmeyen �lmesin
		*girdi�iniz c�mlenin son harfi :N

		 */ 
		//lenght metodu girilen stringin uzunlu�unu verir
		
		System.out.println(str);
		//JAVAYI SEVMEYEN �LMES�N
		
		String str2="";
		System.out.println(str.length());//0
		
		String str3=null;//"null" ikisi ayn� de�ildir, bu �ift t�rnaak i�inde 4 verirdi//peki null neden k�rm�z-->
		//NULL -->hi� demektir
		//normalde stringler neyin i�inde yaz�l�r "" �.t�rnak i�ine ama; null i�in buna gerek yoktur
		//null case sensetive dir, dolay��syla NULL veya Null yaz�lmaz
		//null bir de�er de�er de�ildir, sadece hi�li�i g�steren bir pointerd�r.(i�aretleyici)
		
		System.out.println(str3.length());//buras� ne yazd�r�r?RTE verir. �al��t�rd���m�zda hata verir, str3 �n bir de�er olmad���n� verir
		
		//javada e�itli�in sol taraf� obje k�sm�d�r String str4=
		
		//str2 ile str3 de e�it de�ildir
		
		//null de�er atanan String ile String manipulation methodlar� kullan�lamaz
		System.out.println(str3.equals(str2));
		System.out.println(str.charAt(1));//bu bize indeksi olan say�y� veriri ba�tan 2. yani
		System.out.println(str3.charAt(1));//null la ne i� yap�lsa hata verir, null "" t�rnak i�eriisnde olsaydu u yu veriridi
		
		
		
		
	}

}
