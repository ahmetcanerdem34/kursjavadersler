package DAY_02_scanners;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		//Scanner=kullanýcýdan bilgialmak için yani data almak kullanýlýr
		//3 adýmla scanner iþlemi gerçekleþir
		//1->Scanner oluþtur nasýl
		
		
		Scanner scan=new Scanner (System.in);//dýþardan alýrken in diyoruz yazdýrýrken sout yapýyorduk
		
		
		//new= java da ne zamn new kellþimesini görseniz; yeni bir object oluþturuyor demektir
		//() parantez içine yazýlan deðerlere parametre denir, Sysytem.in yazalýyým
		//bir kod yazdýðýmýzda kodun altýnda kýrmýz çizgi oluþuyorsa veya satýr numarasý olan yerde kýrmýzý x ise, 
		//bazý þeyler yanlýþtýr, kýrmýzý, üzerine gel java.util i týkla
		//java.utui; javanýn bize hazýrladýüðý kütüphanedir, import etmek yeterlidir
		//scan= oluþturduðumuz scan ner objesine verdiðimiz isimlerdir, scan ismi çoðu yazýlýmcý tarafýndan kullanýlýr
		
		//2. adým kullanýcýya bir mesaj yazýn, yazmazsan bilmez kullanýcý
		System.out.print("karenin birkenar uzunluðunu giriniz :");//bunun içerisine mesaj yazmalýyým, 
			
		//3. adým=kullanýcýnýn konola girdiði deðeri programimiza alacaðýz, scan i kullanacaðýz
		//scan yazýp noktaya basýnca çýkan þeyle yanýnda () parentez varsa metoddur. içinde yazý yazanlar parametredir
		
		//primitive ve non primitive type lar arsýndaki farkký söyldeiðimiz de demiþtik, primitivler deðer taþýrlar
		//non primitveler deðerle beraber metod taþýrlardý
		//object non primitivedir. 
		//karenin bir kenarýný alacaðýz, kullanýcý ne girer bilemem, tamsayýda girer yada virgüllü double
		//bundan dolayý mesajda belirtmeli, 
		//double seçersek mesajda belirtmeye gerek yok
		
		//scan.nextDouble();//next gelecek demek burda gelecekteki sayý þu olsun gibisinden
		//ben sayýyý aldýysam bunu bir deðþiþkene atamalýyým onada double kenar deðiþkeni diyelim
		
		double kenar=scan.nextDouble();//artýk kenar isminde konteynýrým var
		
		System.out.println("girdiðiniz kenar uzunluðuna sahip alaný =" + (kenar*kenar));
		/*
		 * karenin birkenar uzunluðunu giriniz :5
		 * 25.0
		 * 
		 * karenin birkenar uzunluðunu giriniz :4.2 
		 * 17.64
		 * karenin birkenar uzunluðunu giriniz :5.2
		 * girdiðiniz kenar uzunluðuna sahip alaný =27.040000000000003

		 */
		
		
		
		
	}

}
