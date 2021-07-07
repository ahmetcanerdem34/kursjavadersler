package DAY_18_whileLoop;

public class C6_WhileLoop6 {

	public static void main(String[] args) {
	
		
		//verilen sayýnýn asal olup olmadýðýný bulan pro yazýn
		//1 ve kendisinden baþka böleni olmayan sayýya asal denir
		
		
		
		
		int sayi=41;//baþlangýç þartý--41 olsun 7 , 3 5 girip bakabiliriz
		
		String flag="Asal";
		
		//flag=0; //flag=bayrak=0 bizim istediðimiz þartýn gerçekleþip gerçekleþmediðine bakýyor
		
		int bolen=2; //kendiisnden ve 1 den baska böleni olmayanlarý bulacaðýz
		//2 ye bölenleri if içinde almayacaðýz
		
		while (bolen <sayi) {
			
			
			if(sayi%bolen==0) {
				flag="asal sayý deðildir";
				bolen++;//artýþ olmasa sonsuz döngüye girer...
			
			}
			
		}
		
		System.out.println(flag);
		
		

	}

}
