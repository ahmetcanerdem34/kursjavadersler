package DAY_14_metodCreation;

public class C3_MetodCreation3 {

	public static void main(String[] args) {
		
		
	//verilen 3 double say�n�n ortalamas�n alan bi metod yaz�n main metod i�inden �a��rarak metodu �al��t�r�n
		
		//java yukardan a�a�� �al���rken parantezi g�r�nce metodla kar��la�t���n� anlayacak ve i�eri�ini sorgulayacak
		//argumentle a�a��daki data tipinin parametrelerine bakar a�a��da double i�leri
		
		
		ortalama(80,60,55);//integeri de kabul eder double daha b�y�k kutu, problem yapmaz
		//girdi�iniz 3 say��n ortalams� =65.0 --->�al��t� sonu�
		
		ortalama(80,60);

	} //Main Metodu sonu
	
	public static void ortalama(double sayi1, double sayi2, double sayi3) {
		//bunlar� �nt te yapsam �al���r ��nk� yukardakiler int de�er
		
		//ama girilen notlar . noktal� ise yanl�� sonu� verebilir, 
		//onun i�in en iyisi double olmas�
		
		
		System.out.println("girdi�iniz 3 say��n ortalams� =" +(sayi1+ sayi2 + sayi3)/3);
		//bu metodun �al��mas� i�in yukarda metod caall yapal�y�m
		//metod call u main metodu i�erisinde olaml�ki motor main metodu oldu�undan oras� �al��t�racak
		
	}
	
			public static void ortalama(double sayi1, double sayi2) {
		
			System.out.println("girdi�iniz 2 say�n�n ortalamas� :" + (sayi1 +sayi2)/2);
		
				// bu metodumuz �sttekiyle ayn� ama java sorun vermedi, ��nk� 3 de�erli
			//ama java hangisini �nce �al��t�r�r parametresi fazla olan� yukarda 3 de�er var oradaki metodu �al��t�r�
			//2 tane yani 80, 70 olsayd� buradaki  metodu �al��t�r�d�
	}


}//class sonu
