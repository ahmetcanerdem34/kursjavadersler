package DAY_05_operatorSigns;

public class C1_Modulus {

	public static void main(String[] args) {
	
		//veirlen bir integer �n birler basama��n� yazd�r�n
		
		int sayi=1469;
		
		int birler=sayi%10;
		System.out.println(sayi%10);
		System.out.println("verilen say�n�n birler basama�� : "+birler);
		//verilen say�n�n birler basama�� : 9
		
		//verilen say�n�n birler basama�� hari� geriye kalan say�y� yaz�n
		
		int kalan = sayi/10;
		System.out.println(sayi/10);//b�yle yazarsam sadece o anl�k i�lem yapar
		System.out.println(sayi);//bu k�sm� tekrar yazd���mda sayi 1469 olarak devam eder
		//146
		System.out.println(sayi/=10);
		System.out.println(sayi);//�imdi yazd�rsam art�k 146 yazar ��nk� e�itlikle atama yapt�k. a�a��daki not bununla alkal�
		
		//sayi/10 ile sayi/=10 aras�ndaki fark nedir
		//0 i�rareti taam assa�ingnment) demektir
		//biei i�lemde = (e�ittr)atama varsa orada de�er kal�c� olaak de�i�ir 
		//e�ittir i�areti yoksa matematiksel i�lem yapar
		//sayi/10 yaz�l�rsa, say�n�n de�eri de�i�mez
		//sayi/=10 yaz�l�rsa sayi 10 a b�l�n�r ve yeni de�er olarak atan�r
		
//		9
//		verilen say�n�n birler basama�� : 9
//		146
//		1469
//		146
//		146
		

		
	}

}
