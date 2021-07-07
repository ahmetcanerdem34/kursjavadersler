package DAY_31_varrags;

public class C2_Varrags01 {

	public static void main(String[] args) {
		
		
		//veirlen iki sayýyý toplayan ve sonucu yazdýran bir method yazýn
		
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		
		 toplama(sayi1,sayi2);//method call
		
		 
		 //verilen 3 sayiyi toplayan method oluþturun
		 //bir önce method iþe yaramaz, çünkü orda 2 argument var

		toplama(sayi1,sayi2,sayi3);//method call
		//yukardaki methodun sonu yok süreki arttýrýrz
		
		//öyle bir method yazalým ki içine kaç sayý yazarsak yazalým toplasýn
		toplama(2,3);//dersek 1. method çalýþýr
		toplama(2,5,8);//2. method çalýþýr, 3 sayýnýn toplamý
		
		//istediðimiz kadar sayýyý yazabileceðimiz methodu oluþturabilmemiz için varagsa bakalým
		//java varags oluþturmuþ

	}

	public static void toplama(int sayi1, int sayi2, int sayi3) {
		
		
		System.out.println("3 sayýnýn toplamý : " +(sayi1 + sayi2+ sayi3));
		
	}

	public static void toplama(int sayi1, int sayi2) {
		
		System.out.println("2 sayýnýn toplamý : " +(sayi1 + sayi2));
		
	}

}
