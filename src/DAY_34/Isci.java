package DAY_34;

public class Isci extends Muhasebe{//i��i class �n� extend yapmak istiyorum
		//i��ide main olmak zorunda
	public static void main(String[] args) {
		
		//i�ci olu�turmak istiyorsaom objesini olu�tururum
		Isci isci1=new Isci();//i��i yaz�p . noktaya bas�nca her�ey ��kar
		isci1.isim="�mer";
		isci1.soy�isim="Ayd�n";
		isci1.Id=1001;
		isci1.saatUcreti=10;
		isci1.statu="i��i";
		isci1.maas=isci1.maasHesapla();//bunu gider muhasebede hesaplar ordaki methoddan atar
		
		
		//yazd�ral�m nas�l yazd�rabilirm
		System.out.println(isci1.Id+" "+isci1.isim+" "+isci1.soy�isim+" "+" "+isci1.statu+" "+isci1.maas+"$");
		//1001 �mer Ayd�n 10 i��i 2400tl
		
		//bu derse kadar  hangi class dan bilgi elde etmek istiyorsak o class dan obje olu�turuduk
		//inheritance ile bu mecburiyet ortadan kalkt�
		//child class da olu�turdu�um obje ile tum parent claslarda bulunan variable ve methodlar� inherit edebilirim
		
		System.out.println("*************************");
		//bir i��i, bir obje daha olu�turmak istiyorsam kopy paste yap�yoruz i��i2 i�in
		
		Isci isci2=new Isci();//i��i yaz�p . noktaya bas�nca her�ey ��kar
		isci2.isim="Seher";
		isci2.soy�isim="Bos";
		isci2.Id=1003;
		isci2.saatUcreti=10;
		isci2.statu="i��i";
		isci2.izindeMi=false;
		isci2.maas=isci2.maasHesapla();//bunu gider muhasebede hesaplar ordaki methoddan atar
		
		System.out.println(isci2.Id+" "+isci2.isim+" "+isci2.soy�isim+" "+isci2.izindeMi+" "+isci2.statu+" "+isci2.maas+"$");
		//1003 Seher Bos false i��i 2400$
	}

}
