package DAY_24_arrays;

public class Arrays_CalismaDiziOlusturma01 {

	public static void main(String[] args) {
		
		// ayn� t�rden(byt short, int double gibi... verileri bir arada kal�p olarak tutan veri yap�lar� 
		
		
		int [] sayilar=new int[5];//ka�ta say� de�eri alaca��n� belirtmemiz laz�m, dizi boyutu belirledik
		
		sayilar[0]=12;
		sayilar[1]=7;
		//2. �NDEX e de�er vermeyelim
		sayilar[3]=25;
		sayilar[4]=15;
		//5. index de a�a��da yazd�ral�m, hata verecek
		
		System.out.println("s�f�r�nc� indexdeki eleman :" + sayilar[0]);
		System.out.println("ikinci indexdeki eleman :" + sayilar[2]);
		System.out.println("���nc� indexdeki eleman :" + sayilar[3]);
		System.out.println("4. indexdeki eleman :" + sayilar[4]);
		System.out.println("6. indexdeki eleman :" + sayilar[5]);//buna hata verri RTE
		
		
//		s�f�r�nc� indexdeki eleman :12
//		ikinci indexdeki eleman :0
//		���nc� indexdeki eleman :25
//		4. indexdeki eleman :15
	}

}
