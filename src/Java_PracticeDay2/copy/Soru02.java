package Java_PracticeDay2.copy;

public class Soru02 {

	public static void main(String[] args) {
	/*	
		* Auto widening  ve Explicit narrowing ornekleri olusturunuz
		 * increment ve decrement ornekleri olusturunuz
		 * iki variable olusturun ve matematik operatorlerini kullanarak dort islem ve mod
		 * islemlerini yapiniz
		 *
		 */
		System.out.println("***********************************************************");
		
		//* Auto widening 
		byte sayiByte=34;
		short sayiShort=sayiByte;
		int sayiInteger=sayiShort;
		long sayiLong=sayiInteger;
		
		
		int a=34;
		
		System.out.println(a);
		
		double b=a;//Auto widening
		System.out.println(b);
		
//		34
//		34.0
		
		
		System.out.println("***********************************************************");
		
		//Explicit narrowing ornekleri olusturunuz
		
		double c=45.6;
		
		System.out.println(c);
		int d=(int) c;
		System.out.println(d);
		
//		45.6
//		45
		
		
		System.out.println("***********************************************************");
		
		//* increment ve decrement ornekleri olusturunuz
		
		
		int i=20;
		System.out.println(i);
		i=i+20;
		System.out.println(i);
		i+=20;
		System.out.println(i);
//		20
//		40
//		60
		
		System.out.println("**********************************************************************************");
		
		
		short s=10;
		System.out.println(s);
		//s=s+10; bu hata veriyor neden?
		// s ye bir þey eklediðimiz zaman int kendisi çeviriken short çevirmiyor, kendimiz çevirdik
		//java int i kendi çeviriyor ama shortta biz yapýyoruz
		//byte ayný biz yapýyoruz
		
		s=(short)(s+10);
		System.out.println(2);
		
		s-=10;//decreemnt azaltým
		System.out.println(s);
		
//		10
//		2
//		10
		
		
		System.out.println("**********************************************************************************");
		
		
		short x=10;
		x=(short) (x +10);
		
		short y=5;
		
		//short toplam=x+y;//hat verdi, int yap
		
		short toplama=(short)(x+y);
		short cikarma=(short)(x-y);
	    short carpma=(short)(x*y);
		short bolme=(short)(x/y);
		
		System.out.println(toplama);
		System.out.println(cikarma);
		System.out.println(carpma);
		System.out.println(bolme);
		
//		25
//		15
//		100
//		4
//		
		System.out.println("**********************************************************************************");
		

		//y yukarda 5 ti
		short mod=(short)(y%6);
		System.out.println("Mod :" +mod);
		//Mod :5
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
