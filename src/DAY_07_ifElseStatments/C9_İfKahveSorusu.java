package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C9_�fKahveSorusu {

	public static void main(String[] args) {
	/*	
		1. Basit bir Kahve makinesi olu�turun.    3 �e�it kahvemiz olsun.
		2. Sistem �u soruyu sorsun: "Hangi Kahveyi istersiniz?"
		3.Bu soru ile birlikte kullan�c� kahve bilgilerini g�rs�n.  �rn:
		Hangi Kahveyi �stersiniz?
		1.T�rk kahvesi
		2.Filtre Kahve
		3.Espresso
		      String hangiKahve olu�turun ve var olan kahvelerden birini yaz�n�z. (�rn: T�rk Kahvesi,  ya da t�rk kahvesi.  --->  B�y�k- k���k harf duyarl� olmamas� i�in String methodu kullan�n.)
		                                                                                   1. Ko�ul b�l�m�
		      E�er kahve T�rk kahvesi ise, konsola = T�rk kahvesi haz�rlan�yor. yazs�n.(D�md�z T�rk kahvesi yazmay�n. String hangiKahve'yi �a��r�n!!)
		      E�er filtre kahve ise,   konsola = Filtre kahve haz�rlan�yor.  yazs�n.     (String hangiKahve'yi kullan�n !)
		      E�er Espresso ise, konsola =  Espresso haz�rlan�yor...   yazs�n.  (String hangiKahve'yi kullan�n !)
		      E�er yanl�� harf girerseniz, konsola = Hatal� tu�lama yapt�n�z. yazs�n. (Hatal� tuslamadan sonra kod cal�smaya devam edecektir, o konuyu daha g�rmediniz bu y�zden bastan baslat�n.)
		                                                                                   ----------------------------------
		      Sistem bize �u soruyu sorsun: "S�t eklememizi ister misiniz ? (Evet veya Hay�r olarak cevaplay�n�z):    "   Konsolda aynen b�yle  yazmal�. Parantez i�i de konsolda olsun.
		     String sut olusturun.
		                                                                         2.Ko�ul B�l�m�
		     e�er String sut,  evet   e e�itse,konsola, S�t ekleniyor... yaz�s� gelsin.         -- (B�y�k k���k harf duyarl� olmamas� i�in String methodu kullan�n. Olmas� gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.
		    e�er String sut, hay�r a e�it ise, konsola , S�t eklenmiyor  yaz�s� gelsin.
		                                                                                  ----------------------------------
		      Sistem bize "�eker ister misiniz ? (Evet veya hay�r cevab�n� veriniz) : " �eklinde bir soru sorsun. (B�y�k k���k harf duyarl�l�g� olmamas� i�in string method kullan�n.
		      String seker olu�turunuz.
		  
		3.Ko�ul if(){
		      E�er String seker   Evet e e�itse ,  sistem bize "Ka� �eker olsun?" sorusunu sormal�. Sorunun alt�na int kacSeker  olu�turunuz.
		      �eker say�s�n� giriniz.
		      Ve konsola   �unu yazd�r�n�z �rnek: 5 �eker ekleniyor.  (ipucu: Bu kodlar�n heosi if blo�unun i�erisinde olacak)
		      }
		     else{
		  E�er String �eker  hay�r 'a e�itse, sistem bize "�eker eklenmiyor" cevab�n� versin.
		          ONEML� !! =   bir int girdisinden sonra String girdisi yapacaksak,araya bo� bir nextLine koymam�z gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.
		Sistem bize "Hangi boyutta olsun? (B�y�k boy - orta boy - k���k boy olarak giriniz.) :   sorusunu sorsun. (b�y�k k���k harf duyarl�l�g� olmamal�. yani kullan�c� b�y�k boy veya B�Y�K Boy girdiginde kabul etmeli.
		String boyut olu�turun...
		4.Ko�ul B�l�m�
		      e�er String boyut B�y�k boy' a e�itse =  Kahveniz b�y�k boy haz�rlan�yor. (B�y�k boy k�sm�n� String boyut'u kullanarak yazal�m= "Kahveniz" + boyut + "haz�rlan�yor.")
		      E�er String boyut  Orta Boy'a e�itse = Kahveniz orta boy haz�rlan�yor.. ("Kahveniz" + boyut + "haz�rlan�yor.)
		      E�er String boyut  K���k boy'a e�itse = Kahveniz k���k boy haz�rlan�yor.    yazs�n. ("Kahveniz" + boyut + "haz�rlan�yor.)
		SONU� B�L�M�
		                  Sipari�lerimizi verdik. Son hali g�rmek istiyoruz.
		                  konsola �unu yazd�r�n �rnek :
		      T�rk Kahvesi orta boy haz�rd�r. Afiyet olsun !!! (T�rk kahvesi i�in String hangiKahveyi kullan�n.     orta boy i�in de String boyut ' u kullan�n.)
		 */


    Scanner sc =new Scanner(System.in);
    System.out.println("hangi kahveyi istersiniz");
    System.out.println("1.T�rk kahvesi\n2.Filitre Kahve\n3.Arap kahvesi");
    String hangiKahve=sc.nextLine();
    if (hangiKahve.equalsIgnoreCase("T�rk kahvesi")) {
        System.out.println("T�rk kahvesi haz�rlan�yor");
    }
    else if (hangiKahve.equalsIgnoreCase("Filitre Kahve")) {
        System.out.println("filitre kahvesi haz�rlan�yor");
    }
    else if (hangiKahve.equalsIgnoreCase("Arap kahvesi")) {
        System.out.println("arap kahvesi haz�rlan�yor");
    }
    else System.out.println("Hatal� tu�lama yapt�n�z");
    System.out.println("S�t eklememizi ister misiniz ?");
    String sut=sc.nextLine();
    if (sut.equalsIgnoreCase("evet") ) {
        System.out.println("S�t ekleniyor...");
    }
    else System.out.println("S�t eklenmiyor...");
    System.out.println("�eker eklememizi ister misiniz ?");
    String sugar=sc.nextLine();
    if (sugar.equalsIgnoreCase("evet") ) {
        System.out.println("ka� �eker istersiniz");
        int sekerSayisi= sc.nextInt();
        System.out.println(sekerSayisi+"tane �eker ekleniyor...");
    }
    else System.out.println("�eker eklenmiyor...");
    System.out.println("hangi boyutta olsun?");
    System.out.println("b�y�k boy\norta boy\nk���k boy");
    String boyut=sc.nextLine();
    if (boyut.equalsIgnoreCase("b�y�k boy") ) {
        System.out.println("Kahveniz b�y�k boy haz�rlan�yor");
    }
    else if (boyut.equalsIgnoreCase("orta boy")) {
        System.out.println("Kahveniz orta boy haz�rlan�yor");
    }else
    System.out.println("Kahveniz k���k boy haz�rlan�yor");
    System.out.println(hangiKahve+" "+boyut+"haz�rlan�yor"+" Afiyet olsun...");
}	
		

	}


