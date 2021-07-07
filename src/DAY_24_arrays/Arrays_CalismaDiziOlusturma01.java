package DAY_24_arrays;

public class Arrays_CalismaDiziOlusturma01 {

	public static void main(String[] args) {
		
		// ayný türden(byt short, int double gibi... verileri bir arada kalýp olarak tutan veri yapýlarý 
		
		
		int [] sayilar=new int[5];//kaçta sayý deðeri alacaðýný belirtmemiz lazým, dizi boyutu belirledik
		
		sayilar[0]=12;
		sayilar[1]=7;
		//2. ÝNDEX e deðer vermeyelim
		sayilar[3]=25;
		sayilar[4]=15;
		//5. index de aþaðýda yazdýralým, hata verecek
		
		System.out.println("sýfýrýncý indexdeki eleman :" + sayilar[0]);
		System.out.println("ikinci indexdeki eleman :" + sayilar[2]);
		System.out.println("üçüncü indexdeki eleman :" + sayilar[3]);
		System.out.println("4. indexdeki eleman :" + sayilar[4]);
		System.out.println("6. indexdeki eleman :" + sayilar[5]);//buna hata verri RTE
		
		
//		sýfýrýncý indexdeki eleman :12
//		ikinci indexdeki eleman :0
//		üçüncü indexdeki eleman :25
//		4. indexdeki eleman :15
	}

}
