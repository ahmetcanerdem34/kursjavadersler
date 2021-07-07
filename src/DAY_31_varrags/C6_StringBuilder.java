package DAY_31_varrags;

public class C6_StringBuilder {

	public static void main(String[] args) {
		
		//String immutable d�r
		
		//StringBuilder= mutable de�i�tirilebilir
		//StringBuilder da bir obje  dir
		
		
		
		StringBuilder sb1=  new StringBuilder();//bunu yazd���m�zda java bo� string builder olu�turur
		System.out.println("sb1 :" + sb1);
		//sb1 :
		
		StringBuilder str1= new StringBuilder("kaz�m");
		System.out.println("str1" +" "+ str1);
		//str1 kaz�m
		
		StringBuilder str2= new StringBuilder();
		System.out.println("str2 :" +str2);
		//str2 :
		str2.append("turun�gillerden");
		System.out.println("str2 yeni : "+str2);
		//str2 yeni : turun�gillerden
		
		str2.append(" portakal");
		System.out.println(str2);
		//turun�gillerden portakal
	
		System.out.println(str2.length());//24
		System.out.println(str2.capacity());//46
		System.out.println("***************************");
		
		StringBuilder sb2= new StringBuilder("Mehmet");//i�inde mehmet de�eri olan bi SB �retir
		System.out.println("sb2 : " + sb2);

		StringBuilder sb3= new StringBuilder(10);//10 kapasitesi olan bir SB �retir
		System.out.println("sb3 : " + sb3);
		//sb3 : 
		
	
		System.out.println("***************************");
		
		
		sb1.append(" Hoca");//sb2 bo�tu  bir bo�luk b�rakarak ekleme yap�yoruz hoca ekledik
		System.out.println("sb1 apend :" + sb1);
		//sb1 apend : Hoca
		
		sb2.append(" Hoca");//sb2 bo�tu hoca ekledik
		System.out.println("sb2 apend :" + sb2); // mehmet hoca oldu
		
		sb3.append(" Hoca");//sb2 bo�tu hoca ekledik
		System.out.println("sb3 apend :" + sb3); //hoca oldu
		
		System.out.println("sb1 uzunluk :" + sb1.length());//5
		System.out.println("sb1 kapasite :" + sb1.capacity());//16//buna bir deger yazmad���m�z i�in default kapasite 16 atad� kendi
		
		
		System.out.println("sb2 uzunluk :" + sb2.length());//11 mehmet hoca
		System.out.println("sb2 kapasite :" + sb2.capacity());//22 basta bi 6 olusturduk 16 da default de�er
		
		System.out.println("sb3 uzunluk :" + sb3.length());//5 ""hoca"
		System.out.println("sb3 kapasite :" + sb3.capacity());//10 basta 10 kapasite verdi�imiz i�in dolana
		
		//capacity haf�za yonetimi i�in �ok onmeli
		//b�z uzunluk vermezsek java yer ay�r�yor kendi
		//en ba�ta sabit uuznluk veya max uzunluk belli ise 
		//3.method ile olu�turarak haf�za verimllili�ini kullan�m�n� optimize edebiliriz
		
		
//		    sb1 :
//			sb2 : Mehmet
//			sb3 : 
//			sb1 apend : Hoca
//			sb2 apend :Mehmet Hoca
//			sb3 apend : Hoca
//			sb1 uzunluk :5
//			sb1 kapasite :16
//			sb2 uzunluk :11
//			sb2 kapasite :22
//			sb3 uzunluk :5
//			sb3 kapasite :10
	}

}
