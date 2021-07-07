package DAY_12_ÝndexOf;

import java.util.Scanner;

public class C3_LenghtMetodu {

	public static void main(String[] args) {
		
		//kullanýcýdan bir string girmesini isteyin 
		//girilen stringin son harfini büyük harf olarak yazdýýrn
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("lütfen bir cümle giriniz :");
		String str=scan.nextLine().toUpperCase();
		
		System.out.println("girdiðiniz cümlenin son harfi :" + str.charAt(str.length()-1));
		/*lütfen bir cümle giriniz :javayý sevmeyen ölmesin
		*girdiðiniz cümlenin son harfi :N

		 */ 
		//lenght metodu girilen stringin uzunluðunu verir
		
		System.out.println(str);
		//JAVAYI SEVMEYEN ÖLMESÝN
		
		String str2="";
		System.out.println(str.length());//0
		
		String str3=null;//"null" ikisi ayný deðildir, bu çift týrnaak içinde 4 verirdi//peki null neden kýrmýz-->
		//NULL -->hiç demektir
		//normalde stringler neyin içinde yazýlýr "" ç.týrnak içine ama; null için buna gerek yoktur
		//null case sensetive dir, dolayýýsyla NULL veya Null yazýlmaz
		//null bir deðer deðer deðildir, sadece hiçliði gösteren bir pointerdýr.(iþaretleyici)
		
		System.out.println(str3.length());//burasý ne yazdýrýr?RTE verir. çalýþtýrdýðýmýzda hata verir, str3 ün bir deðer olmadýðýný verir
		
		//javada eþitliðin sol tarafý obje kýsmýdýr String str4=
		
		//str2 ile str3 de eþit deðildir
		
		//null deðer atanan String ile String manipulation methodlarý kullanýlamaz
		System.out.println(str3.equals(str2));
		System.out.println(str.charAt(1));//bu bize indeksi olan sayýyý veriri baþtan 2. yani
		System.out.println(str3.charAt(1));//null la ne iþ yapýlsa hata verir, null "" týrnak içeriisnde olsaydu u yu veriridi
		
		
		
		
	}

}
