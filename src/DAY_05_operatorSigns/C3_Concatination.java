package DAY_05_operatorSigns;

public class C3_Concatination {

	public static void main(String[] args) {

		
		//concatination ne demek?
		// birleþtirme demektir
		//java birden fazla stringi toplma iþareti ile toplarsanýz yan yana yazar
		
		String str1="java";
		String str2="güzeldir";
		
		System.out.println(str1+str2);//javagüzeldir
		
		//kodlamacýya uygun bir dil deðildir
		//eðer arada boþluk býrakma istiyorsak aray birde boþluk yazýn
		
		System.out.println(str1+" "+str2);
		//java güzeldir
		
		System.out.println(str1+' '+str2 );
		//java güzeldir---> buda olur yani char la da olur ama bir sýkýntý olur bahsedeceðiz
		
		
		//güzeldir java yazdýrýn
		
		System.out.println(str2+str1);//bu java da 2 strigngi birleþtir anlamýna gelir-->concatination yaptý
		//güzeldirjava
		
		int sayi1=5;
		int sayi2=4;
		//bunlarý kullanarak 9 yazdýrabilir misiniz
		
		System.out.println(sayi1+sayi2);//9--->2 string deðil sayý var java toplar
		//9
		//biri strin biri sayý olunca ne yapar
		
		//peki sayi artý string olsa ne yapar
		System.out.println(sayi1+sayi2+str1+str2 );
		//java yukardan iner soldan saða gider, sayi1 gördü toplar, saonra artý string birleþtirir 9+string
		//9javagüzeldir
		
		
		
		System.out.println(str1+str2+sayi1+sayi2);
		//önce javagüzeldir5-->burasý artýk string oldu sonra 4 de birleþtirir
		//javagüzeldir54
		
		//verilen deðiþkenlerle javagüzeldir1 yazdýrýn
		
		System.out.println(str1+str2+(sayi1-sayi2));//concatineyþýn yani birleþtirmede java çýkarmayla karþýlaþmaz
		//parantez koymayýnca sýkýntý yaptý neden java dediki ben stringden sayý çýkararmam parentez içinde yap diyor
		//javagüzeldir1
		
		//soru: verilen deðiþkenlerle 9 boþlýk javagüzeldir yazdýrýn
		
		System.out.println(sayi1 + sayi2+" "+str1 + str2);
		//boþluk olarak stringde koyabiliriz char da koymayýz çünkü char harfin sayýsal deðerini verir
		//neden java bakar iþlem içerisinde matematiksel bir iþlem yapýlýrken char görürse onu da matematik olarak düþünür 
		//ve harfin syýsal(askii) deðerini yazar//önemli=char 2 sayý arasýnda olursa
		//9 javagüzeldir
		
		
		//ama char ýn bir tarafý sayý bir tarafý strring se normal calýþtýrý java yani birleþtirir
		//2 sayý arasýnda veya sayýdan hemen sonra olursa char sýkýntý yapar
		System.out.println(sayi1+sayi2+str1+' '+str2);//toplamayla beraber string varsa java birleþtirme yapar
		//9java güzeldir
		
		
		//çarpma olursa ne olur
		
		System.out.println(str1+str2+sayi1*sayi2);//burda toplama ve çarpma var, java önce çarpma yapar =20 sonra en soldan toplmaya baþlar
		//javagüzeldir20
		
		//eðer topl
		
		
		
		
		
	}

}
