package DAY_18_whileLoop;

public class C6_WhileLoop6 {

	public static void main(String[] args) {
	
		
		//verilen say�n�n asal olup olmad���n� bulan pro yaz�n
		//1 ve kendisinden ba�ka b�leni olmayan say�ya asal denir
		
		
		
		
		int sayi=41;//ba�lang�� �art�--41 olsun 7 , 3 5 girip bakabiliriz
		
		String flag="Asal";
		
		//flag=0; //flag=bayrak=0 bizim istedi�imiz �art�n ger�ekle�ip ger�ekle�medi�ine bak�yor
		
		int bolen=2; //kendiisnden ve 1 den baska b�leni olmayanlar� bulaca��z
		//2 ye b�lenleri if i�inde almayaca��z
		
		while (bolen <sayi) {
			
			
			if(sayi%bolen==0) {
				flag="asal say� de�ildir";
				bolen++;//art�� olmasa sonsuz d�ng�ye girer...
			
			}
			
		}
		
		System.out.println(flag);
		
		

	}

}
