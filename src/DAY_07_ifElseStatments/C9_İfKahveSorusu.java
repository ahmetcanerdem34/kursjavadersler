package DAY_07_ifElseStatments;

import java.util.Scanner;

public class C9_ÝfKahveSorusu {

	public static void main(String[] args) {
	/*	
		1. Basit bir Kahve makinesi oluþturun.    3 çeþit kahvemiz olsun.
		2. Sistem þu soruyu sorsun: "Hangi Kahveyi istersiniz?"
		3.Bu soru ile birlikte kullanýcý kahve bilgilerini görsün.  Örn:
		Hangi Kahveyi Ýstersiniz?
		1.Türk kahvesi
		2.Filtre Kahve
		3.Espresso
		      String hangiKahve oluþturun ve var olan kahvelerden birini yazýnýz. (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlý olmamasý için String methodu kullanýn.)
		                                                                                   1. Koþul bölümü
		      Eðer kahve Türk kahvesi ise, konsola = Türk kahvesi hazýrlanýyor. yazsýn.(Dümdüz Türk kahvesi yazmayýn. String hangiKahve'yi çaðýrýn!!)
		      Eðer filtre kahve ise,   konsola = Filtre kahve hazýrlanýyor.  yazsýn.     (String hangiKahve'yi kullanýn !)
		      Eðer Espresso ise, konsola =  Espresso hazýrlanýyor...   yazsýn.  (String hangiKahve'yi kullanýn !)
		      Eðer yanlýþ harf girerseniz, konsola = Hatalý tuþlama yaptýnýz. yazsýn. (Hatalý tuslamadan sonra kod calýsmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatýn.)
		                                                                                   ----------------------------------
		      Sistem bize þu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayýr olarak cevaplayýnýz):    "   Konsolda aynen böyle  yazmalý. Parantez içi de konsolda olsun.
		     String sut olusturun.
		                                                                         2.Koþul Bölümü
		     eðer String sut,  evet   e eþitse,konsola, Süt ekleniyor... yazýsý gelsin.         -- (Büyük küçük harf duyarlý olmamasý için String methodu kullanýn. Olmasý gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.
		    eðer String sut, hayýr a eþit ise, konsola , Süt eklenmiyor  yazýsý gelsin.
		                                                                                  ----------------------------------
		      Sistem bize "Þeker ister misiniz ? (Evet veya hayýr cevabýný veriniz) : " þeklinde bir soru sorsun. (Büyük küçük harf duyarlýlýgý olmamasý için string method kullanýn.
		      String seker oluþturunuz.
		  
		3.Koþul if(){
		      Eðer String seker   Evet e eþitse ,  sistem bize "Kaç þeker olsun?" sorusunu sormalý. Sorunun altýna int kacSeker  oluþturunuz.
		      Þeker sayýsýný giriniz.
		      Ve konsola   þunu yazdýrýnýz örnek: 5 þeker ekleniyor.  (ipucu: Bu kodlarýn heosi if bloðunun içerisinde olacak)
		      }
		     else{
		  Eðer String þeker  hayýr 'a eþitse, sistem bize "Þeker eklenmiyor" cevabýný versin.
		          ONEMLÝ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boþ bir nextLine koymamýz gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.
		Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun. (büyük küçük harf duyarlýlýgý olmamalý. yani kullanýcý büyük boy veya BüYüK Boy girdiginde kabul etmeli.
		String boyut oluþturun...
		4.Koþul Bölümü
		      eðer String boyut Büyük boy' a eþitse =  Kahveniz büyük boy hazýrlanýyor. (Büyük boy kýsmýný String boyut'u kullanarak yazalým= "Kahveniz" + boyut + "hazýrlanýyor.")
		      Eðer String boyut  Orta Boy'a eþitse = Kahveniz orta boy hazýrlanýyor.. ("Kahveniz" + boyut + "hazýrlanýyor.)
		      Eðer String boyut  Küçük boy'a eþitse = Kahveniz küçük boy hazýrlanýyor.    yazsýn. ("Kahveniz" + boyut + "hazýrlanýyor.)
		SONUÇ BÖLÜMÜ
		                  Sipariþlerimizi verdik. Son hali görmek istiyoruz.
		                  konsola þunu yazdýrýn örnek :
		      Türk Kahvesi orta boy hazýrdýr. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanýn.     orta boy için de String boyut ' u kullanýn.)
		 */


    Scanner sc =new Scanner(System.in);
    System.out.println("hangi kahveyi istersiniz");
    System.out.println("1.Türk kahvesi\n2.Filitre Kahve\n3.Arap kahvesi");
    String hangiKahve=sc.nextLine();
    if (hangiKahve.equalsIgnoreCase("Türk kahvesi")) {
        System.out.println("Türk kahvesi hazýrlanýyor");
    }
    else if (hangiKahve.equalsIgnoreCase("Filitre Kahve")) {
        System.out.println("filitre kahvesi hazýrlanýyor");
    }
    else if (hangiKahve.equalsIgnoreCase("Arap kahvesi")) {
        System.out.println("arap kahvesi hazýrlanýyor");
    }
    else System.out.println("Hatalý tuþlama yaptýnýz");
    System.out.println("Süt eklememizi ister misiniz ?");
    String sut=sc.nextLine();
    if (sut.equalsIgnoreCase("evet") ) {
        System.out.println("Süt ekleniyor...");
    }
    else System.out.println("Süt eklenmiyor...");
    System.out.println("þeker eklememizi ister misiniz ?");
    String sugar=sc.nextLine();
    if (sugar.equalsIgnoreCase("evet") ) {
        System.out.println("kaç þeker istersiniz");
        int sekerSayisi= sc.nextInt();
        System.out.println(sekerSayisi+"tane þeker ekleniyor...");
    }
    else System.out.println("þeker eklenmiyor...");
    System.out.println("hangi boyutta olsun?");
    System.out.println("büyük boy\norta boy\nküçük boy");
    String boyut=sc.nextLine();
    if (boyut.equalsIgnoreCase("büyük boy") ) {
        System.out.println("Kahveniz büyük boy hazýrlanýyor");
    }
    else if (boyut.equalsIgnoreCase("orta boy")) {
        System.out.println("Kahveniz orta boy hazýrlanýyor");
    }else
    System.out.println("Kahveniz küçük boy hazýrlanýyor");
    System.out.println(hangiKahve+" "+boyut+"hazýrlanýyor"+" Afiyet olsun...");
}	
		

	}


