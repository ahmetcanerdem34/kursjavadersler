package DAY_05_operatorSigns;

public class C2_WrapperClass {

	public static void main(String[] args) {
		
		//java da 2 t�r data t�r vard�= primitive ve non primitive
		
		//Wrapper Class : java n�n primitive data tipleri ile haz�r metodlar� kullannabilmemiz i�in olu�turdu�u Class lard�r
		
		//primitiveler sade sadece de�er i�erir
		//non primitiveler ise de�er ve metod i�erir
		
		String isim="mehmet";
		
		System.out.println(isim.toUpperCase());//
		
		//wrapper class nedir
		//java n�n primitve data t�rleri ile baz� metodlar�  kullanabilmemiz i�in olu�turdu�u classlard�r
		
		//boolean, char, byte, short, int long, float, double
		
		
		byte sayi=10;//burdaki byte primitive, alttak� Byte de�il
		Byte sayi2=11;//bak�n buyuk B yi de kabul etti.. 
		//ismen primitive data t�r� ile ayn� ama Byte primitive t�r� de�l, ba�ka bir t�r olan wrapper-->non primitive dir
		System.out.println(sayi2);
		//11
		
		
		
		//bunun bize faydas� ne
		
		Byte byteMinSayi= Byte.MIN_VALUE;
		System.out.println(byteMinSayi);
		//-128
	
		
		Byte byteMaxSayi=Byte.MAX_VALUE;
		System.out.println(byteMaxSayi);
		//127
		
		
		//variable olu�turmadan shortun en k���k ve en b�y�k de�erlerini yazd�ral�m
		
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
		 
		
		//int veri t�r�n�n wrapper class� Integerd�r
		
		System.out.println(Integer.MIN_VALUE);
		//-2147483648
		System.out.println(Integer.MAX_VALUE);
		//2147483647
		
		
		//booleaan, character, byte short �nt long double
		//boolean da ��kmaz ��nk� o true ve false de�eri verirler
		
		
		
		
	
		
		
		
		

	}

}
