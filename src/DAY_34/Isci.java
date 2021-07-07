package DAY_34;

public class Isci extends Muhasebe{//iþçi class ýný extend yapmak istiyorum
		//iþçide main olmak zorunda
	public static void main(String[] args) {
		
		//iþci oluþturmak istiyorsaom objesini oluþtururum
		Isci isci1=new Isci();//iþçi yazýp . noktaya basýnca herþey çýkar
		isci1.isim="Ömer";
		isci1.soyÝisim="Aydýn";
		isci1.Id=1001;
		isci1.saatUcreti=10;
		isci1.statu="iþçi";
		isci1.maas=isci1.maasHesapla();//bunu gider muhasebede hesaplar ordaki methoddan atar
		
		
		//yazdýralým nasýl yazdýrabilirm
		System.out.println(isci1.Id+" "+isci1.isim+" "+isci1.soyÝisim+" "+" "+isci1.statu+" "+isci1.maas+"$");
		//1001 Ömer Aydýn 10 iþçi 2400tl
		
		//bu derse kadar  hangi class dan bilgi elde etmek istiyorsak o class dan obje oluþturuduk
		//inheritance ile bu mecburiyet ortadan kalktý
		//child class da oluþturduðum obje ile tum parent claslarda bulunan variable ve methodlarý inherit edebilirim
		
		System.out.println("*************************");
		//bir iþçi, bir obje daha oluþturmak istiyorsam kopy paste yapýyoruz iþçi2 için
		
		Isci isci2=new Isci();//iþçi yazýp . noktaya basýnca herþey çýkar
		isci2.isim="Seher";
		isci2.soyÝisim="Bos";
		isci2.Id=1003;
		isci2.saatUcreti=10;
		isci2.statu="iþçi";
		isci2.izindeMi=false;
		isci2.maas=isci2.maasHesapla();//bunu gider muhasebede hesaplar ordaki methoddan atar
		
		System.out.println(isci2.Id+" "+isci2.isim+" "+isci2.soyÝisim+" "+isci2.izindeMi+" "+isci2.statu+" "+isci2.maas+"$");
		//1003 Seher Bos false iþçi 2400$
	}

}
