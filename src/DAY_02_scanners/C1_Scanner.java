package DAY_02_scanners;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		//Scanner=kullan�c�dan bilgialmak i�in yani data almak kullan�l�r
		//3 ad�mla scanner i�lemi ger�ekle�ir
		//1->Scanner olu�tur nas�l
		
		
		Scanner scan=new Scanner (System.in);//d��ardan al�rken in diyoruz yazd�r�rken sout yap�yorduk
		
		
		//new= java da ne zamn new kell�imesini g�rseniz; yeni bir object olu�turuyor demektir
		//() parantez i�ine yaz�lan de�erlere parametre denir, Sysytem.in yazal�y�m
		//bir kod yazd���m�zda kodun alt�nda k�rm�z �izgi olu�uyorsa veya sat�r numaras� olan yerde k�rm�z� x ise, 
		//baz� �eyler yanl��t�r, k�rm�z�, �zerine gel java.util i t�kla
		//java.utui; javan�n bize haz�rlad���� k�t�phanedir, import etmek yeterlidir
		//scan= olu�turdu�umuz scan ner objesine verdi�imiz isimlerdir, scan ismi �o�u yaz�l�mc� taraf�ndan kullan�l�r
		
		//2. ad�m kullan�c�ya bir mesaj yaz�n, yazmazsan bilmez kullan�c�
		System.out.print("karenin birkenar uzunlu�unu giriniz :");//bunun i�erisine mesaj yazmal�y�m, 
			
		//3. ad�m=kullan�c�n�n konola girdi�i de�eri programimiza alaca��z, scan i kullanaca��z
		//scan yaz�p noktaya bas�nca ��kan �eyle yan�nda () parentez varsa metoddur. i�inde yaz� yazanlar parametredir
		
		//primitive ve non primitive type lar ars�ndaki farkk� s�yldei�imiz de demi�tik, primitivler de�er ta��rlar
		//non primitveler de�erle beraber metod ta��rlard�
		//object non primitivedir. 
		//karenin bir kenar�n� alaca��z, kullan�c� ne girer bilemem, tamsay�da girer yada virg�ll� double
		//bundan dolay� mesajda belirtmeli, 
		//double se�ersek mesajda belirtmeye gerek yok
		
		//scan.nextDouble();//next gelecek demek burda gelecekteki say� �u olsun gibisinden
		//ben say�y� ald�ysam bunu bir de��i�kene atamal�y�m onada double kenar de�i�keni diyelim
		
		double kenar=scan.nextDouble();//art�k kenar isminde konteyn�r�m var
		
		System.out.println("girdi�iniz kenar uzunlu�una sahip alan� =" + (kenar*kenar));
		/*
		 * karenin birkenar uzunlu�unu giriniz :5
		 * 25.0
		 * 
		 * karenin birkenar uzunlu�unu giriniz :4.2 
		 * 17.64
		 * karenin birkenar uzunlu�unu giriniz :5.2
		 * girdi�iniz kenar uzunlu�una sahip alan� =27.040000000000003

		 */
		
		
		
		
	}

}
