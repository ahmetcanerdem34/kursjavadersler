package DAY_05_operatorSigns;

public class C3_Concatination {

	public static void main(String[] args) {

		
		//concatination ne demek?
		// birle�tirme demektir
		//java birden fazla stringi toplma i�areti ile toplarsan�z yan yana yazar
		
		String str1="java";
		String str2="g�zeldir";
		
		System.out.println(str1+str2);//javag�zeldir
		
		//kodlamac�ya uygun bir dil de�ildir
		//e�er arada bo�luk b�rakma istiyorsak aray birde bo�luk yaz�n
		
		System.out.println(str1+" "+str2);
		//java g�zeldir
		
		System.out.println(str1+' '+str2 );
		//java g�zeldir---> buda olur yani char la da olur ama bir s�k�nt� olur bahsedece�iz
		
		
		//g�zeldir java yazd�r�n
		
		System.out.println(str2+str1);//bu java da 2 strigngi birle�tir anlam�na gelir-->concatination yapt�
		//g�zeldirjava
		
		int sayi1=5;
		int sayi2=4;
		//bunlar� kullanarak 9 yazd�rabilir misiniz
		
		System.out.println(sayi1+sayi2);//9--->2 string de�il say� var java toplar
		//9
		//biri strin biri say� olunca ne yapar
		
		//peki sayi art� string olsa ne yapar
		System.out.println(sayi1+sayi2+str1+str2 );
		//java yukardan iner soldan sa�a gider, sayi1 g�rd� toplar, saonra art� string birle�tirir 9+string
		//9javag�zeldir
		
		
		
		System.out.println(str1+str2+sayi1+sayi2);
		//�nce javag�zeldir5-->buras� art�k string oldu sonra 4 de birle�tirir
		//javag�zeldir54
		
		//verilen de�i�kenlerle javag�zeldir1 yazd�r�n
		
		System.out.println(str1+str2+(sayi1-sayi2));//concatiney��n yani birle�tirmede java ��karmayla kar��la�maz
		//parantez koymay�nca s�k�nt� yapt� neden java dediki ben stringden say� ��kararmam parentez i�inde yap diyor
		//javag�zeldir1
		
		//soru: verilen de�i�kenlerle 9 bo�l�k javag�zeldir yazd�r�n
		
		System.out.println(sayi1 + sayi2+" "+str1 + str2);
		//bo�luk olarak stringde koyabiliriz char da koymay�z ��nk� char harfin say�sal de�erini verir
		//neden java bakar i�lem i�erisinde matematiksel bir i�lem yap�l�rken char g�r�rse onu da matematik olarak d���n�r 
		//ve harfin sy�sal(askii) de�erini yazar//�nemli=char 2 say� aras�nda olursa
		//9 javag�zeldir
		
		
		//ama char �n bir taraf� say� bir taraf� strring se normal cal��t�r� java yani birle�tirir
		//2 say� aras�nda veya say�dan hemen sonra olursa char s�k�nt� yapar
		System.out.println(sayi1+sayi2+str1+' '+str2);//toplamayla beraber string varsa java birle�tirme yapar
		//9java g�zeldir
		
		
		//�arpma olursa ne olur
		
		System.out.println(str1+str2+sayi1*sayi2);//burda toplama ve �arpma var, java �nce �arpma yapar =20 sonra en soldan toplmaya ba�lar
		//javag�zeldir20
		
		//e�er topl
		
		
		
		
		
	}

}
