package DAY_31_varrags;

public class C6_StringBuilder {

	public static void main(String[] args) {
		
		//String immutable dýr
		
		//StringBuilder= mutable deðiþtirilebilir
		//StringBuilder da bir obje  dir
		
		
		
		StringBuilder sb1=  new StringBuilder();//bunu yazdýðýmýzda java boþ string builder oluþturur
		System.out.println("sb1 :" + sb1);
		//sb1 :
		
		StringBuilder str1= new StringBuilder("kazým");
		System.out.println("str1" +" "+ str1);
		//str1 kazým
		
		StringBuilder str2= new StringBuilder();
		System.out.println("str2 :" +str2);
		//str2 :
		str2.append("turunçgillerden");
		System.out.println("str2 yeni : "+str2);
		//str2 yeni : turunçgillerden
		
		str2.append(" portakal");
		System.out.println(str2);
		//turunçgillerden portakal
	
		System.out.println(str2.length());//24
		System.out.println(str2.capacity());//46
		System.out.println("***************************");
		
		StringBuilder sb2= new StringBuilder("Mehmet");//içinde mehmet deðeri olan bi SB üretir
		System.out.println("sb2 : " + sb2);

		StringBuilder sb3= new StringBuilder(10);//10 kapasitesi olan bir SB üretir
		System.out.println("sb3 : " + sb3);
		//sb3 : 
		
	
		System.out.println("***************************");
		
		
		sb1.append(" Hoca");//sb2 boþtu  bir boþluk býrakarak ekleme yapýyoruz hoca ekledik
		System.out.println("sb1 apend :" + sb1);
		//sb1 apend : Hoca
		
		sb2.append(" Hoca");//sb2 boþtu hoca ekledik
		System.out.println("sb2 apend :" + sb2); // mehmet hoca oldu
		
		sb3.append(" Hoca");//sb2 boþtu hoca ekledik
		System.out.println("sb3 apend :" + sb3); //hoca oldu
		
		System.out.println("sb1 uzunluk :" + sb1.length());//5
		System.out.println("sb1 kapasite :" + sb1.capacity());//16//buna bir deger yazmadýðýmýz için default kapasite 16 atadý kendi
		
		
		System.out.println("sb2 uzunluk :" + sb2.length());//11 mehmet hoca
		System.out.println("sb2 kapasite :" + sb2.capacity());//22 basta bi 6 olusturduk 16 da default deðer
		
		System.out.println("sb3 uzunluk :" + sb3.length());//5 ""hoca"
		System.out.println("sb3 kapasite :" + sb3.capacity());//10 basta 10 kapasite verdiðimiz için dolana
		
		//capacity hafýza yonetimi için çok onmeli
		//býz uzunluk vermezsek java yer ayýrýyor kendi
		//en baþta sabit uuznluk veya max uzunluk belli ise 
		//3.method ile oluþturarak hafýza verimlliliðini kullanýmýný optimize edebiliriz
		
		
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
