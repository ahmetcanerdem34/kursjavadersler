package DAY_09_Ternary;

public class C1_Ternary {

	public static void main(String[] args) {
		
		//turnary de de bir de�i�kene tama yapmal�y�m, yoksa hata verir sonuca atayal�m mesela
		
		int sayi= 10;
		//burda neden String a atad�k ��nk� son yazd�rd���m�z string= �ift veya tek
		
	String sonuc = sayi%2==0? "�ift" : "tek say�";// paranteze alsakt aolur almasakta
		
	
	//peki bir variable ye asign etmek isteemzsem 
	//sonucu nas�l g�r��r�m
	//o zamn syso i�inde yazar�m

	System.out.println(sayi%2==0? "�ift" : "tek say�");
	
	//ba��na a��klama yazmak istersem itiraz eder= parantez i�erisine almal�y�m ternary operat�r�n�
	
	System.out.println("i�lem sonucu :" +(sayi%2==0? "�ift" : "tek say�"));
	
	
	
	}

}
