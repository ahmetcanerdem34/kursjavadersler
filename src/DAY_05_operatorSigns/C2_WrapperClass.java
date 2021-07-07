package DAY_05_operatorSigns;

public class C2_WrapperClass {

	public static void main(String[] args) {
		
		//java da 2 tür data tür vardý= primitive ve non primitive
		
		//Wrapper Class : java nýn primitive data tipleri ile hazýr metodlarý kullannabilmemiz için oluþturduðu Class lardýr
		
		//primitiveler sade sadece deðer içerir
		//non primitiveler ise deðer ve metod içerir
		
		String isim="mehmet";
		
		System.out.println(isim.toUpperCase());//
		
		//wrapper class nedir
		//java nýn primitve data türleri ile bazý metodlarý  kullanabilmemiz için oluþturduðu classlardýr
		
		//boolean, char, byte, short, int long, float, double
		
		
		byte sayi=10;//burdaki byte primitive, alttaký Byte deðil
		Byte sayi2=11;//bakýn buyuk B yi de kabul etti.. 
		//ismen primitive data türü ile ayný ama Byte primitive türü deðl, baþka bir tür olan wrapper-->non primitive dir
		System.out.println(sayi2);
		//11
		
		
		
		//bunun bize faydasý ne
		
		Byte byteMinSayi= Byte.MIN_VALUE;
		System.out.println(byteMinSayi);
		//-128
	
		
		Byte byteMaxSayi=Byte.MAX_VALUE;
		System.out.println(byteMaxSayi);
		//127
		
		
		//variable oluþturmadan shortun en küçük ve en büyük deðerlerini yazdýralým
		
		Short shortMinSayi=Short.MIN_VALUE;
		System.out.println(shortMinSayi);
		System.out.println(Short.MIN_VALUE);
//		-32768
//		-32768
		
		Short shortMaxSayi=Short.MAX_VALUE;
		System.out.println(shortMaxSayi);
		System.out.println(Short.MAX_VALUE);
//		32767
//		32767
		 
		
		//int veri türünün wrapper classý Integerdýr
		
		System.out.println(Integer.MIN_VALUE);
		//-2147483648
		System.out.println(Integer.MAX_VALUE);
		//2147483647
		
		
		//booleaan, character, byte short ýnt long double
		//boolean da çýkmaz çünkü o true ve false deðeri verirler
		
		
		
		
	
		
		
		
		

	}

}
